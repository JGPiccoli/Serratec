package relacao;

public class Atleta {
	private String nomeAtleta;
	private Integer idade;

	public Atleta(String nomeAtleta, Integer idade) {
		this.nomeAtleta = nomeAtleta;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Nome do Atleta: " + nomeAtleta + ", idade: " + idade;
	}

	public String getNomeAtleta() {
		return nomeAtleta;
	}

	public void setNomeAtleta(String nomeAtleta) {
		this.nomeAtleta = nomeAtleta;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
