package com.example.java_rpg_game.player;


import java.io.Serializable;

public class Player implements Serializable {
    /**
     * Integer to hold the players current health
     */
    private int playerCurrentHealth;
    /**
     * Integer to hold the players maximum health
     */
    private int playerMaxHealth;
    /**
     * Integer to hold the players current mp
     */
    private int playerCurrentMp;
    /**
     * Integer to hold the players maximum mp
     */
    private int playerMaxMp;
    /**
     * Integer to hold the players attack
     */
    private int playerAttack;
    /**
     * Integer to hold the players total attack
     */
    private int playerTotalAttack;
    /**
     * Integer to hold the players defense
     */
    private int playerDefense;
    /**
     * Integer to hold the players total defense
     */
    private int playerTotalDefense;
    /**
     * Integer to hold the players gold
     */
    private int playerGold;
    /**
     * Integer to hold the players strength stat
     */
    private int playerStrength;
    /**
     * Integer to hold the players intelligence stat
     */
    private int playerIntelligence;
    /**
     * Integer to hold the players vitality stat
     */
    private int playerVitality;
    /**
     * Integer to hold the players level
     */
    private int playerLevel;
    /**
     * Integer to hold the players experience
     */
    private int playerXp;
    /**
     * Integer to hold the players stat points remaining
     */
    private int playerStatPoints;
    /**
     * String to hold the players helmet equipped
     */
    private String playerHelmet = "";
    /**
     * String to hold the players chestplate equipped
     */
    private String playerChestplate = "";
    /**
     * String to hold the players boots equipped
     */
    private String playerBoots = "";
    /**
     * String to hold the players gloves equipped
     */
    private String playerGloves = "";
    /**
     * String to hold the players leggings equipped
     */
    private String playerLeggings = "";
    /**
     * String to hold the players shoulders equipped
     */
    private String playerShoulders = "";
    /**
     * String to hold the players ring equipped
     */
    private String playerRing = "";
    /**
     * String to hold the players neck equipped
     */
    private String playerNeck = "";
    /**
     * String to hold the players weapon equipped
     */
    private String playerWeapon = "";
    /**
     * String array to hold the players inventory
     */
    public String [] playerBag = new String [15];
    /**
     * String to hold the players known spells
     */
    public String [] playerSpellList = new String[16];
    /**
     * String to hold the players accepted quests
     */
    public String [] playerQuestList = new String[16];

    /**
     * Basic constructor
     */
    public Player(){
        playerCurrentHealth = 30;
        playerMaxHealth = 30;
        playerAttack = 5;
        playerDefense = 0;
        playerLevel = 1;
        playerXp = 0;
        playerGold = 0;
        playerStrength = 0;
        playerVitality = 0;
        playerIntelligence = 0;
        playerCurrentMp = 10;
        playerMaxMp = 10;
        playerStatPoints = 1;
        for(int i=0; i< playerBag.length;i++){
            //playerBag[i] = new String();
            playerBag[i] = "Empty";
        }
        for(int i=0; i < playerSpellList.length;i++){
            playerSpellList[i] = new String();
        }
        for(int i=0; i < playerQuestList.length;i++){
            playerQuestList[i] = new String();
        }
    }

    /**
     * Gets the player current health
     * @return
     */
    public int getPlayerCurrentHealth() {
        return playerCurrentHealth;
    }

    /**
     * Sets the players current health to a new value
     * @param playerCurrentHealth
     */
    public void setPlayerCurrentHealth(int playerCurrentHealth) {
        this.playerCurrentHealth = playerCurrentHealth;
    }

    /**
     * Gets the players maximum health
     * @return
     */
    public int getPlayerMaxHealth() {
        return playerMaxHealth;
    }

    /**
     * Sets the players maximum health to a  new value
     * @param playerMaxHealth
     */
    public void setPlayerMaxHealth(int playerMaxHealth) {
        this.playerMaxHealth = playerMaxHealth;
    }

