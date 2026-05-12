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

		Cliente cliente = daoCliente.getClienteByLogin(uss, pass);

		if (null != cliente) {
			ret = true;
		}

		sesion = cliente;
		return ret;
	}

	public boolean registrarCliente(String nombre, String apellido, String usuario, String pass, String passConfirm,
			Date fecNacimiento, String idioma, boolean premiun) {
		boolean ret = false;
		Cliente cliente = new Cliente();
		if (pass.equals(passConfirm)) {
			cliente.setNombre(nombre);
			cliente.setApellido(apellido);
			cliente.setUsuario(usuario);
			cliente.setContraseña(pass);
			cliente.setFechaNacimiento(fecNacimiento);
			cliente.setIdIdioma(idioma);
			if(premiun == true) {
				cliente.setTipo("premium");
			}else {
				cliente.setTipo("free");
			}
			daoCliente.insert(cliente, premiun);
			ret = true;
		}
		return ret;
	}
	
	public Cliente getClienteSesion() {
		return sesion;
	}
	
	
}
