package co.gov.dps.incluapp.dominio.adaptadores.proyectos;

import java.util.List;

import co.gov.dps.incluapp.R;

import co.gov.dps.incluapp.dominio.entidades.experiencias.ComentExperiencia;
import co.gov.dps.incluapp.dominio.entidades.proyectos.comentarios.ProyectosComentario;
import co.gov.dps.incluapp.presentacion.proyectos.ComentarioProyectosActivity;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

public class CustomAdapterComentariosProyectos extends BaseAdapter {

	private List<ProyectosComentario> listaComentarios;
	private Context context;

	public CustomAdapterComentariosProyectos(Context context,
			List<ProyectosComentario> listaComentarios) {
		this.context = context;
		this.listaComentarios = listaComentarios;

	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.listaComentarios.size();
	}

	@Override
	public ProyectosComentario getItem(int arg0) {
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

			convertView = mInflater.inflate(R.layout.custom_adapter_coments,
					null);

			holder = new viewHolder();
			holder.txtAuser = (TextView) convertView
					.findViewById(R.id.txt_auser);
			holder.txtDescription = (TextView) convertView
					.findViewById(R.id.txt_description);
			holder.txtDate = (TextView) convertView.findViewById(R.id.txt_date);
			convertView.setTag(holder);
		} else {
			holder = (viewHolder) convertView.getTag();
		}

		ProyectosComentario coment = getItem(position);

		holder.txtAuser.setText(coment.getaUser());
		holder.txtDescription.setText(coment.getaComment());
		holder.txtDate.setText(coment.getaDate());
		return convertView;
	}

	private class viewHolder {
		TextView txtAuser;
		TextView txtDescription;
		TextView txtDate;
	}

}
