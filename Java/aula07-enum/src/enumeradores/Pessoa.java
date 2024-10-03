package enumeradores;

public class Pessoa {
	private String nome;
	private EstadoCicil estadoCicil;

	public Pessoa(String nome, EstadoCicil estadoCicil) {
		super();
		this.nome = nome;
		this.estadoCicil = estadoCicil;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EstadoCicil getEstadoCicil() {
		return estadoCicil;
	}

	public void setEstadoCicil(EstadoCicil estadoCicil) {
		this.estadoCicil = estadoCicil;
	}

}
