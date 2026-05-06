package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JList;

public class PanelEditarPlaylist extends JPanel {
	public PanelEditarPlaylist() {
		setLayout(null);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(20, 48, 89, 23);
		add(btnAtras);
		
		JButton btnVerPerfil = new JButton("Ver Perfil");
		btnVerPerfil.setBounds(287, 48, 89, 23);
		add(btnVerPerfil);
		
		JList list = new JList();
		list.setBounds(94, 92, 224, 142);
		add(list);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
