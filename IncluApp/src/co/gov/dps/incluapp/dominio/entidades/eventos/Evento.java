package co.gov.dps.incluapp.dominio.entidades.eventos;

import java.util.Date;

import co.gov.dps.incluapp.dominio.entidades.Ubicacion;

public class Evento {

	private String eventName;
	private String eventDescr;
	private Ubicacion ubicacion;
	private Date fecha;
	private String codigo;

	public Evento() {

	}

	public Evento(String eventName, String eventDescr, Ubicacion ubicacion,
			String codigo) {
		super();
		this.eventName = eventName;
		this.eventDescr = eventDescr;
		this.ubicacion = ubicacion;
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDescr() {
		return eventDescr;
	}

	public void setEventDescr(String eventDescr) {
		this.eventDescr = eventDescr;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
