package com.rockpaperscissors.model.strategies;

import java.util.Random;

import com.rockpaperscissors.model.Gesture;

public class RandomStrategy {
	private static final Random random = new Random();

	public static final Strategy RANDOM_GESTURE = () -> Gesture.values()[random
			.nextInt(Strategy.NUMBER_OF_GESTURES)];
}