programa
{
	funcao inicio()
	{
		inteiro n1, n2, n3
		escreva("Digite o 1° número: ")
		leia(n1)
		escreva("Digite o 2° número: ")
		leia(n2)
		escreva("Digite o 3° número: ")
		leia(n3)
		se (n1 > n2 e n1 > n3){
			escreva(n1, " o 1° é o maior número")
		}senao se (n2 > n1 e n2 > n3){
			escreva(n2, " o 2° número maior número")
		}senao{
			escreva(n3, " o 3° número é o maior número")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 190; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */