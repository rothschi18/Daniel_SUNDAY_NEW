package com.example.administrator.danielrcs371hw2;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class PickTeams extends ActionBarActivity {

    public static TeamRoster[] teamsToPlayGame;
    public static int counter;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_teams);
        counter = 0;
        teamsToPlayGame = new TeamRoster[2];
        Button[] teamList = new Button[14];
        teamList[0] = (Button)this.findViewById(R.id.team1Button);
        teamList[1] = (Button)this.findViewById(R.id.team2Button);
        teamList[2] = (Button)this.findViewById(R.id.team3Button);
        teamList[3] = (Button)this.findViewById(R.id.team4Button);
        teamList[4] = (Button)this.findViewById(R.id.team5Button);
        teamList[5] = (Button)this.findViewById(R.id.team6Button);
        teamList[6] = (Button)this.findViewById(R.id.team7Button);
        teamList[7] = (Button)this.findViewById(R.id.team8Button);
        teamList[8] = (Button)this.findViewById(R.id.team9Button);
        teamList[9] = (Button)this.findViewById(R.id.team10Button);
        teamList[10] = (Button)this.findViewById(R.id.team11Button);
        teamList[11] = (Button)this.findViewById(R.id.team12Button);
        teamList[12] = (Button)this.findViewById(R.id.team13Button);
        teamList[13] = (Button)this.findViewById(R.id.team14Button);
        MainActivity.TeamData.viewTeams(this, teamList);
    }

    /*
    Method: pickTeams
    Purpose: The User can select tow teams to play in the fantasy game
    Implementation: When the user clicks on a button, I will find the corresponding team by using the text of
                    the button they clicked
     */
    public void pickTeam(View view)
    {
        Button team = (Button)view;
        for(String key: MainActivity.TeamData.rosterDatabase.keySet())
        {
            if(team.getText().toString().equals(key))
            {
                if(counter<2)
                    teamsToPlayGame[counter] = MainActivity.TeamData.rosterDatabase.get(key);
                counter++;
            }

        }

    }
    public void backToMain(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void startGame(View view)
    {
        Intent intent = new Intent(this, Game.class);
        startActivity(intent);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pick_teams, menu);
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
