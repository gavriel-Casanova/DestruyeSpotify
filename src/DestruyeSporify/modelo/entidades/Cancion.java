package DestruyeSporify.modelo.entidades;

public class Cancion extends Audio {

	public Cancion(int idAudio, String nombre, String tipo, int nReproducciones, double duracion) {
		super(idAudio, nombre, tipo, nReproducciones, duracion);
		// TODO Auto-generated constructor stub
	}

	private Album album = null;
	private String artistaInvitado = null;

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	public String getArtistaInvitado() {
		return artistaInvitado;
	}

	public void setArtistaInvitado(String artistaInvitado) {
		this.artistaInvitado = artistaInvitado;
	}

	@Override
	public String toString() {
		return "Cancion [album=" + album + ", artistaInvitado=" + artistaInvitado + "]";
	}

	public Cancion(int idAudio, String nombre, String tipo, int nReproducciones, double duracion, Album album,
			String artistaInvitado) {
		super(idAudio, nombre, tipo, nReproducciones, duracion);
		this.album = album;
		this.artistaInvitado = artistaInvitado;
	}

	public Cancion() {
		super();
	}
	
}
