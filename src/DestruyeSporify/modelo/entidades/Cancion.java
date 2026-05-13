package DestruyeSporify.modelo.entidades;

import java.util.Objects;

public class Cancion extends Audio {

	private Album album = null;
	private String artistaInvitado = null;

	public Cancion(int idAudio, String nombre, String tipo, String imagen, int nReproducciones, double duracion,
			Album album, String artistaInvitado) {
		super(idAudio, nombre, tipo, imagen, nReproducciones, duracion);
		this.album = album;
		this.artistaInvitado = artistaInvitado;
	}

	public Cancion() {
		super();
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(album, artistaInvitado);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		return Objects.equals(album, other.album) && Objects.equals(artistaInvitado, other.artistaInvitado);
	}

	public Cancion() {
		super();
	}
	
}
