const numeros = [10,20,30,5,10,20];

var soma = 0;

for (let i = 0; i < numeros.length; i++) {
    soma += numeros[i];
}

const resultado = numeros.reduce((soma, numero) => soma+numero);
console.log(resultado);