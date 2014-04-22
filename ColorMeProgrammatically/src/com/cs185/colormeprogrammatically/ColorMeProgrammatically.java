package com.cs185.colormeprogrammatically;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.os.Build;

public class ColorMeProgrammatically extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_me_programmatically);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.HORIZONTAL);
        layout.setLayoutParams(new LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        
        Button redButt = new Button(this);
        Button greenButt = new Button(this);
        Button blueButt = new Button(this);
        redButt.setText(R.string.button_red);
        greenButt.setText(R.string.button_green);
        blueButt.setText(R.string.button_blue);
        redButt.setLayoutParams(new LinearLayout.LayoutParams(0, LayoutParams.WRAP_CONTENT, 1));
        greenButt.setLayoutParams(new LinearLayout.LayoutParams(0, LayoutParams.WRAP_CONTENT, 1));
        blueButt.setLayoutParams(new LinearLayout.LayoutParams(0, LayoutParams.WRAP_CONTENT, 1));
        redButt.setBackgroundColor(getResources().getColor(R.color.color_red));
        greenButt.setBackgroundColor(getResources().getColor(R.color.color_green));
        blueButt.setBackgroundColor(getResources().getColor(R.color.color_blue));
        
        layout.addView(redButt);
        layout.addView(greenButt);
        layout.addView(blueButt);
        
        setContentView(layout);
        
        redButt.setOnClickListener(new OnClickListener() {
        	LinearLayout new_layout;
        	public void onClick(View view) {
        		new_layout = (LinearLayout)view.getParent();
        		new_layout.setBackgroundColor(getResources().getColor(R.color.color_red));
        	}
        });
        greenButt.setOnClickListener(new OnClickListener() {
        	LinearLayout new_layout;
        	public void onClick(View view) {
        		new_layout = (LinearLayout)view.getParent();
        		new_layout.setBackgroundColor(getResources().getColor(R.color.color_green));
        	}
        });
        blueButt.setOnClickListener(new OnClickListener() {
        	LinearLayout new_layout;
        	public void onClick(View view) {
        		new_layout = (LinearLayout)view.getParent();
        		new_layout.setBackgroundColor(getResources().getColor(R.color.color_blue));
        	}
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.color_me_programmatically, menu);
        return true;
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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_color_me_programmatically, container, false);
            return rootView;
        }
    }
    

}
