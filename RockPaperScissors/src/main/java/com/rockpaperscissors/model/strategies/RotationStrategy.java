package com.rockpaperscissors.model.strategies;

import com.rockpaperscissors.model.Weapon;

/**
 * Hosts a strategy for rotating the choice of weapon 
 * 
 * @author Tanyel Bariser
 */
public class RotationStrategy {
	/**
	 * Prevents instantiation
	 */
	private RotationStrategy() {
	}

	private static int rotator = 0;
	
	/**
	 * Chooses each weapon one by one, rock is followed by paper, which is
	 * followed by scissors, which again is followed by rock and so on...
	 */
	public static final Strategy ROTATION = () -> {
		rotator++;
		return Weapon.values()[rotator % Strategy.NUMBER_OF_WEAPONS];
	};
}