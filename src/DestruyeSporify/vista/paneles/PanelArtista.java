package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;

import DestruyeSporify.controlador.Controlador;
import DestruyeSporify.modelo.entidades.Album;
import DestruyeSporify.modelo.entidades.Artista;
import DestruyeSporify.vista.ventanas.MainFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelArtista extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelArtista instance = null; 
	private Artista artista = null;
	public PanelArtista(MainFrame ventana, Controlador controlador, Artista art) {
		artista = art;
		instance = this;
		setLayout(null);
		setSize(500,400);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.panelAnterior(instance);
			}
		});
		btnAtras.setBounds(34, 29, 89, 23);
		add(btnAtras);
		
		JButton btnVerPerfil = new JButton("Ver Perfil ");
		btnVerPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.panelPerfil();
			}
		});
		btnVerPerfil.setBounds(339, 29, 89, 23);
		add(btnVerPerfil);
		
		DefaultListModel<String> modelo = new DefaultListModel<>();
		ArrayList<Album> albumnes = controlador.getAlbumsArtistas(artista);
		for(int i =0;i<albumnes.size();i++) {
			modelo.addElement(albumnes.get(i).getTitulo());
		}
		JList<String> listListaCanciones = new JList<>(modelo);
		listListaCanciones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.panelAlbum(controlador.getAlbumByNombre(listListaCanciones.getSelectedValue()));
			}
		});
		listListaCanciones.setBounds(34, 102, 180, 125);
		add(listListaCanciones);
		
		JLabel lblListaCanciones = new JLabel("Lista de canciones");
		lblListaCanciones.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblListaCanciones.setBounds(34, 77, 157, 14);
		add(lblListaCanciones);
		
		JLabel lblInformacion = new JLabel("Informacion");
		lblInformacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInformacion.setBounds(249, 76, 178, 16);
		add(lblInformacion);
		
		ImageIcon iconoOriginal = new ImageIcon("media/img/"+artista.getImagen());
		java.awt.Image imagenOriginal = iconoOriginal.getImage();
		java.awt.Image imagenEscalada = imagenOriginal.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
		ImageIcon icono = new ImageIcon(imagenEscalada);
		JLabel lblImagen = new JLabel(icono);
		lblImagen.setBounds(34, 238, 180, 114);
		add(lblImagen);
		
		JLabel lblNombreArt = new JLabel("Nombre artistico:");
		lblNombreArt.setBounds(239, 103, 101, 23);
		add(lblNombreArt);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(239, 160, 71, 23);
		add(lblGenero);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBounds(239, 213, 71, 23);
		add(lblDescripcion);
		
		JTextPane txtPDescripcion = new JTextPane();
		txtPDescripcion.setEditable(false);
		txtPDescripcion.setBounds(249, 247, 180, 105);
		add(txtPDescripcion);
		txtPDescripcion.setText(artista.getDescripcion());
		
		JLabel lblDatoGenero = new JLabel("");
		lblDatoGenero.setBounds(239, 182, 126, 29);
		lblDatoGenero.setText(artista.getGenero());
		add(lblDatoGenero);
		
		JLabel lblDatoNombre = new JLabel("");
		lblDatoNombre.setBounds(239, 124, 126, 29);
		lblDatoNombre.setText(artista.getNombreArtistico());
		add(lblDatoNombre);
	}
}
