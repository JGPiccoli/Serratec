package aula;

public class TesteEquals {

	public static void main(String[] args) {
		Fornecedor f1 = new Fornecedor("123", "ABC LTDA");
		Fornecedor f2 = new Fornecedor("131", "ABC LTDA");
		
		String resultado = (f1 == f2 ? "Iguais":"Diferentes");
		System.out.println(resultado);
		
		//System.out.println(f1.getNome().equals(f2.getNome()));
		
	}

}
