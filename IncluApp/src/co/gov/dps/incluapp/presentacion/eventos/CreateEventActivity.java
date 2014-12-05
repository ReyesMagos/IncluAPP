package co.gov.dps.incluapp.presentacion.eventos;

import java.util.Date;

import android.app.ActionBar;
import android.app.Activity;
import android.app.DialogFragment;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.dominio.entidades.Ubicacion;
import co.gov.dps.incluapp.dominio.entidades.eventos.Evento;
import co.gov.dps.incluapp.dominio.entidades.eventos.FactoryEvent;
import co.gov.dps.incluapp.presentacion.eventos.util.DatePickerDialogFragment;

public class CreateEventActivity extends Activity {

	private EditText txtNameEvent;
	private EditText txtPlaceEvent;
	private EditText txtDescriptionEvent;
	private Button saveButton;

	private Evento evento;
	private String eventName;
	private String eventPlace;
	private String eventDescription;
	private Date eventDate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_create_event);
		initComponents();
	}

	public void initComponents() {
		this.txtNameEvent = (EditText) super.findViewById(R.id.editTxtNombre);
		this.txtPlaceEvent = (EditText) super.findViewById(R.id.editTxtPlace);
		this.txtDescriptionEvent = (EditText) super
				.findViewById(R.id.editTxtDescr);
		this.saveButton = (Button) super.findViewById(R.id.button1);
		
		ActionBar actionBar = getActionBar();
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#6699cc")));
	}

	public void setDate(Date date) {
		this.eventDate = date;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		getMenuInflater().inflate(R.menu.create_event, menu);
		return true;
	}

	public void saveEvent() {
		this.eventName = this.txtNameEvent.getText().toString();
		this.eventPlace = this.txtPlaceEvent.getText().toString();
		this.eventDescription = this.txtDescriptionEvent.getText().toString();

		evento = new Evento();
		evento.setEventName(eventName);
		evento.setEventDescr(eventDescription);
		Ubicacion ubicacion = new Ubicacion();
		ubicacion.setCity(eventPlace);
		ubicacion.setLat(10.448423);
		ubicacion.setLon(-75.510697);
		ubicacion.setState("Bolivar");
		evento.setUbicacion(ubicacion);
		evento.setFecha(eventDate);

	}

	public void clearFields() {
		this.txtNameEvent.setText("");
		this.txtPlaceEvent.setText("");
		this.txtDescriptionEvent.setText("");

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

	public void onShowDatePickerDialog(View view) {
		DialogFragment datePickerDialogFragment = new DatePickerDialogFragment();
		datePickerDialogFragment.show(super.getFragmentManager(), "datePicker");
	}

	public void onSaveCLick(View view) {
		FactoryEvent.getInstance().add(evento);
		//clearFields();
		finish();
		Toast.makeText(this, "Su evento de guardo exitosamente",
				Toast.LENGTH_LONG).show();
	}
}
