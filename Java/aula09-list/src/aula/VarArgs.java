package aula;

public class VarArgs {

	public static void main(String[] args) {
		int total;
		total = calcularSoma(10,4,20,40,12,100,200,100,1);
		System.out.println("Total: " + total);
	}
	// os ... permite passa quantos numeros quiser
	public static int calcularSoma(int num,int... numeros) {
		int soma = 0;
		for (int i : numeros) {
			soma += i;
		}
		return soma * num;

	}
}
