package co.gov.dps.incluapp.dominio.entidades.projectos;

import java.util.ArrayList;
import java.util.List;


public class ProyectosSingleton {
	
	private static ProyectosSingleton aProyectosSingleton;

	private List<Proyecto> proyectos;
	
	public ProyectosSingleton(){
		
		this.proyectos = new ArrayList<Proyecto>();
		
		Proyecto aProyecto  = new Proyecto(
				"construccion de pactos sociales para la incidencia en politica publica.", 
				1, 
				33, 
				"Los actores locales (economicos, sociales, politicos, ambientales y culturales) construyen una estrategia de integracion ciudadana que deriva en un pacto social municipal.", 
				"1202U", 
				"Metas de Destinatarios; Individuos, Familias, Personas, Productores, Colectivos", 
				221, 
				"En los pactos sociales municipales se vinculan como minimo 30 lideres de organizaciones comunitarias y sociales", 
				"30 Lideres comunitarios vinculados en los pactos sociales", 
				"Sistematizacion_Pactos_Sociales.pdf", 
				"DRPE I", 
				"Gobernabilidad y participación democrática", 
				"Lideres", 
				"Lider comunitario participante"
				
		);
		
		Proyecto aProyecto2  = new Proyecto(
				" incidencia en politica publica.", 
				2, 
				34, 
				"Los actores locales en integracion ciudadana que deriva en un pacto social municipal.", 
				"1202U", 
				"Metas de Destinatarios;", 
				221, 
				"30 lideres de organizaciones comunitarias y sociales", 
				"30 Lideres comunitarios vinculados en los pactos sociales", 
				"Sistematizacion_Pactos_Sociales.pdf", 
				"DRPE I", 
				"Gobernabilidad y participación democrática", 
				"Lideres", 
				"Lider comunitario participante"
				
		);
		
		Proyecto aProyecto3  = new Proyecto(
				"Sisas dblica.", 
				3, 
				35, 
				"Los actoreturaen un pacto social municipal.", 
				"1202U", 
				"Productores, Colectivos", 
				221, 
				"En comunitarias y sociales", 
				"30 en los pactos sociales", 
				"Sociales.pdf", 
				"DRPE I", 
				"Gobernabilidad y participación democrática", 
				"Lideres", 
				"Lider comunitario participante"
				
		);
		
		Proyecto aProyecto4  = new Proyecto(
				"Sisas dosn litica publica.", 
				4, 
				36, 
				"Pablo pepito comez.", 
				"1202U", 
				"Metas de Destinatarios; Individuos, Familias, Personas, Productores, Colectivos", 
				221, 
				"En los pactos sociales municipales se vinculan como minimo 30 lideres de organizaciones comunitarias y sociales", 
				"30 Lideres comunitarios vinculados en los pactos sociales", 
				"Sistematizacion_Pactos_Sociales.pdf", 
				"DRPE I", 
				"Gobernabilidad y participación democrática", 
				"Lideres", 
				"Lider comunitario participante"
				
		);
		
		Proyecto aProyecto5  = new Proyecto(
				"con Ardilla y capila ublica.", 
				5, 
				37, 
				"Losudadana qupal.", 
				"1202U", 
				"Metas de Destinatarios; Individuos, Familias, Personas, Productores, Colectivos", 
				221, 
				"En los pactos sociales municipales se vinculan como minimo 30 lideres de organizaciones comunitarias y sociales", 
				"30 Lideres comunitarios vinculados en los pactos sociales", 
				"Sistematizacion_Pactos_Sociales.pdf", 
				"DRPE I", 
				"Gobernabilidad y participación democrática", 
				"Lideres", 
				"Lider comunitario participante"
				
		);
		
		this.proyectos.add(aProyecto);
		this.proyectos.add(aProyecto2);
		this.proyectos.add(aProyecto3);
		this.proyectos.add(aProyecto4);
		this.proyectos.add(aProyecto5);
		
		
	}
	
	
	
	public List<Proyecto> getProyectos() {
		return proyectos;
	}


	//Singleton
	public static ProyectosSingleton getInstance(){
		
		if (aProyectosSingleton == null){
			aProyectosSingleton = new ProyectosSingleton();
		}
		return aProyectosSingleton;
		
	}

}
