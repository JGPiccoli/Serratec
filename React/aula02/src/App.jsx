import React from "react";
import Curso from "./Components/Curso";
import Botao from "./Components/Botao";
import Aluno from "./Components/Aluno";
import Tarefa from "./Components/Tarefa";
import Carro from "./Components/Carro";
import "./index.css";
import Caixa from "./Components/Caixa";
import Button from "./Components/Button";
import AppClasse from "./Components/AppClasse";

export default function App() {
  const texto = {
    color: "#5af",
    fontSize: "2em",
  };

  return (
    <div>
      {/* <Curso nome="React" />
      <Botao texto="botao" />
      <Aluno nome="João" idade={18} profissao="Programador" />
      <Tarefa titulo="Tarefa" descricao="Descrição da Tarefa" estado={true} />
      <Carro Modelo="Ford" ano={2024} dataLancamento="10/28/2024" />
      <Carro Modelo="Fusca" ano={2018} dataLancamento="10/28/2018" />*/}
      <h1>Tipos de Estilo</h1>
      <p>Estilo no arquivo</p>
      <h2 style={{ color: "green", fontSize: "2em" }}>Estilo in line</h2>
      <h2 style={texto}>Estilo incorporado</h2>
      <Caixa color="blue" />
      <Button />
      <button className="botao">Clique aqui2</button>
      <AppClasse curso = "React Classe"/>
    </div>
  );
}
