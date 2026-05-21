package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;

import DestruyeSporify.controlador.Controlador;
import DestruyeSporify.controlador.ControladorSonido;
import DestruyeSporify.modelo.entidades.Audio;
import DestruyeSporify.vista.ventanas.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JLabel;

public class PanelReproduccion extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton btnPlay = null;
	private JButton btnSiguenteCancion = null;
	private JButton btnCancionAnterior = null;
	private JLabel lblFotoCancion = null;
	
	private boolean reproduccionActiva = false;
	private int indexCancion =0;
	private ArrayList<Audio>audios = null;
	
	// TODO 3 contructores desacoplados 1- generico 2- reproduccion desde album 3-reproduccion desde playlist
	
	public PanelReproduccion(MainFrame ventana, Controlador controlador, ControladorSonido controladorSonido) {
		setLayout(null);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setBounds(36, 47, 89, 23);
		add(btnAtras);
		
		JButton btnPerfil = new JButton("Perfil");
		btnPerfil.setBounds(403, 47, 89, 23);
		add(btnPerfil);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.setBounds(36, 262, 89, 23);
		add(btnMenu);
		
		btnCancionAnterior = new JButton("<");
		btnCancionAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(indexCancion < 0) {
					controladorSonido.setCancionEnReproduccion(indexCancion -1); // Cambia la canción
				}
			}
		});
		btnCancionAnterior.setBounds(142, 262, 89, 23);
		add(btnCancionAnterior);
		
		btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(reproduccionActiva) {
					controladorSonido.pausar();
				} else {
					controladorSonido.reproducir(); 
				}
				
			}
		});
		btnPlay.setBounds(253, 262, 89, 23);
		add(btnPlay);
		
		btnSiguenteCancion = new JButton(">");
		btnSiguenteCancion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controladorSonido.setCancionEnReproduccion(indexCancion+1); // Cambia la canción
			}
		});
		btnSiguenteCancion.setBounds(363, 262, 89, 23);
		add(btnSiguenteCancion);
		
		JComboBox cbxVelocidad = new JComboBox();
		cbxVelocidad.setBounds(462, 262, 30, 22);
		add(cbxVelocidad);
		
		JList list = new JList();
		list.setBounds(36, 81, 235, 170);
		add(list);
		
		ImageIcon iconoOriginal = new ImageIcon("media/img/"+audios.get(0).getArchivo());
		java.awt.Image imagenOriginal = iconoOriginal.getImage();
		java.awt.Image imagenEscalada = imagenOriginal.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
		ImageIcon icono = new ImageIcon(imagenEscalada);
		lblFotoCancion = new JLabel(icono);
		lblFotoCancion.setBounds(296, 82, 196, 169);
		add(lblFotoCancion);
	}
}
