package com.rockpaperscissors.model;

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
	 * Allows creation a score board with scores saved from previous games
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

	public int getWins() {
		return wins;
	}

	public int getTies() {
		return ties;
	}

	public int getLosses() {
		return losses;
	}

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
			throw new IllegalArgumentException(
					"Argument for updateScore(Result) should be of type Result.");
		}
	}
}