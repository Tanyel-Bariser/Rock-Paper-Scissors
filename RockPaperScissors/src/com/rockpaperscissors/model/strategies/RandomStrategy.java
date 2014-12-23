package com.rockpaperscissors.model.strategies;

import java.util.Random;

import com.rockpaperscissors.model.Gesture;

public class RandomStrategy implements ComputerStrategy {
	// Set to 5 (no other changes required) for chooseGesture()
	// to also potentially return either LIZARD or SPOCK
	private final int NUMBER_OF_GESTURES = 3;
	
	@Override
	public Gesture chooseGesture() {
		Random random = new Random();
		Gesture computerChoice = Gesture.values()[random.nextInt(NUMBER_OF_GESTURES)];
		return computerChoice;
	}
}