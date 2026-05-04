package DestruyeSporify.modelo.entidades;

public class Audio {
	private int idAudio = 0;
	private String nombre = null;
	private String tipo = null;
//private imagen = null;
	private int nReproducciones = 0;
	private double duracion = 0;

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
		return "Audio [idAudio=" + idAudio + ", nombre=" + nombre + ", tipo=" + tipo + ", nReproducciones="
				+ nReproducciones + ", duracion=" + duracion + "]";
	}

	public Audio(int idAudio, String nombre, String tipo, int nReproducciones, double duracion) {
		super();
		this.idAudio = idAudio;
		this.nombre = nombre;
		this.tipo = tipo;
		this.nReproducciones = nReproducciones;
		this.duracion = duracion;
	}

}
