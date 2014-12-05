package co.gov.dps.incluapp.dominio.entidades.proyectos.comentarios;

import java.util.Date;

import co.gov.dps.incluapp.dominio.entidades.User;

public class ProyectosComentario {
	
	private User aUser;
	private String aDate;
	private String aComment;
	private int aScore;
	
	public ProyectosComentario(User aUser, String aDate, String aComment){
		super();
		this.aUser = aUser;
		this.aDate = aDate;
		this.aComment = aComment;
		this.aScore = -1;
	}
	
	public ProyectosComentario(User aUser, String aDate, String aComment,
			int aScore) {
		super();
		this.aUser = aUser;
		this.aDate = aDate;
		this.aComment = aComment;
		this.aScore = aScore;
	}

	public User getaUser() {
		return aUser;
	}

	public void setaUser(User aUser) {
		this.aUser = aUser;
	}

	public String getaDate() {
		return aDate;
	}

	public void setaDate(String aDate) {
		this.aDate = aDate;
	}

	public String getaComment() {
		return aComment;
	}

	public void setaComment(String aComment) {
		this.aComment = aComment;
	}

	public int getaScore() {
		return aScore;
	}

	public void setaScore(int aScore) {
		this.aScore = aScore;
	}
	
	
	

}
