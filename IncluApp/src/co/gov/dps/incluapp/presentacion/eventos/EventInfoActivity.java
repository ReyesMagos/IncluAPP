package co.gov.dps.incluapp.presentacion.eventos;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;
import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.controladores.AbstractController;
import co.gov.dps.incluapp.controladores.ControladorRedSocial;

public class EventInfoActivity extends Activity {

	private ImageView imageView;
	private TextView txtNameEvent;
	private TextView txtPlaceEvent;
	private TextView txtDateEvent;
	private TextView txtDescripcion;
	private ImageView imgComment;
	private ImageView imgShare;

	private AbstractController abstractController;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event_info);
		initComponents();
	}

	public void initComponents() {
		this.imgComment = (ImageView) super.findViewById(R.id.img_comment);
		this.imgShare = (ImageView) super.findViewById(R.id.img_share);
		this.imageView = (ImageView) super.findViewById(R.id.imageView1);
		this.txtNameEvent = (TextView) super.findViewById(R.id.txt_name_text);
		this.txtPlaceEvent = (TextView) super.findViewById(R.id.txt_lugar_text);
		this.txtDateEvent = (TextView) super.findViewById(R.id.txt_fecha_text);
		this.txtDescripcion = (TextView) super
				.findViewById(R.id.txt_descripcion_text);
		this.abstractController = new AbstractController(this);

		imgShare.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent arg1) {
				switch (arg1.getAction()) {
				case MotionEvent.ACTION_DOWN: {
					imgShare.setImageDrawable(getResources().getDrawable(
							R.drawable.share_btn_pressed));
					onShareClick(v);

					break;
				}
				case MotionEvent.ACTION_UP: {
					imgShare.setImageDrawable(getResources().getDrawable(
							R.drawable.share_btn));
					break;
				}
				}
				return true;
			}
		});

		imgComment.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent arg1) {
				switch (arg1.getAction()) {
				case MotionEvent.ACTION_DOWN: {
					imgComment.setImageDrawable(getResources().getDrawable(
							R.drawable.comentar_btn_pressed));
					onCommentClick(v);

					break;
				}
				case MotionEvent.ACTION_UP: {
					imgComment.setImageDrawable(getResources().getDrawable(
							R.drawable.comentar_btn));
					break;
				}
				}
				return true;
			}
		});

		ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#6699cc")));

		Bundle bundle = getIntent().getExtras();

		txtNameEvent.setText(bundle.getString("NombreEvento"));
		txtPlaceEvent.setText(bundle.getString("LugarEvento"));
		txtDateEvent.setText("24/07/2014");
		txtDescripcion.setText(bundle.getString("Descripcion"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.event_info, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void onCommentClick(View view) {

		abstractController
				.showAlertMessage("Alerta",
						"Por favor Inicie Sesi�n o Registrate en la aplicaci�n para poder comentar");
	}

	public void onShareClick(View view) {
		ControladorRedSocial controladorRedSocial = new ControladorRedSocial(
				this);

		Bundle bundle = getIntent().getExtras();

		controladorRedSocial.shareOnSocialNetwork(bundle
				.getString("NombreEvento")
				+ "\n"
				+ bundle.getString("LugarEvento")
				+ "\n"
				+ "24/07/2014"
				+ "\n"
				+ bundle.getString("Descripcion"));
	}
}
