package co.gov.dps.incluapp.presentacion.proyectos;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import co.gov.dps.incluapp.R;

public class ProjectActivityCreate extends Activity {

	private EditText editNombrePoyecto;
	private Spinner spinnerCategoria;
	private EditText editDescripcion;
	private EditText editKeyWords;
	private ImageView btnGuardar;

	private String nombreProyecto;
	private String categoria;
	private String descripcionProyecto;
	private String palabrasClaves;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_project_activity_create);
		initComponents();
	}

	public void initComponents() {
		this.editNombrePoyecto = (EditText) super
				.findViewById(R.id.editNombreProy);
		this.spinnerCategoria = (Spinner) super
				.findViewById(R.id.spinnerCategoriaProy);
		this.editDescripcion = (EditText) super
				.findViewById(R.id.editDescripProy);
		this.editKeyWords = (EditText) super
				.findViewById(R.id.editPalabrasClave);
		this.btnGuardar = (ImageView) super.findViewById(R.id.imageView1);

		ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#6699cc")));

		String[] categorias = { "Arte", "Cultura", "Educación", "Otro" };
		SpinnerAdapter adapterCategorias = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, categorias);
		spinnerCategoria.setAdapter(adapterCategorias);
	}

	public void onSaveProject(View view) {
		this.nombreProyecto = editDescripcion.getText().toString();
		this.categoria = "Arte";
		this.descripcionProyecto = editDescripcion.getText().toString();
		this.palabrasClaves = editKeyWords.getText().toString();

		Toast.makeText(this.getApplicationContext(),
				"Su proyecto ha sido guardado con éxito", Toast.LENGTH_LONG)
				.show();
		finish();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.project_activity_create, menu);
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
