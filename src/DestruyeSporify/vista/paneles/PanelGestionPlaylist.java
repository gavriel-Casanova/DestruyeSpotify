package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;

import DestruyeSporify.controlador.Controlador;
import DestruyeSporify.modelo.entidades.Playlist;
import DestruyeSporify.vista.ventanas.MainFrame;

import javax.swing.JList;

public class PanelGestionPlaylist extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PanelGestionPlaylist instance= null;
	public PanelGestionPlaylist(MainFrame ventana, Controlador controlador) {
		instance = this;
		setLayout(null);
		setSize(500,300);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.panelAnterior(instance);
			}
		});
		btnAtras.setBounds(40, 40, 89, 23);
		add(btnAtras);
		
		JButton btnVerPerfil = new JButton("Ver Perfil");
		btnVerPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.panelPerfil();
			}
		});
		btnVerPerfil.setBounds(373, 40, 89, 23);
		add(btnVerPerfil);
		
		JButton btnNewButton = new JButton("Crear Playlist");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(303, 115, 117, 23);
		add(btnNewButton);
		
		JButton btnBorrarPlaylist = new JButton("Borrar Playlist");
		btnBorrarPlaylist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBorrarPlaylist.setBounds(303, 149, 117, 23);
		add(btnBorrarPlaylist);
		
		JButton btnImportar = new JButton("Importar");
		btnImportar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnImportar.setBounds(303, 183, 117, 23);
		add(btnImportar);
		
		JButton btnExportar = new JButton("Exportar");
		btnExportar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExportar.setBounds(303, 217, 117, 23);
		add(btnExportar);
		
		DefaultListModel<String> modelo = new DefaultListModel<>();
		ArrayList<Playlist> playlists = controlador.getPlaylistByCliente();
		for(int i =0;i<playlists.size();i++) {
			modelo.addElement(playlists.get(i).getTitulo());
		}
		JList<String> lstPlaylists = new JList<>(modelo);
		lstPlaylists.setBounds(40, 90, 248, 154);
		add(lstPlaylists);
		
		JButton btnModificarPlaylist = new JButton("Modificar Playlist");
		btnModificarPlaylist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModificarPlaylist.setBounds(303, 81, 117, 23);
		add(btnModificarPlaylist);
	}
}
