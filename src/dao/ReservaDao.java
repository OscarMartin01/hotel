package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import modelo.Reserva;

public class ReservaDao {
	
	private Connection connection;

	public ReservaDao(Connection conexion) {
		this.connection= conexion;
	}

	public void guardar(Reserva reserva) {

		try {
			
			String sql= "Insert into reserva (nombre, apellido, edad, telefono, pais, fecha_entrada, fecha_salida, valor, forma_pago) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			try(PreparedStatement statement= connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
				
				statement.setString(1, reserva.getNombre());
				statement.setString(2, reserva.getApellido());
				statement.setInt(3, reserva.getEdad());
				statement.setLong(4, reserva.getTelefono());
				statement.setString(5, reserva.getPais());
				statement.setDate(6, reserva.getFecha_ingreso());
				statement.setDate(7, reserva.getFecha_salida());
				statement.setString(8, reserva.getValor());
				statement.setString(9, reserva.getForma_pago());
				
				statement.executeUpdate();
				
				try(ResultSet resultSet= statement.getGeneratedKeys()){
					while(resultSet.next()) {
						reserva.setId(resultSet.getInt(1));
					}
				}
			}
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public List<Reserva> listar(){
		List<Reserva> reservas= new ArrayList<>();
		
		try {
			
			String sql= "Select id, nombre, apellido, edad, telefono, pais, fecha_entrada, fecha_salida, valor, forma_pago from reserva";
			
			try(PreparedStatement statement= connection.prepareStatement(sql)){
				statement.execute();
				
				transformar(reservas,statement);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		return reservas;
	}
	
	public List<Reserva> listarId(Integer id) {
		List<Reserva> reservas= new ArrayList<>();
		
		try {
			
			String sql= "Select id, nombre, apellido, edad, telefono, pais, fecha_entrada, fecha_salida, valor, forma_pago from reserva where id=?";
			
			try(PreparedStatement statement= connection.prepareStatement(sql)){
				statement.setInt(1, id);
				statement.execute();
				
				transformar(reservas,statement);
				}
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		return reservas;
	}
	
	public void transformar(List<Reserva> reservas, PreparedStatement statement) throws SQLException {
		try(ResultSet resultSet= statement.getResultSet()){
		
			while(resultSet.next()) {
				Reserva datos= new Reserva(resultSet.getInt("id"), 
										   resultSet.getString("nombre"), 
										   resultSet.getString("apellido"),
										   resultSet.getInt("edad"),
										   resultSet.getLong("telefono"),
										   resultSet.getString("pais"),  
										   resultSet.getDate("fecha_entrada"), 
										   resultSet.getDate("fecha_salida"), 
										   resultSet.getString("valor"), 
										   resultSet.getString("forma_pago"));
				
				reservas.add(datos);
			}
		}
	}

	public void actualizar(String nombre, String apellido, Integer edad, Long telefono, String pais, Date fecha_ent,
			Date fecha_sal, String valor, String forma_pago, Integer id) {
		
		try {
			String sql="update reserva set nombre=?, apellido=?, edad=?, telefono=?, pais=?, fecha_entrada=?,"
					+ "fecha_salida=?, valor=?, forma_pago=? where id=?";
			
			try(PreparedStatement statement= connection.prepareStatement(sql)){
				statement.setString(1, nombre);
				statement.setString(2, apellido);
				statement.setInt(3, edad);
				statement.setLong(4, telefono);
				statement.setString(5, pais);
				statement.setDate(6, fecha_ent);
				statement.setDate(7, fecha_sal);
				statement.setString(8, valor);
				statement.setString(9, forma_pago);
				statement.setInt(10, id);
				
				statement.execute();
			}
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}

	}

	public void eliminar(Integer id) {
		
		String sql= "delete from reserva where id=?";
		
		try(PreparedStatement statement= connection.prepareStatement(sql)){
			
			statement.setInt(1, id);
			statement.execute();
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

	


}
