package atividade;

import java.util.ArrayList;
import java.util.List;

public class Contato {
	private String nome;
	private Endereco endereco;
	private List<Telefone> telefones = new ArrayList<>();

	public Contato(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", telefone: " + telefones + ", " + endereco;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public String getNome() {
		return nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void adicionarTelefone(Telefone telefone) {
		telefones.add(telefone);
	}

	public void listarTelefones() {
		for (Telefone v : telefones) {
			System.out.println(v.getNumero());
		}
	}
}