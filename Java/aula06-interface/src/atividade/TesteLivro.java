package atividade;

public class TesteLivro {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Marco Antônio", "Cisco CCNA", 85.00);
		Livro livro2 = new Livro("Katgy Sierra", "Use a Cabeça Java", 98.00);
		Operacao operacao1 = new Operacao("Venda", livro1);
		Operacao operacao2 = new Operacao("Empréstimo", livro2);
		
		
		livro1.reajuste(livro1.getValor());
		operacao1.venderLivro();
		operacao2.emprestarLivro();

		System.out.println(operacao1);
		System.out.println(operacao2);

	}

}
