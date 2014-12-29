package com.rockpaperscissors.model.strategies;

import com.rockpaperscissors.model.Weapon;

@FunctionalInterface
public interface ComputerStrategy {
	// Only choose from the first 3 Gestures, i.e. ROCK/PAPER/SCISSORS
	static final int NUMBER_OF_GESTURES = 3;

	Weapon chooseGesture();
}