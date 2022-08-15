package com.philippa.javaFXPigGame.Model;

/**
 * Player class containing properties pertaining to player: name, current score, total score, and turn status.
 */
public class Player {

    String name;
    private int currentScore;
    private int totalScore;

    public Player(String name) {
        this.name = name;
        this.currentScore = 0;
        this.totalScore = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void resetCurrentScore() {
        this.currentScore = 0;
    }

    public void updateCurrentScore(int diceValue) { this.currentScore += diceValue;};

    public int getTotalScore() {
        return totalScore;
    }

    public void resetTotalScore() { this.totalScore = 0;};

    public void updateTotalScore() {
        this.totalScore += currentScore;
    }

    // methods

    public void resetPlayerState() {
        currentScore = 0;
        totalScore = 0;
    }
}
