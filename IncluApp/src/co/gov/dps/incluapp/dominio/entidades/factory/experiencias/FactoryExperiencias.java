package co.gov.dps.incluapp.dominio.entidades.factory.experiencias;

import java.util.ArrayList;
import java.util.List;

import android.graphics.BitmapFactory;
import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.dominio.entidades.Ubicacion;
import co.gov.dps.incluapp.dominio.entidades.User;
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

		Experiencia expirience = new Experiencia();
		listExpiriences = new ArrayList<Experiencia>();
		User user = new User();
		user.setName("Maria Amparo");
		user.setLastName("Valencia Cardona");
		user.setAge("46");
		user.setProfession("Cocinera");
		user.setProfilePicture(BitmapFactory.decodeResource(ExperienciaFragment
				.getCurrentView().getContext().getResources(),
				R.drawable.amparo));
		Ubicacion ubication = new Ubicacion();
		ubication.setState("Antioquia");
		ubication.setCity("Envigado");
		ubication.setAddress("mi casa");
		ubication.setLat(6.170060);
		ubication.setLon(-75.581733);
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
