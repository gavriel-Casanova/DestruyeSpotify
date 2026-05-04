package DestruyeSporify.controlador;

import DestruyeSporify.modelo.daos.DaoCliente;
import DestruyeSporify.vista.ventanas.MainFrame;

public class Controlador {

	private DaoCliente daoCliente = null;
	
	
	public Controlador() {
		daoCliente = new DaoCliente();
	}
	
	public void iniciar() {
		MainFrame ventana = new MainFrame();
		ventana.hacerVisible();
	}
	
	public boolean validarLogin(String uss, String pass) {
		boolean ret = false;
		
		return ret;
	}
}
