package atividade;

public class Aluno {
	String nome;
	double nota1;
	double nota2;
	double resultado = 0;

	public Aluno(String nome, double nota1, double nota2) {
		super();
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Media: " + resultado;
	}

	public String getNome() {
		return nome;
	}

	public double getNota1() {
		return nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double calcularMedia() {
		
		resultado = (nota1 + nota2) / 2;
		if (nota1 == 0 || nota2 == 0) {
			throw new AlunoException("A nota não pode ser menor ou igual a 0");
		} else if (nota1 > 10 || nota2 > 10) {
			throw new AlunoException("A nota não pode ser maior que 10");
		}else {
			return resultado;
		}
	}
}
