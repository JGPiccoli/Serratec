package heranca;

public class Gerente extends Empregado {
	private String categoria;
	private Integer numeroEmpregados;
	
	public Gerente() {
	}

	public Gerente(String nome, String cpf, Double salario, Integer numeroEmpregados, String categoria) {
		super(nome, cpf, salario);
		this.categoria = categoria;
		this.numeroEmpregados = numeroEmpregados;
	}

	@Override
	public String toString() {
		return super.toString() + ", categoria: " + categoria + ", Nº Emp.: " + numeroEmpregados;
	}

	@Override
	public void aumentarSalario() {
		salario = salario * 1.15;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getNumeroEmpregados() {
		return numeroEmpregados;
	}

	public void setNumeroEmpregados(Integer numeroEmpregados) {
		this.numeroEmpregados = numeroEmpregados;
	}

}