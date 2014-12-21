package com.rockpaperscissors.strategies;

import java.util.Random;

import com.rockpaperscissors.Gesture;

public class RandomStrategy implements Strategy {
	// Set to 5 (no other changes required) so chooseGesture()
	// can also potentially return either LIZARD or SPOCK
	private final int NUMBER_OF_GESTURES = 3;
	
	@Override
	public Gesture chooseGesture() {
		Random random = new Random();
		Gesture computerChoice = Gesture.values()[random.nextInt(NUMBER_OF_GESTURES)];
		return computerChoice;
	}
}