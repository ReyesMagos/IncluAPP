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
		evento.setEventDescr("Espacio donde los diferentes victimas de la violencia, " +
				"podremos contar nuestras experiencias");
		Ubicacion ubicacion = new Ubicacion();
		ubicacion.setCity("Cartagena");
		ubicacion.setLat(10.448423);
		ubicacion.setLon(-75.510697);
		ubicacion.setState("Bolivar");
		evento.setUbicacion(ubicacion);
		evento.setFecha(new Date(2014,12,20));
		
		Evento evento1 = new Evento();
		evento1.setEventName("Comparte tu experiencia");
		evento1.setEventDescr("Espacio donde los diferentes victimas de la violencia, " +
				"podremos contar nuestras experiencias y podremos ralizar muchas mas actividades ");
		Ubicacion ubicacion1 = new Ubicacion();
		ubicacion1.setCity("Cartagena");
		ubicacion1.setLat(10.448423);
		ubicacion1.setLon(-75.510697);
		ubicacion1.setState("Bolivar");
		evento1.setUbicacion(ubicacion1);
		evento1.setFecha(new Date(2014,12,20));
		
		eventos.add(evento);
		eventos.add(evento1);
		

		return eventos;

	}

}