    /**
     * Gets the players current mp
     * @return
     */
    public int getPlayerCurrentMp() {
        return playerCurrentMp;
    }

    /**
     * Sets the players current mp to a new value
     * @param playerCurrentMp
     */
    public void setPlayerCurrentMp(int playerCurrentMp) {
        this.playerCurrentMp = playerCurrentMp;
    }

    /**
     * Gets the players maximum mp
     * @return
     */
    public int getPlayerMaxMp() {
        return playerMaxMp;
    }

    /**
     * Sets the players maximum mp to a new value
     * @param playerMaxMp
     */
    public void setPlayerMaxMp(int playerMaxMp) {
        this.playerMaxMp = playerMaxMp;
    }

    /**
     * Gets the players attack
     * @return
     */
    public int getPlayerAttack() {
        return playerAttack;
    }

    /**
     * Sets the players attack to a new value
     * @param playerAttack
     */
    public void setPlayerAttack(int playerAttack) {
        this.playerAttack = playerAttack;
    }

    /**
     * Gets the players total attack
     * @return
     */
    public int getPlayerTotalAttack() {
        return playerTotalAttack;
    }

    /**
     * Sets the players total attack to a new value
     * @param playerTotalAttack
     */
    public void setPlayerTotalAttack(int playerTotalAttack) {
        this.playerTotalAttack = playerTotalAttack;
    }

    /**
     * Gets the players defense
     * @return
     */
    public int getPlayerDefense() {
        return playerDefense;
    }

    /**
     * Sets the players defense to a new value
     * @param playerDefense
     */
    public void setPlayerDefense(int playerDefense) {
        this.playerDefense = playerDefense;
    }

    /**
     * Gets the players total defense
     * @return
     */
    public int getPlayerTotalDefense() {
        return playerTotalDefense;
    }

    /**
     * Sets the players total defense to a new value
     * @param playerTotalDefense
     */
    public void setPlayerTotalDefense(int playerTotalDefense) {
        this.playerTotalDefense = playerTotalDefense;
    }

    /**
     * Gets the players gold
     * @return
     */
    public int getPlayerGold() {
        return playerGold;
    }

    /**
     * Sets the players gold to a new value
     * @param playerGold
     */
    public void setPlayerGold(int playerGold) {
        this.playerGold = playerGold;
    }

    /**
     * Gets the players strength stat
     * @return
     */
    public int getPlayerStrength() {
        return playerStrength;
    }

    /**
     * Sets the players strength stat to a new value
     * @param playerStrength
     */
    public void setPlayerStrength(int playerStrength) {
        this.playerStrength = playerStrength;
    }

    /**
     * Gets the players intelligence stat
     * @return
     */
    public int getPlayerIntelligence() {
        return playerIntelligence;
    }

    /**
     * Sets the players intelligence stat to a new value
     * @param playerIntelligence
     */
    public void setPlayerIntelligence(int playerIntelligence) {
        this.playerIntelligence = playerIntelligence;
    }

    /**
     * Gets the players vitality stat
     * @return
     */
    public int getPlayerVitality() {
        return playerVitality;
    }

    /**
     * Sets the players vitality stat to a new value
     * @param playerVitality
     */
    public void setPlayerVitality(int playerVitality) {
        this.playerVitality = playerVitality;
    }

    /**
     * Gets the players level
     * @return
     */
    public int getPlayerLevel() {
        return playerLevel;
    }

    /**
     * Sets the players level to a new value
     * @param playerLevel
     */
    public void setPlayerLevel(int playerLevel) {
        this.playerLevel = playerLevel;
    }

    /**
     * Gets the player experience
     * @return
     */
    public int getPlayerXp() {
        return playerXp;
    }

    /**
     * Sets the players experience to a new value
     * @param playerXP
     */
    public void setPlayerXp(int playerXP) {
        this.playerXp = playerXP;
    }

    /**
     * Gets the players stat points
     * @return
     */
    public int getPlayerStatPoints() {
        return playerStatPoints;
    }

