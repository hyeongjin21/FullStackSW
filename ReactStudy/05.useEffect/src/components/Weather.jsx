import React, { useEffect, useRef, useState } from 'react'
import axios from 'axios'

const Weather = () => {

    // .env(환경변수파일)
    // - 외부에 노출되면 안되는 코드를 저장하는 공간

    // key : 8e282f5c637c21e859d15031b4a409fe
    // https://api.openweathermap.org/data/2.5/weather?q=Gwangju&appid=8e282f5c637c21e859d15031b4a409fe&units=metric

    let API_KEY = import.meta.env.VITE_WEATHER_API_KEY;

    const [city, setCityName] = useState("Gwangju");
    const [nowDate, setNowDate] = useState();
    const [weatherData, setWeatherData] = useState();
    const [chk, setChk] = useState(true);
    const cityRef = useRef();

    // const getWeatherData = () => {
    //     const WEATHER_URL = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${API_KEY}&units=metric`
    //     axios.get(WEATHER_URL)
    //         .then((res) => res.data)
    //         .then((data) => {
    //             // console.log(data);
    //             const date = new Date();
    //             setNowDate(`${date.getFullYear()}.${date.getMonth() + 1}.${date.getDate()}`);
    //             setWeatherData({name:data.name,temp:data.main.temp,icon:data.weather[0].icon})
    //             setChk(false);
    //         })
    // }

    const getWeatherData = async () => {
        const WEATHER_URL = `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${API_KEY}&units=metric`
        let res = await axios.get(WEATHER_URL)
        let data = res.data;
        const date = new Date();
        setNowDate(`${date.getFullYear()}.${date.getMonth() + 1}.${date.getDate()}`);
        setWeatherData({ name: data.name, temp: data.main.temp, icon: data.weather[0].icon })
        setChk(false);
    }


    const handleCityName = () => {
        let inputCity = cityRef.current.value;
        setCityName(inputCity);
    }

    useEffect(() => {
        getWeatherData();
    }, [city])

    if (chk) {
        return (
            <div>
                로딩중
            </div>
        )
    }
    return (
        <div>
            <h1>{nowDate}</h1>
            <img src={`https://openweathermap.org/img/wn/${weatherData.icon}@2x.png`} alt='날씨 아이콘' />
            <p>현재 {weatherData.name}은 {weatherData.temp}℃입니다.</p>
            <input ref={cityRef} /><button onClick={handleCityName}>검색</button>
        </div>
    )

}
export default Weather