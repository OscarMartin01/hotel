package factory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConexion {
	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperaConexion();

		System.out.println("Probando!!");

		connection.close();
		
		System.out.println("Conectado!!");
	}

}
