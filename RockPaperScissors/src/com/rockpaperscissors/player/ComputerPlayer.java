package com.rockpaperscissors.player;

import com.rockpaperscissors.Gesture;
import com.rockpaperscissors.strategies.Strategy;

public class ComputerPlayer implements Player {
	Strategy strategy;
	
	public ComputerPlayer(Strategy strategy) {
		this.strategy = strategy;
	}
	
	@Override
	public Gesture throwGesture() {
		return strategy.chooseGesture();
	}
}