package edu.sbcc.cs105;

import java.util.*;

/**
 * This class simulates rolling a die by generating a random number between 1
 * and 6 inclusive.
 */
public class DieSimulator {
    public int rollTheDie() {
        Random rand = new Random();
        int randomDieRoll = rand.nextInt(6 ) + 1;

        return randomDieRoll;
    }
}