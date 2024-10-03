package atividade2;

public class Atleta {
	private String nome; // sempre tem que estar privado
	private Double peso;
	private Pais pais;
	private String modalidade;
	private static int totalParticipantes = 0; // tem que ser static para que seja possível manipular ela

	public Atleta(String nome, double peso, Pais pais) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;

		String situacao = verificaSituacao(); // isso é uma recursividade

		if (situacao.equals("Participará!!")) { // equals serve para efetuar uma conversão de
												// qualificação de um objeto igual para retornar um resultado positivo
			totalParticipantes++;

		}
	}

	public String verificaSituacao() {

		if (this.getPeso() >= 90) {
			setModalidade("Peso pesado");
			return "Participará!!";
		} else if (this.getPeso() >= 60 && this.getPeso() < 90) {
			setModalidade("Peso médio!!");
			return "Participará!!";
		} else {
			return "Não participará!!";
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public static Integer getTotalParticipantes() {

		return totalParticipantes;
	}

}
