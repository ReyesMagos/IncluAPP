package co.gov.dps.incluapp.dominio.adaptadores.experiencias;

import java.util.List;

import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.dominio.entidades.experiencias.ComentExperiencia;
import co.gov.dps.incluapp.dominio.entidades.experiencias.Experiencia;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class CustomAdapterExperienciasComents extends BaseAdapter {

	private Context context;
	private List<ComentExperiencia> listaComentarios;

	public CustomAdapterExperienciasComents(Context context,
			List<ComentExperiencia> listaComentarios) {
		super();
		this.context = context;
		this.listaComentarios = listaComentarios;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.listaComentarios.size();
	}

	@Override
	public ComentExperiencia getItem(int arg0) {
		// TODO Auto-generated method stub
		return this.listaComentarios.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return this.listaComentarios.indexOf(getItem(arg0));
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		viewHolder holder = null;

		LayoutInflater mInflater = (LayoutInflater) context
				.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		if (convertView == null) {

			convertView = mInflater.inflate(
					R.layout.custom_adapter_coments_experiencias, null);

			holder = new viewHolder();
			holder.rtPuntuacion = (RatingBar) convertView
					.findViewById(R.id.rt_puntuacion);
			holder.txtDate = (TextView) convertView.findViewById(R.id.txt_date);
			holder.txtUser = (TextView) convertView
					.findViewById(R.id.txt_user_name);
			holder.txtComent = (TextView) convertView
					.findViewById(R.id.txt_coment);
			convertView.setTag(holder);
		} else {
			holder = (viewHolder) convertView.getTag();
		}

		ComentExperiencia coment = getItem(position);

		holder.rtPuntuacion.setRating(coment.getPuntuation());
		holder.rtPuntuacion.setEnabled(false);
		holder.txtComent.setText(coment.getComent());
		holder.txtDate.setText(coment.getDate());
		holder.txtUser.setText(coment.getUserName());
		return convertView;
	}

	private class viewHolder {
		RatingBar rtPuntuacion;
		TextView txtDate;
		TextView txtUser;
		TextView txtComent;
	}
}
