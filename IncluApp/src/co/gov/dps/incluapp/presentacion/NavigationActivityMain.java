package co.gov.dps.incluapp.presentacion;

import com.parse.Parse;
import com.parse.PushService;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import co.gov.dps.incluapp.R;

import co.gov.dps.incluapp.controladores.Comunicador;

import co.gov.dps.incluapp.TimelineActivity;

import co.gov.dps.incluapp.dominio.entidades.experiencias.fragments.ExperienciaFragment;
import co.gov.dps.incluapp.presentacion.eventos.EventosListActivityFragment;
import co.gov.dps.incluapp.presentacion.expericiencias.MapsActivity;
import co.gov.dps.incluapp.presentacion.proyectos.fragments.ProyectosFragment;
import co.gov.dps.incluapp.presentacion.timeline.fragments.TimelineFragment;

public class NavigationActivityMain extends Activity implements
		NavigationDrawerFragment.NavigationDrawerCallbacks {

	/**
	 * Fragment managing the behaviors, interactions and presentation of the
	 * navigation drawer.
	 */
	private NavigationDrawerFragment mNavigationDrawerFragment;

	/**
	 * Used to store the last screen title. For use in
	 * {@link #restoreActionBar()}.
	 */
	private CharSequence mTitle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_navigation_main);

		mNavigationDrawerFragment = (NavigationDrawerFragment) getFragmentManager()
				.findFragmentById(R.id.navigation_drawer);
		mTitle = getTitle();

		// Set up the drawer.
		mNavigationDrawerFragment.setUp(R.id.navigation_drawer,
				(DrawerLayout) findViewById(R.id.drawer_layout));

		Parse.initialize(this, "tts9uJk33PucVBuNXSIS4TftFWzoKCNn6kcfSLtE",
				"LoujGUFKApCyECwX3JzoEOxSL2SwrPqUMc8vUe0K");
		// Also in this method, specify a default Activity to handle push
		// notifications
		PushService.setDefaultPushCallback(this, TimelineActivity.class);
	}

	@Override
	public void onNavigationDrawerItemSelected(int position) {
		// update the main content by replacing fragments
		FragmentManager fragmentManager = getFragmentManager();
		Fragment fragment = null;
		switch (position) {
		case 0:
			fragment = new TimelineFragment();
			break;
		case 1:
			fragment = new ExperienciaFragment();

			break;
		case 2:
			fragment = new ProyectosFragment();
			break;
		case 3:
			fragment = new EventosListActivityFragment();
			break;
		case 4:
			break;
		default:
			break;
		}

		fragmentManager.beginTransaction().replace(R.id.container, fragment)
				.commit();
	}

	public void showExperienceOnMaps() {
		Comunicador.setMapOption(2);
		Intent i = new Intent(getApplicationContext(), MapsActivity.class);
		startActivity(i);
	}

	public void onSectionAttached(int number) {
		switch (number) {
		case 1:
			mTitle = getString(R.string.title_section1);
			break;
		case 2:
			mTitle = getString(R.string.title_section2);
			break;
		case 3:
			mTitle = getString(R.string.title_section3);
			break;
		case 4:
			mTitle = getString(R.string.title_section4);
		}
	}

	public void restoreActionBar() {
		ActionBar actionBar = getActionBar();
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
		actionBar.setDisplayShowTitleEnabled(true);
		actionBar.setTitle(mTitle);
		// TODO: Para cambiar color del action
		actionBar.setBackgroundDrawable(new ColorDrawable(Color
				.parseColor("#6699cc")));

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		if (!mNavigationDrawerFragment.isDrawerOpen()) {
			// Only show items in the action bar relevant to this screen
			// if the drawer is not showing. Otherwise, let the drawer
			// decide what to show in the action bar.
			getMenuInflater().inflate(R.menu.navigation_activity_main, menu);
			restoreActionBar();
			return true;
		}
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.maps) {
			showExperienceOnMaps();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		private static final String ARG_SECTION_NUMBER = "section_number";

		/**
		 * Returns a new instance of this fragment for the given section number.
		 */
		public static PlaceholderFragment newInstance(int sectionNumber) {
			PlaceholderFragment fragment = new PlaceholderFragment();
			Bundle args = new Bundle();
			args.putInt(ARG_SECTION_NUMBER, sectionNumber);
			fragment.setArguments(args);
			return fragment;
		}

		public PlaceholderFragment() {
		}

		// @Override
		// public View onCreateView(LayoutInflater inflater, ViewGroup
		// container,
		// Bundle savedInstanceState) {
		// View rootView = inflater.inflate(
		// R.layout.fragment_navigation_activity_main, container,
		// false);
		// return rootView;
		// }

		@Override
		public void onAttach(Activity activity) {
			super.onAttach(activity);
			((NavigationActivityMain) activity)
					.onSectionAttached(getArguments()
							.getInt(ARG_SECTION_NUMBER));
		}
	}

}
