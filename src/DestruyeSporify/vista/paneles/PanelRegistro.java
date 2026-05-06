package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;

import DestruyeSporify.controlador.Controlador;
import DestruyeSporify.vista.ventanas.MainFrame;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import javax.swing.JComboBox;

public class PanelRegistro extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Controlador controlador = null;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtUsuario;
	private JTextField txtContraseña;
	private JTextField txtConfirmarContraseña;
	private JDateChooser dateChooser;
	private boolean premiun = false;
	private JComboBox<String> comboBoxIdioma = null;

	public PanelRegistro(MainFrame ventana) {
		setLayout(null);

		setSize(545, 400);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(34, 45, 46, 14);
		add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(90, 42, 86, 20);
		add(txtNombre);
		txtNombre.setColumns(10);

		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(256, 45, 46, 14);
		add(lblApellido);

		txtApellido = new JTextField();
		txtApellido.setBounds(325, 42, 86, 20);
		add(txtApellido);
		txtApellido.setColumns(10);

		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(34, 84, 46, 14);
		add(lblNewLabel);

		txtUsuario = new JTextField();
		txtUsuario.setBounds(90, 81, 86, 20);
		add(txtUsuario);
		txtUsuario.setColumns(10);

		JLabel lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setBounds(34, 122, 81, 14);
		add(lblContraseña);

		txtContraseña = new JTextField();
		txtContraseña.setBounds(100, 119, 126, 20);
		add(txtContraseña);
		txtContraseña.setColumns(10);

		JLabel lblConfirmarContraseña = new JLabel("Confirmar Contraseña:");
		lblConfirmarContraseña.setBounds(34, 156, 116, 14);
		add(lblConfirmarContraseña);

		txtConfirmarContraseña = new JTextField();
		txtConfirmarContraseña.setBounds(149, 153, 133, 20);
		add(txtConfirmarContraseña);
		txtConfirmarContraseña.setColumns(10);

		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
		lblFechaNacimiento.setBounds(34, 181, 95, 14);
		add(lblFechaNacimiento);

		JLabel lblIdioma = new JLabel("Idioma:");
		lblIdioma.setBounds(34, 222, 46, 14);
		add(lblIdioma);

		 String[] opciones = {"ES", "EN", "CA"};
		comboBoxIdioma = new JComboBox<>(opciones);
		comboBoxIdioma.setBounds(72, 218, 133, 22);
		add(comboBoxIdioma);

		dateChooser = new JDateChooser();
		dateChooser.setLocation(128, 181);
		dateChooser.setSize(126, 29);
		add(dateChooser);

		JButton btnAtras = new JButton("Atrás");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.panelLogin();
			}
		});
		btnAtras.setBounds(26, 350, 89, 23);
		add(btnAtras);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				if(null == txtNombre || null == txtApellido  || null == txtUsuario || null == txtContraseña || null == txtConfirmarContraseña) {
					JOptionPane.showMessageDialog(null, "Los datos obligatorios no estan completos", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					Date fechaSeleccionada = dateChooser.getDate();
					java.sql.Date sqlDate = new java.sql.Date(fechaSeleccionada.getTime());
					
					controlador.registrarCliente(txtNombre.getText(), txtApellido.getSelectedText(), txtUsuario.getText(),
							txtContraseña.getText(), txtConfirmarContraseña.getText(), sqlDate, comboBoxIdioma.getSelectedItem().toString(),
							premiun);
				}
			}
		});
		btnGuardar.setBounds(206, 350, 89, 23);
		add(btnGuardar);

		JButton btnComprarPremiun = new JButton("Comprar Premiun");
		btnComprarPremiun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnComprarPremiun.setBounds(382, 350, 133, 23);
		add(btnComprarPremiun);
	}
}