    /**
     * Sets the players stat points to a new value
     * @param statPoints
     */
    public void setPlayerStatPoints(int statPoints) {
        this.playerStatPoints = statPoints;
    }

    /**
     * Gets the players equipped helmet
     * @return
     */
    public String getPlayerHelmet() {
        return playerHelmet;
    }

    /**
     * Sets the players helmet to a new value
     * @param playerHelmet
     */
    public void setPlayerHelmet(String playerHelmet) {
        this.playerHelmet = playerHelmet;
    }

    /**
     * Gets the players equipped chestplate
     * @return
     */
    public String getPlayerChestplate() {
        return playerChestplate;
    }

    /**
     * Sets the players equipped chestplate to a new value
     * @param playerChestPlate
     */
    public void setPlayerChestplate(String playerChestPlate) {
        this.playerChestplate = playerChestPlate;
    }

    /**
     * Gets the players weapon
     * @return
     */
    public String getPlayerWeapon() {
        return playerWeapon;
    }

    /**
     * Sets the players weapon to a new value
     * @param playerWeapon
     */
    public void setPlayerWeapon(String playerWeapon) {
        this.playerWeapon = playerWeapon;
    }

    /**
     * Gets the players boots
     * @return
     */
    public String getPlayerBoots() {
        return playerBoots;
    }

    /**
     * Sets the players boots to a new value
     * @param playerBoots
     */
    public void setPlayerBoots(String playerBoots) {
        this.playerBoots = playerBoots;
    }

    /**
     * Gets the players gloves
     * @return
     */
    public String getPlayerGloves() {
        return playerGloves;
    }

    /**
     * Sets the players gloves to a new value
     * @param playerGloves
     */
    public void setPlayerGloves(String playerGloves) {
        this.playerGloves = playerGloves;
    }

    /**
     * Gets the players shoulders
     * @return
     */
    public String getPlayerShoulders() {
        return playerShoulders;
    }

    /**
     * Sets the players shoulders to a new value
     * @param playerShoulders
     */
    public void setPlayerShoulders(String playerShoulders) {
        this.playerShoulders = playerShoulders;
    }
    /**
     * Gets the players leggings
     * @return
     */
    public String getPlayerLeggings() {
        return playerLeggings;
    }
    /**
     * Sets the players leggings to a new value
     * @param playerLeggings
     */
    public void setPlayerLeggings(String playerLeggings) {
        this.playerLeggings = playerLeggings;
    }
    /**
     * Gets the players ring
     * @return
     */
    public String getPlayerRing(){
        return playerRing;
    }
    /**
     * Sets the players ring to a new value
     * @param playerRing
     */
    public void setPlayerRing(String playerRing){
        this.playerRing = playerRing;
    }
    /**
     * Gets the players neck
     * @return
     */
    public String getPlayerNeck(){
        return playerNeck;
    }
    /**
     * Sets the players neck to a new value
     * @param playerNeck
     */
    public void setPlayerNeck(String playerNeck){
        this.playerNeck = playerNeck;
    }
    /**
     * Gets the players bag
     * @return
     */
    public String[] getPlayerBag() {
        return playerBag;
    }
    /**
     * Sets the players bag to a new value
     * @param playerBag
     */
    public void setPlayerBag(String[] playerBag) {
        this.playerBag = playerBag;
    }
    /**
     * Gets the players spell list
     * @return
     */
    public String[] getPlayerSpellList() {
        return playerSpellList;
    }
    /**
     * Sets the players spell list to a new value
     * @param playerSpellList
     */
    public void setPlayerSpellList(String[] spellList) {
        this.playerSpellList = spellList;
    }
    /**
     * Gets the players quest list
     * @return
     */
    public String[] getPlayerQuestList() {
        return playerQuestList;
    }
    /**
     * Sets the players quest list to a new value
     * @param playerQuestList
     */
    public void setPlayerQuestList(String[] questList) {
        this.playerQuestList = questList;
    }
}
