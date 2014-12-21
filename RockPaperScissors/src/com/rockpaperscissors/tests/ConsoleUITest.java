package com.rockpaperscissors.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rockpaperscissors.GameType;
import com.rockpaperscissors.ui.ConsoleUI;
import com.rockpaperscissors.ui.UserInterface;

public class ConsoleUITest {

	@Test
	public void askGameTypeReturnsValidType() {
		UserInterface ui = new ConsoleUI();
		GameType gameType = ui.askGameType();
		assertTrue(gameType.equals(GameType.PLAYER_VS_COMPUTER) ||
				gameType.equals(GameType.COMPUTER_VS_COMPUTER));
		System.out.println("Test finished, check JUnit for result.");
	}
}