package DestruyeSporify.vista.ventanas;


import javax.swing.JFrame;

import DestruyeSporify.controlador.Controlador;
import DestruyeSporify.vista.paneles.PanelLogin;
import DestruyeSporify.vista.paneles.PanelMenuPrincipal;
import DestruyeSporify.vista.paneles.PanelPerfil;
import DestruyeSporify.vista.paneles.PanelRegistro;

public class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Controlador controlador = null;

	public MainFrame() {
		controlador = new Controlador();
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Login - Destruye Spotify");
		PanelLogin panelLogin = new PanelLogin(this, controlador);
		setContentPane(panelLogin);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void panelLogin() {
		setTitle("Login - Destruye Spotify");
		PanelLogin panelLogin = new PanelLogin(this, controlador);
		setSize(800, 600);
		setContentPane(panelLogin);
	}
	
	public void panelRegistro() {
		setTitle("Registrarse - Destruye Spotify");
		PanelRegistro panelRegistro = new PanelRegistro(this, controlador);
		setSize(545, 400);
		setContentPane(panelRegistro);
	}
	
	public void panelMenuPrincipal() {
		setSize(500,350);
		setTitle("Menu principal - Destruye Spotify");
		PanelMenuPrincipal panelMenu = new PanelMenuPrincipal(this, controlador);
		setContentPane(panelMenu);
	}
	
	public void panelPerfil() {
		setSize(473, 309);
		setTitle("Perfil - Destruye Spotify");
		PanelPerfil panelPerfil = new PanelPerfil(this, controlador.getClienteSesion(), controlador);
		setContentPane(panelPerfil);
	}
	
	
}
