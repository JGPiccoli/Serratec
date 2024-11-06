export default function Caixa(props) {
  const caixa = {
    width: "100px",
    height: "100px",
    backgroundColor: props.com,
  };
  return (
    <div>
      <h1>Curso de React</h1>
      <div style={caixa}>
        <p>Serratec</p>
      </div>
    </div>
  );
}
