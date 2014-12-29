package com.rockpaperscissors.model;

public enum Weapon {
	ROCK("SCISSORS", "LIZARD"), PAPER("ROCK", "SPOCK"),
	SCISSORS("PAPER", "LIZARD"), LIZARD("PAPER", "SPOCK"),
	SPOCK("ROCK", "SCISSORS");
	
	private final String beats1;
	private final String beats2;

	private Weapon(String beats1, String beats2) {
		this.beats1 = beats1;
		this.beats2 = beats2;
	}
	
	public Result against(Weapon opponent) {
		if (this.equals(opponent)) {
			return Result.TIED;
		}
		boolean beatsOpponent = opponent.name().equals(beats1) || 
								opponent.name().equals(beats2);
		if (beatsOpponent) {
			return Result.WON;
		} else {
			return Result.LOST;
		}
	}
}