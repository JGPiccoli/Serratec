programa
{
	
	funcao inicio()
	{
		const inteiro tamanho = 10
		inteiro vetor [tamanho]
		para(inteiro i=0;i<tamanho;i++)
		{
			escreva("digite o ", i+1,"° indice do vetor: ")
			leia(vetor[i])
		}
		para (inteiro i= tamanho - 1;i >= 0;i--)
		{
			escreva(vetor[i], "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 66; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */