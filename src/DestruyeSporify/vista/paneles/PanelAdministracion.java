package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelAdministracion extends JPanel {
	public PanelAdministracion() {
		setLayout(null);
		
		JButton btnGestionarCanciones = new JButton("Gestionar Canciones");
		btnGestionarCanciones.setBounds(148, 170, 254, 23);
		add(btnGestionarCanciones);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(28, 53, 89, 23);
		add(btnAtras);
		
		JButton btnGestionarPodcast = new JButton("Gestionar Podcast");
		btnGestionarPodcast.setBounds(148, 216, 247, 23);
		add(btnGestionarPodcast);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
