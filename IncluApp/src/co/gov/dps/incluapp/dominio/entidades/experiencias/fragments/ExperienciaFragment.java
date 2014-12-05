package co.gov.dps.incluapp.dominio.entidades.experiencias.fragments;

import java.util.List;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ListView;
import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.dominio.adaptadores.experiencias.CustomAdapterExperiencias;
import co.gov.dps.incluapp.dominio.entidades.experiencias.Experiencia;
import co.gov.dps.incluapp.dominio.entidades.factory.experiencias.FactoryExperiencias;
import co.gov.dps.incluapp.presentacion.expericiencias.ExperienciasActivity;

public class ExperienciaFragment extends Fragment {

	private View rootView;
	private ListView lvExpirience;
	private CustomAdapterExperiencias customAdapterExperiencias;
	private List<Experiencia> listExpirience;
	public static View currentView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		rootView = inflater.inflate(R.layout.fragment_experiencias, container,
				false);
		currentView = rootView;
		initComponents(rootView);

		return rootView;
	}

	public void initComponents(View view) {
		lvExpirience = (ListView) view.findViewById(R.id.lv_expiriences);
		List<Experiencia> listExperiencia = FactoryExperiencias.getInstance()
				.getListExperiencias();

		customAdapterExperiencias = new CustomAdapterExperiencias(
				view.getContext(), listExperiencia);

		lvExpirience.setAdapter(customAdapterExperiencias);

		lvExpirience.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> adapter, View arg1,
					int position, long arg3) {
				FactoryExperiencias.getInstance().setExperienceToShow(
						(Experiencia) adapter.getAdapter().getItem(position));
				Intent i = new Intent(getActivity(), ExperienciasActivity.class);
				startActivity(i);
				return false;
			}
		});
	}

	public static View getCurrentView() {
		return currentView;
	}

	public static void setCurrentView(View currentView) {
		ExperienciaFragment.currentView = currentView;
	}

}
