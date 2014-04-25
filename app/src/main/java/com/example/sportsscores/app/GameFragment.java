package com.example.sportsscores.app;

/**
 * Created by Sean on 4/21/14.
 */

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GameFragment extends DialogFragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sports_scores, container, false);
        getDialog().setTitle(R.string.enter_game);
        final String[] team_array = getResources().getStringArray(R.array.team_array);
        ArrayAdapter<String> teams = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, team_array);
        AutoCompleteTextView team1 = (AutoCompleteTextView)view.findViewById(R.id.team1_field);
        AutoCompleteTextView team2 = (AutoCompleteTextView)view.findViewById(R.id.team2_field);
        team1.setAdapter(teams);
        team2.setAdapter(teams);

        Button done = (Button)view.findViewById(R.id.done_butt);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AutoCompleteTextView team1f = (AutoCompleteTextView)getView().findViewById(R.id.team1_field);
                AutoCompleteTextView team2f = (AutoCompleteTextView)getView().findViewById(R.id.team2_field);
                EditText team1s = (EditText)getView().findViewById(R.id.team1_sfield);
                EditText team2s = (EditText)getView().findViewById(R.id.team2_sfield);
                TextView team1v = (TextView)getActivity().findViewById(R.id.team1_text);
                TextView team2v = (TextView)getActivity().findViewById(R.id.team2_text);
                TextView team1sc = (TextView)getActivity().findViewById(R.id.team1_score);
                TextView team2sc = (TextView)getActivity().findViewById(R.id.team2_score);
                team1v.setText(team1f.getText().toString());
                team2v.setText(team2f.getText().toString());
                team1sc.setText(team1s.getText().toString());
                team2sc.setText(team2s.getText().toString());
                getDialog().dismiss();
            }
        });
        return view;
    }
}
