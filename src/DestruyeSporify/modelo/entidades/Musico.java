package DestruyeSporify.modelo.entidades;

public class Musico extends Artista {

	public Musico(int idArtiste, String nombreArtistico, String descripcion, String genero) {
		super(idArtiste, nombreArtistico, descripcion, genero);
		// TODO Auto-generated constructor stub
	}

	private String caracteristicas = null;

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		return "Musico [caracteristicas=" + caracteristicas + "]";
	}

	public Musico(int idArtiste, String nombreArtistico, String descripcion, String genero, String caracteristicas) {
		super(idArtiste, nombreArtistico, descripcion, genero);
		this.caracteristicas = caracteristicas;
	}

	public Musico() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
