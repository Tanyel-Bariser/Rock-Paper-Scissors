package com.rockpaperscissors;

public enum GameType {
	PLAY, COMPUTER;

	public static GameType getGameType(String gameType) {
		return GameType.valueOf(gameType.toUpperCase().trim());
	}
}