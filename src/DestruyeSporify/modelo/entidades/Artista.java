package DestruyeSporify.modelo.entidades;

public class Artista {
	private int idArtiste = 0;
	private String nombreArtistico = null;
	// private imagen = null;
	private String descripcion = null;
	private String genero = null;

	public int getIdArtiste() {
		return idArtiste;
	}

	public void setIdArtiste(int idArtiste) {
		this.idArtiste = idArtiste;
	}

	public String getNombreArtistico() {
		return nombreArtistico;
	}

	public void setNombreArtistico(String nombreArtistico) {
		this.nombreArtistico = nombreArtistico;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Artista [idArtiste=" + idArtiste + ", nombreArtistico=" + nombreArtistico + ", descripcion="
				+ descripcion + ", genero=" + genero + "]";
	}

	public Artista(int idArtiste, String nombreArtistico, String descripcion, String genero) {
		super();
		this.idArtiste = idArtiste;
		this.nombreArtistico = nombreArtistico;
		this.descripcion = descripcion;
		this.genero = genero;
	}

	public Artista() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
