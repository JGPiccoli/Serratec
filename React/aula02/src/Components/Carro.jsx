import PropTypes from "prop-types";

export default function Carro({Modelo, ano, dataLancamento}) {
    Carro.prototype = {
      Modelo: PropTypes.string.isRequired,
      ano: PropTypes.number,
      dataLancamento: PropTypes.instanceOf(Date)
    };
    Carro.defaultProps = {
      modelo: "Modelo Obrigatório",
      ano:0,
      dataLancamento: new Date().toLocaleDateString()
    }
  return (
    <div>
        <li>
        {Modelo} - {ano} - {dataLancamento}
        </li>
    </div>
  );
}
