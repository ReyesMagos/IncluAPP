package co.gov.dps.incluapp.controladores;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Environment;
import co.gov.dps.incluapp.dominio.entidades.eventos.Evento;
import co.gov.dps.incluapp.dominio.entidades.qr.Contents;
import co.gov.dps.incluapp.dominio.entidades.qr.QRCodeEncoder;
import co.gov.dps.incluapp.servicios.qrservice.GenerateQRCodeActivity;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;

public class GenerateQRCodeController extends AbstractController {

	public GenerateQRCodeController(Activity activity) {
		super(activity);
	}

	public void generateQrCode(Evento evento) {
		// generate a 150x150 QR code
		QRCodeEncoder qrCodeEncoder = new QRCodeEncoder(evento.getEventName()
				+ "\n" + evento.getCodigo() + "\n" + evento.getUbicacion()
				+ "\n" + evento.getFecha() + "\n" + evento.getEventDescr(), null, Contents.Type.TEXT,
				BarcodeFormat.QR_CODE.toString(), 500);

		try {
			Bitmap bitmap = qrCodeEncoder.encodeAsBitmap();

			GenerateQRCodeActivity generateQRCodeActivity = (GenerateQRCodeActivity) getActivity();
			generateQRCodeActivity.getImageviewQR().setImageBitmap(bitmap);
			save(bitmap);

		} catch (WriterException e) {
			e.printStackTrace();
		}
	}

	public void save(Bitmap bitmap) {
		String file_path = Environment.getExternalStorageDirectory()
				.getAbsolutePath() + "/QR";
		File dir = new File(file_path);
		if (!dir.exists())
			dir.mkdirs();
		Random r = new Random();
		int x = r.nextInt();
		File file = new File(dir, "QR" + x + ".png");
		FileOutputStream fOut;
		try {
			fOut = new FileOutputStream(file);
			bitmap.compress(Bitmap.CompressFormat.PNG, 85, fOut);
			showAlertMessage("Exito", "Archivo Generado Con Exito. Ruta: "
					+ file_path);
			fOut.flush();
			fOut.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
