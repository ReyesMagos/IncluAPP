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
		coment.setComent("Lorem Ipsum Dolor");
		coment.setUserName("Ana Bolivar");
		coment.setPuntuation(3);
		listaComentarios.add(coment);

		coment = new ComentExperiencia();
		coment.setDate("28/08/2014");
		coment.setComent("Una Chimba");
		coment.setPuntuation(4);
		coment.setUserName("Ana Zapata");
		listaComentarios.add(coment);

		expirience.setComents(listaComentarios);
		expirience.setUser(user);
		expirience.setUbication(ubication);
		expirience.setDescription(" enim ad minima veniam, "
				+ "quis nostrum exercitationem ullam corporis"
				+ " suscipit laboriosam, nisi ut aliquid ex ea "
				+ "commodi consequatur? Quis autem vel eum iure "
				+ "reprehenderit qui in ea voluptate velit  ");
		expirience.setTitle("Lorem ipsum Dolor");
		expirience.setEstado(true);

		listExpiriences.add(expirience);

		//An other One
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

		ubication.setLat(	10.458953);
		ubication.setLon(-75.507402);

		coment = new ComentExperiencia();
		coment.setDate("12/14/2015");
		coment.setComent("Lorem Ipsum Dolor");
		coment.setUserName("Alexis Calderon");
		coment.setPuntuation(2);
		listaComentarios.add(coment);

		coment = new ComentExperiencia();
		coment.setDate("09/03/2013");
		coment.setComent("Una Chimba");
		coment.setPuntuation(4);
		coment.setUserName("Jairo Fernandes");
		listaComentarios.add(coment);
		
		coment = new ComentExperiencia();
		coment.setDate("10/03/2014");
		coment.setComent("Una Chimba Parce");
		coment.setPuntuation(4);
		coment.setUserName("Anabel Garcias");
		listaComentarios.add(coment);

		expirience2.setComents(listaComentarios);
		expirience2.setUser(user);
		expirience2.setUbication(ubication);
		expirience2.setDescription(" enim ad minima veniam, "
				+ "quis nostrum exercitationem ullam corporis"
				+ " suscipit laboriosam, nisi ut aliquid ex ea "
				+ "commodi consequatur? Quis autem vel eum iure "
				+ "reprehenderit qui in ea voluptate velit  ");
		expirience2.setTitle("Lorem ipsum Dolor");
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
