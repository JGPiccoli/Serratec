package revisao;

import javax.swing.JOptionPane;

public class Exemplos {

	public static void main(String[] args) {

		// enquanto
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		// faça enquanto
		do {
			System.out.println(i);
			i--;
		} while (i >= 1);

		// para
		for (int j = 1; j <= 10; j++) {
			System.out.println(j);
		}

		// array
		String[] times = { "Flamengo", "Vasco", "Botafogo", "Fluminense" };
		for (int j = 0; j < times.length; j++) {
			if (j >= 1 && j <= 2) {
				continue;
			}
			System.out.println(times[j]);
			// break sai da repetição
			break;
		}

		// foreach: array simplificado
		System.out.println("**foreach**");
		for (String t : times) {
			System.out.println(t);
		}

		// diz quantos dos números digitados são pares ou impares
		int impar = 0, par = 0, num = 0;
		for (int p = 1; p <= 20; p++) {
			String input = JOptionPane.showInputDialog("Digite um número:");
			num = Integer.parseInt(input);
			if (num % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		JOptionPane.showMessageDialog(null, "Você digitou " + par + " pares.");
		JOptionPane.showMessageDialog(null, "Você digitou " + impar + " impares.");
	}
}