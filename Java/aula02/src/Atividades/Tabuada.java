package Atividades;

import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {
		int num = 0;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		System.out.println("+---------------+");
		for (int i = 1; i <= 10; i++) {
			System.out.println("|"+num + " x " + i + " = " + num * i+"|");
		}
		System.out.println("+-------------------+");
	}
}
