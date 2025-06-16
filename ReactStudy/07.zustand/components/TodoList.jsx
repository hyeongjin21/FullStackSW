import React from 'react'
import useTodoStore from '../stores/useTodoStore'

const TodoList = () => {

    const {todos} = useTodoStore();

  return (
    <div>{todos && todos.map((v) => (
        <p key={v.id}>{v.todo}({v.date})</p>
    ))}</div>
  )
}

export default TodoList