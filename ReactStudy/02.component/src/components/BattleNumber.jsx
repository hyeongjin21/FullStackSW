import React, { useState } from 'react'

/*
    숫자 맞추기
    1. 버튼을 클릭했을 때, 랜덤한 숫자 생성하기(1~3)
        -parseInt(Math.random()+3)+1
    2. 사용자가 누른 버튼의 값과 랜덤한 숫자 비교하기
        - 정답인 경우 -> "정답입니다~"
        - 틀린 경우 -> "땡~"
        - 출력
        - 누른 버튼의 값 가져오는 방법 -> event 객체
*/

const BattleNumber = () => {

    const [comNum, setComNum] = useState(0);
    const [userNum, setUserNum] = useState(0);
    const [result, setResult] = useState("");

    const checkNum = (e) => {
        let num = parseInt(e.target.innerText);
        let com = parseInt(Math.random() * 3) + 1;
        setUserNum(num);
        setComNum(com);
        // setResult(num===com?"정답":"땡");
        if(num === com){
            setResult("정답입니다.");
        }else{
            setResult("땡");
        }
    }

    return (
        <div>
            <div>
                <button onClick={checkNum}>1</button>
                <button onClick={checkNum}>2</button>
                <button onClick={checkNum}>3</button>
                <p>랜덤 값 : {comNum}</p>
                <p>선택한 값 : {userNum}</p>
                <p>결과 : {result}</p>
            </div>

        </div>
    )
}

export default BattleNumber