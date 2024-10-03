package atividade;

public class testarContato {
	public static void main(String[] args) {
		Estado e1 = new Estado("Rio de Janeiro", "RJ");
		Cidade c1 = new Cidade("Petrópolis", e1);
		Endereco en1 = new Endereco("Virgilio de Sá Pereira Junior", "Roseiral", "25715-200", c1);
		Telefone t1 = new Telefone("(24)98856-6707");
		Telefone t2 = new Telefone("8002-8922");
		Contato co1 = new Contato("João Guilherme Piccoli");
		
		co1.adicionarTelefone(t1);
		co1.adicionarTelefone(t2);
		co1.setEndereco(en1);
		
		
		System.out.println(co1);
	}
}