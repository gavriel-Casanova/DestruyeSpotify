package DestruyeSporify.modelo.entidades;

import java.util.Objects;

public class Podcast extends Audio {

	private int idPodcast = 0;
	private Podcaster podcaster = null;
	private String colaboradores = null;
	public Podcast(int idAudio, String nombre, String tipo, String imagen, int nReproducciones, double duracion,
			int idPodcast, Podcaster podcaster, String colaboradores) {
		super(idAudio, nombre, tipo, imagen, nReproducciones, duracion);
		this.idPodcast = idPodcast;
		this.podcaster = podcaster;
		this.colaboradores = colaboradores;
	}
	public Podcast() {
		super();
	}
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(colaboradores, idPodcast, podcaster);
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
		Podcast other = (Podcast) obj;
		return Objects.equals(colaboradores, other.colaboradores) && idPodcast == other.idPodcast
				&& Objects.equals(podcaster, other.podcaster);
	}

	
	
	
}
