package aula;

public class Marca {

	private Integer codigo;
	private String nome;

	public Marca(Integer codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo + ", nome: " + nome + "\n";
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

}
