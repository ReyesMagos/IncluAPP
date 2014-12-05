package co.gov.dps.incluapp.presentacion.timeline.fragments;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.controladores.Comunicador;
import co.gov.dps.incluapp.dominio.adaptadores.timeline.CustomAdapterTimeLine;
import co.gov.dps.incluapp.dominio.entidades.experiencias.Experiencia;
import co.gov.dps.incluapp.dominio.entidades.factory.experiencias.FactoryExperiencias;
import co.gov.dps.incluapp.dominio.entidades.factory.proyectos.FactoryProyectos;
import co.gov.dps.incluapp.dominio.entidades.projectos.Proyecto;

public class TimelineFragment extends Fragment {

	private View rootView;
	private ListView timelineListView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.activity_timeline, container,
				false);
		Comunicador.setCurrentVier(rootView);
		setHasOptionsMenu(true);
		initComponents();

		return rootView;
	}

	public void initComponents() {
		this.timelineListView = (ListView) rootView
				.findViewById(R.id.listView_timeline);

		List<Object> objectList = new ArrayList<Object>();
		List<Proyecto> objectProyecto = FactoryProyectos.getInstance()
				.getProyectos();
		List<Experiencia> objectExperience = FactoryExperiencias.getInstance()
				.getListExperiencias();

		for (int i = 0; i < objectProyecto.size(); i++) {
			objectList.add(objectProyecto.get(i));
		}

		for (int i = 0; i < objectExperience.size(); i++) {
			objectList.add(objectExperience.get(i));
		}

		List<Object> list2 = new ArrayList<Object>();

		Random randn = new Random();

		for (int i = 0; i < objectList.size(); i++) {
			int r = (int) (Math.random() * objectList.size() + 0);
			list2.add(objectList.get(r));
		}

		CustomAdapterTimeLine customAdapterTimeLine = new CustomAdapterTimeLine(
				rootView.getContext(), list2);
		timelineListView.setAdapter(customAdapterTimeLine);
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

		// inflater.inflate(R.menu., menu)

		super.onCreateOptionsMenu(menu, inflater);
	}

}
