package DestruyeSporify.modelo.entidades;

import java.util.Objects;

public class Musico extends Artista {

	private String caracteristicas = null;

	public Musico(int idArtiste, String nombreArtistico, String imagen, String descripcion, String genero,
			String caracteristicas) {
		super(idArtiste, nombreArtistico, imagen, descripcion, genero);
		this.caracteristicas = caracteristicas;
	}

	public Musico() {
		super();
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(caracteristicas);
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
		Musico other = (Musico) obj;
		return Objects.equals(caracteristicas, other.caracteristicas);
	}
	
	

}
