package com.example.admin.tormentarpgcharactermanager;

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
    public int testAttribute(int difficulty) {
        
        return 0;
    }
}
