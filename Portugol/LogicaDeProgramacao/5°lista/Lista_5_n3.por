programa
{
	funcao inicio()
	{
		const inteiro tamanho = 10
		real vetor[tamanho]
		para (inteiro i = 0 ; i < tamanho ; i++)
		{
			escreva("Digite o ",i+1,"° número: ")
			leia(vetor[i])
		}
		para (inteiro i = 0;i < tamanho ; i++)
		{
			escreva("O dobro do vetor é: ",vetor[i] * 2, "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 191; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */