package Controlador;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Modelo.Usuario;

public class Control_Usuario {

	public boolean loginUser(Usuario objeto) {
		
		boolean respuesta = false;
		
		Connection cn = Conexion.conectar();
		String sql = "select usuario, password from tb_usuarios where usuario = '" + objeto.getUsuario() + "' and password = '" +objeto.getPassword() + "'";

		Statement st;
		try {
			
			st = cn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while (rs.next()) {
				respuesta = true;
			}
			
		}catch(SQLException e) {
			
			System.out.println("Error al Iniciar Sesión");
			JOptionPane.showMessageDialog(null, "Error al Iniciar Sesión");
		}
		
		return respuesta;

	}
	
	
}
