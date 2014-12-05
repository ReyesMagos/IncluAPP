package co.gov.dps.incluapp.dominio.adaptadores.timeline;

import java.util.List;

import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.dominio.entidades.experiencias.Experiencia;
import co.gov.dps.incluapp.dominio.entidades.projectos.Proyecto;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapterTimeLine extends BaseAdapter {

	private Context context;
	private List<Object> objectList;

	public CustomAdapterTimeLine(Context context, List<Object> objectList) {
		super();
		this.context = context;
		this.objectList = objectList;
	}

	@Override
	public int getCount() {
		return objectList.size();
	}

	@Override
	public Object getItem(int position) {
		return objectList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return objectList.indexOf(getItem(position));
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		ViewHolder viewHolder = null;

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

		if (convertView == null) {
			convertView = inflater.inflate(
					R.layout.timeline_listview_personalized, null);

			viewHolder = new ViewHolder();
			viewHolder.imgIcon = (ImageView) convertView
					.findViewById(R.id.img_icon);
			viewHolder.txtTitle = (TextView) convertView
					.findViewById(R.id.txt_title);
			viewHolder.txtDescr = (TextView) convertView
					.findViewById(R.id.txt_description);

			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}

		if (getItem(position) instanceof Experiencia) {
			Experiencia experiencia = (Experiencia) getItem(position);
			viewHolder.imgIcon.setImageDrawable(context.getResources()
					.getDrawable(R.drawable.icono_experiencia));
			viewHolder.txtTitle.setText(experiencia.getTitle());
			viewHolder.txtDescr.setText(experiencia.getDescription());
		} else if (getItem(position) instanceof Proyecto) {
			Proyecto proyecto = (Proyecto) getItem(position);
			viewHolder.imgIcon.setImageDrawable(context.getResources()
					.getDrawable(R.drawable.icono_experiencia));
			viewHolder.txtTitle.setText(proyecto.getActSubvencion());
			viewHolder.txtDescr.setText(proyecto.getDescripcionResPropuesto());
		}

		return convertView;
	}

	private class ViewHolder {

		ImageView imgIcon;
		TextView txtTitle;
		TextView txtDescr;

	}

}
