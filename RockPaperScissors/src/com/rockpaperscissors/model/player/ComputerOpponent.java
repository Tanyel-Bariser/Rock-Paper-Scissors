package com.rockpaperscissors.model.player;

import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.strategies.Strategy;

/**
 * Default opponent player that users compete against
 * 
 * @author Tanyel Bariser
 */
public class ComputerOpponent {
	private final Strategy strategy;
	
	/**
	 * Creates computer opponent with a default strategy
	 * 
	 * @param strategy chooses which weapon the computer opponent plays with
	 */
	public ComputerOpponent(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * @return the weapon chosen based on the computer opponents strategy
	 */
	public Weapon playWeapon() {
		return strategy.chooseWeapon();
	}
}