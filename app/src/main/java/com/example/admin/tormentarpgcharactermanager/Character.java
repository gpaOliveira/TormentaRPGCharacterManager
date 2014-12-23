package com.example.admin.tormentarpgcharactermanager;

/**
 * Created by admin on 12/21/2014.
 */
public class Character {
    private Attribute strength;
    private Attribute dexterity;
    private Attribute constitution;
    private Attribute intelligence;
    private Attribute wisdom;
    private Attribute charisma;

    public void setStrength(int value) {
        Attribute str = new Attribute();

        str.setValue(value);
        str.setBonus();
    }
    public Attribute getStrength() {
        return this.strength;
    }
    public void setDexterity(int value) {
        Attribute dex = new Attribute();

        dex.setValue(value);
        dex.setBonus();
    }
    public Attribute getDexterity() {
        return this.dexterity;
    }
    public void setConstitution(int value) {
        Attribute cons = new Attribute();

        cons.setValue(value);
        cons.setBonus();
    }
    public Attribute getConstitution() {
        return this.constitution;
    }
    public void setIntelligence(int value) {
        Attribute intelligence = new Attribute();

        intelligence.setValue(value);
        intelligence.setBonus();
    }
    public Attribute getIntelligence() {
        return this.intelligence;
    }
    public void setWisdom(int value) {
        Attribute wis = new Attribute();

        wis.setValue(value);
        wis.setBonus();
    }
    public Attribute getWisdom() {
        return this.wisdom;
    }
    public void setCharisma(int value) {
        Attribute charisma = new Attribute();

        charisma.setValue(value);
        charisma.setBonus();
    }
    public Attribute getCharisma() {
        return this.charisma;
    }
}
