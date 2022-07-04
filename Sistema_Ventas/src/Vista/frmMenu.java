package Vista;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.ImageIcon;

public class frmMenu {

	private JFrame frmMenuSistema;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmMenu window = new frmMenu();
					window.frmMenuSistema.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenuSistema = new JFrame();
		frmMenuSistema.getContentPane().setFont(new Font("Arial", Font.BOLD, 16));
		frmMenuSistema.setSize(new Dimension(1200,700));
		frmMenuSistema.setLocationRelativeTo(null);
		frmMenuSistema.setIconImage(Toolkit.getDefaultToolkit().getImage(frmMenu.class.getResource("/img/ventas.png")));
		frmMenuSistema.setTitle("Menu - Sistema de Ventas");
		frmMenuSistema.getContentPane().setLayout(null);
		
		JMenuBar BarraMenu = new JMenuBar();
		BarraMenu.setBounds(0, 0, 1176, 22);
		frmMenuSistema.getContentPane().add(BarraMenu);
		
		JMenu MenuUsuario = new JMenu("Usuario");
		MenuUsuario.setIcon(new ImageIcon(frmMenu.class.getResource("/img/usuario.png")));
		MenuUsuario.setPreferredSize(new Dimension(150, 50));
		MenuUsuario.setFont(new Font("Arial", Font.BOLD, 16));
		BarraMenu.add(MenuUsuario);
		
		JMenuItem UsuarioCrearUsuario = new JMenuItem("Crear Usuario");
		MenuUsuario.add(UsuarioCrearUsuario);
		
		JMenuItem UsuarioGestionarUsuario = new JMenuItem("Gestionar Usuario");
		MenuUsuario.add(UsuarioGestionarUsuario);
		
		JMenu MenuProducto = new JMenu("Producto");
		MenuProducto.setIcon(new ImageIcon(frmMenu.class.getResource("/img/producto.png")));
		MenuProducto.setPreferredSize(new Dimension(150, 50));
		MenuProducto.setFont(new Font("Arial", Font.BOLD, 16));
		BarraMenu.add(MenuProducto);
		
		JMenuItem ProductoNuevoProducto = new JMenuItem("Nuevo Producto");
		MenuProducto.add(ProductoNuevoProducto);
		
		JMenuItem ProductoGestionarProducto = new JMenuItem("Gestionar Producto");
		MenuProducto.add(ProductoGestionarProducto);
		
		JMenuItem ProductoActualizarStock = new JMenuItem("Actualizar Stock");
		MenuProducto.add(ProductoActualizarStock);
		
		JMenu MenuCliente = new JMenu("Cliente");
		MenuCliente.setIcon(new ImageIcon(frmMenu.class.getResource("/img/cliente.png")));
		MenuCliente.setPreferredSize(new Dimension(150, 50));
		MenuCliente.setFont(new Font("Arial", Font.BOLD, 16));
		BarraMenu.add(MenuCliente);
		
		JMenuItem ClienteNuevoCliente = new JMenuItem("Nuevo Cliente");
		MenuCliente.add(ClienteNuevoCliente);
		
		JMenuItem ClienteGestionarCliente = new JMenuItem("Gestionar Cliente");
		MenuCliente.add(ClienteGestionarCliente);
		
		JMenu MenuCategoria = new JMenu("Categoria");
		MenuCategoria.setIcon(new ImageIcon(frmMenu.class.getResource("/img/categorias.png")));
		MenuCategoria.setPreferredSize(new Dimension(150, 50));
		MenuCategoria.setFont(new Font("Arial", Font.BOLD, 16));
		BarraMenu.add(MenuCategoria);
		
		JMenuItem CategoriaNuevaCategoria = new JMenuItem("Nueva Categoria");
		MenuCategoria.add(CategoriaNuevaCategoria);
		
		JMenuItem CategoriaGestionarCategoria = new JMenuItem("Gestionar Categoria");
		MenuCategoria.add(CategoriaGestionarCategoria);
		
		JMenu MenuFacturar = new JMenu("Facturar");
		MenuFacturar.setIcon(new ImageIcon(frmMenu.class.getResource("/img/carrito.png")));
		MenuFacturar.setPreferredSize(new Dimension(150, 50));
		MenuFacturar.setFont(new Font("Arial", Font.BOLD, 16));
		BarraMenu.add(MenuFacturar);
		
		JMenuItem FacturarNuevaVenta = new JMenuItem("Nueva Venta");
		MenuFacturar.add(FacturarNuevaVenta);
		
		JMenuItem FacturarGestionarVenta = new JMenuItem("Gestionar Venta");
		MenuFacturar.add(FacturarGestionarVenta);
		
		JMenu MenuReportes = new JMenu("Reportes");
		MenuReportes.setIcon(new ImageIcon(frmMenu.class.getResource("/img/reportes.png")));
		MenuReportes.setPreferredSize(new Dimension(150, 50));
		MenuReportes.setFont(new Font("Arial", Font.BOLD, 16));
		BarraMenu.add(MenuReportes);
		
		JMenuItem ReportesReporteCliente = new JMenuItem("Reporte Clientes");
		MenuReportes.add(ReportesReporteCliente);
		
		JMenuItem ReportesReporteCategoria = new JMenuItem("Reporte Categoria");
		MenuReportes.add(ReportesReporteCategoria);
		
		JMenuItem ReportesReporteProducto = new JMenuItem("Reporte Productos");
		MenuReportes.add(ReportesReporteProducto);
		
		JMenuItem ReportesReporteVenta = new JMenuItem("Reporte Ventas");
		MenuReportes.add(ReportesReporteVenta);
		
		JMenu MenuHistorial = new JMenu("Historial");
		MenuHistorial.setIcon(new ImageIcon(frmMenu.class.getResource("/img/historial1.png")));
		MenuHistorial.setPreferredSize(new Dimension(150, 50));
		MenuHistorial.setFont(new Font("Arial", Font.BOLD, 16));
		BarraMenu.add(MenuHistorial);
		
		JMenuItem HistorialVerHistorial = new JMenuItem("Ver Historial");
		MenuHistorial.add(HistorialVerHistorial);
		
		JMenu MenuCerrarSesion = new JMenu("Cerrar Sesi\u00F3n");
		MenuCerrarSesion.setIcon(new ImageIcon(frmMenu.class.getResource("/img/cerrar-sesion.png")));
		MenuCerrarSesion.setPreferredSize(new Dimension(150, 50));
		MenuCerrarSesion.setFont(new Font("Arial", Font.BOLD, 16));
		BarraMenu.add(MenuCerrarSesion);
		
		JMenuItem CerrarSesionCerrarSesion = new JMenuItem("Cerrar Sesi\u00F3n");
		MenuCerrarSesion.add(CerrarSesionCerrarSesion);
	
	}
}
