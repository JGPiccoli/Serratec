package relacao;

public class TesteImovel {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Roni", "roni@gmail.vom");
		Pessoa p2 = new Pessoa("Adriana", "a@gmail.vom");
		
		Imovel i1 = new Imovel("Casa", 88000., p2);
		
		System.out.println(i1);

	}

}
