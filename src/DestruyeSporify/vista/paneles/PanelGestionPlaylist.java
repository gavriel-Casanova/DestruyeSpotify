package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class PanelGestionPlaylist extends JPanel {
	public PanelGestionPlaylist() {
		setLayout(null);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(40, 40, 89, 23);
		add(btnAtras);
		
		JButton btnVerPerfil = new JButton("Ver Perfil");
		btnVerPerfil.setBounds(373, 40, 89, 23);
		add(btnVerPerfil);
		
		JButton btnNewButton = new JButton("Crear Playlist");
		btnNewButton.setBounds(198, 109, 117, 23);
		add(btnNewButton);
		
		JButton btnBorrarPlaylist = new JButton("Borrar Playlist");
		btnBorrarPlaylist.setBounds(198, 157, 117, 23);
		add(btnBorrarPlaylist);
		
		JButton btnImportar = new JButton("Importar");
		btnImportar.setBounds(198, 210, 117, 23);
		add(btnImportar);
		
		JButton btnExportar = new JButton("Exportar");
		btnExportar.setBounds(198, 255, 117, 23);
		add(btnExportar);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
