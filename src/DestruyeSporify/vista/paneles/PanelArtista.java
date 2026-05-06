package DestruyeSporify.vista.paneles;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelArtista extends JPanel{
	public PanelArtista() {
		setLayout(null);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAtras.setBounds(43, 49, 89, 23);
		add(btnAtras);
		
		JButton btnVerPerfil = new JButton("Ver Perfil ");
		btnVerPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVerPerfil.setBounds(339, 49, 89, 23);
		add(btnVerPerfil);
		
		JList listListaArtistas = new JList();
		listListaArtistas.setBounds(95, 116, 306, 173);
		add(listListaArtistas);
		
		JLabel lblNewLabel = new JLabel("Lista de artistas ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(183, 91, 157, 14);
		add(lblNewLabel);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
