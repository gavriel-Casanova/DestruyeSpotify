package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;

import DestruyeSporify.controlador.Controlador;
import DestruyeSporify.modelo.entidades.Artista;
import DestruyeSporify.vista.ventanas.MainFrame;

public class PanelArtista extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelArtista instance = null; 
	public PanelArtista(MainFrame ventana, Controlador controlador, Artista artista) {
		instance = this;
		setLayout(null);
		
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
		
		JList listListaCanciones = new JList();
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
		
		JLabel lblImagen = new JLabel("New label");
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
		
		JLabel lblDatoGenero = new JLabel("");
		lblDatoGenero.setBounds(239, 182, 126, 29);
		add(lblDatoGenero);
		
		JLabel lblDatoNombre = new JLabel("");
		lblDatoNombre.setBounds(239, 124, 126, 29);
		add(lblDatoNombre);
	}
}
