package com.rockpaperscissors.model.strategies;

import com.rockpaperscissors.model.Weapon;
/**
 * This function interface allows lambda expressions to implement a strategy
 * to choose the weapon the computer player plays with
 * 
 * @author Tanyel Bariser
 */
@FunctionalInterface
public interface Strategy {
	// Only choose from the first 3 Weapons, i.e. ROCK/PAPER/SCISSORS
	static final int NUMBER_OF_WEAPONS = 3;

	/**
	 * Chooses a weapon based on the implemented strategy
	 * 
	 * @return chosen weapon
	 */
	Weapon chooseWeapon();
}