package oo;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.nome = "Maria";
		c.cpf = "123";
		c.telefone = "22435309";
		
		System.out.println(c.nome);
		System.out.println(c.cpf);
		System.out.println(c.telefone);

	}
}
