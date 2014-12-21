package com.rockpaperscissors;

public enum GameType {
	PLAYER_VS_COMPUTER, COMPUTER_VS_COMPUTER;

	public static GameType getGameType(String gameType) {
		switch (gameType.toUpperCase().trim()) {
			case "P": return GameType.valueOf("PLAYER_VS_COMPUTER");
			case "C": return GameType.valueOf("COMPUTER_VS_COMPUTER");
			default: return null;
		}
	}
}