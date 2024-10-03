package atividade;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno[] alunos = new Aluno[4];
		alunos[0] = new Aluno("João", 7, 4);
		alunos[1] = new Aluno("Fulano", 10, 10);
		alunos[2] = new Aluno("Ciclano", 10, 6);
		alunos[3] = new Aluno("Bertrano", 9, 8);

		for (Aluno aluno : alunos) {
			try {
				aluno.calcularMedia();
			} catch (ArithmeticException e) {
				throw new AlunoException("A nota não pode ser menor ou igual a 0 ou maior que 10");
			} 
			System.out.println(aluno.toString());
			
		}
		

	}

}
