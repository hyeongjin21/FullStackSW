import React from 'react'

const MenuNav = ({onFilter}) => {

    const categorys = ['All', '커피', '디저트', '에이드', '베이커리'];

    return (
        <div>
            <ul className='menu-nav'>
                {categorys.map((v, i) => (
                    <li onClick={() => onFilter(v)} key={i}>{v}</li>
                ))}
            </ul>
        </div>
    )
}

export default MenuNav