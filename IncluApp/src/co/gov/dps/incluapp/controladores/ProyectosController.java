package co.gov.dps.incluapp.controladores;

import co.gov.dps.incluapp.dominio.entidades.factory.proyectos.FactoryProyectos;
import co.gov.dps.incluapp.presentacion.proyectos.ProyectosActivity;
import android.app.Activity;

public class ProyectosController extends AbstractController{

	public ProyectosController(Activity activity) {
		super(activity);
	}
	
	public void showProyecto(){
		ProyectosActivity proyActivity = (ProyectosActivity) getActivity();
		proyActivity.showProyecto(FactoryProyectos.getInstance().getProyectoToShow());
	}
	

}
