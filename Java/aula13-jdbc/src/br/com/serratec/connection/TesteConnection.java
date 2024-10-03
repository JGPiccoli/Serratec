package br.com.serratec.connection;

import java.sql.Connection;

public class TesteConnection {

	public static void main(String[] args) {
		Connection connection = new ConnectionFactory().getConnection();

	}

}
