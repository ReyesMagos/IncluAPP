package co.gov.dps.incluapp.presentacion.expericiencias;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;
import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.controladores.Comunicador;
import co.gov.dps.incluapp.controladores.ExperienciasController;
import co.gov.dps.incluapp.dominio.entidades.experiencias.Experiencia;

public class ExperienciasActivity extends Activity {

	private TextView txtTitulo;
	private ImageView imProfile;
	private TextView txtDescription;
	private TextView txtUbicacion;
	private ExperienciasController controller;
	private ImageView btn_compartir;
	private ImageView btn_mapa;
	private ImageView btn_coment;
	private ImageView btn_mensaje;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_experiencias);
		init();

	}

	public void init() {
		controller = new ExperienciasController(this);
		txtTitulo = (TextView) findViewById(R.id.txt_title);
		imProfile = (ImageView) findViewById(R.id.im_profile);
		txtDescription = (TextView) findViewById(R.id.txt_description);
		txtUbicacion = (TextView) findViewById(R.id.txt_ubication);
		controller.showExperience();
		btn_compartir = (ImageView) findViewById(R.id.btn_compartir);
		btn_mapa = (ImageView) findViewById(R.id.btn_mapa);
		btn_coment = (ImageView) findViewById(R.id.btn_coment);
		btn_mensaje = (ImageView) findViewById(R.id.btn_mensaje);
		
		btn_mensaje.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				switch (arg1.getAction()) {
				case MotionEvent.ACTION_DOWN: {
					btn_mensaje.setImageDrawable(getResources().getDrawable(
							R.drawable.mensaje_btn_pressed));
					break;
				}
				case MotionEvent.ACTION_UP: {
					btn_mensaje.setImageDrawable(getResources().getDrawable(
							R.drawable.mensaje_btn));
					break;
				}
				}
				return true;
			}
		});
		
		
		
		btn_coment.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				switch (arg1.getAction()) {
				case MotionEvent.ACTION_DOWN: {
					btn_coment.setImageDrawable(getResources().getDrawable(
							R.drawable.comentar_btn_pressed));
					showComents_Click(arg0);
					break;
				}
				case MotionEvent.ACTION_UP: {
					btn_coment.setImageDrawable(getResources().getDrawable(
							R.drawable.comentar_btn));
					break;
				}
				}
				return true;
			}
		});
		

		btn_compartir.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent arg1) {
				switch (arg1.getAction()) {
				case MotionEvent.ACTION_DOWN: {
					btn_compartir.setImageDrawable(getResources().getDrawable(
							R.drawable.share_btn_pressed));
					
					break;
				}
				case MotionEvent.ACTION_UP: {
					btn_compartir.setImageDrawable(getResources().getDrawable(
							R.drawable.share_btn));
					break;
				}
				}
				return true;
			}
		});
		
		btn_mapa.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				switch (arg1.getAction()) {
				case MotionEvent.ACTION_DOWN: {
					btn_mapa.setImageDrawable(getResources().getDrawable(
							R.drawable.mapa_btn_pressed));
					btnMap_Click(arg0);
					break;
				}
				case MotionEvent.ACTION_UP: {
					btn_mapa.setImageDrawable(getResources().getDrawable(
							R.drawable.map_btn));
					break;
				}
				}
				return true;
			}
		});

	}

	public void showExperience(Experiencia expirience) {

		txtTitulo.setText(expirience.getTitle());
		imProfile.setImageBitmap(expirience.getUser().getProfilePicture());
		txtDescription.setText(expirience.getDescription());
		txtUbicacion.setText(expirience.getUbication().getState() + "/"
				+ expirience.getUbication().getCity());

	}

	public void showComents_Click(View view) {

		controller.changeActivity(ComentExperienciaActivity.class);
	}

	public void btnMap_Click(View view) {
		// 1 para mostrar uno
		Comunicador.setMapOption(1);
		controller.changeActivity(MapsActivity.class);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.experiencias, menu);
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

}
