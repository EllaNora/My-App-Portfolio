package com.creation.ellanora.firstapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.view.View.OnClickListener;
import java.lang.String;



public class MyActivity extends ActionBarActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
         return true;
    }


    public void clickFunc(View view)
    {
        switch (view.getId()) {

            case R.id.button1:  Toast.makeText(MyActivity.this, "This wil open Spotify Streamer", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button2:   Toast.makeText(MyActivity.this, "This will open Scores App", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button3:  Toast.makeText(MyActivity.this, "This will open Library App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:  Toast.makeText(MyActivity.this, "This wil open Built it Bigger App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:  Toast.makeText(MyActivity.this, "This will open XYZ Reader App", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button6:  Toast.makeText(MyActivity.this, "This will open Capstone:My own App", Toast.LENGTH_SHORT).show();
                break;
    }

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
   /* Context context = getApplicationContext();
    CharSequence text = "Hello toast!";
    int duration = Toast.LENGTH_SHORT;


    public void sendMessage(View view) {
        // Do something in response to button click
        Toast.makeText(context, text, duration).show();
    }*/
}
