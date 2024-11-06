import { useParams } from "react-router-dom";
import Header from "../../components/Header";
import { useEffect, useState } from "react";
import axios from "axios";
import * as styles from "./More.module.css";

export default function More() {
  const { id } = useParams();
  const [readMore, setReadMore] = useState({});

  useEffect(() => {
    axios
      .get(`https://6722c0452108960b9cc577b2.mockapi.io/Posts/${id}`)
      .then((response) => {
        setReadMore(response.data);
      });
  }, []);

  return (
    <div>
      <Header />
      <main>
        <div className={styles.cards}>
          <div className={styles.card}>
            <header>
              <h2>{readMore.titulo}</h2>
            </header>
            <div className={styles.line} />
            <p>{readMore.conteudo}</p>
          </div>
        </div>
      </main>
    </div>
  );
}
