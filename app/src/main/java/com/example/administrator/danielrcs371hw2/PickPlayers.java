package com.example.administrator.danielrcs371hw2;

import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class PickPlayers extends ActionBarActivity {

    public static PlayerStats[] team1;
    public static PlayerStats[] team2;
    public ImageButton[] team1B;
    public ImageButton[] team2B;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_players);
        team1 = new PlayerStats[15];
        team2 = new PlayerStats[15];

        team1B = new ImageButton[15];
        team2B = new ImageButton[15];

        team1B[0] = (ImageButton)
    }

    public void team1(View view)
    {

    }

    public void team2(View view)
    {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pick_players, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
