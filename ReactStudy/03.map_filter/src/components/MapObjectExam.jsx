import React from 'react'

const MapObjectExam = () => {

    let members = [
        { id: 1, name: '박수현', age: 25, gender: 'W' },
        { id: 2, name: '류이수', age: 30, gender: 'M' },
        { id: 3, name: '임명진', age: 35, gender: 'M' },
    ];

    let result = members.map((v,i)=>{
        return(<div key={i}> {v.id}.{v.name} - {v.age}({v.gender === "M"?"남자":"여자"}) </div>)
    });

    return (
        <div>
            {members.map((v, i) => (
                <div key={v.id}>{v.id}.{v.name} - {v.age}({v.gender === "M"?"남자":"여자"})</div>
            ))}
            <hr/>
            {result}
        </div>
    )
}

export default MapObjectExam