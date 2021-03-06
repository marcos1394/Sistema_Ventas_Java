package Vista;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Color;


public class frmMenu21 {

	public static JFrame frmMenuSistema = new JFrame();
	public static JDesktopPane jDesktopPane_menu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMenu21 window = new frmMenu21();
					window.frmMenuSistema.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public frmMenu21() {
		initialize();
	
	
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frmMenuSistema.getContentPane().setLayout(null);
		frmMenuSistema.getContentPane().setFont(new Font("Arial", Font.BOLD, 16));
		frmMenuSistema.setSize(new Dimension(1235, 700));
		frmMenuSistema.setLocationRelativeTo(null);
		frmMenuSistema.setIconImage(Toolkit.getDefaultToolkit().getImage(frmMenu21.class.getResource("/img/ventas.png")));
		frmMenuSistema.setTitle("Menu - Sistema de Ventas");
		frmMenuSistema.getContentPane().setLayout(null);
		
		JMenuBar BarraMenu = new JMenuBar();
		BarraMenu.setBounds(0, 0, 1221, 28);
		frmMenuSistema.getContentPane().add(BarraMenu);
		
		JMenu MenuUsuario = new JMenu("Usuario");
		MenuUsuario.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/usuario.png")));
		MenuUsuario.setPreferredSize(new Dimension(150, 50));
		MenuUsuario.setFont(new Font("Arial", Font.BOLD, 16));
		BarraMenu.add(MenuUsuario);
		
		JMenuItem UsuarioCrearUsuario = new JMenuItem("Crear Usuario");
		UsuarioCrearUsuario.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/nuevo-cliente.png")));
		MenuUsuario.add(UsuarioCrearUsuario);
		
		JMenuItem UsuarioGestionarUsuario = new JMenuItem("Gestionar Usuario");
		UsuarioGestionarUsuario.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/configuraciones.png")));
		MenuUsuario.add(UsuarioGestionarUsuario);
		
		JMenu MenuProducto = new JMenu("Producto");
		MenuProducto.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/producto.png")));
		MenuProducto.setPreferredSize(new Dimension(150, 50));
		MenuProducto.setFont(new Font("Arial", Font.BOLD, 16));
		BarraMenu.add(MenuProducto);
		
		JMenuItem ProductoNuevoProducto = new JMenuItem("Nuevo Producto");
		ProductoNuevoProducto.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/nuevo-producto.png")));
		MenuProducto.add(ProductoNuevoProducto);
		
		JMenuItem ProductoGestionarProducto = new JMenuItem("Gestionar Producto");
		ProductoGestionarProducto.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/configuraciones.png")));
		MenuProducto.add(ProductoGestionarProducto);
		
		JMenuItem ProductoActualizarStock = new JMenuItem("Actualizar Stock");
		ProductoActualizarStock.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/nuevo.png")));
		MenuProducto.add(ProductoActualizarStock);
		
		JMenu MenuCliente = new JMenu("Cliente");
		MenuCliente.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/cliente.png")));
		MenuCliente.setPreferredSize(new Dimension(150, 50));
		MenuCliente.setFont(new Font("Arial", Font.BOLD, 16));
		BarraMenu.add(MenuCliente);
		
		JMenuItem ClienteNuevoCliente = new JMenuItem("Nuevo Cliente");
		ClienteNuevoCliente.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/nuevo-cliente.png")));
		MenuCliente.add(ClienteNuevoCliente);
		
		JMenuItem ClienteGestionarCliente = new JMenuItem("Gestionar Cliente");
		ClienteGestionarCliente.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/configuraciones.png")));
		MenuCliente.add(ClienteGestionarCliente);
		
		JMenu MenuCategoria = new JMenu("Categoria");
		MenuCategoria.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/categorias.png")));
		MenuCategoria.setPreferredSize(new Dimension(150, 50));
		MenuCategoria.setFont(new Font("Arial", Font.BOLD, 16));
		BarraMenu.add(MenuCategoria);
		
		JMenuItem CategoriaNuevaCategoria = new JMenuItem("Nueva Categoria");
		CategoriaNuevaCategoria.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/categorias.png")));
		MenuCategoria.add(CategoriaNuevaCategoria);
		
		JMenuItem CategoriaGestionarCategoria = new JMenuItem("Gestionar Categoria");
		CategoriaGestionarCategoria.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/configuraciones.png")));
		MenuCategoria.add(CategoriaGestionarCategoria);
		
		JMenu MenuFacturar = new JMenu("Facturar");
		MenuFacturar.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/carrito.png")));
		MenuFacturar.setPreferredSize(new Dimension(150, 50));
		MenuFacturar.setFont(new Font("Arial", Font.BOLD, 16));
		BarraMenu.add(MenuFacturar);
		
		JMenuItem FacturarNuevaVenta = new JMenuItem("Nueva Venta");
		FacturarNuevaVenta.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/carrito.png")));
		MenuFacturar.add(FacturarNuevaVenta);
		
		JMenuItem FacturarGestionarVenta = new JMenuItem("Gestionar Venta");
		FacturarGestionarVenta.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/configuraciones.png")));
		MenuFacturar.add(FacturarGestionarVenta);
		
		JMenu MenuReportes = new JMenu("Reportes");
		MenuReportes.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/reportes.png")));
		MenuReportes.setPreferredSize(new Dimension(150, 50));
		MenuReportes.setFont(new Font("Arial", Font.BOLD, 16));
		BarraMenu.add(MenuReportes);
		
		JMenuItem ReportesReporteCliente = new JMenuItem("Reporte Clientes");
		ReportesReporteCliente.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/reporte1.png")));
		MenuReportes.add(ReportesReporteCliente);
		
		JMenuItem ReportesReporteCategoria = new JMenuItem("Reporte Categoria");
		ReportesReporteCategoria.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/reportes.png")));
		MenuReportes.add(ReportesReporteCategoria);
		
		JMenuItem ReportesReporteProducto = new JMenuItem("Reporte Productos");
		ReportesReporteProducto.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/anadir.png")));
		MenuReportes.add(ReportesReporteProducto);
		
		JMenuItem ReportesReporteVenta = new JMenuItem("Reporte Ventas");
		ReportesReporteVenta.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/carrito.png")));
		MenuReportes.add(ReportesReporteVenta);
		
		JMenu MenuHistorial = new JMenu("Historial");
		MenuHistorial.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/historial1.png")));
		MenuHistorial.setPreferredSize(new Dimension(150, 50));
		MenuHistorial.setFont(new Font("Arial", Font.BOLD, 16));
		
		BarraMenu.add(MenuHistorial);
		
		JMenuItem HistorialVerHistorial = new JMenuItem("Ver Historial");
		HistorialVerHistorial.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/historial1.png")));
		MenuHistorial.add(HistorialVerHistorial);
		
		JMenu MenuCerrarSesion = new JMenu("Cerrar Sesi\u00F3n");
		MenuCerrarSesion.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/cerrar-sesion.png")));
		MenuCerrarSesion.setPreferredSize(new Dimension(150, 50));
		MenuCerrarSesion.setFont(new Font("Arial", Font.BOLD, 16));
		BarraMenu.add(MenuCerrarSesion);
		
		JMenuItem CerrarSesionCerrarSesion = new JMenuItem("Cerrar Sesi\u00F3n");
		CerrarSesionCerrarSesion.setIcon(new ImageIcon(frmMenu21.class.getResource("/img/cerrar-sesion.png")));
		MenuCerrarSesion.add(CerrarSesionCerrarSesion);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 21, 1186, 642);
		panel.setLayout(null);
		 
		
		
	
		
		
	
	

		
	}
}