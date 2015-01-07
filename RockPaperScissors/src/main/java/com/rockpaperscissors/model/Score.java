package com.rockpaperscissors.model;

/**
 * This class contains the score, to be used by Player objects
 * 
 * @author Tanyel Bariser
 */
public class Score {
	private int wins;
	private int ties;
	private int losses;
	
	/**
	 * Creates blank score board
	 */
	public Score() {
		this(0,  0,  0);
	}
	
	/**
	 * Allows creation of a score board with scores saved from previous games
	 * 
	 * @param wins from previous games
	 * @param ties from previous games
	 * @param losses from previous games
	 */
	public Score(int wins, int ties, int losses) {
		this.wins = wins;
		this.ties = ties;
		this.losses = losses;
	}

	/**
	 * Takes the result of the last game and updates the player's score accordingly
	 * 
	 * @param result of last game
	 */
	public void updateScore(Result result) {
		switch (result) {
		case WON:
			wins++;
			break;
		case TIED:
			ties++;
			break;
		case LOST:
			losses++;
			break;
		default:
			throw new NullPointerException(
					"Argument for updateScore(Result) should be of type Result.");
		}
	}

	/**
	 * @return the number of times the player has won
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * @return the number of times the player has tied
	 */
	public int getTies() {
		return ties;
	}

	/**
	 * @return the number of times the player has lost
	 */
	public int getLosses() {
		return losses;
	}
}