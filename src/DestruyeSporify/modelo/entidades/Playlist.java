package DestruyeSporify.modelo.entidades;

import java.sql.Date;

public class Playlist {
	private int idPlaylist = 0;
	private String titulo = null;
	private Date fechaCreacion = null;
	private Cliente cliente = null;

	public int getIdPlaylist() {
		return idPlaylist;
	}

	public void setIdPlaylist(int idPlaylist) {
		this.idPlaylist = idPlaylist;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Playlist [idPlaylist=" + idPlaylist + ", titulo=" + titulo + ", fechaCreacion=" + fechaCreacion
				+ ", cliente=" + cliente + "]";
	}

	public Playlist(int idPlaylist, String titulo, Date fechaCreacion, Cliente cliente) {
		super();
		this.idPlaylist = idPlaylist;
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.cliente = cliente;
	}

}
