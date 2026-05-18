package DestruyeSporify.modelo.entidades;

import java.util.Objects;

public class Audio {
	private int idAudio = 0;
	private String nombre = null;
	private String tipo = null;
	private String imagen = null;
	private int nReproducciones = 0;
	private double duracion = 0;

	public Audio(int idAudio, String nombre, String tipo, String imagen, int nReproducciones, double duracion) {
		super();
		this.idAudio = idAudio;
		this.nombre = nombre;
		this.tipo = tipo;
		this.imagen = imagen;
		this.nReproducciones = nReproducciones;
		this.duracion = duracion;
	}

	public Audio() {
		super();
	}

	public int getIdAudio() {
		return idAudio;
	}

	public void setIdAudio(int idAudio) {
		this.idAudio = idAudio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getnReproducciones() {
		return nReproducciones;
	}

	public void setnReproducciones(int nReproducciones) {
		this.nReproducciones = nReproducciones;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Audio [idAudio=" + idAudio + ", nombre=" + nombre + ", tipo=" + tipo + ", imagen=" + imagen
				+ ", nReproducciones=" + nReproducciones + ", duracion=" + duracion + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(duracion, idAudio, imagen, nReproducciones, nombre, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Audio other = (Audio) obj;
		return Double.doubleToLongBits(duracion) == Double.doubleToLongBits(other.duracion) && idAudio == other.idAudio
				&& Objects.equals(imagen, other.imagen) && nReproducciones == other.nReproducciones
				&& Objects.equals(nombre, other.nombre) && Objects.equals(tipo, other.tipo);
	}

}
