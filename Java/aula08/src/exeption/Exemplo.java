package exeption;

public class Exemplo {
	// throw
	public static double calcular(int a, int b) throws Exception {
		// if (b == 0) {
		// throw new ArithmeticException("Erro de divisão por zero");
		// }
		return a / b;
	}

	public static void main(String[] args) {
		try {
			System.out.println("Entrando no try");
			System.out.println("Resultado: " + calcular(10, 0));
			System.out.println("Saindo no try");
		} catch (Exception e) {
			System.out.println("Erro de divisão por zero");
		}finally {
			System.out.println("Sempre é executado");
		}
	}
}
