package com.philippa.javaFXPigGame.Model;

/**
 * Player class containing properties pertaining to player: name, current score, total score, and turn status.
 */
public class Player {

    private String name;
    private int currentScore;
    private int totalScore;

    public Player(String name, boolean activePlayer) {
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

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void resetTotalScore() { this.totalScore = 0;};

    public void updateTotalScore() {
        this.totalScore += currentScore;
    }
}
