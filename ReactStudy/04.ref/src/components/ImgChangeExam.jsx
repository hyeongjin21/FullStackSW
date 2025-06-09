import { React, useRef, useState } from 'react'

const ImgChangeExam = () => {
    const [imgPath, useImg] = useState(`src/imgs/고양이${0}.jpeg`);
    const animal = useRef("");

    const imgRef = useRef();
    const keyWordRef = useRef();

    const handleClick = (e) => {
        e.preventDefault();
        if(keyWordRef.current.value === "강아지"){
            imgRef.current.src = `src/imgs/강아지${3}.jpeg`;
        }else if(keyWordRef.current.value === "고양이"){
            imgRef.current.src = `src/imgs/고양이${3}.jpeg`;
        }

        // 입력창의 내용을 초기화하고 해당 요소를 선택(focus)하는 기능
        keyWordRef.current.value = "";
        keyWordRef.current.focus();
    }

    const changeImg = (e) => {
        e.preventDefault();
        const randNum = parseInt(Math.random() * 4);
        if (animal.current.value == "강아지") {
            const dogImg = `src/imgs/강아지${randNum}.jpeg`;
            useImg(dogImg);
        } else if (animal.current.value == "고양이") {
            const catImg = `src/imgs/고양이${randNum}.jpeg`;
            useImg(catImg);
        }
    }

    return (
        <div>
            <p>희망하는 사진이 있으신가요?</p>
            <form>
                {/* <p><input ref={animal} /><button onClick={changeImg}>변경!</button></p> */}
                <p><input ref={keyWordRef} /><button onClick={handleClick}>변경!</button></p>
            </form>
            <img ref={imgRef} src={`${imgPath}`} />
            {/* <img src={`${imgPath}`} /> */}
        </div>
    )
}

export default ImgChangeExam