package com.rockpaperscissors.model.strategies;

import java.util.Random;

import com.rockpaperscissors.model.Weapon;

/**
 * Hosts a strategy for choosing the same weapon consistently 
 * 
 * @author Tanyel Bariser
 */
public class FixedStrategy {
	/**
	 * Prevents instantiation
	 */
	private FixedStrategy() {
	}

	/**
	 * Initialise fixed weapon once per new game
	 */
	private static final Weapon WEAPON = Weapon.values()[new Random()
			.nextInt(Strategy.NUMBER_OF_WEAPONS)];

	/**
	 * Consistently chooses the same weapon to compete with once initialised 
	 */
	public static final Strategy FIXED = () -> WEAPON;
}