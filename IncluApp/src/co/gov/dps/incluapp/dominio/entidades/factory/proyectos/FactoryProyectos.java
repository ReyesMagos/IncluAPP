package co.gov.dps.incluapp.dominio.entidades.factory.proyectos;

import java.util.ArrayList;
import java.util.List;

import co.gov.dps.incluapp.dominio.entidades.projectos.Proyecto;
import co.gov.dps.incluapp.dominio.entidades.proyectos.comentarios.ProyectosComentario;

public class FactoryProyectos implements IFactoryProyectos {

	private static FactoryProyectos aProyectosSingleton;
	private List<Proyecto> proyectos;
	private Proyecto proyectoToShow;

	public FactoryProyectos() {

	}

	@Override
	public List<Proyecto> getProyectos() {
		this.proyectos = new ArrayList<Proyecto>();
		List<ProyectosComentario> listaComentarios = new ArrayList<ProyectosComentario>();

		ProyectosComentario comentario = new ProyectosComentario(
				"Andres Morales-Estadistico", "05/12/2014", "Excelente Proyecto");
		listaComentarios.add(comentario);

		comentario = new ProyectosComentario("Natalia Morales-Investiadora", "06/11/2014",
				"Excelente Proyecto Les recomiendo www.dps.com");

		listaComentarios.add(comentario);

		Proyecto aProyecto = new Proyecto(
				"construccion de pactos sociales para la incidencia en politica publica.",
				1,
				33,
				"Los actores locales (economicos, sociales, politicos, ambientales y culturales) construyen una estrategia de integracion ciudadana que deriva en un pacto social municipal.",
				"1202U",
				"Metas de Destinatarios; Individuos, Familias, Personas, Productores, Colectivos",
				221,
				"En los pactos sociales municipales se vinculan como minimo 30 lideres de organizaciones comunitarias y sociales",
				"30 Lideres comunitarios vinculados en los pactos sociales",
				"Sistematizacion_Pactos_Sociales.pdf", "DRPE I",
				"Gobernabilidad y participación democrática", "Lideres",
				"Lider comunitario participante"

		);

		aProyecto.setComentario(listaComentarios);
		listaComentarios = new ArrayList<ProyectosComentario>();
		comentario = new ProyectosComentario("Sonia Ramirez-Contadora",
				"05/02/2013", "Deben Mejorar Presupuesto");
		listaComentarios.add(comentario);

		comentario = new ProyectosComentario("Camilo Londono-Administrador",
				"05/12/2014", "Buen Proyecto visiten para recursos www.FNA.com");

		listaComentarios.add(comentario);

		Proyecto aProyecto2 = new Proyecto(
				" incidencia en politica publica.",
				2,
				34,
				"Los actores locales en integracion ciudadana que deriva en un pacto social municipal.",
				"1202U", "Metas de Destinatarios;", 221,
				"30 lideres de organizaciones comunitarias y sociales",
				"30 Lideres comunitarios vinculados en los pactos sociales",
				"Sistematizacion_Pactos_Sociales.pdf", "DRPE I",
				"Gobernabilidad y participación democrática", "Lideres",
				"Lider comunitario participante"

		);
		listaComentarios = new ArrayList<ProyectosComentario>();
		comentario = new ProyectosComentario("Felipe Correa-Ingeniero",
				"04/05/2010", "Contraran mas Personal");
		listaComentarios.add(comentario);

		aProyecto2.setComentario(listaComentarios);

		Proyecto aProyecto3 = new Proyecto("Sisas dblica.", 3, 35,
				"Los actoreturaen un pacto social municipal.", "1202U",
				"Productores, Colectivos", 221, "En comunitarias y sociales",
				"30 en los pactos sociales", "Sociales.pdf", "DRPE I",
				"Gobernabilidad y participación democrática", "Lideres",
				"Lider comunitario participante"

		);
		aProyecto3.setComentario(listaComentarios);

		Proyecto aProyecto4 = new Proyecto(
				"Sisas dosn litica publica.",
				4,
				36,
				"Pablo pepito comez.",
				"1202U",
				"Metas de Destinatarios; Individuos, Familias, Personas, Productores, Colectivos",
				221,
				"En los pactos sociales municipales se vinculan como minimo 30 lideres de organizaciones comunitarias y sociales",
				"30 Lideres comunitarios vinculados en los pactos sociales",
				"Sistematizacion_Pactos_Sociales.pdf", "DRPE I",
				"Gobernabilidad y participación democrática", "Lideres",
				"Lider comunitario participante"

		);

		Proyecto aProyecto5 = new Proyecto(
				"con Ardilla y capila ublica.",
				5,
				37,
				"Losudadana qupal.",
				"1202U",
				"Metas de Destinatarios; Individuos, Familias, Personas, Productores, Colectivos",
				221,
				"En los pactos sociales municipales se vinculan como minimo 30 lideres de organizaciones comunitarias y sociales",
				"30 Lideres comunitarios vinculados en los pactos sociales",
				"Sistematizacion_Pactos_Sociales.pdf", "DRPE I",
				"Gobernabilidad y participación democrática", "Lideres",
				"Lider comunitario participante"

		);

		this.proyectos.add(aProyecto);
		this.proyectos.add(aProyecto2);
		this.proyectos.add(aProyecto3);
		this.proyectos.add(aProyecto4);
		this.proyectos.add(aProyecto5);

		return proyectos;
	}

	public Proyecto getProyectoToShow() {
		return proyectoToShow;
	}

	public void setProyectoToShow(Proyecto proyectoToShow) {
		this.proyectoToShow = proyectoToShow;
	}

	// Singleton
	public static FactoryProyectos getInstance() {

		if (aProyectosSingleton == null) {
			aProyectosSingleton = new FactoryProyectos();
		}
		return aProyectosSingleton;

	}

}
