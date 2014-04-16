package com.cs185.colormexml;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.os.Build;

public class ColorMeXML extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_me_xml);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.color_me_xml, menu);
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
    
    public void changeColor(View view) {
        // Do something in response to button
    	
    	LinearLayout layout;
    	
        if(view.getTag().toString().equals("redButt")){
        	layout = (LinearLayout)view.getParent();
        	layout.setBackgroundColor(getResources().getColor(R.color.color_red));
        }
        
        if(view.getTag().toString().equals("greenButt")){
        	layout = (LinearLayout)view.getParent();
        	layout.setBackgroundColor(getResources().getColor(R.color.color_green));
        }
        if(view.getTag().toString().equals("blueButt")){
        	layout = (LinearLayout)view.getParent();
        	layout.setBackgroundColor(getResources().getColor(R.color.color_blue));
        }
    }
    
}
