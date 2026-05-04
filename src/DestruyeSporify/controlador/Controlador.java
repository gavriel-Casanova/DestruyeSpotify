package DestruyeSporify.controlador;

import DestruyeSporify.modelo.daos.DaoCliente;

public class Controlador {

	private DaoCliente daoCliente = null;
	
	public Controlador() {
		daoCliente = new DaoCliente();
	}
	
	public void iniciar() {
		
	}
}
