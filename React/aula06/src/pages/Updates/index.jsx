import Header from "../../components/Header";
import * as styles from "./Updates.module.css";
import { useForm } from "react-hook-form";
import { yupResolver } from "@hookform/resolvers/yup";
import * as yup from "yup";
import axios from "axios";
import { useNavigate, useParams } from "react-router-dom";
import { useEffect } from "react";

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

export default function Updates() {
  let navigate = useNavigate();
  const {id} = useParams();
  const {
    register,
    handleSubmit,
    formState: { errors }, reset
  } = useForm({ resolver: yupResolver(validationPost) });

  useEffect(() => {
    axios.get(`https://6722c0452108960b9cc577b2.mockapi.io/Posts/${id}`)
    .then((response) => {
      reset(response.data)
    })
  }, [])

  const addPost = (data) => {
    axios
      .put(`https://6722c0452108960b9cc577b2.mockapi.io/Posts/${id}`, data)
      .then(() => {
        console.log("Deu tudo certo");
        navigate("/");
      })
      .catch(() => console.log("Problemas na requisição"));
  };

  return (
    <div>
      <Header/>
      <main>
        <div className={styles.cardPost}>
          <h1>Atualizar Postagem</h1>
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