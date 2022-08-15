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
    private Player activePlayer;
    private Dice dice;

    public Game() {
        this.gameState = true;
        this.player1 = new Player("Player 1");
        this.player2 = new Player("Player 2");
        this.activePlayer = this.player1;
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

    public Player getPlayer2() {
        return player2;
    }

    public Player getActivePlayer() {
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
        activePlayer.updateCurrentScore(dice.getValue());
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
        activePlayer.resetCurrentScore();
    }

    /**
     * Reset the active player's total score when the dice value is 1.
     */
    public void resetTotalScore() {
        activePlayer.resetTotalScore();
    }

    /**
     * Switch active player.
     */
    public void switchPlayer() {
        activePlayer = activePlayer == player1 ? player2 : player1;
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
        activePlayer.updateTotalScore();
    }

    /**
     * Returns the state of the game.
     * @return boolean game state
     */
    public boolean checkGameState() {
        // if activePlayer's total score >= 20
            // gameState = false;
        return gameState;
    }

    /**
     * Resets the game to its starting conditions.
     * Game state to playing (true).
     * Active player to Player 1.
     * Player states reset (current and total scores).
     */
    public void reset() {
        gameState = true;
        activePlayer = player1;
        player1.resetPlayerState();
        player2.resetPlayerState();
    }

}
