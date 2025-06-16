import React, { useEffect, useState } from 'react'

/*
    실습) 참참참 게임
    1. 사용자는 공격, 컴퓨터는 수비 역할
    2. "좌","정면","우" 중 하나를 클릭했을 때, 사용자와 컴퓨터의 선택을 비교합니다.
        - 같은 선택일 경우 : 사용자의 승리
        - 다른 선택일 경우 : 컴퓨터의 승리
    3. 승리에 대한 결과를 화면에 출력합니다

    * 좌,우,정면 값은 배열에 담아 사용
    * 사용자, 컴퓨터, 결과값에 대한 state 생성할 것

*/

const ChamChamCham = () => {

    const [user, setUser] = useState();
    const [com, setCom] = useState();
    const [result, setResult] = useState("");
    const chamList = ["좌", "정면", "우"];
    const [cnt, setCnt] = useState(0);

    const clickButton = (e) => {
        const userSelect = e.target.innerText;
        setUser(userSelect);
        setCom(chamList[parseInt(Math.random() * 3)]);
        setCnt(cnt + 1);
    };

    useEffect(() => {
        if (user != null) {
            if (user === com) {
                setResult(result + "승");
            } else {
                setResult(result + "패");
            }
            // user == com ? setResult(result + "승") : setResult(result + "패");
        }

    }, [com, cnt])

    return (
        <div>
            <h1>참참참 게임!</h1>
            <p>나의 선택 : {user}</p>
            <p>컴퓨터의 선택 : {com}</p>
            {result == "" ? (<p></p>) : <p>게임 결과 : {result}</p>}
            {/* 
                ""(공백)은 false로 인식하기 때문에 오른쪽의 태그를 출력하지 않음
                result state에 값이 초기화되면 true로 인식하면서 결과값을 출력
            */}
            {/* {result && <p>게임 결과 : {result}</p>} */}
            <button onClick={clickButton}>좌</button>
            <button onClick={clickButton}>정면</button>
            <button onClick={clickButton}>우</button>
        </div>
    )
}

export default ChamChamCham