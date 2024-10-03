package atividade;

public class Fixo extends Vendedor {
	private Double salarioBase;
	private Double comissao = 0.12;
	private Double salarioBruto;

	public Fixo(String nome, String cpf, Double salarioBase, Double comissao, Double salarioBruto) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
		this.salarioBruto = salarioBruto;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	@Override
	public void calcularSalario() {
		this.salarioBruto = salarioBase;
		System.out.println("O Salário Bruto é: "+ salarioBruto);
	}

}
