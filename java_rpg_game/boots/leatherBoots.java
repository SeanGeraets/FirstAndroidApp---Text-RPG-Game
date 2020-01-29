package com.example.java_rpg_game.boots;

public class leatherBoots {
    /**
     * Integer to hold defense value
     */
    private final int defense;
    /**
     * Integer to hold the selling price
     */
    private int sellPrice;
    /**
     * String to hold the rarity
     */
    private String rarity;
    /**
     * Basic constructor
     */
    public leatherBoots() {
        defense = 1;
        sellPrice = 1;
        rarity = "Common";
    }
    /**
     * Gets the value set to defense
     * @return
     */
    public int getDefense(){
        return defense;
    }
    /**
     * Gets the value set to sell price
     * @return
     */
    public int getSellPrice() {
        return sellPrice;
    }
    /**
     * Sets the value of sell price to a new value
     * @param sellPrice
     */
    public void setSellPrice(int sellPrice) {

        this.sellPrice = sellPrice;
    }
    /**
     * Gets the value set to rarity
     * @return
     */
    public String getRarity() {

        return rarity;
    }
    /**
     * Sets the value of rarity to a new value
     * @param rarity
     */
    public void setRarity(String rarity) {

        this.rarity = rarity;
    }
}
