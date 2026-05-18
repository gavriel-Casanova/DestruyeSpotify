package DestruyeSporify.modelo.entidades;

import java.util.Objects;

public class Album {
	private int idAlbum = 0;
	private String titulo = null;
	private int año = 0;
	private String imagen = null;
	private Musico musico = null;

	public Album(int idAlbum, String titulo, int año, String imagen, Musico musico) {
		super();
		this.idAlbum = idAlbum;
		this.titulo = titulo;
		this.año = año;
		this.imagen = imagen;
		this.musico = musico;
	}

	public Album() {
		super();
	}

	public int getIdAlbum() {
		return idAlbum;
	}

	public void setIdAlbum(int idAlbum) {
		this.idAlbum = idAlbum;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Musico getMusico() {
		return musico;
	}

	public void setMusico(Musico musico) {
		this.musico = musico;
	}

	@Override
	public String toString() {
		return "Album [idAlbum=" + idAlbum + ", titulo=" + titulo + ", año=" + año + ", imagen=" + imagen + ", musico="
				+ musico + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(año, idAlbum, imagen, musico, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Album other = (Album) obj;
		return año == other.año && idAlbum == other.idAlbum && Objects.equals(imagen, other.imagen)
				&& Objects.equals(musico, other.musico) && Objects.equals(titulo, other.titulo);
	}

}
