package DestruyeSporify.controlador;

import java.sql.Date;

import DestruyeSporify.modelo.daos.DaoCliente;
import DestruyeSporify.modelo.entidades.Cliente;
import DestruyeSporify.vista.ventanas.MainFrame;

public class Controlador {

	private DaoCliente daoCliente = null;
	private Cliente sesion = null;
	
	
	public Controlador() {
		daoCliente = new DaoCliente();
	}
	
	public void iniciar() {
		MainFrame ventana = new MainFrame();
		ventana.hacerVisible();
	}
	
	public boolean validarLogin(String uss, String pass) {
		boolean ret = false;
		
		Cliente cliente = daoCliente.getClienteByLogin(uss,pass);
		
		if(null != cliente) {
			ret = true;
		}
		
		sesion = cliente;
		return ret;
	}
	
	// nombre, usuario, pass, confirmacion pass, fecha nacimiento, idioma
	
	public boolean registrarCliente(String nombre, String usuario, String pass, String passConfirm, Date fecNacimiento, String idioma) {
		boolean ret = false;
		
		
		
		return ret;
	}
}
