package com.rockpaperscissors.model;

/**
 * Models the different weapons players can choose
 * 
 * @author Tanyel Bariser
 */
public enum Weapon {
	ROCK("SCISSORS", "LIZARD"), PAPER("ROCK", "SPOCK"),
	SCISSORS("PAPER", "LIZARD"), LIZARD("PAPER", "SPOCK"),
	SPOCK("ROCK", "SCISSORS");
	
	private final String beats1;
	private final String beats2;

	/**
	 * Creates the weapon with the required information of which other weapons
	 * it beats, and can deduce which weapons it ties and losses to. 
	 * 
	 * @param beats1 weapon this weapon beats
	 * @param beats2 weapon this weapon beats
	 */
	private Weapon(String beats1, String beats2) {
		this.beats1 = beats1;
		this.beats2 = beats2;
	}
	
	/**
	 * Main logic deciding which weapon beats which.
	 * 
	 * @param opponent is the weapon this weapon competes against
	 * @return result after the weapons compete against each other
	 */
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