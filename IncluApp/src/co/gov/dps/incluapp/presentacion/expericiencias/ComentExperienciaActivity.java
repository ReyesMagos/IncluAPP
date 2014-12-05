package co.gov.dps.incluapp.presentacion.expericiencias;

import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.R.id;
import co.gov.dps.incluapp.R.layout;
import co.gov.dps.incluapp.R.menu;
import co.gov.dps.incluapp.dominio.adaptadores.experiencias.CustomAdapterExperiencias;
import co.gov.dps.incluapp.dominio.adaptadores.experiencias.CustomAdapterExperienciasComents;
import co.gov.dps.incluapp.dominio.entidades.factory.experiencias.FactoryExperiencias;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class ComentExperienciaActivity extends Activity {

	private ListView lvComents;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_coment_experiencia);
		init();
	}

	public void init() {
		lvComents = (ListView) findViewById(R.id.lvComents);
		CustomAdapterExperienciasComents customAdapterExperienciasComents = new CustomAdapterExperienciasComents(
				getApplicationContext(), FactoryExperiencias.getInstance()
						.getExperienceToShow().getComents());
		lvComents.setAdapter(customAdapterExperienciasComents);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.coment_experiencia, menu);
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
