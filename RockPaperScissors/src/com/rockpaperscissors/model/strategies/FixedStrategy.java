package com.rockpaperscissors.model.strategies;

import java.util.Random;

import com.rockpaperscissors.model.Weapon;

public class FixedStrategy {
	private FixedStrategy() {
	}

	// Initialise fixed gesture once per new game
	private static final Weapon WEAPON = Weapon.values()[new Random()
			.nextInt(Strategy.NUMBER_OF_WEAPONS)];

	public static final Strategy FIXED = () -> WEAPON;
}