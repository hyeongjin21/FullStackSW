import React, { useEffect, useState } from 'react'
import axios from 'axios';

const MovieList = () => {

    let API_KEY = import.meta.env.VITE_MOVIE_API_KEY;
    // let targetDt = "20250611";
    // const url = `http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json${API_KEY}&${targetDt}`;
    const url = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json";

    const [topMovie, setTopMovie] = useState();

    const getMovieList = () => {
        // axios.get(url)
        axios.get(url, { params: { key: API_KEY, targetDt: "20250611" } })
            .then((res) => res.data.boxOfficeResult)
            .then((data) => {
                console.log(data);
                setTopMovie(data.dailyBoxOfficeList.map((v) => (
                    <p>{v.rank}.{v.movieNm} | {v.openDt}</p>
                )));
            })
    }

    const gemovielist = async () => {
      let res = await axios.get(url);
      let data = res.data;
    }

    useEffect(() => {
        getMovieList();
    }, [])

    return (
        <div>
            <h1>영화 순위</h1>
            {topMovie}
        </div>
    )
}

export default MovieList