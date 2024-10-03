let testeDoenca = true;
let resultado = testeDoenca === true ? "Positivo" : "Negativo";
console.log(`O resultado do teste é:  ${resultado} em 20-09-2024`);

var frutas = new Array();
var cores = [];
var curso = ["java", "c#", "ruby"];

curso.push("php");
curso.unshift("JS");

for (let i = 0; i < curso.length; i++) {
  console.log(curso[i]);
}
