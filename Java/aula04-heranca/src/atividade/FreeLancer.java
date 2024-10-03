package atividade;

public class FreeLancer extends Vendedor {
	private Integer diasTrabalho;
	private Double valorDia;

	public FreeLancer(String nome, String cpf, Integer diasTrabalho, Double valorDia) {
		super(nome, cpf);
		this.diasTrabalho = diasTrabalho;
		this.valorDia = valorDia;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public Integer getDiasTrabalho() {
		return diasTrabalho;
	}

	public void setDiasTrabalho(Integer diasTrabalho) {
		this.diasTrabalho = diasTrabalho;
	}

	public Double getValorDia() {
		return valorDia;
	}

	public void setValorDia(Double valorDia) {
		this.valorDia = valorDia;
	}

}
