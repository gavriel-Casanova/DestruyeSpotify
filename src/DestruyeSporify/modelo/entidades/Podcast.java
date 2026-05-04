package DestruyeSporify.modelo.entidades;

public class Podcast extends Audio {

	public Podcast(int idAudio, String nombre, String tipo, int nReproducciones, double duracion) {
		super(idAudio, nombre, tipo, nReproducciones, duracion);
		// TODO Auto-generated constructor stub
	}

	private int idPodcast = 0;
	private Podcaster podcaster = null;
	private String colaboradores = null;

	public int getIdPodcast() {
		return idPodcast;
	}

	public void setIdPodcast(int idPodcast) {
		this.idPodcast = idPodcast;
	}

	public Podcaster getPodcaster() {
		return podcaster;
	}

	public void setPodcaster(Podcaster podcaster) {
		this.podcaster = podcaster;
	}

	public String getColaboradores() {
		return colaboradores;
	}

	public void setColaboradores(String colaboradores) {
		this.colaboradores = colaboradores;
	}

	@Override
	public String toString() {
		return "Podcast [idPodcast=" + idPodcast + ", podcaster=" + podcaster + ", colaboradores=" + colaboradores
				+ "]";
	}

	public Podcast(int idAudio, String nombre, String tipo, int nReproducciones, double duracion, int idPodcast,
			Podcaster podcaster, String colaboradores) {
		super(idAudio, nombre, tipo, nReproducciones, duracion);
		this.idPodcast = idPodcast;
		this.podcaster = podcaster;
		this.colaboradores = colaboradores;
	}

}
