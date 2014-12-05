package co.gov.dps.incluapp.presentacion.expericiencias;

import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.R.id;
import co.gov.dps.incluapp.R.layout;
import co.gov.dps.incluapp.R.menu;
import co.gov.dps.incluapp.controladores.Comunicador;
import co.gov.dps.incluapp.controladores.ExperienciasController;
import co.gov.dps.incluapp.dominio.entidades.experiencias.Experiencia;
import co.gov.dps.incluapp.dominio.entidades.experiencias.fragments.ExperienciaFragment;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Build;

public class ExperienciasActivity extends Activity {

	private TextView txtTitulo;
	private ImageView imProfile;
	private TextView txtDescription;
	private TextView txtUbicacion;
	private ExperienciasController controller;

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
