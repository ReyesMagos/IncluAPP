package co.gov.dps.incluapp.controladores;

import android.view.View;

public class Comunicador {

	public static int mapOption;
	public static View currentVier;

	public static int getMapOption() {
		return mapOption;
	}

	public static void setMapOption(int mapOption) {
		Comunicador.mapOption = mapOption;
	}

	public static View getCurrentVier() {
		return currentVier;
	}

	public static void setCurrentVier(View currentVier) {
		Comunicador.currentVier = currentVier;
	}
	
	
	
	
}
