package co.gov.dps.incluapp.controladores;

import android.app.Activity;
import co.gov.dps.incluapp.dominio.entidades.eventos.Evento;
import co.gov.dps.incluapp.servicios.qrservice.GenerateQRCodeActivity;

public class FacadeController {

	private static FacadeController instance;
	
	private GenerateQRCodeController generateQRCodeController;
	
	private FacadeController() {
		super();
	}
	
	public static FacadeController getInstance() {
		if (instance == null)
			instance = new FacadeController();
		return instance;
	}
	
	public void generateQrCode(Evento e) {
		this.generateQRCodeController.generateQrCode(e);
	}
	
	public void registerActivityToController(Activity activity) {
	
		if (activity instanceof GenerateQRCodeActivity)
			this.generateQRCodeController = new GenerateQRCodeController(
					activity);


	}
}
