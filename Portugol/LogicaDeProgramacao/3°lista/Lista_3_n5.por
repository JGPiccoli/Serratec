programa
{

    funcao inicio()
    {
        inteiro num, numInconst, invertido = 0

        escreva("Digite seu número: ")
        leia (num)

        numInconst = num

        enquanto (numInconst > 0)
        {
            invertido = (invertido * 10) + (numInconst % 10)
            numInconst = numInconst / 10
        }
        se (num == invertido)
        {
            escreva ("O número ", num, " é um palíndromo")
        }
        senao
        {
            escreva ("O número ", num, " não é um palíndromo")
        }
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 225; 
 * @PONTOS-DE-PARADA = 6;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */