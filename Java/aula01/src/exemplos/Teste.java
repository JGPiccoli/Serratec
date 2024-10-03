package exemplos;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {
		String nome;
		System.out.println("Hello World!");
		JOptionPane.showMessageDialog(null, "Hello World!");
		nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		JOptionPane.showMessageDialog(null, "Hello " + nome);
	}
}
