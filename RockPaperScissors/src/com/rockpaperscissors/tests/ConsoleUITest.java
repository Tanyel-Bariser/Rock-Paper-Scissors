package com.rockpaperscissors.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rockpaperscissors.GameType;
import com.rockpaperscissors.Gesture;
import com.rockpaperscissors.ui.ConsoleUI;
import com.rockpaperscissors.ui.UserInterface;

public class ConsoleUITest {

	@Test
	public void askGameTypeReturnsValidType() {
		UserInterface ui = new ConsoleUI();
		GameType gameType = ui.askGameType();
		assertTrue(gameType.equals(GameType.PLAY) ||
				gameType.equals(GameType.COMPUTER));
		System.out.println("\nYou chose: " + gameType);
		System.out.println("\nCheck JUnit for result.\n");
	}
	@Test
	public void chooseGestureReturnsValidType() {
		UserInterface ui = new ConsoleUI();
		Gesture gesture = ui.chooseGesture();
		assertTrue(gesture.equals(Gesture.ROCK) || gesture.equals(Gesture.PAPER)
				|| gesture.equals(Gesture.SCISSORS));
		System.out.println("\nYou chose: " + gesture);
		System.out.println("\nCheck JUnit for result.\n");
	}
}