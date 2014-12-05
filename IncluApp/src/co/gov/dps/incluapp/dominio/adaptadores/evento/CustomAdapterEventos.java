package co.gov.dps.incluapp.dominio.adaptadores.evento;

import java.util.List;

import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.dominio.entidades.eventos.Evento;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapterEventos extends BaseAdapter {

	private Context context;
	private List<Evento> eventList;

	public CustomAdapterEventos(Context context, List<Evento> listEventos) {
		super();
		this.context = context;
		this.eventList = listEventos;
	}

	@Override
	public int getCount() {
		return eventList.size();
	}

	@Override
	public Evento getItem(int position) {
		return eventList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return eventList.indexOf(getItem(position));
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		ViewHolder viewHolder = null;

		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

		if (convertView == null) {
			convertView = inflater.inflate(
					R.layout.event_listview_personalized, null);

			viewHolder = new ViewHolder();
			viewHolder.imgIcon = (ImageView) convertView
					.findViewById(R.id.im_icon);
			viewHolder.txtTitle = (TextView) convertView
					.findViewById(R.id.txt_title);
			viewHolder.txtPlace = (TextView) convertView
					.findViewById(R.id.txt_lugar);
			viewHolder.txtDate = (TextView) convertView
					.findViewById(R.id.txt_fecha);
			viewHolder.txtDescr = (TextView) convertView
					.findViewById(R.id.txt_description);

			convertView.setTag(viewHolder);
		} else {
			viewHolder = (ViewHolder) convertView.getTag();
		}

		Evento evento = getItem(position);

		viewHolder.txtTitle.setText(evento.getEventName());
		viewHolder.txtPlace.setText(evento.getUbicacion().getCity());
		viewHolder.txtDate.setText("21/07/2014");
		viewHolder.txtDescr.setText(evento.getEventDescr());

		return convertView;
	}

	private class ViewHolder {
		ImageView imgIcon;
		TextView txtTitle;
		TextView txtPlace;
		TextView txtDate;
		TextView txtDescr;
	}

}
