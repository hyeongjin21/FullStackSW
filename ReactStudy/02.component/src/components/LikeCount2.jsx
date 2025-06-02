import React, { useState } from 'react'

const LikeCount2 = () => {

    const [num, useNum] = useState(0);

    const handleLikeBtn = (e) => {
        const eName = e.target.name;
        if (eName === "likeBtn") {
            useNum(num + 1);
        } else {
            if (num > 0) {
                useNum(num - 1);
            }
        }
    }

    const decrease = () =>{
        if(num > 0){
            useNum(num-1);
        }
    }

    return (
        <div className='imgContainer'>
            <img src='src/assets/img/풍경.jpeg' />
            <p>좋아요<span>{num}</span></p>
            <p>
                {/* onClick 속성에 함수 실행문을 넣을 때 ()=>함수명 형태로 정의해야 한다 */}
                {/* <button name='likeBtn' onClick={()=>{useNum(num+1)}}>👍</button> */}
                <button name='likeBtn' onClick={handleLikeBtn}>👍</button>
                {/* <button name='unLikeBtn' onClick={decrease}>😢</button> */}
                <button name='unLikeBtn' onClick={handleLikeBtn}>😢</button>
            </p>
        </div>
    )
}

export default LikeCount2