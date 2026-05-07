package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelMenúPrincipal extends JPanel {
	public PanelMenúPrincipal() {
		setLayout(null);
		
		JLabel lblOpciones = new JLabel("OPCIONES");
		lblOpciones.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblOpciones.setBounds(173, 31, 119, 21);
		add(lblOpciones);
		
		JButton btnDescubrirMusica = new JButton("Descubrir Musica");
		btnDescubrirMusica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDescubrirMusica.setBounds(137, 84, 177, 23);
		add(btnDescubrirMusica);
		
		JButton btnDescubrirPodcast = new JButton("Descubrir Podcast");
		btnDescubrirPodcast.setBounds(137, 139, 177, 23);
		add(btnDescubrirPodcast);
		
		JButton btnMisPlaylist = new JButton("Mis Playlist");
		btnMisPlaylist.setBounds(137, 199, 177, 23);
		add(btnMisPlaylist);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtras.setBounds(29, 256, 89, 23);
		add(btnAtras);
		
		JButton btnVerPerfil = new JButton("Ver Perfil");
		btnVerPerfil.setBounds(343, 256, 89, 23);
		add(btnVerPerfil);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
