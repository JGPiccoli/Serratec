programa
{

    funcao inicio()
    {
        inteiro num
        cadeia asterisco = "*"

        escreva("Digite um número: ")
        leia (num)

        para (inteiro i = 1; i <= num; i++)
        {
            escreva (asterisco, "\n")
            asterisco = asterisco + '*'
        }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 37; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */