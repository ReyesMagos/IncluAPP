package co.gov.dps.incluapp.presentacion.eventos.util;

import java.util.Calendar;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.widget.DatePicker;
import co.gov.dps.incluapp.presentacion.eventos.CreateEventActivity;

public class DatePickerDialogFragment extends DialogFragment implements
		OnDateSetListener {

	public DatePickerDialogFragment() {
		super();
	}

	@Override()
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		final Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);

		return (new DatePickerDialog(super.getActivity(), this, year, month,
				day));
	}

	@Override
	public void onDateSet(DatePicker view, int year, int monthOfYear,
			int dayOfMonth) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, monthOfYear, dayOfMonth);

		CreateEventActivity createEventActivity = (CreateEventActivity) super
				.getActivity();
		createEventActivity.setDate(calendar.getTime());

	}

}
