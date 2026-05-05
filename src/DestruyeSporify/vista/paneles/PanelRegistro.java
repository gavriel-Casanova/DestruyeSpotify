package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;

import DestruyeSporify.controlador.Controlador;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class PanelRegistro extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Controlador controlador = null;
	private JTextField textNombre;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public PanelRegistro() {
		setLayout(null);
		
		JButton btnAtras = new JButton("Atrás");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtras.setBounds(26, 350, 89, 23);
		add(btnAtras);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(206, 350, 89, 23);
		add(btnGuardar);
		
		JButton btnComprarPremiun = new JButton("ComprarPremiun");
		btnComprarPremiun.setBounds(382, 350, 133, 23);
		add(btnComprarPremiun);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(34, 45, 46, 14);
		add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(90, 42, 86, 20);
		add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(256, 45, 46, 14);
		add(lblApellido);
		
		textField = new JTextField();
		textField.setBounds(325, 42, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuario:");
		lblNewLabel.setBounds(34, 84, 46, 14);
		add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(90, 81, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblContraseña = new JLabel("Contraseña:");
		lblContraseña.setBounds(34, 122, 81, 14);
		add(lblContraseña);
		
		textField_2 = new JTextField();
		textField_2.setBounds(100, 119, 126, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblConfirmarContraseña = new JLabel("Confirmar Contraseña:");
		lblConfirmarContraseña.setBounds(34, 156, 116, 14);
		add(lblConfirmarContraseña);
		
		textField_3 = new JTextField();
		textField_3.setBounds(149, 153, 133, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
		lblFechaNacimiento.setBounds(34, 181, 95, 14);
		add(lblFechaNacimiento);
		
		JLabel lblIdioma = new JLabel("Idioma:");
		lblIdioma.setBounds(34, 222, 46, 14);
		add(lblIdioma);
		
		JComboBox comboBoxIdioma = new JComboBox();
		comboBoxIdioma.setBounds(72, 218, 133, 22);
		add(comboBoxIdioma);
	}
}
