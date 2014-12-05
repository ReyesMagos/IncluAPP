package co.gov.dps.incluapp.dominio.entidades.eventos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import co.gov.dps.incluapp.dominio.entidades.Ubicacion;

public class FactoryEvent {

	private static FactoryEvent instance;
	private List<Evento> listEventos;

	private FactoryEvent() {

	}

	@SuppressWarnings("deprecation")
	public static List<Evento> getInstance() {
		List<Evento> eventos = new ArrayList<Evento>();

		Evento evento = new Evento();
		evento.setEventName("Charla sobre experiencias");
		evento.setEventDescr("Espacio donde los diferentes victimas de la violencia, "
				+ "podremos contar nuestras experiencias");
		Ubicacion ubicacion = new Ubicacion();
		ubicacion.setCity("Cartagena");
		ubicacion.setLat(10.448423);
		ubicacion.setLon(-75.510697);
		ubicacion.setState("Bolivar");
		evento.setUbicacion(ubicacion);
		evento.setCodigo("123");
		evento.setFecha(new Date(2014, 12, 20));

		Evento evento1 = new Evento();
		evento1.setEventName("Comparte tu experiencia");
		evento1.setEventDescr("Espacio donde los diferentes victimas de la violencia, "
				+ "podremos contar nuestras experiencias y podremos ralizar muchas mas actividades ");
		Ubicacion ubicacion1 = new Ubicacion();
		ubicacion1.setCity("Cartagena");
		ubicacion1.setLat(10.448423);
		ubicacion1.setLon(-75.510697);
		ubicacion1.setState("Bolivar");
		evento1.setUbicacion(ubicacion1);
		evento.setCodigo("1234");
		evento1.setFecha(new Date(2015, 01, 10));

		Evento evento2 = new Evento();
		evento2.setEventName("Apporta a la Paz");
		evento2.setEventDescr("Espacio donde los mejores desarrolladores de todo el país se reunen"
				+ "para poner su creatividad a prueba y dar lo mejor de si para el bien de los Colombianos ");
		Ubicacion ubicacion2 = new Ubicacion();
		ubicacion2.setCity("Cartagena");
		ubicacion2.setLat(10.448423);
		ubicacion2.setLon(-75.510697);
		ubicacion2.setState("Bolivar");
		evento2.setUbicacion(ubicacion2);
		evento.setCodigo("12345");
		evento2.setFecha(new Date(2014, 12, 18));
		
		Evento evento3 = new Evento();
		evento3.setEventName("Ayuda al Projimo");
		evento3.setEventDescr("Reunamonos y ayudemos a las personas mas necesitas del país");
		Ubicacion ubicacion3 = new Ubicacion();
		ubicacion3.setCity("Antioquia");
		ubicacion3.setLat(10.448423);
		ubicacion3.setLon(-75.510697);
		ubicacion3.setState("Bolivar");
		evento3.setUbicacion(ubicacion3);
		evento.setCodigo("12345");
		evento3.setFecha(new Date(2015, 03, 15));

		eventos.add(evento);
		eventos.add(evento1);
		eventos.add(evento2);
		eventos.add(evento3);

		return eventos;

	}

	public void setEvent(Evento evento) {
		this.listEventos.add(evento);
	}

}
