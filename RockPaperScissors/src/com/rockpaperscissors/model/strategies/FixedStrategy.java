package com.rockpaperscissors.model.strategies;

import java.util.Random;

import com.rockpaperscissors.model.Weapon;

public class FixedStrategy {
	private FixedStrategy() {
	}

	// Initialise fixed gesture once per new game
	private static final Weapon GESTURE = Weapon.values()[new Random()
			.nextInt(ComputerStrategy.NUMBER_OF_GESTURES)];

	public static final ComputerStrategy FIXED_GESTURE = () -> GESTURE;
}