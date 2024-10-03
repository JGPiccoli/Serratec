package br.com.serratec.entity;

public class Cliente {
	private String nome;
	private Integer codigo;
	private String teleString;
	private String email;

	public Cliente(Integer codigo, String nome, String teleString, String email) {
		this.codigo = codigo;
		this.nome = nome;
		this.teleString = teleString;
		this.email = email;
	}

	@Override
	public String toString() {
		return "codigo: " + codigo + "\nnome: " + nome + "\nteleString: " + teleString + "\nemail: " + email + "\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getTeleString() {
		return teleString;
	}

	public void setTeleString(String teleString) {
		this.teleString = teleString;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
