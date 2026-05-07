package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelDescubrirMusica extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PanelDescubrirMusica() {
		setLayout(null);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(36, 42, 89, 23);
		add(btnAtras);
		
		JButton btnVerPerfil = new JButton("Ver Perfil");
		btnVerPerfil.setBounds(273, 42, 89, 23);
		add(btnVerPerfil);
	}

	
	
}
