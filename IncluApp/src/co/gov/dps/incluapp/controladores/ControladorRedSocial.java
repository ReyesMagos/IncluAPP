package co.gov.dps.incluapp.controladores;

import android.app.Activity;
import co.gov.dps.incluapp.servicios.redesociales.RedSocial;

public class ControladorRedSocial {

	private RedSocial redSocial;
	private Activity activity;

	public ControladorRedSocial(Activity a) {
		this.activity = a;
		redSocial = new RedSocial();
	}

	public void shareOnSocialNetwork(String evento) {
		redSocial.compartirRedSocial(this.activity, evento);
	}
}
