import { Link } from "react-router-dom";
import Back from "../../assets/back-button.svg";

export default function Header() {
  return (
    <header>
      <div>
        <Link to={"/"}>
          <img src={Back} alt="Voltar" style={{ width: "50px" }} />
        </Link>
      </div>
    </header>
  );
}
