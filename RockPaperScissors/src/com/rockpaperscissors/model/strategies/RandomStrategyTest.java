package com.rockpaperscissors.model.strategies;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rockpaperscissors.model.Gesture;

public class RandomStrategyTest {

	@Test
	public void testsChooseGesture() {
		RandomStrategy strategy = new RandomStrategy();
		Gesture gesture = strategy.chooseGesture();
		assertTrue("RandomStrategy should return either ROCK, PAPER, or SCISSORS.",
				gesture.equals(Gesture.ROCK) || gesture.equals(Gesture.PAPER)
						|| gesture.equals(Gesture.SCISSORS));
	}
}