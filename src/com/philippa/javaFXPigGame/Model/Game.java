package com.philippa.javaFXPigGame.Model;

/**
 * Class contains the game logic of the Pig Game.
 * The class interacts with the Game Controller Class
 * Pig Game game logic: // TODO Description
 */
public class Game {

    private boolean gameState;
    private Player player1;
    private Player player2;
    private int activePlayer;
    private Dice dice;

    public Game() {
        this.gameState = true;
        this.player1 = new Player("Player 1", true);
        this.player2 = new Player("Player 2", false);
        this.activePlayer = 1;
        this.dice = new Dice();
    }

    public boolean isGameState() {
        return gameState;
    }

    private void setGameState(boolean gameState) {
        this.gameState = gameState;
    }

    public Player getPlayer1() {
        return player1;
    }

//    private void setPlayer1(Player player1) {
//        this.player1 = player1;
//    }

    public Player getPlayer2() {
        return player2;
    }

//    public void setPlayer2(Player player2) {
//        this.player2 = player2;
//    }

    public int getActivePlayer() {
        return activePlayer;
    }

    public Dice getDice() {
        return dice;
    }


    // Methods

    /**
     * Calls rollDice method in Dice class which returns a value between 1 to 6.
     * The value is returned to the GameController.
     * @return int value of dice
     */
    public int rollDice() {
        return dice.rollDice();
    }

    /**
     * Update the active player's current score.
     */
    public void updateCurrentScore() {
        if (activePlayer == 1) {
            player1.setCurrentScore(dice.getValue());
        } else {
            player2.setCurrentScore(dice.getValue());
        }
    }

    /**
     * Checks current dice roll for a value or 1.
     * If 1, current and total scores are reset for the active player.
     * @return boolean true dice value equals 1; false if not
     */
    public boolean checkForOne() {
        if (dice.getValue() == 1) {
            resetCurrentScore();
            resetTotalScore();
            return true;
        }
        return false;
    }

    /**
     * Reset the active player's current score when the dice value is 1.
     */
    public void resetCurrentScore() {
        if (activePlayer == 1) {
            player1.setCurrentScore(0);
        } else {
            player2.setCurrentScore(0);
        }
    }

    /**
     * Reset the active player's total score when the dice value is 1.
     */
    public void resetTotalScore() {
        if (activePlayer == 1) {
            player1.resetTotalScore();
        } else {
            player2.resetTotalScore();
        }
    }

    /**
     * Switch active player.
     */
    public void switchPlayer() {
        activePlayer = activePlayer == 1 ? 2 : 0;
    }

    /**
     * Holds, i.e. saves, the active player's current score.
     * The current score is then added to the total score.
     * The int returned is the total score.
     * @return int total score
     */
    public int hold() {
        return 1;  // TODO
    }

    /**
     * Updates the active player's total score
     */
    public void updateTotalScore() {
        if (activePlayer == 1) {
            player1.updateTotalScore();
        } else {
            player2.updateTotalScore();
        }
    }

    /**
     * Returns the state of the game.
     * @return boolean game state
     */
    public boolean checkGameState() {
        return gameState;
    }

    /**
     * Resets the game to its starting conditions.
     */
    public void reset() {
        // TODO
    }

}
