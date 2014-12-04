package co.gov.dps.incluapp.dominio.adaptadores.experiencias;

import java.util.List;

import co.gov.dps.incluapp.R;
import co.gov.dps.incluapp.dominio.entidades.experiencias.Experiencia;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
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
		return listExpiriences.size();
	}

	@Override
	public Experiencia getItem(int arg0) {
		// TODO Auto-generated method stub
		return this.listExpiriences.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return this.listExpiriences.indexOf(getItem(arg0));
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		viewHolder holder = null;

		LayoutInflater mInflater = (LayoutInflater) context
				.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		if (convertView == null) {

			convertView = mInflater.inflate(
					R.layout.experiencias_custom_list_layout, null);

			holder = new viewHolder();
			holder.imIcon = (ImageView) convertView.findViewById(R.id.im_icon);
			holder.txtTitle = (TextView) convertView
					.findViewById(R.id.txt_title);
			holder.imProfile = (ImageView) convertView
					.findViewById(R.id.im_profile);
			holder.txtDescription = (TextView) convertView
					.findViewById(R.id.txt_description);
			convertView.setTag(holder);
		} else {
			holder = (viewHolder) convertView.getTag();
		}
		Experiencia expirience = getItem(position);

		holder.txtTitle.setText(expirience.getTitle());
		holder.txtDescription.setText(expirience.getDescription());
		holder.imProfile.setImageBitmap(expirience.getUser()
				.getProfilePicture());

		return convertView;
	}

	private class viewHolder {
		ImageView imIcon;
		ImageView imProfile;
		TextView txtTitle;
		TextView txtDescription;
	}

}
