package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;

public class PanelAlbum extends JPanel {
	public PanelAlbum() {
		setLayout(null);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(25, 32, 89, 23);
		add(btnAtras);
		
		JButton btnVerPerfil = new JButton("Ver Perfil");
		btnVerPerfil.setBounds(287, 32, 89, 23);
		add(btnVerPerfil);
		
		JList listAlbums = new JList();
		listAlbums.setBounds(25, 93, 154, 179);
		add(listAlbums);
		
		JLabel lblListaAlbum = new JLabel("Lista Album");
		lblListaAlbum.setBounds(68, 68, 100, 14);
		add(lblListaAlbum);
		
		JList listInformacionAlbum = new JList();
		listInformacionAlbum.setBounds(273, 93, 145, 179);
		add(listInformacionAlbum);
		
		JLabel lblInformacionAlbum = new JLabel("Informacion Album");
		lblInformacionAlbum.setBounds(297, 66, 100, 14);
		add(lblInformacionAlbum);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
