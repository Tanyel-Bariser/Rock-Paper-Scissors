package com.rockpaperscissors.model.strategies;

import com.rockpaperscissors.model.Weapon;
/**
 * This functional interface allows lambda expressions to implement a strategy
 * to choose the weapon computer player/computer opponent objects play with
 * 
 * @author Tanyel Bariser
 */
@FunctionalInterface
public interface Strategy {
	/**
	 * Only choose from the first 3 Weapons, i.e. ROCK/PAPER/SCISSORS
	 */
	static final int NUMBER_OF_WEAPONS = 3;

	/**
	 * @return chosen weapon based on the implemented strategy
	 */
	Weapon chooseWeapon();
}