package DestruyeSporify.vista.paneles;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

import DestruyeSporify.controlador.Controlador;
import DestruyeSporify.modelo.entidades.Cliente;
import DestruyeSporify.vista.ventanas.MainFrame;

public class PanelPerfil extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField txtNombre;
	private JTextField txtApellido;
	private JDateChooser dateChooser;
	private JComboBox<String> comboBoxIdioma = null;
	
	public PanelPerfil(MainFrame ventana, Cliente cliente, Controlador controlador) {
		setLayout(null);
		setSize(473, 309);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(34, 45, 68, 14);
		add(lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBounds(128, 42, 86, 20);
		txtNombre.setText(cliente.getNombre());
		add(txtNombre);
		txtNombre.setColumns(10);

		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(256, 45, 59, 14);
		add(lblApellido);

		txtApellido = new JTextField();
		txtApellido.setBounds(325, 42, 86, 20);
		txtApellido.setText(cliente.getApellido());
		add(txtApellido);
		txtApellido.setColumns(10);


		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
		lblFechaNacimiento.setBounds(26, 125, 116, 14);
		add(lblFechaNacimiento);
		
		dateChooser = new JDateChooser();
		dateChooser.setLocation(152, 125);
		dateChooser.setSize(126, 29);
		add(dateChooser);
		java.util.Date fecha = new java.util.Date(cliente.getFechaNacimiento().getTime());
		dateChooser.setDate(fecha);

		JLabel lblIdioma = new JLabel("Idioma:");
		lblIdioma.setBounds(34, 174, 46, 14);
		add(lblIdioma);

		String[] opciones = { "ES", "EN", "CA" };
		comboBoxIdioma = new JComboBox<>(opciones);
		comboBoxIdioma.setEnabled(false);
		comboBoxIdioma.setEditable(true);
		comboBoxIdioma.setBounds(90, 170, 133, 22);
		add(comboBoxIdioma);

		

		JButton btnAtras = new JButton("Atrás");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.panelLogin();
			}
		});
		btnAtras.setBounds(34, 226, 89, 23);
		add(btnAtras);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnGuardar.setBounds(350, 226, 89, 23);
		add(btnGuardar);


	}
}
