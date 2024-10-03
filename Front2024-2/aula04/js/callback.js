const saudacao = (nome) => alert(`Olá ${nome}`);

const processamento = (callback) => {
  const nome = prompt("Preencha o nome: ");
  callback(nome);
};

processamento(saudacao);