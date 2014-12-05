package co.gov.dps.incluapp.presentacion.eventos;

import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.dominio.adaptadores.evento.CustomAdapterEventos;
import co.gov.dps.incluapp.dominio.entidades.eventos.FactoryEvent;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class EventosListActivityFragment extends Fragment {

	private View rootView;
	private ListView listViewEvents;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.eventos_activity_main, container,
				false);
		initComponents();
		return rootView;
	}

	public void initComponents() {
		this.listViewEvents = (ListView) rootView
				.findViewById(R.id.listView_event);

		CustomAdapterEventos customAdapterEventos = new CustomAdapterEventos(
				rootView.getContext(), FactoryEvent.getInstance());

		listViewEvents.setAdapter(customAdapterEventos);
		
		ActionBar actionBar = getActivity().getActionBar();
		

	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu, inflater);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		return super.onOptionsItemSelected(item);
	}
}
