package aula;

import javax.swing.JOptionPane;

public class GerarFolha {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.setcpf(JOptionPane.showInputDialog("Digite o cpf do funcionario"));
		funcionario.setnome(JOptionPane.showInputDialog("Digite o nome do funcionario"));
		funcionario.setSalarioBruto(Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do funcionario")));
		
		JOptionPane.showMessageDialog(null, "Nome: " + funcionario.getNome() + " é: " + funcionario.CalcularFolha());

		// System.out.println("Total de funcionarios " + Funcionario.total);
	}

}