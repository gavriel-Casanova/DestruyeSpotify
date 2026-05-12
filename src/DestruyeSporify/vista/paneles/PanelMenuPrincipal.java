package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;

import DestruyeSporify.controlador.Controlador;
import DestruyeSporify.vista.ventanas.MainFrame;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelMenuPrincipal extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelMenuPrincipal instance = null;
	
	public PanelMenuPrincipal(MainFrame ventana, Controlador controlador) {
		instance = this;
		setLayout(null);
		setSize(500,350);
		
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
		btnDescubrirPodcast.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDescubrirPodcast.setBounds(137, 139, 177, 23);
		add(btnDescubrirPodcast);
		
		JButton btnMisPlaylist = new JButton("Mis Playlist");
		btnMisPlaylist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMisPlaylist.setBounds(137, 199, 177, 23);
		add(btnMisPlaylist);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.panelLogin();
			}
		});
		btnAtras.setBounds(29, 256, 89, 23);
		add(btnAtras);
		
		JButton btnVerPerfil = new JButton("Ver Perfil");
		btnVerPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.panelPerfil();
			}
		});
		btnVerPerfil.setBounds(343, 256, 89, 23);
		add(btnVerPerfil);
	}

	
}
