package com.example.java_rpg_game.Enemies;

import java.io.Serializable;

public class Skeleton implements Serializable {
    /**
     * Integer to hold the skeletons current health
     */
    private int skeletonCurrentHealth;
    /**
     * Integer to hold the skeletons maximum health
     */
    private int skeletonMaxHealth;
    /**
     * Integer to hold the skeletons current mp
     */
    private int skeletonCurrentMp;
    /**
     * Integer to hold the skeletons maximum mp
     */
    private int skeletonMaxMp;
    /**
     * Integer to hold the skeletons attack
     */
    private int skeletonAttack;
    /**
     * Integer to hold the skeletons defense
     */
    private int skeletonDefense;
    /**
     * Integer to hold the skeletons experience given to the player upon death
     */
    private int skeletonExperience;
    /**
     * Integer to hold the skeletons gold dropped upon death
     */
    private int skeletonGoldDropped;
    /**
     * String to hold the skeletons name
     */
    private String skeletonName;

    /**
     * Basic constructor
     */
    public Skeleton(){
        setSkeletonCurrentHealth(7);
        setSkeletonMaxHealth(7);
        setSkeletonCurrentMp(0);
        setSkeletonMaxMp(0);
        setSkeletonAttack(1);
        setSkeletonDefense(0);
        setSkeletonExperience(10);
        setSkeletonGoldDropped(5);
        setSkeletonName("Skeleton");
    }

    /**
     * Gets the skeletons current health
     * @return
     */
    public int getSkeletonCurrentHealth() {
        return skeletonCurrentHealth;
    }

    /**
     * Sets the skeletons current health to a new value
     * @param skeletonCurrentHealth
     */
    public void setSkeletonCurrentHealth(int skeletonCurrentHealth) {
        this.skeletonCurrentHealth = skeletonCurrentHealth;
    }

    /**
     * Gets the skeletons current mp
     * @return
     */
    public int getSkeletonCurrentMp() {
        return skeletonCurrentMp;
    }

    /**
     * Sets the skeletons current mp to a new value
     * @param skeletonCurrentMp
     */
    public void setSkeletonCurrentMp(int skeletonCurrentMp) {
        this.skeletonCurrentMp = skeletonCurrentMp;
    }

    /**
     * Gets the skeletons maximum mp
     * @return
     */
    public int getSkeletonMaxMp() {
        return skeletonMaxMp;
    }

    /**
     * Sets the skeletons maximum mp to a new value
     * @param skeletonMaxMp
     */
    public void setSkeletonMaxMp(int skeletonMaxMp) {
        this.skeletonMaxMp = skeletonMaxMp;
    }

    /**
     * Gets the skeletons maximum health
     * @return
     */
    public int getSkeletonMaxHealth() {
        return skeletonMaxHealth;
    }

    /**
     * Sets the skeletons maximum health to a new value
     * @param skeletonMaxHealth
     */
    public void setSkeletonMaxHealth(int skeletonMaxHealth) {
        this.skeletonMaxHealth = skeletonMaxHealth;
    }

    /**
     * Gets the skeletons attack
     * @return
     */
    public int getSkeletonAttack() {
        return skeletonAttack;
    }

    /**
     * Sets the skeletons attack to a new value
     * @param skeletonAttack
     */
    public void setSkeletonAttack(int skeletonAttack) {
        this.skeletonAttack = skeletonAttack;
    }

    /**
     * Gets the skeletons defense
     * @return
     */
    public int getSkeletonDefense() {
        return skeletonDefense;
    }

    /**
     * Sets the skeletons defense to a new value
     * @param skeletonDefense
     */
    public void setSkeletonDefense(int skeletonDefense) {
        this.skeletonDefense = skeletonDefense;
    }

    /**
     * Gets the skeletons experience
     * @return
     */
    public int getSkeletonExperience() {
        return skeletonExperience;
    }

    /**
     * Sets the skeletons experience to a new value
     * @param skeletonExperience
     */
    public void setSkeletonExperience(int skeletonExperience) {
        this.skeletonExperience = skeletonExperience;
    }

    /**
     * Gets the skeletons gold value
     * @return
     */
    public int getSkeletonGoldDropped() {
        return skeletonGoldDropped;
    }

    /**
     * Sets the skeletons gold to a new value
     * @param skeletonGoldDropped
     */
    public void setSkeletonGoldDropped(int skeletonGoldDropped) {
        this.skeletonGoldDropped = skeletonGoldDropped;
    }

    /**
     * String to hold the skeleton name
     */ /**
     * Gets the skeletons name
     * @return
     */
    public String getSkeletonName(){
        return skeletonName;
    }

    /**
     * Sets the skeletons name to a new value
     * @param skeletonName
     */
    public void setSkeletonName(String skeletonName) {
        this.skeletonName = skeletonName;
    }
}
