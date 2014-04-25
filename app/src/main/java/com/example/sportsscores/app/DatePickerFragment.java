package com.example.sportsscores.app;

/**
 * Created by Sean on 4/21/14.
 */

import java.text.DateFormatSymbols;
import android.os.Bundle;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        int year = 2013;
        int month = 3;
        int day = 17;
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    public void onDateSet(DatePicker view, int year, int month, int day) {
        String m = new DateFormatSymbols().getMonths()[month];
        final TextView date = (TextView)getActivity().findViewById(R.id.date_text);
        date.setText(m + " " + day + ", " + year);
    }
}
