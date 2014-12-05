package co.gov.dps.incluapp.presentacion.expericiencias;

import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.R.id;
import co.gov.dps.incluapp.R.layout;
import co.gov.dps.incluapp.R.menu;
import co.gov.dps.incluapp.controladores.Comunicador;
import co.gov.dps.incluapp.dominio.entidades.experiencias.Experiencia;
import co.gov.dps.incluapp.dominio.entidades.factory.experiencias.FactoryExperiencias;

import com.google.android.gms.maps.GoogleMap;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends Activity {

	private GoogleMap mapa;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_maps);
		mapa = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
				.getMap();
		if (Comunicador.getMapOption() == 1) {
			ubicarExperiencia(FactoryExperiencias.getInstance()
					.getExperienceToShow(), 5);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.maps, menu);
		return true;
	}

	public void ubicarExperiencia(Experiencia e, int size) {
		Double lat = e.getUbication().getLat();
		Double lng = e.getUbication().getLon();

		LatLng latlong = new LatLng(lat, lng);
		// mapa.setMapType(GoogleMap.MAP_TYPE_NORMAL);
		CameraPosition posicion = new CameraPosition.Builder().target(latlong)
				.zoom(size).bearing(0).build();

		CameraUpdate camUpd = CameraUpdateFactory.newCameraPosition(posicion);
		mapa.animateCamera(camUpd);
		String nombre = e.getTitle();

		Marker n = mapa.addMarker(new MarkerOptions()
				.position(new LatLng(lat, lng))
				.icon(BitmapDescriptorFactory
						.defaultMarker(BitmapDescriptorFactory.HUE_RED))
				.title(nombre)
				.snippet(
						e.getUbication().getState() + "; "
								+ e.getUbication().getCity()));

		// n.setIcon(BitmapDescriptorFactory.defaultMarker())

		n.showInfoWindow();

		// se muestra la venta de info

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
