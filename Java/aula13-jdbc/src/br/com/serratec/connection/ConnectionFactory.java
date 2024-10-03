package br.com.serratec.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	String url = "jdbc:postgresql://localhost:5432/curso";
	String usuario = "postgres";
	String senha = "JGPiccoli01142006";

	private Connection connection;

	public Connection getConnection() {
		System.out.println("Conectando ao banco");
		try {
			connection = DriverManager.getConnection(url,usuario,senha);
			if (connection != null) {
				System.out.println("Conectado com sucesso");
			}else {
				System.out.println("Falhao ao conectar");
			}
		} catch (SQLException e) {
			System.err.println("não foi possivel conectar");
		}
		return connection;
	}
	
	
	
}
