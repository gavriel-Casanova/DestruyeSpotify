package DestruyeSporify.modelo.entidades;

import java.sql.Date;
import java.util.Objects;

public class Cliente {
	private int idCliente = 0;
	private String nombre = null;
	private String apellido= null;
	private String usuario= null;
	private String contraseña= null;
	private Date fechaNacimiento = null;
	private Date fechaRegistro = null;
	private String idIdioma = null;
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getIdIdioma() {
		return idIdioma;
	}
	public void setIdIdioma(String idIdioma) {
		this.idIdioma = idIdioma;
	}
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", usuario="
				+ usuario + ", contraseña=" + contraseña + ", fechaNacimiento=" + fechaNacimiento + ", fechaRegistro="
				+ fechaRegistro + ", idIdioma=" + idIdioma + "]";
	}
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellido, contraseña, fechaNacimiento, fechaRegistro, idCliente, idIdioma, nombre, usuario);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(contraseña, other.contraseña)
				&& Objects.equals(fechaNacimiento, other.fechaNacimiento)
				&& Objects.equals(fechaRegistro, other.fechaRegistro) && idCliente == other.idCliente
				&& Objects.equals(idIdioma, other.idIdioma) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(usuario, other.usuario);
	}
	
	

}
