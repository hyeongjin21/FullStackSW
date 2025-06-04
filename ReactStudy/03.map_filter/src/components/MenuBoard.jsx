import React, { useState } from 'react'
import menuData from '../assets/data/coffee_menu.json'
import MenuItem from './MenuItem'
import MenuNav from './MenuNav';

const MenuBoard = () => {
    // let menu = menuData.map((v,i)=>{
    //     return (<div><MenuItem menu={v}/></div>)
    // });
    const [menus, setMenu] = useState(menuData);

    const menuFilter = (category) =>{
        let menu = menuData.filter( (v)=>{
            if(category=='All'){
                return menuData;
            }else{
                return v.category == category
            }
        });
        setMenu(menu);
    }

    return (
        // <div>{menu}</div>
        <div className='menu-board'>
            <h1>메뉴판</h1>
            <MenuNav onFilter={menuFilter}/>
            <div className='menu-list'>
                {menus.map((v) => (
                    <MenuItem menu={v} />
                ))}
            </div>
        </div>

    )
}

export default MenuBoard