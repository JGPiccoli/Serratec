import Header from "../../components/Header";
import * as styles from "./Posts.module.css";
import { useForm } from "react-hook-form";
import { yupResolver } from "@hookform/resolvers/yup";
import * as yup from "yup";
import axios from "axios";
import { useNavigate } from "react-router-dom";

const validationPost = yup.object().shape({
  titulo: yup
    .string()
    .required("O titulo deve ser preenchido")
    .max(40, "Tamanho máx. 40 caracteres"),
  descricao: yup
    .string()
    .required("A descrição deve ser preenchido")
    .max(100, "Tamanho máx. 100 caracteres"),
  conteudo: yup
    .string()
    .required("O conteudo deve ser preenchido")
    .max(80, "Tamanho máx. 80 caracteres"),
});

export default function Posts() {
  let navigate = useNavigate();

  const {
    register,
    handleSubmit,
    formState: { errors },
  } = useForm({ resolver: yupResolver(validationPost) });

  const addPost = (data) => {
    axios
      .post("https://6722c0452108960b9cc577b2.mockapi.io/Posts", data)
      .then(() => {
        console.log("Deu tudo certo");
        navigate("/");
      })
      .catch(() => console.log("Problemas na requisição"));
  };

  return (
    <div>
      <Header />
      <main>
        <div className={styles.cardPost}>
          <h1>Criar Postagem</h1>
          <div className={styles.linePost} />
          <div className={styles.cardBodyPost}>
            <form onSubmit={handleSubmit(addPost)}>
              <div className={styles.fields}>
                <label htmlFor="titulo">Titulo</label>
                <input
                  type="text"
                  name="titulo"
                  id="titulo"
                  {...register("titulo")}
                />
                <p className={styles.errorMessage}>{errors.titulo?.message}</p>
              </div>

              <div className={styles.fields}>
                <label htmlFor="descricao">Descrição</label>
                <input
                  type="text"
                  name="descricao"
                  id="descricao"
                  {...register("descricao")}
                />
                <p className={styles.errorMessage}>
                  {errors.descricao?.message}
                </p>
              </div>

              <div className={styles.fields}>
                <label htmlFor="conteudo">Conteudo</label>
                <textarea
                  type="text"
                  name="conteudo"
                  id="conteudo"
                  cols="30"
                  rows="10"
                  {...register("conteudo")}
                ></textarea>
                <p className={styles.errorMessage}>
                  {errors.conteudo?.message}
                </p>
              </div>

              <div className={styles.btnPost}>
                <button type="submit">Cadastrar</button>
              </div>
            </form>
          </div>
        </div>
      </main>
    </div>
  );
}