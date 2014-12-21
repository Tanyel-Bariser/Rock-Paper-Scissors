package com.rockpaperscissors;

public enum Gesture {
	ROCK("SCISSORS", "LIZARD"), PAPER("ROCK", "SPOCK"),
	SCISSORS("PAPER", "LIZARD"), LIZARD("PAPER", "SPOCK"),
	SPOCK("ROCK", "SCISSORS");
	
	private final String beats1;
	private final String beats2;

	Gesture(String beats1, String beats2) {
		this.beats1 = beats1;
		this.beats2 = beats2;
	}

	public Result against(Gesture opponent) {
		if (this.equals(opponent)) {
			return Result.TIE;
		}
		boolean win = opponent.name().equals(beats1) || 
					opponent.name().equals(beats2);
		if (win) {
			return Result.WIN;
		} else {
			return Result.LOSE;
		}
	}
}