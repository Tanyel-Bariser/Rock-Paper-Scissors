package com.rockpaperscissors.model.strategies;

import java.util.Random;

import com.rockpaperscissors.model.Weapon;

/**
 * Hosts a strategy for choosing weapons Randomly 
 * 
 * @author Tanyel Bariser
 */
public class RandomStrategy {
	/**
	 * Prevents instantiation
	 */
	private RandomStrategy() {
	}

	private static final Random random = new Random();

	/**
	 * Strategy for choosing random weapons
	 */
	public static final Strategy RANDOM = () -> Weapon
			.values()[random.nextInt(Strategy.NUMBER_OF_WEAPONS)];
}