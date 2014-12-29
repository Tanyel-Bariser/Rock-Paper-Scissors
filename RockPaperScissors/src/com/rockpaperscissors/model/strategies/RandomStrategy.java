package com.rockpaperscissors.model.strategies;

import java.util.Random;

import com.rockpaperscissors.model.Weapon;

public class RandomStrategy {
	private RandomStrategy() {
	}

	private static final Random random = new Random();

	public static final ComputerStrategy RANDOM_GESTURE = () -> Weapon
			.values()[random.nextInt(ComputerStrategy.NUMBER_OF_GESTURES)];
}