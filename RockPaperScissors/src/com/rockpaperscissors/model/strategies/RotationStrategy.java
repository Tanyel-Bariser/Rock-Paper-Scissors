package com.rockpaperscissors.model.strategies;

import com.rockpaperscissors.model.Weapon;

public class RotationStrategy {
	private RotationStrategy() {
	}

	private static int rotator = 0;
	public static final Strategy ROTATION_STRATEGY = () -> {
		rotator++;
		return Weapon.values()[rotator % Strategy.NUMBER_OF_WEAPONS];
	};
}