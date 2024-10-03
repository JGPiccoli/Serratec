package exemplos;

import javax.swing.JOptionPane;

public class Calculo {
	public static void main(String[] args) {
		float num1, num2;
		num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor: "));
		calc(num1, num2);
	}
	
	public static void calc(float num1, float num2) {
		JOptionPane.showMessageDialog(null, (num1+num2)/2);
	}
}
