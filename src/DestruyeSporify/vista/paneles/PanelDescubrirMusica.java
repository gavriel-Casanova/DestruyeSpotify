package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;

import DestruyeSporify.vista.ventanas.MainFrame;

import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelDescubrirMusica extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public PanelDescubrirMusica(MainFrame ventana) {
		setBackground(new Color(255, 127, 80));
		setLayout(null);
		setSize(470,360);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana.panelMenuPrincipal();
			}
		});
		btnAtras.setBounds(29, 42, 89, 23);
		add(btnAtras);
		
		JButton btnVerPerfil = new JButton("Ver Perfil");
		btnVerPerfil.setBounds(330, 42, 89, 23);
		add(btnVerPerfil);
		
		JList lstArtistas = new JList();
		lstArtistas.setBounds(115, 92, 227, 208);
		add(lstArtistas);
	}
}
