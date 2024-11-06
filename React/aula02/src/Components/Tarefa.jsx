export default function Tarefa({titulo, descricao, estado}) {
  return (
    <div>
        <p>{titulo}</p>
        <p>{descricao}</p>
        <p>Status: {estado?"Concluída":"Pendente"}</p>
        </div>
  )
}
