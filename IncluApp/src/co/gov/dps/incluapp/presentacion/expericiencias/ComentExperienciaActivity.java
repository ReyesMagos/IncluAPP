package co.gov.dps.incluapp.presentacion.expericiencias;

import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.R.id;
import co.gov.dps.incluapp.R.layout;
import co.gov.dps.incluapp.R.menu;
import co.gov.dps.incluapp.dominio.adaptadores.experiencias.CustomAdapterExperiencias;
import co.gov.dps.incluapp.dominio.adaptadores.experiencias.CustomAdapterExperienciasComents;
import co.gov.dps.incluapp.dominio.entidades.experiencias.ComentExperiencia;
import co.gov.dps.incluapp.dominio.entidades.factory.experiencias.FactoryExperiencias;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RatingBar;

public class ComentExperienciaActivity extends Activity {

	private ListView lvComents;
	private EditText txtComent;
	private RatingBar rtComent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_coment_experiencia);
		init();
	}

	public void btnAddComent_Click(View view) {
		ComentExperiencia coment = new ComentExperiencia();
		coment.setDate("05/12/2014");
		coment.setUserName("oscar");
		coment.setComent(txtComent.getText().toString());
		coment.setPuntuation((int)rtComent.getRating());
		FactoryExperiencias.getInstance().getExperienceToShow().getComents()
				.add(coment);
		showComents();
	
	}

	public void init() {
		rtComent= (RatingBar) findViewById(R.id.rt_coment);
		txtComent = (EditText) findViewById(R.id.txt_coment);
		lvComents = (ListView) findViewById(R.id.lvComents);
		showComents();

	}

	public void showComents() {
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
