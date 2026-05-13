package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

import DestruyeSporify.controlador.Controlador;
import DestruyeSporify.modelo.entidades.Podcast;
import DestruyeSporify.vista.ventanas.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;

public class PanelDescubrirPodcast extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelDescubrirPodcast instance = null;
	public PanelDescubrirPodcast(MainFrame ventana, Controlador controlador) {
		instance = this;
		setLayout(null);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.panelAnterior(instance);
			}
		});
		btnAtras.setBounds(34, 23, 89, 23);
		add(btnAtras);
		
		JButton btnVerPerfil = new JButton("Ver Perfil");
		btnVerPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.panelPerfil();
			}
		});
		btnVerPerfil.setBounds(290, 23, 89, 23);
		add(btnVerPerfil);
		
		DefaultListModel<String> modelo = new DefaultListModel<>();
		ArrayList<Podcast> podcast = null;
		for(int i =0;i<podcast.size();i++) {
			modelo.addElement(podcast.get(i).getNombre()+ " - "+ podcast.get(i).getnReproducciones());
		}
		
		JList<String> lstArtistas = new JList<>(modelo);
		lstArtistas.setBounds(115, 92, 227, 208);

		lstArtistas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		add(lstArtistas);
	}

	

}
