programa
{
	const inteiro valor = 5
	inteiro vetor[valor]
	funcao inicio()
	{
		para (inteiro i = 0; i < valor; i++)
		{
			escreva ("Digite o ", i+1, "° número: ")
			leia (vetor[i])
		}
		
		bubbleSort()

		para (inteiro k =0; k < valor; k++)
		{
			escreva(vetor[k], " ")
		}
	}
	funcao vazio bubbleSort()
	{
		para(inteiro i = 0; i < valor; i++)
		{
			para(inteiro j = 0; j < valor-1; j++)
			{
				se(vetor[j] > vetor[j+1])
				{
					inteiro void = vetor[j]
					vetor[j] = vetor[j+1]
					vetor[j+1] = void
				}
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 82; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {vetor, 4, 9, 5}-{void, 28, 13, 4};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */