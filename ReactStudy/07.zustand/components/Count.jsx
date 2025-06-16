import React from 'react'
import CountBox from './CountBox';
import useCountStore from '../stores/useCountStore';

const Count = () => {

    const { count, increase, increaseBy, decrease } = useCountStore();

    const handleAddCount = () => {
        increase();
    }

    return (
        <div>
            <h1>Count : {count}</h1>
            <button onClick={handleAddCount}>+1</button>
            <button onClick={()=>increaseBy(10)}>+10</button>
            <button onClick={()=>decrease(1)}>감소</button>
            <CountBox />
        </div>
    )
}

export default Count