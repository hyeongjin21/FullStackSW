import React from 'react'

// filter()
// - 배열 내 요소 중 조건에 부합한 요소를 새로운 배열로 묶어서 반환하는 함수
// - map() 처럼 출력하는 것은 아니기 떄문에 조건을 확인할 때 filter()로 처리하고
//   출력은 map()로 활용

const FilterExam = () => {

    let numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

    let members = [
        { id: 1, name: '박수현', age: 25, gender: 'W' },
        { id: 2, name: '류이수', age: 30, gender: 'M' },
        { id: 3, name: '임명진', age: 35, gender: 'M' },
    ];

    let result = numbers.filter((v) => v % 2 === 1)
    // let result = numbers.filter((v) => v % 2 === 1).map((v) => { return (<div>{v}</div>) })

    // let resultMembers = members.filter((v) => v.age >= 30).map((v) => { return (<div>{v.name}</div>) })
    let resultMembers = members.filter((v) => v.age >= 30)

    return (
        <div>
            {/* {numbers} */}
            {result.map((v) => (<div>{v}</div>))}
            {/* {result} */}
            {resultMembers.map((v) => (
                <div key={v.id}>{v.name}</div>
            ))}
            {/* {resultMembers} */}
        </div>
    )
}

export default FilterExam