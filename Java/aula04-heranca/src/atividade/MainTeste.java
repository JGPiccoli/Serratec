package atividade;

import java.util.Scanner;

public class MainTeste {
	public static void main(String[] args) {
		Fixo v1 = new Fixo("Joana", "12345678912", 2150., 100., null);
		Fixo v2 = new Fixo("Maria", "98765432198", 2000., 100., null);
		double valorVenda;
		int opcao;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Vendedor: \n1- Joana \n2- Maria \n3- sair do programa \nEscolha o vendedor: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Digite o valor da venda: ");
				v1.setSalarioBase(valorVenda = sc.nextDouble());
				v1.calcularSalario();
				break;
			case 2:
				System.out.println("Digite o valor da venda: ");
				v2.setSalarioBase(valorVenda = sc.nextDouble());
				v2.calcularSalario();
				break;
			case 3:
				break;
			}
		} while (opcao != 3);
		
		
		
	}
	
}
