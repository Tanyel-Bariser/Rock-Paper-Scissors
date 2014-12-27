package com.rockpaperscissors.model.strategies;

import com.rockpaperscissors.model.Gesture;

public interface Strategy {
	// Only choose from the first 3 Gestures, i.e. ROCK/PAPER/SCISSORS
	public static final int NUMBER_OF_GESTURES = 3;
	Gesture chooseGesture();
}
