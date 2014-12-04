package co.gov.dps.incluapp.dominio.adaptadores.experiencias;

import java.util.List;

import co.gov.dps.incluapp.dominio.entidades.experiencias.Experiencia;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapterExperiencias extends BaseAdapter {

	private Context context;
	private List<Experiencia> listExpiriences;
	
	
	
	public CustomAdapterExperiencias(Context context,
			List<Experiencia> listExpiriences) {
		super();
		this.context = context;
		this.listExpiriences = listExpiriences;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private class viewHolder {
		ImageView imIcon;
		ImageView imProfile;
		TextView txtTitle;
		TextView txtDescription;
	}

}
