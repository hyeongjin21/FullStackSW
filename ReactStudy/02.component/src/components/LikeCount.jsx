import React, { useState } from 'react'

const LikeCount = () => {
    const imgPath = "src/assets/img";
    
    const [num,setNum] = useState(0);
    const [emoji,setEmoji] = useState("🤍"); // window + .

    const handleClick = () =>{
        if(emoji === "🤍"){
            setEmoji("❤");
            setNum(num+1);
        }else{
            setEmoji("🤍");
            setNum(num-1);
        }
    }

    return (
        <div>
            <img 
            style={{width:300,height:180}}
            src={`${imgPath}/풍경.jpeg`} alt={"풍경 이미지"} />
            <p><span onClick={handleClick}>{emoji}</span> 좋아요 {num}개</p>
        </div>
    )
}

export default LikeCount
