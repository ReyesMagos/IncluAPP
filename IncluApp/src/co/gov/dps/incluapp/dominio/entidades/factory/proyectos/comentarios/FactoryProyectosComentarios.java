package co.gov.dps.incluapp.dominio.entidades.factory.proyectos.comentarios;

import java.util.ArrayList;
import java.util.List;

import co.gov.dps.incluapp.dominio.entidades.User;
import co.gov.dps.incluapp.dominio.entidades.proyectos.comentarios.ProyectosComentario;

public class FactoryProyectosComentarios implements IFactoryProyectosComentarios {

	private static FactoryProyectosComentarios aFactoryProyectosComentarios;
	private List<ProyectosComentario> comentarios;
	
	public FactoryProyectosComentarios(){
		
	}
	
	public void generateProyectosComentarios(){
		
	}
	
	@Override
	public List<ProyectosComentario> getProyectosComentarios() {
		
		this.comentarios = new ArrayList<ProyectosComentario>();
		
		User user1 = new User("Pedro", "Retón", "21", "Estudiante");
		ProyectosComentario comment = new ProyectosComentario(user1, "1/11/5", "Muy bacano");
		
		User user2 = new User("Juan", "Fe", "21", "Estudiante");
		ProyectosComentario comment1 = new ProyectosComentario(user1, "1/12/6", "Muy bacano");
		
		User user3 = new User("Ander", "Ber", "21", "Empresario");
		ProyectosComentario comment2 = new ProyectosComentario(user1, "1/13/7", "Muy bacano");
		
		User user4 = new User("Bambi", "Fly", "21", "Publico");
		ProyectosComentario comment3 = new ProyectosComentario(user1, "1/14/8", "Muy bacano");
		
		User user5 = new User("Yefry", "Combo", "21", "Alcalde");
		ProyectosComentario comment4 = new ProyectosComentario(user1, "1/15/9", "Muy bacano");
		
		User user6 = new User("Oscar", "Negro", "21", "Profesor");
		ProyectosComentario comment5 = new ProyectosComentario(user1, "1/16/10", "Muy bacano");
		
		this.comentarios.add(comment);
		this.comentarios.add(comment1);
		this.comentarios.add(comment2);
		this.comentarios.add(comment3);
		this.comentarios.add(comment4);
		this.comentarios.add(comment5);
		
		return this.comentarios;
	}
	
	public static FactoryProyectosComentarios getInstance(){
		if(aFactoryProyectosComentarios == null){
			aFactoryProyectosComentarios = new FactoryProyectosComentarios();
			
		}
		
		return aFactoryProyectosComentarios;
	}

}
