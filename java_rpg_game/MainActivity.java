package com.example.java_rpg_game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.java_rpg_game.Enemies.Skeleton;
import com.example.java_rpg_game.player.Player;

import java.util.Random;

public class MainActivity extends Activity implements View.OnClickListener{
    Player player = new Player();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textTitle = (TextView)findViewById(R.id.game_title);
        Button buttonExplore = (Button)findViewById(R.id.explore);
        Button buttonStats = (Button)findViewById(R.id.stats);
        Button buttonSpells = (Button)findViewById(R.id.spells);
        Button buttonBag = (Button)findViewById(R.id.bag);
        Button buttonQuests = (Button)findViewById(R.id.quests);
        Button buttonShop = (Button)findViewById(R.id.shop);

        buttonExplore.setOnClickListener(this);
        buttonStats.setOnClickListener(this);
        buttonBag.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){

        switch(view.getId()){
            case R.id.explore:
                String enemy;
                Intent y;
                Intent intent = getIntent();

                Bundle extras = intent.getExtras();

                enemy = encounterSelector();
                switch(enemy){
                    case "Skeleton":
                        Skeleton skeleton = new Skeleton();
                        if(extras != null){
                            y = new Intent(this, SkeletonActivity.class);
                            Player player = (Player)intent.getSerializableExtra("player");
                            y.putExtra("skeleton",skeleton);
                            y.putExtra("player", player);
                            startActivity(y);
                        }else {
                            y = new Intent(this, SkeletonActivity.class);
                            y.putExtra("player", player);
                            y.putExtra("skeleton",skeleton);
                            startActivity(y);
                        }
                        break;
                    default:
                        break;
                }
                break;
            case R.id.stats:
                Intent i;
                Intent intent2 = getIntent();
                Bundle extras2 = intent2.getExtras();
                if(extras2 != null) {
                    Player player = (Player) intent2.getSerializableExtra("player");
                    i = new Intent(this, StatsActivity2.class);
                    i.putExtra("player", player);
                    startActivity(i);
               }else {
                    i = new Intent(this, StatsActivity2.class);
                    i.putExtra("player", player);
                    startActivity(i);
                }
                break;
            case R.id.spells:
                break;
            case R.id.bag:
                Intent z;
                Intent intent4 = getIntent();
                Bundle extras3 = intent4.getExtras();
                if(extras3 != null) {
                    Player player = (Player) intent4.getSerializableExtra("player");
                    z = new Intent(this, BagActivity.class);
                    z.putExtra("player", player);
                    startActivity(z);
                }else {
                    z = new Intent(this, BagActivity.class);
                    z.putExtra("player", player);
                    startActivity(z);
                }
                break;
            case R.id.quests:
                break;
            case R.id.shop:
                break;

        }

    }
    public String encounterSelector(){
        Random rand = new Random();
        String enemyName = "";
        switch(rand.nextInt(1)){
            case 0:
                enemyName = "Skeleton";
                break;
            case 1:
                enemyName = "Skeleton";
                break;
        }
        return enemyName;
    }
}
