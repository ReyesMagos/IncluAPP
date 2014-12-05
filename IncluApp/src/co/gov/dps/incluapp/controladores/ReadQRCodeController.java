package co.gov.dps.incluapp.controladores;

import android.app.Activity;
import co.gov.dps.incluapp.servicios.qrservice.ReadQRCodeActivity;;

public class ReadQRCodeController extends AbstractController {

	public ReadQRCodeController(Activity activity) {
		super(activity);
		// TODO Auto-generated constructor stub
	}

	public void showProductInfo() {
		ReadQRCodeActivity readQrCodeActivity = new ReadQRCodeActivity();
		readQrCodeActivity.getTextviewProductDetail().setText("");
		readQrCodeActivity.getTextviewProductName().setText("");
	}
	
}
