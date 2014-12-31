package com.example.admin.tormentarpgcharactermanager;

import java.util.Random;

/**
 * Created by admin on 12/20/2014.
 */
public class Attribute {
    private int value;
    private int bonus;

    public int getValue() {
        return this.value;
    }
    public void setValue(int newValue) {
        this.value = newValue;
    }
    public int getBonus() {
        return this.bonus;
    }
    public void setBonus() {
        if(this.getValue() < 10) {
            this.setValue(this.getValue()-1);
        }
        this.bonus = (this.getValue()-10) / 2;
    }
    public void addOne() {
        this.setValue(this.getValue()+1);
        this.setBonus();
    }
    public void setRandomValue() {
        Die die = new Die();
        int value = 0;

        while(value < 1){
            value = die.rollDice(1, 20);
        }

        this.setValue(value);
    }
}
