package DestruyeSporify.modelo.entidades;

public class Album {
	private int idAlbum = 0;
	private String titulo = null;
	private int año = 0;
	// private musico= null;
	private Musico musico = null;

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

	public Musico getMusico() {
		return musico;
	}

	public void setMusico(Musico musico) {
		this.musico = musico;
	}

	@Override
	public String toString() {
		return "Album [idAlbum=" + idAlbum + ", titulo=" + titulo + ", año=" + año + ", musico=" + musico + "]";
	}

	public Album(int idAlbum, String titulo, int año, Musico musico) {
		super();
		this.idAlbum = idAlbum;
		this.titulo = titulo;
		this.año = año;
		this.musico = musico;
	}

	public Album() {
		super();
	}

}
