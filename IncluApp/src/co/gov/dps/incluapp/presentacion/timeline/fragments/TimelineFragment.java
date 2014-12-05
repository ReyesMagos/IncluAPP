package co.gov.dps.incluapp.presentacion.timeline.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import co.gov.dps.incluapp.R;

public class TimelineFragment extends Fragment {

	private View rootView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.activity_timeline,
				container, false);
		setHasOptionsMenu(true);
		return rootView;
	}
	
	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		
//		inflater.inflate(R.menu., menu)
		
		super.onCreateOptionsMenu(menu, inflater);
	}

}
