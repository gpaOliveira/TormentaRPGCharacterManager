package com.example.admin.tormentarpgcharactermanager;

import java.util.Random;

/**
 * Created by admin on 12/31/2014.
 */
public class Die {
    public int rollDice(int numOfRolls, int numOfFaces) {
        int result = 0;
        Random die = new Random();

        for(int i = 0; i < numOfRolls; i++) {
            result = result + (die.nextInt()/numOfFaces);
        }

        return result;
    }
}
