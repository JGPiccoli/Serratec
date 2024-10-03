package Atividades;

import javax.swing.JOptionPane;

public class N2 {

	public static void main(String[] args) {
		String n1, n2, n3, n4;
		Double p1, p2, p3, p4;
		Float a1, a2, a3, a4;
		n1 = JOptionPane.showInputDialog("Digite o seu nome: ");
		p1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));
		a1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua altura: "));
		n2 = JOptionPane.showInputDialog("Digite o seu nome: ");
		p2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));
		a2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua altura: "));
		n3 = JOptionPane.showInputDialog("Digite o seu nome: ");
		p3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));
		a3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua altura: "));
		n4 = JOptionPane.showInputDialog("Digite o seu nome: ");
		p4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));
		a4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua altura: "));
		if (p1 > p2) {
			System.out.println(n1 + " a é a pessoa com o maior peso com " + p1 + " kg");
		} else if (p2 > p3) {
			System.out.println(n2 + " a é a pessoa com o maior peso com " + p2 + " kg");
		} else if (p3 > p4) {
			System.out.println(n3 + " a é a pessoa com o maior peso com " + p3 + " kg");
		} else {
			System.out.println(n4 + " a é a pessoa com o maior peso com " + p4 + " kg");
		}
		if (a1 > a2) {
			System.out.println(n1 + " a é a pessoa mais alta com " + a1 + " metros de altura");
		} else if (a2 > a3) {
			System.out.println(n2 + " a é a pessoa mais alta com " + a2 + " metros de altura");
		} else if (a3 > a4) {
			System.out.println(n3 + " a é a pessoa mais alta com " + a3 + " metros de altura");
		} else {
			System.out.println(n4 + " a é a pessoa mais alta com " + a4 + " metros de altura");
		}
		System.out.println("A media de peso das quatro pessoas é " + (p1 + p2 + p3 + p4) / 2);
		System.out.println("A media de altura das quatro pessoas é " + (a1 + a2 + a3 + a4) / 2);
	}
}
