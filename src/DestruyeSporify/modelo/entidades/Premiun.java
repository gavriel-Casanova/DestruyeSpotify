package DestruyeSporify.modelo.entidades;

import java.sql.Date;

public class Premiun extends Cliente {
	private Date fechaCaducidad = null;

	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	@Override
	public String toString() {
		return "Premiun [fechaCaducidad=" + fechaCaducidad + "]";
	}

	public Premiun(Date fechaCaducidad) {
		super();
		this.fechaCaducidad = fechaCaducidad;
	}

}
