package com.rockpaperscissors.model.strategies;

import com.rockpaperscissors.model.Weapon;

public class RotationStrategy {
	private RotationStrategy() {
	}

	private static int rotator = 0;
	public static final ComputerStrategy ROTATION_STRATEGY = () -> {
		rotator++;
		return Weapon.values()[rotator % ComputerStrategy.NUMBER_OF_GESTURES];
	};
}