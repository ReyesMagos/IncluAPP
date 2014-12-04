package co.gov.dps.incluapp.dominio.entidades.experiencias.fragments;

import java.util.List;

import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.dominio.adaptadores.experiencias.CustomAdapterExperiencias;
import co.gov.dps.incluapp.dominio.entidades.experiencias.Experiencia;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class ExperienciaFragment extends Fragment {

	private View rootView;
	private ListView lvExpirience;
	private CustomAdapterExperiencias customAdapterExperiencias;
	private List<Experiencia> listExpirience;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		rootView = inflater.inflate(R.layout.fragment_experiencias, container,
				false);
		return rootView;
	}

	public void initComponents(View view) {
		lvExpirience = (ListView) view.findViewById(R.id.lv_expiriences);
		
		

	}

}
