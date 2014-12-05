package co.gov.dps.incluapp.servicios.qrservice;

import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.controladores.FacadeController;
import co.gov.dps.incluapp.controladores.ReadQRCodeController;
import co.gov.dps.incluapp.dominio.entidades.eventos.Evento;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class ReadQRCodeActivity extends Activity {

	private FacadeController facadeController;
	private ActionBar action;
	private TextView textviewProductName;
	private TextView textviewProductDetail;
	private String nit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_read_qr_code);
		FacadeController facadeController = FacadeController.getInstance();
		action = getActionBar();
		action.setTitle("Leer Codigo QR");

	}

	public void init() {
		textviewProductDetail = (TextView) findViewById(R.id.textview_product_detail);
		textviewProductName = (TextView) findViewById(R.id.textview_product_name);
	}

	public void getEventnfo(View v) {

	}

	public void change() {
//		Intent i = new Intent(this, PerfilActivity.class);
//		startActivity(i);
	}

	public TextView getTextviewProductName() {
		return textviewProductName;
	}

	public void setTextviewProductName(TextView textviewProductName) {
		this.textviewProductName = textviewProductName;
	}

	public TextView getTextviewProductDetail() {
		return textviewProductDetail;
	}

	public void setTextviewProductDetail(TextView textviewProductDetail) {
		this.textviewProductDetail = textviewProductDetail;
	}

	public void read(View v) {
		try {

			Intent intent = new Intent("com.google.zxing.client.android.SCAN");
			intent.putExtra("SCAN_MODE", "QR_CODE_MODE"); // "PRODUCT_MODE for
															// bar codes

			startActivityForResult(intent, 0);

		} catch (Exception e) {

			Uri marketUri = Uri
					.parse("market://details?id=com.google.zxing.client.android");
			Intent marketIntent = new Intent(Intent.ACTION_VIEW, marketUri);
			startActivity(marketIntent);

		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if (requestCode == 0) {

			if (resultCode == RESULT_OK) {
				String contents = data.getStringExtra("SCAN_RESULT");
				ReadQRCodeController readQRCodeController = new ReadQRCodeController(
						this);
				readQRCodeController.showAlertMessage("OLA", contents);
			}
			if (resultCode == RESULT_CANCELED) {
				// handle cancel
			}
		}
	}
}
