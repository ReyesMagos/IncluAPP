package co.gov.dps.incluapp.dominio.adaptadores.proyectos;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.dominio.entidades.projectos.Proyecto;

public class CustomAdapterProyectos extends BaseAdapter {
	
	private Context contex;
	private List<Proyecto> listProyectos;
	

	public CustomAdapterProyectos(Context contex, List<Proyecto> listProyectos) {
		super();
		this.contex = contex;
		this.listProyectos = listProyectos;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return listProyectos.size();
	}

	@Override
	public Proyecto getItem(int arg0) {
		// TODO Auto-generated method stub
		return listProyectos.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return listProyectos.indexOf(getItem(arg0));
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		ViewHolder viewHolder = null;
		
		LayoutInflater inflater = (LayoutInflater) contex
				.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		
		if (convertView == null){
			convertView = inflater.inflate(R.layout.proyectos_custom_list_layout, null);
			
			viewHolder = new ViewHolder();
			viewHolder.imgIcon = (ImageView) convertView
					.findViewById(R.id.im_icon);
			viewHolder.txtActaSub = (TextView) convertView
					.findViewById(R.id.proyecto_txt_ActaS);
			viewHolder.txtTag = (TextView) convertView
					.findViewById(R.id.proyecto_txt_tagssTV);
			viewHolder.txtDescripcion = (TextView) convertView
					.findViewById(R.id.proyectos_txt_descripcion);
			viewHolder.txtRequiere = (TextView) convertView
					.findViewById(R.id.proyectos_textRequieree);

			convertView.setTag(viewHolder);
			
		}else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		
		Proyecto proyecto = getItem(position);
		
		viewHolder.txtActaSub.setText(proyecto.getActSubvencion());
		//viewHolder.txtTag.setText(proyecto.getGrupoMeta());
		viewHolder.txtDescripcion.setText(proyecto.getDescripcionResPropuesto());
		viewHolder.txtRequiere.setText(proyecto.getTema());
		viewHolder.txtTag.setText(proyecto.getGrupoMeta());
		
		return convertView;
		
	}
	
	private class ViewHolder {
		ImageView imgIcon;
		TextView txtActaSub;
		TextView txtDescripcion;
		TextView txtRequiere;
		TextView txtTag;
	}

}
