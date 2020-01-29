package com.example.java_rpg_game;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.java_rpg_game.player.Player;

public class AllocationActivity2 extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allocation2);

        Intent j = getIntent();
        Player player = (Player) j.getSerializableExtra("player");

        /**
         * Strings to display stats
         */
        String allocationTitle = "Allocate Stat Points";
        String playerStrength = "Strength: " + player.getPlayerStrength();
        String playerIntelligence = "Intelligence: " + player.getPlayerIntelligence();
        String playerVitality = "Vitality: " + player.getPlayerVitality();
        String playerStatPoints = "Remaining Stat Points: " + player.getPlayerStatPoints();
        /**
         * Creating the text views and buttons
         */
        TextView textAllocationTitle = (TextView)findViewById(R.id.allocation_title2);
        TextView textStrength = (TextView)findViewById(R.id.strength_text2);
        TextView textIntelligence = (TextView)findViewById(R.id.intelligence_text2);
        TextView textVitality = (TextView)findViewById(R.id.vitality_text2);
        TextView textStatPoints = (TextView)findViewById(R.id.stat_points2);
        Button buttonStrength = (Button)findViewById(R.id.strength_button2);
        Button buttonIntelligence = (Button)findViewById(R.id.intelligence_button2);
        Button buttonVitality = (Button)findViewById(R.id.vitality_button2);
        Button buttonBackToStats = (Button)findViewById(R.id.back_to_stats2);
        /**
         * Setting the values for the text views
         */
        textAllocationTitle.setText(allocationTitle);
        textStrength.setText(playerStrength);
        textIntelligence.setText(playerIntelligence);
        textVitality.setText(playerVitality);
        textStatPoints.setText(playerStatPoints);
        /**
         * Setting the onClickListener for the buttons
         */
        buttonStrength.setOnClickListener(this);
        buttonIntelligence.setOnClickListener(this);
        buttonVitality.setOnClickListener(this);
        buttonBackToStats.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        Intent j = getIntent();
        Player player = (Player) j.getSerializableExtra("player");
        /**
         * Determines what to do depending on what button was pressed
         */
        switch(view.getId()){
            /**
             * Strength Button is pressed
             */
            case R.id.strength_button2:
                //Checks to see if the players has enough stat points
                if(player.getPlayerStatPoints() > 0){
                    //Adds one to the players strength
                    player.setPlayerStrength(player.getPlayerStrength() + 1);
                    //Subtracts one from available stat points
                    player.setPlayerStatPoints(player.getPlayerStatPoints() - 1);
                    //Creates a new intent
                    Intent i;
                    //Sends the player back to the menu with the new updates stats
                    i = new Intent(this, AllocationActivity2.class);
                    i.putExtra("player", player);
                    startActivity(i);
                    break;
                } else {
                    //Displays a message if there isnt enough stat points to use
                    Context context = getApplicationContext();
                    CharSequence text = "Not Enough Stat Points!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    break;
                }
                /**
                 * Intelligence button is pressed
                 */
            case R.id.intelligence_button2:
                //Checks to see if the players has enough stat points
                if(player.getPlayerStatPoints() > 0){
                    //Adds one to the players intelligence
                    player.setPlayerIntelligence(player.getPlayerIntelligence() + 1);
                    //Subtracts one from available stat points
                    player.setPlayerStatPoints(player.getPlayerStatPoints() - 1);
                    //Creates a new intent
                    Intent i;
                    //Sends the player back to the menu with the new updates stats
                    i = new Intent(this, AllocationActivity2.class);
                    i.putExtra("player", player);
                    startActivity(i);
                    break;
                } else {
                    //Displays a message if there isnt enough stat points to use
                    Context context = getApplicationContext();
                    CharSequence text = "Not Enough Stat Points!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    break;
                }
            case R.id.vitality_button2:
                //Checks to see if the players has enough stat points
                if(player.getPlayerStatPoints() > 0){
                    //Adds one to the players vitality
                    player.setPlayerVitality(player.getPlayerVitality() + 1);
                    //Subtracts one from available stat points
                    player.setPlayerStatPoints(player.getPlayerStatPoints() - 1);
                    //Creates a new intent
                    Intent i;
                    //Sends the player back to the menu with the new updates stats
                    i = new Intent(this, AllocationActivity2.class);
                    i.putExtra("player", player);
                    startActivity(i);
                    break;
                } else {
                    //Displays a message if there isnt enough stat points to use
                    Context context = getApplicationContext();
                    CharSequence text = "Not Enough Stat Points!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    break;
                }
                /**
                 * Sends the player back to the stats page
                 */
            case R.id.back_to_stats2:
                Intent i;
                i = new Intent(this, StatsActivity2.class);
                i.putExtra("player",player);
                startActivity(i);
                break;
        }

    }

}
