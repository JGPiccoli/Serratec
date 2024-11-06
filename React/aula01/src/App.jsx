import Exemplo from "./components/Exemplo";

const app = () => {
  return (
    <div>
      <h1>Hello World</h1>
      <h2>Data: {new Date().toLocaleDateString()}</h2>
      <h2>Hora: {new Date().toLocaleTimeString()}</h2>
      <Exemplo />
    </div>
  );
};
export default app;
