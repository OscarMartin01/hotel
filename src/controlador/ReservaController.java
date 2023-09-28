package controlador;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import dao.ReservaDao;
import factory.ConnectionFactory;
import modelo.Reserva;

public class ReservaController {
	
	private ReservaDao reservaDao;
	
	public ReservaController() {
		Connection conexion= new ConnectionFactory().recuperaConexion();
		this.reservaDao= new ReservaDao(conexion);
	}
	
	public void guardar(Reserva reserva) {
		this.reservaDao.guardar(reserva);
	}
	
	public List<Reserva> listar(){
		return this.reservaDao.listar();
	}
	
	public List<Reserva> listarId(Integer id){
		return this.reservaDao.listarId(id);
	}
	
	public void actualizar(String nombre, String apellido,Integer edad, Long telefono, String pais, Date fecha_ent,
							Date fecha_sal, String valor, String forma_pago, Integer id) {
		this.reservaDao.actualizar(nombre,apellido,edad,telefono,pais,fecha_ent,fecha_sal,valor,forma_pago,id);
	}
	
	public void eliminar(Integer id) {
		this.reservaDao.eliminar(id);
	}

}
