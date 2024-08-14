programa
{
	
	funcao inicio()
	{
		const inteiro produto1 = 10
		const inteiro produto2 = 15
		const inteiro produto3 = 20
		inteiro produto
		escreva("Escolha o produto que deseja ver digitando 1 dos números a seguir\n 1° produto - código 1\n 2° produto - código 2\n 3° produto - código 3\n")
		leia(produto)
		se (produto==1){
			escreva("O valor do 1° produto é: ",produto1," R$")
		}senao se (produto==2){
			escreva("O valor do 2° produto é: ",produto2," R$")
		}senao se (produto==3){
			escreva("O valor do 3° produto é: ",produto3," R$")
		}senao{
			escreva("Esse produto não existe")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 609; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */