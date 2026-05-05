package DestruyeSporify.vista.ventanas;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import DestruyeSporify.vista.paneles.PanelLogin;

public class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<JPanel> paneles = null;

	public MainFrame() {
		paneles = new ArrayList<JPanel>();
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Login - Destruye Spotify");
		PanelLogin panelLogin = new PanelLogin(this);
		setContentPane(panelLogin);
		paneles.add(panelLogin);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void CambiarPanel(int panel) {
		setContentPane(paneles.get(panel));
	}
	
	public void panelRegistro() {
		setTitle("Registrarse - Destruye Spotify");
		
	}
}
