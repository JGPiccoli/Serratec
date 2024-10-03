package atividade2;

public class Pais {
	private String nome;

	public Pais(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Pais: nome = " + nome + "\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
