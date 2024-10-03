package exemplos;

import javax.swing.JOptionPane;

public class maratona {
	public static void main(String[] args) {
		double idade;
		float altura;
		idade = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua idade: "));
		altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua idade: "));
		if (idade >= 18 || altura > 1.70) {
			JOptionPane.showMessageDialog(null, "Pode participar da maratona");
		} else {
			JOptionPane.showMessageDialog(null, "Não pode participar da maratona");
		}
		String res = (idade >= 18 || altura >= 1.70 ? "pode participar da maratona"
				: "não pode participar da maratona");
		JOptionPane.showMessageDialog(null, "O atleta " + res);
	}
}
