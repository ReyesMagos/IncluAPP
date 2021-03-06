package co.gov.dps.incluapp.dominio.entidades.experiencias;

import java.util.List;

import co.gov.dps.incluapp.dominio.entidades.Ubicacion;
import co.gov.dps.incluapp.dominio.entidades.User;

public class Experiencia {
	
	private String title;
	private String description;
	private User user;
	private Ubicacion ubication;
	private boolean estado;
	private List<ComentExperiencia> coments;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Ubicacion getUbication() {
		return ubication;
	}
	public void setUbication(Ubicacion ubication) {
		this.ubication = ubication;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public List<ComentExperiencia> getComents() {
		return coments;
	}
	public void setComents(List<ComentExperiencia> coments) {
		this.coments = coments;
	}
	
	
	
	
	
	

}
