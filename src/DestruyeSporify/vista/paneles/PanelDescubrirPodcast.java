package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelDescubrirPodcast extends JPanel{
	public PanelDescubrirPodcast() {
		setLayout(null);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(34, 23, 89, 23);
		add(btnAtras);
		
		JButton btnVerPerfil = new JButton("Ver Perfil");
		btnVerPerfil.setBounds(290, 23, 89, 23);
		add(btnVerPerfil);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
