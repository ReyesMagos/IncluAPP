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
		
		ProyectosComentario comment = new ProyectosComentario(user1, "1	", "Muy bacano");
		
		
		return null;
	}
	
	

}
