package com.rockpaperscissors.tests;

import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.rockpaperscissors.GameType;
import com.rockpaperscissors.ui.ConsoleUI;
import com.rockpaperscissors.ui.UserInterface;

public class ConsoleUITest {

	@Test
	public void test() {
		UserInterface ui = new ConsoleUI();
		GameType gameType = ui.askGameType();
		assertNotEquals(gameType, null);
		System.out.println("JUnit Test passed. You can close console.");
	}
}