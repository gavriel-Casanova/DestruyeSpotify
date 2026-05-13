package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import DestruyeSporify.controlador.Controlador;
import DestruyeSporify.modelo.entidades.Cancion;
import DestruyeSporify.vista.ventanas.MainFrame;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class PanelDescubrirMusica extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PanelDescubrirMusica instance = null;

	public PanelDescubrirMusica(MainFrame ventana, Controlador controlador) {
		setBackground(new Color(255, 127, 80));
		setLayout(null);
		setSize(470, 360);

		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.panelAnterior(instance);
			}
		});
		btnAtras.setBounds(29, 42, 89, 23);
		add(btnAtras);

		JButton btnVerPerfil = new JButton("Ver Perfil");
		btnVerPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.panelPerfil();
			}
		});
		btnVerPerfil.setBounds(330, 42, 89, 23);
		add(btnVerPerfil);

		DefaultListModel<String> modelo = new DefaultListModel<>();
		ArrayList<Cancion> canciones = null;
		for(int i =0;i<canciones.size();i++) {
			modelo.addElement(canciones.get(i).getNombre()+ " - "+ canciones.get(i).getnReproducciones());
		}
		
		JList<String> lstArtistas = new JList<>(modelo);
		lstArtistas.setBounds(115, 92, 227, 208);

		lstArtistas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		add(lstArtistas);
	}
}
