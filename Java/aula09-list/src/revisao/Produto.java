package revisao;

public class Produto {
	private String descrição;
	private Double valor;

	public Produto(String descrição, Double valor) {
		super();
		this.descrição = descrição;
		this.valor = valor;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
