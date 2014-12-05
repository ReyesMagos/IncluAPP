package co.gov.dps.incluapp.dominio.entidades.factory.proyectos;

import java.util.ArrayList;
import java.util.List;

import android.graphics.BitmapFactory;

import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.controladores.Comunicador;
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
		
		comentario = new ProyectosComentario("Carlos Gaviria-Profesor",
				"16/15/2011", "www.DANE.com encontraran ampliar sus datos");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario("David Mendoza-AdminEmpresas",
				"14/03/2011", "Excelente idea, todo mi apoyo");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario("María Torrez-Ama de casa",
				"16/15/2011", "Me encanta, más ideas como esta se hace un mejor país");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario("Juan Cuervo-Ingeniero",
				"14/03/2011", "Incluir a personas dela 3era edad mejorarría en un gran impacto");
		listaComentarios.add(comentario);

		Proyecto aProyecto = new Proyecto(
				"Construccion de pactos sociales para la incidencia en politica publica.",
				1,
				33,
				"Los actores locales (economicos, sociales, politicos, ambientales y culturales) construyen una estrategia de integracion ciudadana que deriva en un pacto social municipal.",
				"1202U",
				"Metas de Destinatarios; Individuos, Familias, Personas, Productores, Colectivos",
				221,
				"Agosto 23 del 2014",
				"30 Lideres comunitarios vinculados en los pactos sociales",
				"Sistematizacion_Pactos_Sociales.pdf", 
				"Requiere: 80.000.000\nRecolectado: 5.000.000",
				"Gobernabilidad y participación democrática", "Lideres",
				BitmapFactory.decodeResource(Comunicador
						.getCurrentVier().getContext().getResources(),
						R.drawable.pro1)

		);

		aProyecto.setComentario(listaComentarios);
		
		
		listaComentarios = new ArrayList<ProyectosComentario>();
		comentario = new ProyectosComentario("Sonia Ramirez-Contadora",
				"05/02/2013", "Deben Mejorar Presupuesto");
		listaComentarios.add(comentario);

		comentario = new ProyectosComentario("Camilo Londono-Administrador",
				"05/12/2014", "Buen Proyecto visiten para recursos www.FNA.com");

		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario(
				"Andres Morales-Estadistico", "05/12/2014", "Excelente Proyecto");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario("Felipe Correa-Ingeniero",
				"04/05/2010", "Contraran mas Personal");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario("Maiía Torrez-Ama de casa",
				"16/15/2011", "Me encanta, más ideas como esta se hace un mejor país");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario("Juan Cuervo-Ingeniero",
				"14/03/2011", "Incluir a personas dela 3era edad mejorarría en un gran impacto");
		listaComentarios.add(comentario);

		Proyecto aProyecto2 = new Proyecto(
				"Tableta cardiaca",
				2,
				34,
				"De acuerdo con Miguel Díez Trujillo, Presidente de Estelar “también buscamos hacer partícipe a la ciudad para que disfrute de todos los servicios que ofrece el hotel, contamos con ocho salones para organizar reuniones sociales; no es un lugar solo para las personas que viajan desde el interior del país, es un espacio de encuentro para todos los llaneros.”\n\n Sus 127 habitaciones fueron diseñadas teniendo en cuenta los últimos conceptos de comodidad para el descanso de sus huéspedes y una versátil área de trabajo que se complementa con servicio de WiFi, voz sobre IP, contestador automático programable y Centro de Negocios. \n\n Se complementa con espacios funcionales como lobby bar, restaurante, terraza lounge, gimnasio / spa, solárium, piscina, jacuzzi, sala de belleza y parqueadero privado.",
				"1202U", 
				"Tic, Dispositivos electronicos, cardiaco, wifi, hoteles;", 
				221,
				"Este proyecto inició el 20 de Octubre del 2014",
				"30 Lideres comunitarios vinculados en los pactos sociales",
				"Sistematizacion_Pactos_Sociales.pdf", 
				"Requiere: 150.000.000\nRecolectado: 5.000.000",
				"Gobernabilidad y participación democrática", "Lideres",
				BitmapFactory.decodeResource(Comunicador
						.getCurrentVier().getContext().getResources(),
						R.drawable.pro2)

		);
		aProyecto2.setComentario(listaComentarios);
		
		//:-------------
		
		listaComentarios = new ArrayList<ProyectosComentario>();
		comentario = new ProyectosComentario("Felipe Correa-Ingeniero",
				"04/05/2010", "Contraran mas Personal");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario("Juan perez-Profesor",
				"16/15/2011", "Quisiera ser de ayuda en el proyecto");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario("Andrea Gutierrez-AdminEmpresas",
				"14/03/2011", "Excelente idea, todo mi apoyo");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario("Maria Torrez-Ama de casa",
				"16/15/2011", "Me encanta, más ideas como esta se hace un mejor país");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario("Juan Cuervo-Ingeniero",
				"14/03/2011", "Incluir a personas dela 3era edad mejorarría en un gran impacto");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario("Camilo Londono-Administrador",
				"05/12/2014", "Buen Proyecto visiten para recursos www.FNA.com");
		listaComentarios.add(comentario);

		Proyecto aProyecto3 = new Proyecto("Mercado agropecuario en pro de la sana competencia.", 3, 35,
				"Los actoreturaen un pacto social municipal.", "1202U",
				"Productores, Colectivos", 221, "Este proyecto inició el 20 de Octubre del 2014",
				"30 en los pactos sociales", "Sociales.pdf", "Requiere: 150.000.000\nRecolectado: 5.000.000",
				"Gobernabilidad y participación democrática", "Lideres",
				BitmapFactory.decodeResource(Comunicador
						.getCurrentVier().getContext().getResources(),
						R.drawable.pro3)

		);
		aProyecto3.setComentario(listaComentarios);
		
		//----------
		
		listaComentarios = new ArrayList<ProyectosComentario>();
		comentario = new ProyectosComentario("Ana Lopez-Diputada",
				"02/05/2010", "Pienso que hay que mejorar algunos aspectos importantes");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario("Carlos Gaviria-Profesor",
				"16/15/2011", "www.DANE.com encontraran ampliar sus datos");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario("David Mendoza-AdminEmpresas",
				"14/03/2011", "Excelente idea, todo mi apoyo");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario("Juan Cuervo-Ingeniero",
				"14/03/2011", "Incluir a personas dela 3era edad mejorarría en un gran impacto");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario(
				"Andres Morales-Estadistico", "05/12/2014", "Excelente Proyecto");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario("Felipe Correa-Ingeniero",
				"04/05/2010", "Contraran mas Personal");
		listaComentarios.add(comentario);

		Proyecto aProyecto4 = new Proyecto(
				"MujerApp - Ayuda a La Mujer",
				4,
				36,
				"APlicactivo movil que permite con una llamada comunicarse con los entes que velan por los derechos de las mujes y que los protejen. Con esta aplicacion las mujeres estaran seguras en cualquier lugar que se encuentren ya que solo con un par de click puede solicitar acompanamiento y proteccion por entidades del estado\n\nCon esta aplicaicion decimos no al maltato fisico y psicologico hacia la mujer",
				"1202U",
				"Mujeres; derechos, proteccion, ayuda, aplicacion, seguridad",
				221,
				"Este proyecto inicio el 20 de Octubre del 2014",
				"30 Lideres comunitarios vinculados en los pactos sociales",
				"Requiere: 80.000.000\nRecolectado: 5.000.000", 
				"Requiere: 80.000.000\nRecolectado: 5.000.000",
				"Gobernabilidad y participacion democrática", 
				"Lideres",
				BitmapFactory.decodeResource(Comunicador
						.getCurrentVier().getContext().getResources(),
						R.drawable.pro4)

		);
		
		aProyecto4.setComentario(listaComentarios);
		
		//------------
		
		listaComentarios = new ArrayList<ProyectosComentario>();
		comentario = new ProyectosComentario("Pedro Zapata-Doctor",
				"02/05/2010", "Sin duda, un gran aporte para salir del conflico");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario("María Torrez-Ama de casa",
				"16/15/2011", "Me encanta, mas ideas como esta se hace un mejor pais");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario("Juan Cuervo-Ingeniero",
				"14/03/2011", "Incluir a personas dela 3era edad mejorarria en un gran impacto");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario("David Mendoza-AdminEmpresas",
				"14/03/2011", "Excelente idea, todo mi apoyo");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario(
				"Andres Morales-Estadistico", "05/12/2014", "Excelente Proyecto");
		listaComentarios.add(comentario);
		
		comentario = new ProyectosComentario("Felipe Correa-Ingeniero",
				"04/05/2010", "Contraran mas Personal");
		listaComentarios.add(comentario);

		Proyecto aProyecto5 = new Proyecto(
				"Galeria de flores",
				2,
				34,
				"De acuerdo con Miguel Diez Trujillo, Presidente de Estelar “también buscamos hacer partícipe a la ciudad para que disfrute de todos los servicios que ofrece el hotel, contamos con ocho salones para organizar reuniones sociales; no es un lugar solo para las personas que viajan desde el interior del pais, es un espacio de encuentro para todos los llaneros.”\n\n Sus 127 habitaciones fueron diseñadas teniendo en cuenta los ultimos conceptos de comodidad para el descanso de sus huespedes y una versatil area de trabajo que se complementa con servicio de WiFi, voz sobre IP, contestador automático programable y Centro de Negocios. \n\n Se complementa con espacios funcionales como lobby bar, restaurante, terraza lounge, gimnasio / spa, solarium, piscina, jacuzzi, sala de belleza y parqueadero privado.",
				"1202U", 
				"Arte, Cuadros, flores, recoleccion, paz;", 
				221,
				"Este proyecto inicio el 20 de Octubre del 2014",
				"30 Lideres comunitarios vinculados en los pactos sociales",
				"Sistematizacion_Pactos_Sociales.pdf", 
				"Requiere: 80.000.000\nRecolectado: 5.000.000",
				"Gobernabilidad y participación democratica", 
				"Lideres",
				BitmapFactory.decodeResource(Comunicador
						.getCurrentVier().getContext().getResources(),
						R.drawable.pro5)

		);
		
		aProyecto5.setComentario(listaComentarios);

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
