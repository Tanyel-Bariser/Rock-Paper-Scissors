package com.rockpaperscissors.model.strategies;

import java.util.Random;

import com.rockpaperscissors.model.Gesture;

public class FixedStrategy {
	// Initialise fixed gesture once per game
	private static final Gesture GESTURE = Gesture.values()[new Random()
			.nextInt(Strategy.NUMBER_OF_GESTURES)];

	public static final Strategy FIXED_GESTURE = () -> GESTURE;
}