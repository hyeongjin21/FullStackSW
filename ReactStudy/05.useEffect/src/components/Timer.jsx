import React, { useEffect } from 'react'

const Timer = () => {

    useEffect(() => {
      const interval = setInterval(() => {
        console.log("1초마다 실행")        
    },1000);

    
    // Unmountiong(앱 종료)에 대한 처임
    return ()=>{
        console.log('타이머 종료')
        clearInterval(interval);
    }
},[])


  return (
    <div>Timer</div>
  )
}

export default Timer