package com.rockpaperscissors.model.strategies;

import java.util.Random;

import com.rockpaperscissors.model.Weapon;

public class RandomStrategy {
	private RandomStrategy() {
	}

	private static final Random random = new Random();

	public static final Strategy RANDOM = () -> Weapon
			.values()[random.nextInt(Strategy.NUMBER_OF_WEAPONS)];
}