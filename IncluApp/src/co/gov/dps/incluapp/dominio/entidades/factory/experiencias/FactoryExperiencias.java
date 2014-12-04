package co.gov.dps.incluapp.dominio.entidades.factory.experiencias;

import java.util.ArrayList;
import java.util.List;

import co.gov.dps.incluapp.dominio.entidades.Ubicacion;
import co.gov.dps.incluapp.dominio.entidades.User;
import co.gov.dps.incluapp.dominio.entidades.experiencias.Experiencia;

public class FactoryExperiencias implements IFactoryExperiencias {

	private static FactoryExperiencias instance;
	private List<Experiencia> listExpiriences;
	
	private FactoryExperiencias(){
		
	}
	@Override
	public List<Experiencia> getListExperiencias() {
		// TODO Auto-generated method stub
		
		Experiencia expirience= new Experiencia();
		listExpiriences = new ArrayList<Experiencia>();
		User user= new User();
		user.setName("Maria Amparo");
		user.setLastName("Valencia Cardona");
		user.setAge("46");
		user.setProfession("Cocinera");
		Ubicacion ubication= new Ubicacion();
		ubication.setState("Antioquia");
		ubication.setCity("Envigado");
		
		
		return listExpiriences;
	}
	
	public static FactoryExperiencias getInstance(){
		if(instance==null)
			instance= new FactoryExperiencias();
		return instance;
	}
	
	
	

}
