package com.rockpaperscissors.model;

public class Score {
	private Score() {
	}

	private static int wins;
	private static int ties;
	private static int losses;

	public static int getWins() {
		return wins;
	}

	public static int getTies() {
		return ties;
	}

	public static int getLosses() {
		return losses;
	}

	public static void updateScore(Result result) {
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
					"Argument in Score.updateScore() should be of type Result.");
		}
	}
}