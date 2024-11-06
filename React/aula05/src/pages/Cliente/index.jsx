import React from 'react'
import { useParams } from 'react-router-dom'
import {StyledButton} from './Button.style'

export default function Cliente() {
    const {id} = useParams();
  return (
    <div>
        <h1>Página do Cliente com id: {id}</h1>
        <StyledButton onClick={() => alert("Clique")}>Clique aqui</StyledButton>
    </div>
  )
}
