package com.example.java_rpg_game;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.java_rpg_game.player.Player;

public class BagActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bag);

        Intent j = getIntent();
        Player player = (Player) j.getSerializableExtra("player");
        String [] bag = player.getPlayerBag();

        String bagTitle = "Bag";
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

        TextView textBagTitle = (TextView)findViewById(R.id.bag_title);
        TextView textItem1 = (TextView)findViewById(R.id.item_1);
        TextView textItem2 = (TextView)findViewById(R.id.item_2);
        TextView textItem3 = (TextView)findViewById(R.id.item_3);
        TextView textItem4 = (TextView)findViewById(R.id.item_4);
        TextView textItem5 = (TextView)findViewById(R.id.item_5);
        TextView textItem6 = (TextView)findViewById(R.id.item_6);
        TextView textItem7 = (TextView)findViewById(R.id.item_7);
        TextView textItem8 = (TextView)findViewById(R.id.item_8);
        TextView textItem9 = (TextView)findViewById(R.id.item_9);
        TextView textItem10 = (TextView)findViewById(R.id.item_10);
        TextView textItem11 = (TextView)findViewById(R.id.item_11);
        TextView textItem12 = (TextView)findViewById(R.id.item_12);
        TextView textItem13 = (TextView)findViewById(R.id.item_13);
        TextView textItem14 = (TextView)findViewById(R.id.item_14);
        TextView textItem15 = (TextView)findViewById(R.id.item_15);
        Button buttonBackToMenu = (Button)findViewById(R.id.back_to_menu);
        Button buttonViewItem = (Button)findViewById(R.id.view_item);
        Button buttonEquipItem = (Button)findViewById(R.id.equip_item);
        Button buttonUseItem = (Button)findViewById(R.id.use_item);

        textBagTitle.setText(bagTitle);
        textItem1.setText(item1);
        textItem2.setText(item2);
        textItem3.setText(item3);
        textItem4.setText(item4);
        textItem5.setText(item5);
        textItem6.setText(item6);
        textItem7.setText(item7);
        textItem8.setText(item8);
        textItem9.setText(item9);
        textItem10.setText(item10);
        textItem11.setText(item11);
        textItem12.setText(item12);
        textItem13.setText(item13);
        textItem14.setText(item14);
        textItem15.setText(item15);

        buttonBackToMenu.setOnClickListener(this);
        buttonViewItem.setOnClickListener(this);
        buttonEquipItem.setOnClickListener(this);
        buttonUseItem.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        Intent j = getIntent();
        Player player = (Player) j.getSerializableExtra("player");

        switch(view.getId()){
            case R.id.back_to_menu:
                Intent k;
                k = new Intent(this, MainActivity.class);
                k.putExtra("player", player);
                startActivity(k);
                break;
            /*case R.id.view_item:
                Intent m;
                m = new Intent(this, ViewItemActivity.class);
                m.putExtra("player", player);
                startActivity(m);
                break;*/
            case R.id.equip_item:
                Intent n;
                n = new Intent(this, EquipItemActivity.class);
                n.putExtra("player", player);
                startActivity(n);
                break;
            /*case R.id.use_item:
                Intent o;
                o = new Intent(this, UseItemActivity.class);
                o.putExtra("player", player);
                startActivity(o);
                break;*/
        }
    }
}
