package co.gov.dps.incluapp.presentacion.eventos;

import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.R.id;
import co.gov.dps.incluapp.R.layout;
import co.gov.dps.incluapp.R.menu;
import co.gov.dps.incluapp.dominio.entidades.eventos.Evento;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class EventInfoActivity extends Activity {

	private ImageView imageView;
	private TextView txtNameEvent;
	private TextView txtPlaceEvent;
	private TextView txtDateEvent;
	private TextView txtDescripcion;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event_info);
		initComponents();
	}
	
	public void initComponents(){
		this.imageView = (ImageView)super.findViewById(R.id.imageView1);
		this.txtNameEvent = (TextView)super.findViewById(R.id.txt_name_text);
		this.txtPlaceEvent = (TextView)super.findViewById(R.id.txt_lugar_text);
		this.txtDateEvent = (TextView)super.findViewById(R.id.txt_fecha_text);
		this.txtDescripcion = (TextView)super.findViewById(R.id.txt_descripcion_text);
		
		Bundle bundle = getIntent().getExtras();
		
		txtNameEvent.setText(bundle.getString("NombreEvento"));
		txtPlaceEvent.setText(bundle.getString("LugarEvento"));
		txtDateEvent.setText(bundle.getString("24/07/2014"));
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
}
