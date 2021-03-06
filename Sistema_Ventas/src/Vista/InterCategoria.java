package Vista;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class InterCategoria extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterCategoria frame = new InterCategoria();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterCategoria() {
		this.setSize(new Dimension(400,200));
		this.setTitle("Nueva Categoria");
		this.setBounds(100, 100, 450, 300);
		this.getContentPane().setLayout(null);
		this.setResizable(true);
		this.setIconifiable(false);
		
		JLabel Fondo_Pantalla = new JLabel("");
		Fondo_Pantalla.setIcon(new ImageIcon(InterCategoria.class.getResource("/img/fondo3.jpg")));
		Fondo_Pantalla.setBounds(0, 0, 440, 271);
		getContentPane().add(Fondo_Pantalla);
		
		JLabel Etiqueta_Titulo_Nueva_Categoria = new JLabel("Nueva Categoria");
		Etiqueta_Titulo_Nueva_Categoria.setBackground(new Color(0, 139, 139));
		Etiqueta_Titulo_Nueva_Categoria.setForeground(Color.WHITE);
		Etiqueta_Titulo_Nueva_Categoria.setFont(new Font("Arial", Font.BOLD, 16));
		Etiqueta_Titulo_Nueva_Categoria.setBounds(81, 21, 293, 34);
		getContentPane().add(Etiqueta_Titulo_Nueva_Categoria);

	}

}
