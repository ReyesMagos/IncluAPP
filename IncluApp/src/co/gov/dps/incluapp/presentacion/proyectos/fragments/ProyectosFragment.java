package co.gov.dps.incluapp.presentacion.proyectos.fragments;

import android.app.ActionBar;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.dominio.adaptadores.proyectos.CustomAdapterProyectos;
import co.gov.dps.incluapp.dominio.entidades.factory.proyectos.FactoryProyectos;
import co.gov.dps.incluapp.dominio.entidades.projectos.Proyecto;
import co.gov.dps.incluapp.presentacion.eventos.CreateEventActivity;
import co.gov.dps.incluapp.presentacion.proyectos.ProjectActivityCreate;
import co.gov.dps.incluapp.presentacion.proyectos.ProyectosActivity;

public class ProyectosFragment extends Fragment {

	private View rootView;
	private ListView listViewProyectos;
	private static View currentView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		rootView = inflater.inflate(R.layout.fragment_proyectos, container,
				false);
		currentView = rootView;
		setHasOptionsMenu(true);
		initComponents();
		return rootView;

	}

	public static View getCurrentView() {
		return currentView;
	}

	public static void setCurrentView(View currentView) {
		ProyectosFragment.currentView = currentView;
	}

	public void initComponents() {
		this.listViewProyectos = (ListView) rootView
				.findViewById(R.id.listView_proyectos);
		CustomAdapterProyectos customAdapterPro = new CustomAdapterProyectos(
				rootView.getContext(), FactoryProyectos.getInstance()
						.getProyectos());

		listViewProyectos.setAdapter(customAdapterPro);
		listViewProyectos
				.setOnItemLongClickListener(new OnItemLongClickListener() {
					@Override
					public boolean onItemLongClick(AdapterView<?> adapter,
							View arg1, int position, long arg3) {

						Proyecto proy = (Proyecto) adapter.getAdapter()
								.getItem(position);

						FactoryProyectos.getInstance().setProyectoToShow(proy);

						Intent i = new Intent(getActivity(),
								ProyectosActivity.class);
						startActivity(i);

						return false;
					}
				});

		ActionBar actionBar = getActivity().getActionBar();
		actionBar.setIcon(R.drawable.ic_launcher);

	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		inflater.inflate(R.menu.project_activity_create, menu);
		super.onCreateOptionsMenu(menu, inflater);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch (item.getItemId()) {
		case R.id.create_project:
			startActivity(new Intent(getActivity(), ProjectActivityCreate.class));
			break;
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}

}
