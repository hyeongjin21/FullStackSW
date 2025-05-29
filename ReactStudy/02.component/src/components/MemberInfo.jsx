import React from 'react'

const Memberinfo = ({team,member}) => {

  return (
    <div  className='team-info'>
        <h4>{team}</h4>
        <spawn>{member}</spawn>
    </div>
  )
}

export default Memberinfo