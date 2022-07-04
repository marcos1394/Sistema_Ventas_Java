package Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexion {

	public static Connection conectar() {
		
		try {
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_sistema_ventas", "root","");
			return cn;
		} catch (SQLException e) {
			System.out.println("Error en la conexión local " + e);
		}
		return null;
				
	}

}
