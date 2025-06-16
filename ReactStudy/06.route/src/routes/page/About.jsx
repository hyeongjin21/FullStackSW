import React from 'react'
import { Link } from 'react-router'

const About = () => {
    return (
        <div>
            <h1>About</h1>
            <Link to="/">Home 이동</Link>
            <Link to="/prdList">ProductList 이동</Link>
            <Link to="/mypage">MyPage 이동</Link>
        </div>
    )
}

export default About