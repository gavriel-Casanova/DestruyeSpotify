package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;

import DestruyeSporify.controlador.Controlador;
import DestruyeSporify.modelo.entidades.Album;
import DestruyeSporify.modelo.entidades.Cancion;
import DestruyeSporify.vista.ventanas.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class PanelAlbum extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PanelAlbum instance = null;

	public PanelAlbum(MainFrame ventana, Controlador controlador, Album album) {
		instance = this;
		setLayout(null);
		setSize(460,370);
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.panelAnterior(instance);
			}
		});
		btnAtras.setBounds(25, 32, 89, 23);
		add(btnAtras);
		
		JButton btnVerPerfil = new JButton("Ver Perfil");
		btnVerPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.panelPerfil();
			}
		});
		btnVerPerfil.setBounds(287, 32, 89, 23);
		add(btnVerPerfil);
		DefaultListModel<String> modelo = new DefaultListModel<>();
		ArrayList<Cancion> canciones = controlador.getCancionesAlbum(album);
		for(int i = 0;i<canciones.size();i++) {
			modelo.addElement(canciones.get(i).getNombre());
		}
		JList<String> listCanciones = new JList<>(modelo);
		listCanciones.setBounds(25, 93, 154, 179);
		add(listCanciones);
		
		JLabel lblListaCanciones = new JLabel("Lista Canciones");
		lblListaCanciones.setBounds(68, 68, 100, 14);
		add(lblListaCanciones);
		
		JLabel lblInformacionAlbum = new JLabel("Informacion Album");
		lblInformacionAlbum.setBounds(251, 66, 146, 14);
		add(lblInformacionAlbum);
		
		JTextPane txpInformacion = new JTextPane();
		txpInformacion.setBounds(251, 93, 146, 93);
		txpInformacion.setText("Titulo: "+album.getTitulo()+"\n "
				+ "fecha de lanzamiento: "+album.getAño().toString()+"\n"
						+ "");
		add(txpInformacion);
		
		
		ImageIcon iconoOriginal = new ImageIcon("media/img/"+album.getImagen());
		java.awt.Image imagenOriginal = iconoOriginal.getImage();
		java.awt.Image imagenEscalada = imagenOriginal.getScaledInstance(125, 125, java.awt.Image.SCALE_SMOOTH);
		ImageIcon icono = new ImageIcon(imagenEscalada);
		JLabel lblImgAlbum = new JLabel(icono);
		lblImgAlbum.setBounds(251, 197, 146, 132);
		add(lblImgAlbum);
	}
}
