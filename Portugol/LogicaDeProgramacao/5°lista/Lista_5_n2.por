programa
{
	
	funcao inicio()
	{
		const inteiro tamanho = 10
		real m = 0
		real vetor[tamanho]
		para (inteiro i = 0 ; i < tamanho ; i++)
		{
			escreva("digite o ",i+1,"° do vetor: ")
			leia(vetor[i])
			m = m + vetor[i]
		}
		m = m / 10
		escreva("a media dos n° do vetor é: ",m,"\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 92; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {m, 7, 7, 1}-{vetor, 8, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */