const pessoas = [
  { nome: "João", idade: 20, cidade: "Petrópolis" },
  { nome: "Ana", idade: 28, cidade: "Petrópolis" },
  { nome: "Carla", idade: 44, cidade: "São Paulo" },
  { nome: "Carlos", idade: 38, cidade: "Petrópolis" },
  { nome: "Igor", idade: 16, cidade: "Juiz de Fora" },
];

const filtro = pessoas.filter((pessoas) => pessoas.cidade === "Petrópolis" && pessoas.idade < 18
);

console.log(filtro);
const busca = pessoas.find((pessoas) => pessoas.cidade.toUpperCase === "Petrópolis");
console.log(busca);
