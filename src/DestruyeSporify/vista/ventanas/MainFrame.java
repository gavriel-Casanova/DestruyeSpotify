package DestruyeSporify.vista.ventanas;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<JPanel> paneles = null;

	public MainFrame() {
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Login - Destruye Spotify");
		
	}
	
	public void CambiarPanel(int panel) {
		setContentPane(paneles.get(panel));
	}
}
