package aula;

import javax.swing.JOptionPane;

public class Funcionario {
	private String Cpf;
	private String Nome;
	private Double SalarioBruto;
	private static int total = 0;

	public String getNome() {
		return Nome;
	}

	public String getCpf() {
		return Cpf;
	}

	public Double getSalarioBruto() {
		return SalarioBruto;
	}

	public static int getTotal() {
		return total;
	}

	public void setcpf(String Cpf) {
		this.Cpf = Cpf;
	}

	public void setnome(String nome) {
		this.Nome = nome;
	}

	public void setSalarioBruto(Double SalarioBruto) {
		if (SalarioBruto > 1402) {
			this.SalarioBruto = SalarioBruto;
		} else {
			JOptionPane.showMessageDialog(null, "Salário inválido");
		}
	}

	// Salario Liquido * 11% de INSS e 6% de vale transporte

	public Double CalcularFolha() {
		return SalarioBruto * 0.83;
	}

	public static int registro() {
		total++;
		return total;
	}

}