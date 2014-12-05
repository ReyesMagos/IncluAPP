package co.gov.dps.incluapp.dominio.entidades.factory.experiencias;

import java.util.ArrayList;
import java.util.List;

import android.graphics.BitmapFactory;
import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.controladores.Comunicador;
import co.gov.dps.incluapp.dominio.entidades.Ubicacion;
import co.gov.dps.incluapp.dominio.entidades.User;
import co.gov.dps.incluapp.dominio.entidades.experiencias.ComentExperiencia;
import co.gov.dps.incluapp.dominio.entidades.experiencias.Experiencia;
import co.gov.dps.incluapp.dominio.entidades.experiencias.fragments.ExperienciaFragment;

public class FactoryExperiencias implements IFactoryExperiencias {

	private static FactoryExperiencias instance;
	private List<Experiencia> listExpiriences;
	private Experiencia experienceToShow;

	private FactoryExperiencias() {

	}

	@Override
	public List<Experiencia> getListExperiencias() {
		// TODO Auto-generated method stub

		List<ComentExperiencia> listaComentarios = new ArrayList<ComentExperiencia>();
		Experiencia expirience = new Experiencia();
		listExpiriences = new ArrayList<Experiencia>();
		User user = new User();
		user.setName("Maria Amparo");
		user.setLastName("Valencia Cardona");
		user.setAge("46");
		user.setProfession("Cocinera");
		if (ExperienciaFragment.getCurrentView() != null)
			user.setProfilePicture(BitmapFactory.decodeResource(
					ExperienciaFragment.getCurrentView().getContext()
							.getResources(), R.drawable.miguel));
		else
			user.setProfilePicture(BitmapFactory.decodeResource(Comunicador
					.getCurrentVier().getContext().getResources(),
					R.drawable.miguel));
		Ubicacion ubication = new Ubicacion();
		ubication.setState("Antioquia");
		ubication.setCity("Envigado");
		ubication.setAddress("mi casa");
		ubication.setLat(6.170060);
		ubication.setLon(-75.581733);

		ComentExperiencia coment = new ComentExperiencia();
		coment.setDate("12/05/2013");
		coment.setComent("Muy buena historia debes buscar inclusion");
		coment.setUserName("Ana Bolivar");
		coment.setPuntuation(3);
		listaComentarios.add(coment);

		coment = new ComentExperiencia();
		coment.setDate("28/08/2014");
		coment.setComent("Politico buenos al poder, ciudadano sufre ley 100");
		coment.setPuntuation(4);
		coment.setUserName("Ana Zapata");
		listaComentarios.add(coment);

		expirience.setComents(listaComentarios);
		expirience.setUser(user);
		expirience.setUbication(ubication);
		expirience.setDescription("En 1999 pasado en el parque de Envigado a m " +
				"hijo lo secuestraron en el pasaje de la alcaldia" +
				"y fue doloroso ver como se lo llevaron de mi vida, solo 4" +
				" años despues que supe que habia reporte de victimas y personas " +
				"perdidas puede aliviar de alguna manera mi dolos   ");
		expirience.setTitle("Envigado Desaparecido");
		expirience.setEstado(true);

		listExpiriences.add(expirience);

		// An other One
		listaComentarios = new ArrayList<ComentExperiencia>();
		Experiencia expirience2 = new Experiencia();
		user = new User();
		user.setName("Miguel Angel");
		user.setLastName("Ramirez");
		user.setAge("23");
		user.setProfession("Chef");
		if (ExperienciaFragment.getCurrentView() != null)
			user.setProfilePicture(BitmapFactory.decodeResource(
					ExperienciaFragment.getCurrentView().getContext()
							.getResources(), R.drawable.amparo));
		else
			user.setProfilePicture(BitmapFactory.decodeResource(Comunicador
					.getCurrentVier().getContext().getResources(),
					R.drawable.amparo));
		ubication = new Ubicacion();
		ubication.setState("Bolivar");
		ubication.setCity("Cartagena");
		ubication.setAddress("Las Americas Resort");

		ubication.setLat(10.458953);
		ubication.setLon(-75.507402);

		coment = new ComentExperiencia();
		coment.setDate("12/14/2015");
		coment.setComent("Eres un ejemplo de vida");
		coment.setUserName("Alexis Calderon");
		coment.setPuntuation(2);
		listaComentarios.add(coment);

		coment = new ComentExperiencia();
		coment.setDate("09/03/2013");
		coment.setComent("Que viva la superacion");
		coment.setPuntuation(4);
		coment.setUserName("Jairo Fernandes");
		listaComentarios.add(coment);

		coment = new ComentExperiencia();
		coment.setDate("10/03/2014");
		coment.setComent("Doloroso pero es ya se a que tengo derecho");
		coment.setPuntuation(4);
		coment.setUserName("Anabel Garcias");
		listaComentarios.add(coment);

		expirience2.setComents(listaComentarios);
		expirience2.setUser(user);
		expirience2.setUbication(ubication);
		expirience2.setDescription("En  Junio del 2001  estaba caminando por la playa y " +
				"como dice el dicho una Mina es para aquel que le toca" +
				"gracias a conocer mis DERECHOS puede concegir beneficios que me ayudaron a seguir " +
				"desarollandome como ser humano  ");
		expirience2.setTitle("Playa De mi Alma");
		expirience2.setEstado(true);

		listExpiriences.add(expirience2);

		expirience2 = new Experiencia();
		user = new User();
		user.setName("Daniela");
		user.setLastName("Perdomo");
		user.setAge("18");
		user.setProfession("Enfermera");
		if (ExperienciaFragment.getCurrentView() != null)
			user.setProfilePicture(BitmapFactory.decodeResource(
					ExperienciaFragment.getCurrentView().getContext()
							.getResources(), R.drawable.daniela));
		else
			user.setProfilePicture(BitmapFactory.decodeResource(Comunicador
					.getCurrentVier().getContext().getResources(),
					R.drawable.daniela));
		ubication = new Ubicacion();
		ubication.setState("Santander");
		ubication.setCity("Bucaramanga");
		ubication.setAddress("Neo Mundos");
		ubication.setLat(103016);
		ubication.setLon(-73.119141);

		coment = new ComentExperiencia();
		coment.setDate("12/14/2011");
		coment.setComent("Lorem Ipsum Dolor");
		coment.setUserName("Oscar Gallon");
		coment.setPuntuation(2);
		listaComentarios.add(coment);

		coment = new ComentExperiencia();
		coment.setDate("10/05/2012");
		coment.setComent("Excelente Aporte Esto me ayudo A Saber Mass");
		coment.setPuntuation(4);
		coment.setUserName("Santiago Palacio");
		listaComentarios.add(coment);

		expirience2.setComents(listaComentarios);
		expirience2.setUser(user);
		expirience2.setUbication(ubication);
		expirience2.setDescription(" En neo mundo me fue muy mal +" +
				"en dicimebre de 2001 un grupo violento armado" +
				"se tomo este lugar y lastimaron mi integridad" +
				"como persona, dandome trauma posttraumatico  ");
		expirience2.setTitle("NeoDOLOr");
		expirience2.setEstado(true);

		listExpiriences.add(expirience2);

		return listExpiriences;
	}

	public static FactoryExperiencias getInstance() {
		if (instance == null)
			instance = new FactoryExperiencias();
		return instance;
	}

	public Experiencia getExperienceToShow() {
		return experienceToShow;
	}

	public void setExperienceToShow(Experiencia experienceToShow) {
		this.experienceToShow = experienceToShow;
	}

}
