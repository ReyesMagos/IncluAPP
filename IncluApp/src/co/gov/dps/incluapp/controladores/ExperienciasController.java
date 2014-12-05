package co.gov.dps.incluapp.controladores;

import co.gov.dps.incluapp.dominio.entidades.factory.experiencias.FactoryExperiencias;
import co.gov.dps.incluapp.presentacion.expericiencias.ExperienciasActivity;
import android.app.Activity;

public class ExperienciasController extends AbstractController {

	public ExperienciasController(Activity activity) {
		super(activity);
		// TODO Auto-generated constructor stub
	}

	public void showExperience() {
		ExperienciasActivity activity = (ExperienciasActivity) getActivity();
		activity.showExperience(FactoryExperiencias.getInstance()
				.getExperienceToShow());
	}

}
