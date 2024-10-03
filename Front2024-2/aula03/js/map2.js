const nomes = ['Ana','Carla','Maria','João'];

for (let i = 0; i < nomes.length; i++) {
    console.log(nomes[i].substring(0,1));
}

console.log(nomes.map((nome)=>nome.substring(0,1)));

const alunos = [
    {matricula:"123",nome:"Roni",email:"roni@gmail.com"},
    {matricula:"121",nome:"Ana",email:"ana@gmail.com"},
    {matricula:"122",nome:"Carlos",email:"carlos@gmail.com"},
];

alunos.map((a) => a.nome).forEach((a) => console.log(a));