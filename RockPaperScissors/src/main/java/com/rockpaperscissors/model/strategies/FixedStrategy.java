package com.rockpaperscissors.model.strategies;

import java.util.Random;

import com.rockpaperscissors.model.Weapon;

/**
 * Concrete strategy hosts a constant lambda expression with the logic
 * to initialise a weapon then keep using that same weapon 
 * 
 * @author Tanyel Bariser
 */
public class FixedStrategy {
	private FixedStrategy() {
	}

	// Initialise fixed weapon once per new game
	private static final Weapon WEAPON = Weapon.values()[new Random()
			.nextInt(Strategy.NUMBER_OF_WEAPONS)];

	/**
	 * After weapon is initially randomly chosen, keeps using that same weapon
	 * throughout the rest of the current game 
	 */
	public static final Strategy FIXED = () -> WEAPON;
}