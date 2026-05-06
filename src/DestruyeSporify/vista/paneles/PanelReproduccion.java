package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;

public class PanelReproduccion extends JPanel{
	public PanelReproduccion() {
		setLayout(null);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(20, 47, 89, 23);
		add(btnAtras);
		
		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.setBounds(347, 47, 89, 23);
		add(btnPerfil);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.setBounds(36, 262, 89, 23);
		add(btnMenu);
		
		JButton btnCancionAnterior = new JButton("<");
		btnCancionAnterior.setBounds(142, 262, 89, 23);
		add(btnCancionAnterior);
		
		JButton btnNewButton_2 = new JButton("Play");
		btnNewButton_2.setBounds(253, 262, 89, 23);
		add(btnNewButton_2);
		
		JButton btnSiguenteCancion = new JButton(">");
		btnSiguenteCancion.setBounds(363, 262, 89, 23);
		add(btnSiguenteCancion);
		
		JComboBox cbxVelocidad = new JComboBox();
		cbxVelocidad.setBounds(497, 262, 30, 22);
		add(cbxVelocidad);
		
		JList list = new JList();
		list.setBounds(131, 83, 235, 148);
		add(list);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
