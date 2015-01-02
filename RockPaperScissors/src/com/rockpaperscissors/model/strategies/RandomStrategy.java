package com.rockpaperscissors.model.strategies;

import java.util.Random;

import com.rockpaperscissors.model.Weapon;

/**
 * Concrete strategy hosts a constant lambda expression with the logic
 * to choose a random weapon 
 * 
 * @author Tanyel Bariser
 */
public class RandomStrategy {
	private RandomStrategy() {
	}

	private static final Random random = new Random();

	/**
	 * Chooses random weapon based on the current number of available weapons
	 */
	public static final Strategy RANDOM = () -> Weapon
			.values()[random.nextInt(Strategy.NUMBER_OF_WEAPONS)];
}