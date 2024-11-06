import React, { useState } from 'react'

export default function () {
    const [valor, setValor] = useState(100);
    const [nome,  SetNome] = useState("João")

  return (
    <div>
    <h1>Uso do useState</h1>
    <p>Valor:{valor}</p>
    <p>Nome:{nome}</p>
    <button onClick={() => setValor(valor*2)}>Calcular</button>
    <button onClick={() => SetNome("Piccoli")}>Troca nome</button>
    </div>
  )
}
