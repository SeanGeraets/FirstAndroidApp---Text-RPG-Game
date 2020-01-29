package com.example.java_rpg_game.weapons;

public class greatSword {
    /**
     * Integer to hold attack
     */
    private final int attack;
    /**
     * Integer to hold the buying price
     */
    private int buyPrice;
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
    public greatSword() {
        attack = 5;
        buyPrice = 50;
        sellPrice = 25;
        rarity = "Uncommon";
    }
    /**
     * Gets the value set to attack
     * @return
     */
    public int getAttack() {
        return attack;
    }
    /**
     * Gets the value of buy price
     * @return
     */
    public int getBuyPrice() {
        return buyPrice;
    }
    /**
     * Sets the value of buy price to a new value
     * @param buyPrice
     */
    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
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
