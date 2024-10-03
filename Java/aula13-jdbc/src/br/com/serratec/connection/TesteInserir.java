package br.com.serratec.connection;

import java.util.Scanner;

import br.com.serratec.dao.ClienteDao;
import br.com.serratec.entity.Cliente;

public class TesteInserir {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = sc.next();
		System.out.println("Telefone: ");
		String telefone = sc.next();
		System.out.println("Email: ");
		String email = sc.next();
		
		Cliente cliente = new Cliente(null, nome, telefone, email);
		ClienteDao dao = new ClienteDao();
		dao.inserir(cliente);
		System.out.println("deu certo");
		
	}

}
