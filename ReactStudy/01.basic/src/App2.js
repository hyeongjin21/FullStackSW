import React from 'react'

const App2 = () => {

    let name = prompt("이름을 적어주세요.");

    // 날짜, 시간 관련 정보를 가진 객체
    let date = new Date();
    let month = date.getUTCMonth()+1; // 0~11 값으로 반환 -> +1 더해주는 작업 필요
    // let month = 11;
    let result = "";
    let nowDate = date.toLocaleDateString(); // 현지 시간 기준 날짜(년/월/일) 반환

    let a = [3,4,5];
    let b = [6,7,8];
    let c = [9,10,11];
    let d = [12,1,2];
    let asd = [a,b,c,d];
    let season = ["봄","여름","가을","겨울"];
    // let result3 ="";
    let s = {
        "봄" : [3,4,5],
        "여름" :[6,7,8],
        "가을" : [9,10,11],
        "겨울" : [12,1,2]
    }
    // for(let i =0;i<Object.values(s).length;i++){

    // }
    // Object.values(s).map((data,i)=>{
    //     if(data.indexOf(month) != -1){
    //         result3 = Object.keys()[i];
    //     }
    // })
    // console.log("result3",result3);
    let result2 = "";
    asd.map((data,i) =>{
        if(data.indexOf(month) != -1){
            result2 = season[i];
        }
    });

    switch(month){
        case 3:
        case 4:
        case 5:
            result = "봄";
            break;
        case 6:
        case 7:
        case 8:
            result = "여름";
            break;
        case 9:
        case 10:
        case 11:
            result = "가을";
            break;
        default:
            result = "겨울";
            break;
    }

  return (
    <div>
        <h1>{nowDate}</h1><hr/>
        <p>{name}님 안녕하세요. 지금은 {result2}입니다. 좋은 하루 보내세요 :)</p>
    </div>
  )
}

export default App2