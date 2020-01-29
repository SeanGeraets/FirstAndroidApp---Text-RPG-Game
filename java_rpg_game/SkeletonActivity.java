package com.example.java_rpg_game;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.java_rpg_game.Enemies.Skeleton;
import com.example.java_rpg_game.boots.ironBoots;
import com.example.java_rpg_game.boots.leatherBoots;
import com.example.java_rpg_game.chestplate.ironChestplate;
import com.example.java_rpg_game.chestplate.leatherChestplate;
import com.example.java_rpg_game.gloves.ironGloves;
import com.example.java_rpg_game.gloves.leatherGloves;
import com.example.java_rpg_game.helmet.ironHelmet;
import com.example.java_rpg_game.helmet.leatherHelmet;
import com.example.java_rpg_game.leggings.ironLeggings;
import com.example.java_rpg_game.leggings.leatherLeggings;
import com.example.java_rpg_game.player.Player;
import com.example.java_rpg_game.shoulders.ironShoulders;
import com.example.java_rpg_game.shoulders.leatherShoulders;
import com.example.java_rpg_game.weapons.greatSword;
import com.example.java_rpg_game.weapons.longSword;
import com.example.java_rpg_game.weapons.shortSword;

import java.util.Random;

public class SkeletonActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skeleton);

        /**
         * Gets the player and skeleton intents
         */
        Intent j = getIntent();
        Player player = (Player)j.getSerializableExtra("player");
        Skeleton skeleton = (Skeleton)j.getSerializableExtra("skeleton");
        /**
         * Sets strings for the players health and mp, the skeleton health and mp, and the title of the fight
         */
        String skeletonTitle = "Fight the Skeleton!";
        String playerHP = "HP: " + player.getPlayerCurrentHealth() + " / " + (player.getPlayerMaxHealth() + (player.getPlayerVitality() * 10));
        String playerMP = "MP: " + player.getPlayerCurrentMp() + " / " + (player.getPlayerMaxMp() + (player.getPlayerIntelligence() * 5));
        String skeletonHP = "HP: " + skeleton.getSkeletonCurrentHealth() + " / " + skeleton.getSkeletonMaxHealth();
        String skeletonMP = "MP: " + skeleton.getSkeletonCurrentMp() + " / " + skeleton.getSkeletonMaxMp();
        /**
         * Creates the text views and the buttons
         */
        TextView textTitle = (TextView)findViewById(R.id.fight_title);
        TextView textEnemyHp = (TextView)findViewById(R.id.enemy_hp);
        TextView textEnemyMp = (TextView)findViewById(R.id.enemy_mp);
        TextView textPlayerHp = (TextView)findViewById(R.id.player_hp);
        TextView textPlayerMp = (TextView)findViewById(R.id.player_mp);
        Button buttonAttack = (Button)findViewById(R.id.attack);
        Button buttonUseItem = (Button)findViewById(R.id.use_item);
        Button buttonSpell = (Button)findViewById(R.id.spell);
        Button buttonRun = (Button)findViewById(R.id.run);
        /**
         * Sets the texts for the text views
         */
        textTitle.setText(skeletonTitle);
        textEnemyHp.setText(skeletonHP);
        textEnemyMp.setText(skeletonMP);
        textPlayerHp.setText(playerHP);
        textPlayerMp.setText(playerMP);
        /**
         * Creates the onClickListeners for the buttons
         */
        buttonAttack.setOnClickListener(this);
        buttonUseItem.setOnClickListener(this);
        buttonSpell.setOnClickListener(this);
        buttonRun.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        /**
         * Gets the player and skeletons intents
         */
        Intent j = getIntent();
        Player player = (Player)j.getSerializableExtra("player");
        Skeleton skeleton = (Skeleton)j.getSerializableExtra("skeleton");
        /**
         * Determines the action based on what button was pressed
         */
        switch(view.getId()){
            /**
             * If the attack button was pressed
             */
            case R.id.attack:
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                //Deals damage to the skeleton and lowers its current health appropriately
                skeleton.setSkeletonCurrentHealth(damageDealt(player.getPlayerAttack(),
                        skeleton.getSkeletonCurrentHealth(), skeleton.getSkeletonDefense(),
                        weaponAttack(player.getPlayerWeapon())));
                //Displays a message based on the damage dealt
                if((player.getPlayerAttack() + weaponAttack(player.getPlayerWeapon()) - skeleton.getSkeletonDefense()) < 0){
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable()
                    {

                        @Override
                        public void run()
                        {
                            CharSequence text = "You dealt 0 damage!";
                            Toast.makeText(SkeletonActivity.this, text, Toast.LENGTH_SHORT).show();
                        }
                    },1500);
                }else {
                    final int damage = player.getPlayerAttack() + weaponAttack(player.getPlayerWeapon()) - skeleton.getSkeletonDefense();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable()
                    {

                        @Override
                        public void run()
                        {
                            CharSequence text = "You dealt " + damage + " damage!";
                            Toast.makeText(SkeletonActivity.this, text, Toast.LENGTH_SHORT).show();
                        }
                    }, 1500);
                }
                //Deals damage to the player and lowers their current health appropriately
                player.setPlayerCurrentHealth(damageTaken(skeleton.getSkeletonAttack(),
                        player.getPlayerCurrentHealth(), totalDefense(player.getPlayerBoots(),
                                player.getPlayerChestplate(), player.getPlayerGloves(),
                                player.getPlayerHelmet(), player.getPlayerLeggings(),
                                player.getPlayerShoulders(), player.getPlayerDefense())));
                //Displays a message based on the damage the player took
                if((skeleton.getSkeletonAttack() - totalDefense(player.getPlayerBoots(),
                        player.getPlayerChestplate(), player.getPlayerGloves(),
                        player.getPlayerHelmet(), player.getPlayerLeggings(),
                        player.getPlayerShoulders(), player.getPlayerDefense()) < 0)){
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable()
                    {

                        @Override
                        public void run()
                        {
                            CharSequence text = "You took 0 damage!";
                            Toast.makeText(SkeletonActivity.this, text, Toast.LENGTH_SHORT).show();
                        }
                    }, 3000);
                }else{
                    final int damage = skeleton.getSkeletonAttack() - totalDefense(player.getPlayerBoots(),
                            player.getPlayerChestplate(), player.getPlayerGloves(),
                            player.getPlayerHelmet(), player.getPlayerLeggings(),
                            player.getPlayerShoulders(), player.getPlayerDefense());
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable()
                    {

                        @Override
                        public void run()
                        {
                            CharSequence text = "You took " + damage + " damage!";
                            Toast.makeText(SkeletonActivity.this, text, Toast.LENGTH_SHORT).show();
                        }
                    }, 3000);
                }
                /**
                 * Checks to see if the skeleton has died
                 */
                if(skeleton.getSkeletonCurrentHealth() <= 0){
                    //Grants the player the appropriate amount of experience
                    player.setPlayerXp(player.getPlayerXp() + skeleton.getSkeletonExperience());
                    //Checks to see if the player has leveled up
                    if(player.getPlayerXp() > (player.getPlayerLevel() * 100)){
                        //Adjusts the players stats accordingly if they leveled up
                        player.setPlayerLevel(player.getPlayerLevel() + 1);
                        player.setPlayerXp(player.getPlayerXp() - ((player.getPlayerLevel()-1)*100));
                        player.setPlayerStatPoints(player.getPlayerStatPoints() + 1);
                        player.setPlayerCurrentHealth(player.getPlayerMaxHealth());
                        player.setPlayerCurrentMp(player.getPlayerMaxMp());
                        //Displays a message when the player levels up
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable()
                        {

                            @Override
                            public void run()
                            {
                                CharSequence text = "You leveled up!";
                                Toast.makeText(SkeletonActivity.this, text, Toast.LENGTH_SHORT).show();
                            }
                        }, 7500);
                    }
                    player.setPlayerGold(player.getPlayerGold() + skeleton.getSkeletonGoldDropped());
                    enemyDied(skeleton.getSkeletonGoldDropped(), skeleton.getSkeletonExperience());
                    //Determines what loot the player receives
                    String loot = lootDropped();
                    //Displays a message and places the loot in the players bag
                    if (loot.equals("")){
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable()
                        {

                            @Override
                            public void run()
                            {
                                CharSequence text = "You got no loot";
                                Toast.makeText(SkeletonActivity.this, text, Toast.LENGTH_SHORT).show();
                            }
                        }, 9000);
                    }else {
                        final String loot2 = loot;
                        player.setPlayerBag(placeInBag(loot, player.getPlayerBag()));
                        Handler handler = new Handler();
                        handler.postDelayed(new Runnable()
                        {

                            @Override
                            public void run()
                            {
                                CharSequence text = "You got " + loot2;
                                Toast.makeText(SkeletonActivity.this, text, Toast.LENGTH_SHORT).show();
                            }
                        }, 9000);
                    }
                    //Creates an intent
                    Intent a;
                    //Sends the player back to the main menu with the updated stats and inventory
                    a = new Intent(this, MainActivity.class);
                    a.putExtra("player", player);
                    startActivity(a);
                }else{
                    //Creates an intent
                    Intent a;
                    //Sends the player and the skeleton updated stats to continue combat
                    a = new Intent(this, SkeletonActivity.class);
                    a.putExtra("player", player);
                    a.putExtra("skeleton", skeleton);
                    startActivity(a);
                }
                break;
            /**
             * If the use item button was clicked
             */
            case R.id.use_item:
                break;
            /**
             * If the spell item button was clicked
             */
            case R.id.spell:
                break;
            /**
             * If the run button was clicked
             */
            case R.id.run:
                Intent k;
                //Sends the player back to the main menu
                k = new Intent(this, MainActivity.class);
                k.putExtra("player", player);
                startActivity(k);
                break;
        }

    }

    /**
     * Method to display messages if the skeleton has died
     * @param skeletonGold
     * @param skeletonXp
     */
    public void enemyDied(int skeletonGold, int skeletonXp){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        final int gold = skeletonGold;
        final int xp = skeletonXp;
        CharSequence text = "The skeleton has died";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable()
        {

            @Override
            public void run()
            {
                CharSequence text2 = "You gained " + gold + " gold";
                Toast.makeText(SkeletonActivity.this, text2, Toast.LENGTH_SHORT).show();
            }
        }, 4500);
        Handler handler2 = new Handler();
        handler2.postDelayed(new Runnable()
        {

            @Override
            public void run()
            {
                CharSequence text3 = "You gained " + xp + " xp";
                Toast.makeText(SkeletonActivity.this, text3, Toast.LENGTH_SHORT).show();
            }
        }, 6000);
    }
    /**
     * Gets the players equipped weapons attack
     * @param weaponName
     * @return
     */
    public int weaponAttack(String weaponName){
        String name = weaponName;
        int attack = 0;
        switch(name){
            case "Short Sword":
                shortSword ShortSword = new shortSword();
                attack = ShortSword.getAttack();
                break;
            case "Long Sword":
                longSword LongSword = new longSword();
                attack = LongSword.getAttack();
                break;
            case "Great Sword":
                greatSword GreatSword = new greatSword();
                attack = GreatSword.getAttack();
                break;
            default:
                break;
        }
        return attack;
    }
    /**
     * Calculates the players total defense based on base stats and the equipped items
     * @param boots
     * @param chestplate
     * @param gloves
     * @param helmet
     * @param leggings
     * @param shoulders
     * @param playerDefense
     * @return
     */
    public int totalDefense(String boots, String chestplate, String gloves, String helmet, String leggings, String shoulders, int playerDefense){
        String bootsName = boots;
        String chestplateName = chestplate;
        String glovesName = gloves;
        String helmetName = helmet;
        String leggingsName = leggings;
        String shouldersName = shoulders;
        int defense = playerDefense;
        int armorDefense;
        switch(bootsName){
            case "Leather Boots":
                leatherBoots LeatherBoots = new leatherBoots();
                armorDefense = LeatherBoots.getDefense();
                defense = defense + armorDefense;
                break;
            case "Iron Boots":
                ironBoots IronBoots = new ironBoots();
                armorDefense = IronBoots.getDefense();
                defense = defense + armorDefense;
                break;
            default:
                break;
        }
        switch(chestplateName){
            case "Leather Chestplate":
                leatherChestplate LeatherChestplate = new leatherChestplate();
                armorDefense = LeatherChestplate.getDefense();
                defense = defense + armorDefense;
                break;
            case "Iron Chestplate":
                ironChestplate IronChestplate = new ironChestplate();
                armorDefense = IronChestplate.getDefense();
                defense = defense + armorDefense;
                break;
            default:
                break;
        }
        switch(glovesName){
            case "Leather Gloves":
                leatherGloves LeatherGloves = new leatherGloves();
                armorDefense = LeatherGloves.getDefense();
                defense = defense + armorDefense;
                break;
            case "Iron Gloves":
                ironGloves IronGloves = new ironGloves();
                armorDefense = IronGloves.getDefense();
                defense = defense + armorDefense;
                break;
            default:
                break;
        }
        switch(helmetName){
            case "Leather Helmet":
                leatherHelmet LeatherHelmet = new leatherHelmet();
                armorDefense = LeatherHelmet.getDefense();
                defense = defense + armorDefense;
                break;
            case "Iron Helmet":
                ironHelmet IronHelmet = new ironHelmet();
                armorDefense = IronHelmet.getDefense();
                defense = defense + armorDefense;
                break;
            default:
                break;
        }
        switch(leggingsName){
            case "Leather Leggings":
                leatherLeggings LeatherLeggings = new leatherLeggings();
                armorDefense = LeatherLeggings.getDefense();
                defense = defense + armorDefense;
                break;
            case "Iron Leggings":
                ironLeggings IronLeggings = new ironLeggings();
                armorDefense = IronLeggings.getDefense();
                defense = defense + armorDefense;
                break;
            default:
                break;
        }
        switch(shouldersName){
            case "Leather Shoulders":
                leatherShoulders LeatherShoulders = new leatherShoulders();
                armorDefense = LeatherShoulders.getDefense();
                defense = defense + armorDefense;
                break;
            case "Iron Shoulders":
                ironShoulders IronShoulders = new ironShoulders();
                armorDefense = IronShoulders.getDefense();
                defense = defense + armorDefense;
                break;
            default:
                break;
        }
        return defense;
    }
    /**
     * Calculates the damage the player deals
     * @param playerAttack
     * @param skeletonHealth
     * @param skeletonDefense
     * @param playerWeaponAttack
     * @return
     */
    public int damageDealt(int playerAttack, int skeletonHealth, int skeletonDefense, int playerWeaponAttack){
        int playerDamage = (playerAttack + playerWeaponAttack - skeletonDefense);
        int skeletonHP;
        if (playerDamage < 0){
            skeletonHP = skeletonHealth;
        }else {
         skeletonHP = skeletonHealth - playerDamage;
        }
        return skeletonHP;
    }
    /**
     * Calculates the damage the player takes
     * @param skeletonAttack
     * @param playerHealth
     * @param playerDefense
     * @return
     */
    public int damageTaken(int skeletonAttack, int playerHealth, int playerDefense){
        int skeletonDamage = (skeletonAttack - playerDefense);
        int playerHP;
        if (skeletonDamage < 0){
            playerHP = playerHealth;
        }else{
            playerHP = playerHealth - skeletonDamage;
        }
        return playerHP;
    }
    /**
     * Determines what item was dropped by the skeleton if any
     * @return
     */
    public String lootDropped(){
        Random rand = new Random();
        String loot = "";
        switch(rand.nextInt(8)){
            case 1:
                loot = "Short Sword";
                break;
            case 2:
                loot = "Leather Helmet";
                break;
            case 3:
                loot = "Leather Gloves";
                break;
            case 4:
                loot = "Leather Chestplate";
                break;
            case 5:
                loot = "Leather Shoulders";
                break;
            case 6:
                loot = "Leather Leggings";
                break;
            case 7:
                loot = "Leather Boots";
                break;
            default:
                break;
        }
        return loot;
    }
    /**
     * Places the item dropped into the players bag
     * @param item
     * @param inventory
     * @return
     */
    private static String[] placeInBag(String item, String[] inventory){
        for(int i=0; i<inventory.length; i++){
            if(inventory[i].equals("Empty")){
                inventory[i] = item;
                break;
            }
        }
        return inventory;
    }

}
