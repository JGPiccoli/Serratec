package relacao;

public class Imovel {
	private String tipo;
	private Double Valor;
	private Pessoa pessoa;

	public Imovel(String tipo, Double valor, Pessoa pessoa) {
		super();
		this.tipo = tipo;
		Valor = valor;
		this.pessoa = pessoa;
	}

	@Override
	public String toString() {
		return "tipo: " + tipo + ", Valor: " + Valor + ", " + pessoa;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getValor() {
		return Valor;
	}

	public void setValor(Double valor) {
		Valor = valor;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
