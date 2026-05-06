package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;

import DestruyeSporify.controlador.Controlador;
import DestruyeSporify.vista.ventanas.MainFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelLogin extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Controlador controlador = null;
	private JTextField txtUsuario;
	private JPasswordField psfPassword;
	
	public PanelLogin (MainFrame ventana) {
		controlador = new Controlador();
		setBackground(Color.PINK);
		setSize(800, 600);
		setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(364, 152, 188, 38);
		add(txtUsuario);
		txtUsuario.setColumns(10);
		
		psfPassword = new JPasswordField();
		psfPassword.setBounds(364, 221, 188, 38);
		add(psfPassword);
		
		JButton btnLogin = new JButton("Log in");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean valido = controlador.validarLogin(txtUsuario.getText(), psfPassword.getText());
				if(!valido) {
					JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta", "Error",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnLogin.setBounds(122, 339, 154, 52);
		add(btnLogin);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.panelRegistro();
			}
		});
		btnRegistrarse.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRegistrarse.setBounds(418, 339, 202, 45);
		add(btnRegistrarse);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblUsuario.setBackground(new Color(240, 240, 240));
		lblUsuario.setBounds(224, 158, 73, 26);
		add(lblUsuario);
		
		JLabel lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblContraseña.setBounds(201, 224, 120, 26);
		add(lblContraseña);
	}
}
