package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.UIManager;

import Controlador.Control_Usuario;
import Modelo.Usuario;

import java.awt.Label;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmLogin {

	private JFrame frame;
	private JTextField Campo_Usuario;
	private JPasswordField Campo_Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmLogin window = new frmLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public frmLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 907, 605);
		frame.setResizable(false);
		frame.setTitle("Login - Sistema de Ventas");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		panel.setBounds(10, 10, 444, 558);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel Etiqueta_Sistema_Ventas = new JLabel("Sistema de Ventas");
		Etiqueta_Sistema_Ventas.setForeground(UIManager.getColor("Button.disabledShadow"));
		Etiqueta_Sistema_Ventas.setFont(new Font("Arial", Font.BOLD, 26));
		Etiqueta_Sistema_Ventas.setBounds(90, 127, 242, 67);
		panel.add(Etiqueta_Sistema_Ventas);
		
		JLabel Logo_Sistema_Ventas = new JLabel("");
		Logo_Sistema_Ventas.setIcon(new ImageIcon(frmLogin.class.getResource("/img/carrito1.png")));
		Logo_Sistema_Ventas.setForeground(Color.WHITE);
		Logo_Sistema_Ventas.setFont(new Font("Arial", Font.BOLD, 26));
		Logo_Sistema_Ventas.setBounds(129, 216, 149, 118);
		panel.add(Logo_Sistema_Ventas);
		
		JLabel Etiqueta_Qubits = new JLabel("Qubits");
		Etiqueta_Qubits.setForeground(Color.WHITE);
		Etiqueta_Qubits.setFont(new Font("Arial", Font.BOLD, 26));
		Etiqueta_Qubits.setBounds(155, 357, 93, 67);
		panel.add(Etiqueta_Qubits);
		
		Panel panel_1 = new Panel();
		panel_1.setBounds(449, 10, 444, 558);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel Logo_Usuario = new JLabel("");
		Logo_Usuario.setIcon(new ImageIcon(frmLogin.class.getResource("/img/user1.png")));
		Logo_Usuario.setForeground(Color.WHITE);
		Logo_Usuario.setFont(new Font("Arial", Font.BOLD, 26));
		Logo_Usuario.setBounds(181, 109, 137, 136);
		panel_1.add(Logo_Usuario);
		
		JLabel Etiqueta_Usuario = new JLabel("");
		Etiqueta_Usuario.setIcon(new ImageIcon(frmLogin.class.getResource("/img/user2.png")));
		Etiqueta_Usuario.setFont(new Font("Arial", Font.BOLD, 22));
		Etiqueta_Usuario.setBounds(76, 297, 44, 37);
		panel_1.add(Etiqueta_Usuario);
		
		JLabel Etiqueta_Password = new JLabel("");
		Etiqueta_Password.setIcon(new ImageIcon(frmLogin.class.getResource("/img/password.png")));
		Etiqueta_Password.setFont(new Font("Arial", Font.BOLD, 22));
		Etiqueta_Password.setBounds(76, 382, 53, 37);
		panel_1.add(Etiqueta_Password);
		
		Campo_Usuario = new JTextField();
		Campo_Usuario.setColumns(10);
		Campo_Usuario.setBounds(149, 297, 224, 37);
		panel_1.add(Campo_Usuario);
		
		Campo_Password = new JPasswordField();
		Campo_Password.setBounds(149, 382, 224, 37);
		panel_1.add(Campo_Password);
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesi\u00F3n");
		btnIniciarSesion.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				this.Login();
			}

			private void Login() {
				if(!Campo_Usuario.getText().isEmpty() && !Campo_Password.getText().isEmpty()) {
					
					Control_Usuario controlUsuario = new Control_Usuario();
					Usuario usuario = new Usuario();
					usuario.setUsuario(Campo_Usuario.getText().trim());
					usuario.setPassword(Campo_Password.getText().trim());
					if(controlUsuario.loginUser(usuario)) {
						JOptionPane.showMessageDialog(null, "Login Correcto..");
					}else {
						JOptionPane.showMessageDialog(null, "Usuario o Clave Incorrecto");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Ingrese sus Credenciales");
				}
			}
			
		});
		btnIniciarSesion.setBackground(UIManager.getColor("CheckBoxMenuItem.selectionBackground"));
		btnIniciarSesion.setForeground(UIManager.getColor("Button.focus"));
		btnIniciarSesion.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnIniciarSesion.setBounds(149, 457, 224, 52);
		panel_1.add(btnIniciarSesion);
	}
	
	
}