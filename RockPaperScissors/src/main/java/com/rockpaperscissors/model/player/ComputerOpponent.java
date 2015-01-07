package com.rockpaperscissors.model.player;

import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.strategies.RandomStrategy;
import com.rockpaperscissors.model.strategies.Strategy;

/**
 * Default opponent player that users compete against
 * 
 * @author Tanyel Bariser
 */
public class ComputerOpponent {
	// Strategy to choose the weapon the computer opponent plays with
	private final Strategy strategy;
	
	/**
	 * Default constructor assigns a Random strategy to the Computer Opponent object
	 */
	public ComputerOpponent() {
		this(RandomStrategy.RANDOM);
	}
	
	/**
	 * @param strategy
	 */
	public ComputerOpponent(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * @return the weapon chosen based on the computer opponent's strategy
	 */
	public Weapon playWeapon() {
		return strategy.chooseWeapon();
	}
}