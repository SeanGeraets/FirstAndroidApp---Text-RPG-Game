package com.example.java_rpg_game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.java_rpg_game.player.Player;

public class StatsActivity2 extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats2);
        /**
         * Gets the player intent
         */
        Intent j = getIntent();
        Player player = (Player)j.getSerializableExtra("player");
        /**
         * Sets various strings to display the players stats
         */
        String statsTitle = "Stats";
        String playerLevel = "Level: " + player.getPlayerLevel();
        String playerXp = "XP: " + player.getPlayerXp();
        String playerGold = "Gold: " + player.getPlayerGold();
        String playerHP = "HP: " + player.getPlayerCurrentHealth() + " / " + (player.getPlayerMaxHealth() + (player.getPlayerVitality() * 10));
        String playerMP = "MP: " + player.getPlayerCurrentMp() + " / " + (player.getPlayerMaxMp() + (player.getPlayerIntelligence() * 5));
        String playerAttack = "Attack: " + (player.getPlayerAttack() + player.getPlayerStrength());
        String playerDefense = "Defense: " + player.getPlayerDefense();
        String playerStrength = "Strength: " + player.getPlayerStrength();
        String playerIntelligence = "Intelligence: " + player.getPlayerIntelligence();
        String playerVitality = "Vitality: " + player.getPlayerVitality();
        String playerStatPoints = "Stat Points: " + player.getPlayerStatPoints();
        String playerHelmet = "Helmet: " + player.getPlayerHelmet();
        String playerShoulders = "Shoulders: " + player.getPlayerShoulders();
        String playerGloves = "Gloves: " + player.getPlayerGloves();
        String playerChestplate = "Chestplate: " + player.getPlayerChestplate();
        String playerLeggings = "Leggings: " + player.getPlayerLeggings();
        String playerBoots = "Boots: " + player.getPlayerBoots();
        String playerRing = "Ring: " + player.getPlayerRing();
        String playerNeck = "Neck: " + player.getPlayerNeck();
        String playerWeapon = "Weapon: " + player.getPlayerWeapon();
        /**
         * Creates various text views and buttons
         */
        TextView textTitle = (TextView)findViewById(R.id.stats_title);
        TextView textPlayerLevel3 = (TextView)findViewById(R.id.player_level3);
        TextView textPlayerXp3 = (TextView)findViewById(R.id.player_xp3);
        TextView textPlayerGold3 = (TextView)findViewById(R.id.player_gold3);
        TextView textPlayerHp3 = (TextView)findViewById(R.id.player_hp3);
        TextView textPlayerMp3 = (TextView)findViewById(R.id.player_mp3);
        TextView textPlayerAttack3 = (TextView)findViewById(R.id.player_attack3);
        TextView textPlayerDefense3 = (TextView)findViewById(R.id.player_defense3);
        TextView textPlayerStrength3 = (TextView)findViewById(R.id.player_strength3);
        TextView textPlayerIntelligence3 = (TextView)findViewById(R.id.player_intelligence3);
        TextView textPlayerVitality3 = (TextView)findViewById(R.id.player_vitality3);
        TextView textPlayerStatPoints3 = (TextView)findViewById(R.id.player_stat_points3);
        TextView textPlayerHelmet3 = (TextView)findViewById(R.id.player_helmet3);
        TextView textPlayerShoulders3 = (TextView)findViewById(R.id.player_shoulders3);
        TextView textPlayerGloves3 = (TextView)findViewById(R.id.player_gloves3);
        TextView textPlayerChestplate3 = (TextView)findViewById(R.id.player_chestplate3);
        TextView textPlayerLeggings3 = (TextView)findViewById(R.id.player_leggings3);
        TextView textPlayerBoots3 = (TextView)findViewById(R.id.player_boots3);
        TextView textPlayerRing3 = (TextView)findViewById(R.id.player_ring3);
        TextView textPlayerNeck3 = (TextView)findViewById(R.id.player_neck3);
        TextView textPlayerWeapon3 = (TextView)findViewById(R.id.player_weapon3);
        Button buttonAllocateStatPoints = (Button)findViewById(R.id.allocate_stat_points3);
        Button buttonBackToMenu = (Button)findViewById(R.id.back_to_menu3);
        /**
         * Sets the various text views to their text values
         */
        textTitle.setText(statsTitle);
        textPlayerLevel3.setText(playerLevel);
        textPlayerXp3.setText(playerXp);
        textPlayerGold3.setText(playerGold);
        textPlayerHp3.setText(playerHP);
        textPlayerMp3.setText(playerMP);
        textPlayerAttack3.setText(playerAttack);
        textPlayerDefense3.setText(playerDefense);
        textPlayerStrength3.setText(playerStrength);
        textPlayerIntelligence3.setText(playerIntelligence);
        textPlayerVitality3.setText(playerVitality);
        textPlayerStatPoints3.setText(playerStatPoints);
        textPlayerHelmet3.setText(playerHelmet);
        textPlayerShoulders3.setText(playerShoulders);
        textPlayerGloves3.setText(playerGloves);
        textPlayerChestplate3.setText(playerChestplate);
        textPlayerLeggings3.setText(playerLeggings);
        textPlayerBoots3.setText(playerBoots);
        textPlayerRing3.setText(playerRing);
        textPlayerNeck3.setText(playerNeck);
        textPlayerWeapon3.setText(playerWeapon);
        /**
         * Sets the buttons onClickListeners
         */
        buttonAllocateStatPoints.setOnClickListener(this);
        buttonBackToMenu.setOnClickListener(this);
}
    @Override
    public void onClick(View view){
        Intent j = getIntent();
        Player player = (Player)j.getSerializableExtra("player");
        /**
         * Determines where to send the player based on button pressed
         */
        switch(view.getId()){
            /**
             * If the player pressed the allocate stat points button
             */
            case R.id.allocate_stat_points3:
                Intent i;
                //Sends the player intent to the allocate stat activity
                i = new Intent(this, AllocationActivity2.class);
                i.putExtra("player", player);
                startActivity(i);
                break;
            /**
             * If the player pressed the back to menu button
             */
            case R.id.back_to_menu3:
                Intent k;
                //Sends the player intent back to the main menu activity
                k = new Intent(this, MainActivity.class);
                k.putExtra("player", player);
                startActivity(k);
                break;
        }
    }
}
