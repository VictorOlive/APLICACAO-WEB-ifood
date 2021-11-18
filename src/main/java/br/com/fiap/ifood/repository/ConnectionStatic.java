package br.com.fiap.ifood.repository;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConnectionStatic {

	private static Connection connection = null;

	public static Connection getInstace() {

		if (connection == null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				connection = DriverManager.getConnection(
						"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM88664", "161193");
				System.out.println("Conectado!");
			} catch (SQLException e) {
				System.err.println("Não foi possível conectar no Banco de Dados");
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.err.println("O Driver JDBC não foi encontrado!");
				e.printStackTrace();
			}
		}
		return connection;

	}
}
