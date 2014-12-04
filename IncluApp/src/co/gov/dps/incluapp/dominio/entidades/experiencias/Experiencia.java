package co.gov.dps.incluapp.dominio.entidades.experiencias;

import co.gov.dps.incluapp.dominio.entidades.Ubicacion;
import android.graphics.Bitmap;

public class Experiencia {
	
	private String title;
	private String description;
	private String user;
	private Ubicacion ubication;
	
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
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public Ubicacion getUbication() {
		return ubication;
	}
	public void setUbication(Ubicacion ubication) {
		this.ubication = ubication;
	}
	
	
	
	
	

}
