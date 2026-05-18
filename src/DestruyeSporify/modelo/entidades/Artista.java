package DestruyeSporify.modelo.entidades;

import java.util.Objects;

public class Artista {
	private int idArtiste = 0;
	private String nombreArtistico = null;
	private String imagen = null;
	private String descripcion = null;
	private String genero = null;

	public Artista(int idArtiste, String nombreArtistico, String imagen, String descripcion, String genero) {
		super();
		this.idArtiste = idArtiste;
		this.nombreArtistico = nombreArtistico;
		this.imagen = imagen;
		this.descripcion = descripcion;
		this.genero = genero;
	}

	public Artista() {
		super();
	}

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

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
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
		return "Artista [idArtiste=" + idArtiste + ", nombreArtistico=" + nombreArtistico + ", imagen=" + imagen
				+ ", descripcion=" + descripcion + ", genero=" + genero + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(descripcion, genero, idArtiste, imagen, nombreArtistico);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artista other = (Artista) obj;
		return Objects.equals(descripcion, other.descripcion) && Objects.equals(genero, other.genero)
				&& idArtiste == other.idArtiste && Objects.equals(imagen, other.imagen)
				&& Objects.equals(nombreArtistico, other.nombreArtistico);
	}

}
