function mensagem() {
  console.log("função declarativa");
}
mensagem();

function soma(num1, num2) {
  return num1 + num2;
}
console.log(`Resultado: ${soma(10, 20)}`);

let texto = function(){
    console.log("função anônima");
    return "oi";
}
console.log(texto());

let msg = () => console.log("função Expression ou arrow");
msg();

let res = (num1,num2) => num1 + num2;
console.log(res(10,40));


