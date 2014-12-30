package com.rockpaperscissors.model;

public class Score {
	private int wins;
	private int ties;
	private int losses;
	
	public Score() {
		wins = 0;
		ties = 0;
		losses = 0;
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