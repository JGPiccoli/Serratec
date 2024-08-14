programa
{
	
	funcao inicio()
	{
		real num1 ,num2, m, aluno = 5
		escreva("Digite um número: ")
		leia(num1)
		escreva("Digite outro número: ")
		leia(num2)
		faca
		{
			aluno = media (num1, num2)
		
			se (aluno>=7)
			{
				aprovado(aluno)
			}
			senao se (aluno<7)
			{
				reprovado(aluno)
			}
			aluno = aluno - 1
		}enquanto ( aluno == 5)
	}
	funcao real media (real num1, real num2)
	{
		escreva("A media do aluno é: ", (num1 + num2) / 2)
		retorne (num1 + num2) / 2
	}
	funcao aprovado (real aluno)
	{
			escreva("\nO aluno foi aprovado")
	}
	funcao reprovado (real aluno)
	{
			escreva("\nO aluno foi reprovado")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 348; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */