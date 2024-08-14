programa
{
	
	funcao inicio()
	{
		inteiro num, soma = 0, resultado, contador = 0
		escreva("digite um número: ")
		leia(num)
		resultado = 0
		enquanto (num>0){
			resultado = num % 10
			soma = soma + resultado
			num = num / 10
			contador = contador + 1
		}
		escreva("O numero de dígitos é: ",contador)
		escreva("\nA soma dos dígitos é: ",soma)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 298; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 6, 10, 3}-{soma, 6, 15, 4}-{resultado, 6, 25, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */