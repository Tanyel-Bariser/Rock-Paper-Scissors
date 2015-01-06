package com.rockpaperscissors.model.strategies;

import com.rockpaperscissors.model.Weapon;

/**
 * Concrete strategy hosts a constant lambda expression with the logic
 * to rotate weapon choice one by one
 * 
 * @author Tanyel Bariser
 */
public class RotationStrategy {
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