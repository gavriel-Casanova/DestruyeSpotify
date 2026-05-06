package DestruyeSporify.vista.ventanas;


import javax.swing.JFrame;

import DestruyeSporify.vista.paneles.PanelLogin;
import DestruyeSporify.vista.paneles.PanelRegistro;

public class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Login - Destruye Spotify");
		PanelLogin panelLogin = new PanelLogin(this);
		setContentPane(panelLogin);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void panelLogin() {
		setTitle("Login - Destruye Spotify");
		PanelLogin panelLogin = new PanelLogin(this);
		setContentPane(panelLogin);
	}
	
	public void panelRegistro() {
		setTitle("Registrarse - Destruye Spotify");
		PanelRegistro panelRegistro = new PanelRegistro(this);
		setSize(545, 400);
		setContentPane(panelRegistro);
	}
	
	
	
	
}
