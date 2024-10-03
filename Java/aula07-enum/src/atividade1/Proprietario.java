package atividade1;

public class Proprietario {
	String nome;

	public Proprietario(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome: " + nome;
	}

	public String getNome() {
		return nome;
	}

}
