package com.philippa.javaFXPigGame.Model;

/**
 * Dice class contains value of dice after a dice roll.
 */
public class Dice {

    private int value;

    public Dice() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // methods

    /**
     * Returns a dice roll between 1 to 6.
     * @return int dice roll
     */
    public int rollDice() {
        this.value = (int) (Math.random() * 6) + 1;
        return this.value;
    }
}
