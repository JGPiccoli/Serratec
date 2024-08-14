programa
{
	
	funcao inicio()
	{
		real num1, num2, sub, div, multi, opcao, resultado
		escreva("Digite um número: ")
		leia(num1)
		escreva("Digite outro número: ")
		leia(num2)
			escreva("Escolha o produto que deseja ver digitando 1 dos números a seguir\n soma - n°1\n subtração - n°2\n divisão - n°3\n multiplicação - n°4\n")
			leia(opcao)
			se(opcao == 1){
				resultado = adicao (num1, num2)
				escreva("A soma dos dois números é: ",resultado)
			}senao se(opcao == 2){
				resultado = subt (num1, num2)
				escreva("A subtração dos dois números é: ",resultado)
			}senao se(opcao == 3){
				resultado = divi (num1, num2)
				escreva("A divisão dos dois números é: ",resultado)
			}senao se(opcao == 4){
				resultado = multip (num1, num2)
				escreva("A multiplicação dos dois números é: ",resultado)
			}senao{
				escreva("O digito escolhido não é uma opção valida")
		}
	}
	funcao real adicao (real num1, real num2)
	{
		retorne num1 + num2
	}
	funcao real subt (real num1, real num2)
	{
		retorne num1 - num2
	}
	funcao real divi (real num1, real num2)
	{
		retorne num1 / num2
	}
	funcao real multip (real num1, real num2)
	{
		retorne num1 * num2
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 447; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */