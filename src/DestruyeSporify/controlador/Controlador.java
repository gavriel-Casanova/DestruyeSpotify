package DestruyeSporify.controlador;

import java.sql.Date;
import java.util.ArrayList;

import DestruyeSporify.modelo.daos.DaoAlbum;
import DestruyeSporify.modelo.daos.DaoArtista;
import DestruyeSporify.modelo.daos.DaoCancion;
import DestruyeSporify.modelo.daos.DaoCliente;
import DestruyeSporify.modelo.entidades.Album;
import DestruyeSporify.modelo.entidades.Artista;
import DestruyeSporify.modelo.entidades.Cancion;
import DestruyeSporify.modelo.entidades.Cliente;
import DestruyeSporify.vista.ventanas.MainFrame;

public class Controlador {

	
	private Cliente sesion = null;

	private DaoArtista daoArtista = null;
	private DaoCliente daoCliente = null;
	private DaoAlbum daoAlbum = null;
	private DaoCancion daoCancion= null;
	
	public Controlador() {
		daoCliente = new DaoCliente();
		daoArtista = new DaoArtista();
		daoAlbum = new DaoAlbum();
		daoCancion = new DaoCancion();
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
	
	public Artista getArtistaSeleccionado(String nombre) {
		Artista ret = daoArtista.getByNombre(nombre); 
		return ret;
	}
	
	public ArrayList<Album> getAlbumsArtistas(Artista artista){
		ArrayList<Album> ret = daoAlbum.getAlbumByArtista(artista); 
		return ret;
	}
	
	public Album getAlbumByNombre(String nombre) {
		Album ret = daoAlbum.getAlbumBytitulo(nombre);
		return ret;
	}
	
	public ArrayList<Cancion> getCancionesAlbum(Album album){
		ArrayList<Cancion> ret= daoCancion.getByAlbum(album);
		
		return ret;
	}
	
	 
}
