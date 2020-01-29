package com.example.java_rpg_game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.java_rpg_game.player.Player;

public class EquipItemActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equip_item);

        Intent j = getIntent();
        Player player = (Player) j.getSerializableExtra("player");
        String [] bag = player.getPlayerBag();
        String item1 =  bag[0];
        String item2 = bag[1];
        String item3 = bag[2];
        String item4 = bag[3];
        String item5 = bag[4];
        String item6 = bag[5];
        String item7 = bag[6];
        String item8 = bag[7];
        String item9 = bag[8];
        String item10 = bag[9];
        String item11 = bag[10];
        String item12 = bag[11];
        String item13 = bag[12];
        String item14 = bag[13];
        String item15 = bag[14];


        Button buttonBackToBag = (Button)findViewById(R.id.back_to_bag);
        Button buttonEquipItem1 = (Button)findViewById(R.id.equip_item_1);
        Button buttonEquipItem2 = (Button)findViewById(R.id.equip_item_2);
        Button buttonEquipItem3 = (Button)findViewById(R.id.equip_item_3);
        Button buttonEquipItem4 = (Button)findViewById(R.id.equip_item_4);
        Button buttonEquipItem5 = (Button)findViewById(R.id.equip_item_5);
        Button buttonEquipItem6 = (Button)findViewById(R.id.equip_item_6);
        Button buttonEquipItem7 = (Button)findViewById(R.id.equip_item_7);
        Button buttonEquipItem8= (Button)findViewById(R.id.equip_item_8);
        Button buttonEquipItem9 = (Button)findViewById(R.id.equip_item_9);
        Button buttonEquipItem10 = (Button)findViewById(R.id.equip_item_10);
        Button buttonEquipItem11 = (Button)findViewById(R.id.equip_item_11);
        Button buttonEquipItem12 = (Button)findViewById(R.id.equip_item_12);
        Button buttonEquipItem13 = (Button)findViewById(R.id.equip_item_13);
        Button buttonEquipItem14 = (Button)findViewById(R.id.equip_item_14);
        Button buttonEquipItem15 = (Button)findViewById(R.id.equip_item_15);

        buttonEquipItem1.setText(bag[0]);
        buttonEquipItem2.setText(bag[1]);
        buttonEquipItem3.setText(bag[2]);
        buttonEquipItem4.setText(bag[3]);
        buttonEquipItem5.setText(bag[4]);
        buttonEquipItem6.setText(bag[5]);
        buttonEquipItem7.setText(bag[6]);
        buttonEquipItem8.setText(bag[7]);
        buttonEquipItem9.setText(bag[8]);
        buttonEquipItem10.setText(bag[9]);
        buttonEquipItem11.setText(bag[10]);
        buttonEquipItem12.setText(bag[11]);
        buttonEquipItem13.setText(bag[12]);
        buttonEquipItem14.setText(bag[13]);
        buttonEquipItem15.setText(bag[14]);

        buttonBackToBag.setOnClickListener(this);
        buttonEquipItem1.setOnClickListener(this);
        buttonEquipItem2.setOnClickListener(this);
        buttonEquipItem3.setOnClickListener(this);
        buttonEquipItem4.setOnClickListener(this);
        buttonEquipItem5.setOnClickListener(this);
        buttonEquipItem6.setOnClickListener(this);
        buttonEquipItem7.setOnClickListener(this);
        buttonEquipItem8.setOnClickListener(this);
        buttonEquipItem9.setOnClickListener(this);
        buttonEquipItem10.setOnClickListener(this);
        buttonEquipItem11.setOnClickListener(this);
        buttonEquipItem12.setOnClickListener(this);
        buttonEquipItem13.setOnClickListener(this);
        buttonEquipItem14.setOnClickListener(this);
        buttonEquipItem15.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        Intent j = getIntent();
        Player player = (Player) j.getSerializableExtra("player");
        String [] bag = player.getPlayerBag();
        switch(view.getId()){
            case R.id.back_to_bag:
                Intent k;
                k = new Intent(this, BagActivity.class);
                k.putExtra("player", player);
                startActivity(k);
                break;
            case R.id.equip_item_1:
                Boolean isEquipable;
                isEquipable = itemTest(bag[0]);
                if(isEquipable == true){
                    switch(bag[0]){
                        case "Leather Helmet":
                            if(player.getPlayerHelmet().equals("")){
                                player.setPlayerHelmet("Leather Helmet");
                                player.setPlayerBag(removeFromBag(player.getPlayerBag(), "Leather Helmet"));
                            }else{
                                String previousItem = player.getPlayerHelmet();
                                player.setPlayerHelmet("Leather Helmet");
                                player.setPlayerBag(removeFromBag(player.getPlayerBag(), "Leather Helmet"));
                                player.setPlayerBag(placeInBag(previousItem, player.getPlayerBag()));
                            }
                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable()
                            {

                                @Override
                                public void run()
                                {
                                    CharSequence text3 = "You equipped Leather Helmet";
                                    Toast.makeText(EquipItemActivity.this, text3, Toast.LENGTH_SHORT).show();
                                }
                            }, 0);

                            break;
                        case "Iron Helmet":
                            if(player.getPlayerHelmet().equals("")){
                                player.setPlayerHelmet("Iron Helmet");
                                player.setPlayerBag(removeFromBag(player.getPlayerBag(), "Iron Helmet"));
                            }else{
                                String previousItem = player.getPlayerHelmet();
                                player.setPlayerHelmet("Iron Helmet");
                                player.setPlayerBag(removeFromBag(player.getPlayerBag(), "Iron Helmet"));
                                player.setPlayerBag(placeInBag(previousItem, player.getPlayerBag()));
                            }
                            Handler handler2 = new Handler();
                            handler2.postDelayed(new Runnable()
                            {

                                @Override
                                public void run()
                                {
                                    CharSequence text3 = "You equipped Iron Helmet";
                                    Toast.makeText(EquipItemActivity.this, text3, Toast.LENGTH_SHORT).show();
                                }
                            }, 0);
                            break;
                        case "Leather Shoulders":
                            if(player.getPlayerShoulders().equals("")){
                                player.setPlayerShoulders("Leather Shoulders");
                                player.setPlayerBag(removeFromBag(player.getPlayerBag(), "Leather Shoulders"));
                            }else{
                                String previousItem = player.getPlayerShoulders();
                                player.setPlayerShoulders("Leather Shoulders");
                                player.setPlayerBag(removeFromBag(player.getPlayerBag(), "Leather Shoulders"));
                                player.setPlayerBag(placeInBag(previousItem, player.getPlayerBag()));
                            }
                            Handler handler3 = new Handler();
                            handler3.postDelayed(new Runnable()
                            {

                                @Override
                                public void run()
                                {
                                    CharSequence text3 = "You equipped Leather Shoulders";
                                    Toast.makeText(EquipItemActivity.this, text3, Toast.LENGTH_SHORT).show();
                                }
                            }, 0);
                            break;
                    }
                }else{
                    Handler handler2 = new Handler();
                    handler2.postDelayed(new Runnable()
                    {

                        @Override
                        public void run()
                        {
                            CharSequence text3 = "You cannot equip that";
                            Toast.makeText(EquipItemActivity.this, text3, Toast.LENGTH_SHORT).show();
                        }
                    }, 0);
                }
                Intent a;
                a = new Intent(this, EquipItemActivity.class);
                a.putExtra("player", player);
                startActivity(a);
                break;
        }
    }
    public Boolean itemTest(String item){
        Boolean test = false;
        String name = item;
        if(name == "Leather Boots" || name == "Iron Boots"){
            test = true;
        }
        if(name == "Leather Chestplate" || name == "Iron Chestplate"){
            test = true;
        }
        if(name == "Leather Shoulders" || name == "Iron Shoulders"){
            test = true;
        }
        if(name == "Leather Gloves" || name == "Iron Gloves"){
            test = true;
        }
        if(name == "Leather Leggings" || name == "Iron Leggings"){
            test = true;
        }
        if(name == "Leather Helmet" || name == "Iron Helmet"){
            test = true;
        }
        if(name == "Short Sword" || name == "Long Sword" || name == "Great Sword"){
            test = true;
        }
        return test;
    }
    public String[] placeInBag(String itemName, String[] bag){
        for(int i=0; i<bag.length; i++){
            if(bag[i].equals("Empty")){
                bag[i] = itemName;
                break;
            }
        }
        return bag;
    }
    public String[] removeFromBag(String[] inventory, String item){
        for(int i=0; i<inventory.length; i++){
            if(inventory[i].equals(item)){
                inventory[i] = "Empty";
                break;
            }
        }
        return inventory;
    }
}
