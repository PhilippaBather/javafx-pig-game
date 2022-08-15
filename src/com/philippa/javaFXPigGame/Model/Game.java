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

//    public void setActivePlayer(int activePlayer) {
//        this.activePlayer = activePlayer;
//    }

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
        int value = dice.rollDice();
        return value;
    }

    /**
     * Update the active player's current score
     */
    public void updateCurrentScore() {
        // TODO
    }

    /**
     * Checks current dice roll for a value or 1.
     * @return
     */
    public boolean checkForOne() {
        return false;  // TODO
    }

    /**
     * Reset the active player's current score when the dice value is 1.
     */
    public void resetCurrentScore() {
        // TODO
    }

    /**
     * Reset the active player's total score when the dice value is 1.
     */
    public void resetTotalScore() {
        // TODO
    }

    /**
     * Switch active player.
     */
    public void switchPlayer() {
        // TODO
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
     * Returns the state of the game.
     * @return boolean game state
     */
    public boolean checkGameState() {
        return true;  // TODO
    }

    /**
     * Updates the active player's total score
     */
    public void updateTotalScore() {
        // TODO
    }

    /**
     * Resets the game to its starting conditions.
     */
    public void reset() {
        // TODO
    }

}
