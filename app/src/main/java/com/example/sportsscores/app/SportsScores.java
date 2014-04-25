package com.example.sportsscores.app;

import android.app.DialogFragment;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SportsScores extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_scores);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sports_scores, menu);
        return true;
    }

    public void showDateDialog(View view) {
        DialogFragment dialog = new DatePickerFragment();
        dialog.show(getFragmentManager(), "DateDialog");
    }

    public void showGameDialog(View view) {
        DialogFragment dialog = new GameFragment();
        dialog.show(getFragmentManager(), "GameDialog");
    }

    public void clearOptions(View view) {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }

    public void doNothing() {
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

