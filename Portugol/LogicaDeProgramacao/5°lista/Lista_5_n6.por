programa
{
    
    funcao inicio()
    {
        const inteiro linha = 3, coluna = 3
        inteiro matriz[linha][coluna], soma = 0

        para (inteiro l = 0; l < linha; l++)
        {
            para (inteiro c = 0; c < coluna; c++)
            {
                escreva ("Digite o ", l+1, "° número da ", c+1, "° coluna: ")
                leia (matriz [l][c])
            }
            escreva ("\n")
        }
        para (inteiro diagonal = 0; diagonal < linha; diagonal++)
        {    
            soma = soma + matriz[diagonal][diagonal]
        }
        escreva ("A soma da diagonal é: ", soma)
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */