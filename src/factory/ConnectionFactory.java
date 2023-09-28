package factory;

import java.sql.Connection;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class ConnectionFactory {
	
	public DataSource dataSource;
	
	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSource= new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/hotel?useTimeZone=true&timeServerZone=UTC");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("Oscar.0000");
		
		this.dataSource=comboPooledDataSource;
	}
	
	public Connection recuperaConexion() {
		try {
			return this.dataSource.getConnection();
		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

}
