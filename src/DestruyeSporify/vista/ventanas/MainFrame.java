package DestruyeSporify.vista.ventanas;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import DestruyeSporify.controlador.Controlador;
import DestruyeSporify.vista.paneles.PanelDescubrirMusica;
import DestruyeSporify.vista.paneles.PanelDescubrirPodcast;
import DestruyeSporify.vista.paneles.PanelLogin;
import DestruyeSporify.vista.paneles.PanelMenuPrincipal;
import DestruyeSporify.vista.paneles.PanelPerfil;
import DestruyeSporify.vista.paneles.PanelRegistro;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Controlador controlador = null;
	private ArrayList<JPanel> paneles = null;

	public MainFrame() {
		controlador = new Controlador();
		paneles = new ArrayList<JPanel>();
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Login - Destruye Spotify");
		PanelLogin panelLogin = new PanelLogin(this, controlador);
		setContentPane(panelLogin);
		paneles.add(panelLogin);
	}

	public void hacerVisible() {
		setVisible(true);
	}

	public void panelAnterior(JPanel panel) {
		int posiPanel = paneles.indexOf(paneles.getLast());
		setContentPane(paneles.get(posiPanel - 1));

		if (paneles.get(posiPanel - 1) instanceof PanelLogin) {
			setTitle("Login - Destruye Spotify");
			setSize(800, 600);
		} else if (paneles.get(posiPanel - 1) instanceof PanelRegistro) {
			setTitle("Registrarse - Destruye Spotify");
			setSize(545, 400);

		} else if (paneles.get(posiPanel - 1) instanceof PanelMenuPrincipal) {
			setSize(500, 350);
			setTitle("Menu principal - Destruye Spotify");
		} else if (paneles.get(posiPanel - 1) instanceof PanelPerfil) {
			setSize(473, 309);
			setTitle("Perfil - Destruye Spotify");
		}else if (paneles.get(posiPanel - 1) instanceof PanelDescubrirMusica) {
			setSize(470, 360);
			setTitle("Descubrir musica - Destruye Spotify");
		} else if (paneles.get(posiPanel - 1) instanceof PanelDescubrirPodcast) {
			setSize(470, 360);
			setTitle("Descubrir podcast - Destruye Spotify");
		}

		paneles.removeLast();
	}

	public void panelLogin() {
		setTitle("Login - Destruye Spotify");
		PanelLogin panelLogin = new PanelLogin(this, controlador);
		setSize(800, 600);
		setContentPane(panelLogin);
		paneles.add(panelLogin);
	}

	public void panelRegistro() {
		setTitle("Registrarse - Destruye Spotify");
		PanelRegistro panelRegistro = new PanelRegistro(this, controlador);
		setSize(545, 400);
		setContentPane(panelRegistro);
		paneles.add(panelRegistro);
	}

	public void panelMenuPrincipal() {
		setSize(500, 350);
		setTitle("Menu principal - Destruye Spotify");
		PanelMenuPrincipal panelMenu = new PanelMenuPrincipal(this, controlador);
		setContentPane(panelMenu);
		paneles.add(panelMenu);
	}

	public void panelPerfil() {
		setSize(473, 309);
		setTitle("Perfil - Destruye Spotify");
		PanelPerfil panelPerfil = new PanelPerfil(this, controlador.getClienteSesion(), controlador);
		setContentPane(panelPerfil);
		paneles.add(panelPerfil);
	}
	
	public void panelDescubrirMusica() {
		setSize(470, 360);
		setTitle("Descubrir musica - Destruye Spotify");
		PanelDescubrirMusica panelDescubrirMusica = new PanelDescubrirMusica(this, controlador);
		setContentPane(panelDescubrirMusica);
		paneles.add(panelDescubrirMusica);
	}
	
	public void panelDescubrirPodcast() {
		setSize(470, 360);
		setTitle("Descubrir podcast - Destruye Spotify");
		PanelDescubrirPodcast panelDescubrirPodcast = new PanelDescubrirPodcast(this, controlador);
		setContentPane(panelDescubrirPodcast);
		paneles.add(panelDescubrirPodcast);
	}

}
