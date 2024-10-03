package testes;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o nome: ");
		String nome = sc.next();

		System.out.println("Entre com a idade: ");
		Integer idade = sc.nextInt();
		System.out.println(idade);

		System.out.println("Entre com o salrio: ");
		Double salario = sc.nextDouble();
		System.out.println(salario);
		sc.close();
		
		System.out.printf("%s tem %d anos e salario de %.2f", nome, idade, salario);
	}
}