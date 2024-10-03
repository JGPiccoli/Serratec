package br.com.serratec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.serratec.connection.ConnectionFactory;
import br.com.serratec.entity.Cliente;

public class ClienteDao {
	private Connection connection;	

	public ClienteDao() {
		connection = new ConnectionFactory().getConnection();
	}
	
	public void inserir(Cliente cliente) {
		String sql = "insert into cliente(nome,telefone,email) values (?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getTeleString());
			stmt.setString(3, cliente.getEmail());
			stmt.execute();
			stmt.close();
			connection.close();
			
		} catch (SQLException e) {
			System.err.println("Erro ao garvar o registro do cliente");
		}
	}
}
