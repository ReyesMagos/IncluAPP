package co.gov.dps.incluapp.presentacion.proyectos;

import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.R.id;
import co.gov.dps.incluapp.R.layout;
import co.gov.dps.incluapp.R.menu;
import co.gov.dps.incluapp.controladores.ProyectosController;
import co.gov.dps.incluapp.dominio.entidades.projectos.Proyecto;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Notification.Action;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProyectosActivity extends Activity {

	private TextView txtActSub;
	private ImageView imProfile;
	private TextView txtDescription;
	private TextView txtGrupo;

	private ProyectosController controlador;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_proyectos);
		init();
		ColorDrawable colorDrawable = new ColorDrawable(
				Color.parseColor("#6699cc"));
		ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(colorDrawable);
	}

	public void showComments(View view) {
		Intent i = new Intent(this, ComentarioProyectosActivity.class);
		startActivity(i);
	}

	public void init() {
		controlador = new ProyectosController(this);

		txtActSub = (TextView) findViewById(R.id.proyecto_txt_ActSub);
		txtDescription = (TextView) findViewById(R.id.proyecto_txt_description);
		txtGrupo = (TextView) findViewById(R.id.proyectos_txt_grupometa);

		controlador.showProyecto();
	}

	public void showProyecto(Proyecto proyecto) {
		txtActSub.setText(proyecto.getActSubvencion());
		txtDescription.setText(proyecto.getDescripcionResPropuesto());
		txtGrupo.setText(proyecto.getGrupoMeta());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.proyectos, menu);
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
