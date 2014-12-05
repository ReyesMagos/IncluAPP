package co.gov.dps.incluapp.presentacion.eventos;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.dominio.adaptadores.evento.CustomAdapterEventos;
import co.gov.dps.incluapp.dominio.entidades.eventos.FactoryEvent;
import co.gov.dps.incluapp.servicios.qrservice.GenerateQRCodeActivity;

public class EventosListActivityFragment extends Fragment {

	private View rootView;
	private ListView listViewEvents;
	private int pos;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.eventos_activity_main, container,
				false);
		setHasOptionsMenu(true);
		initComponents();

		return rootView;
	}

	public void initComponents() {
		this.listViewEvents = (ListView) rootView
				.findViewById(R.id.listView_event);

		CustomAdapterEventos customAdapterEventos = new CustomAdapterEventos(
				rootView.getContext(), FactoryEvent.getInstance());

		listViewEvents.setAdapter(customAdapterEventos);
		registerForContextMenu(listViewEvents);
		listViewEvents.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				pos = position;
			}
			
		});

	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {

		if (v.getId() == R.id.listView_event) {
			AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) menuInfo;
			menu.setHeaderTitle("Opciones");
			String[] menuItems = getResources().getStringArray(
					R.array.context_items);

			for (int i = 0; i < menuItems.length; i++) {
				menu.add(Menu.NONE, i, i, menuItems[i]);
			}
		}

		super.onCreateContextMenu(menu, v, menuInfo);
	}

	@SuppressLint("NewApi")
	@Override
	public boolean onContextItemSelected(MenuItem item) {

		AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item
				.getMenuInfo();
		int menuItemIndex = item.getItemId();
		switch (menuItemIndex) {
		case 0:
			startActivityForResult(new Intent(getActivity(),
					GenerateQRCodeActivity.class), 1);
			break;
		case 1:
			Intent i = new Intent(getActivity(), EventInfoActivity.class);

			i.putExtra("NombreEvento",
					FactoryEvent.getInstance().get(pos)
							.getEventName());
			i.putExtra("LugarEvento",
					FactoryEvent.getInstance().get(pos)
							.getUbicacion().getCity());
			i.putExtra("FechaEvento",
					FactoryEvent.getInstance().get(pos).getFecha()
							.toLocaleString());
			i.putExtra("Descripcion",
					FactoryEvent.getInstance().get(pos)
							.getEventDescr());
			startActivity(i);
			break;
		default:
			break;
		}

		return super.onContextItemSelected(item);
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

		inflater.inflate(R.menu.events_fragments, menu);
		super.onCreateOptionsMenu(menu, inflater);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
		case R.id.create_event:
			startActivity(new Intent(getActivity(), CreateEventActivity.class));
			break;
		default:
			break;
		}

		return super.onOptionsItemSelected(item);
	}
}
