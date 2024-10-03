package br.com.serratec.exemplos;

public class Empregado {
	private String nome;
	private String profissao;

	public Empregado(String nome, String profissao) {
		this.nome = nome;
		this.profissao = profissao;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\nprofissao: " + profissao + "\n";
	}

	public String getNome() {
		return nome;
	}

	public String getProfissao() {
		return profissao;
	}

}
