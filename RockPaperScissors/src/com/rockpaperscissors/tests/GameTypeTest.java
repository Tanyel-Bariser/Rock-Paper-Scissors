package com.rockpaperscissors.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.rockpaperscissors.GameType;

public class GameTypeTest {

	@Test
	public void getPlayerVsComputer() {
		assertEquals("Should return PLAYER_VS_COMPUTER GameType",
				GameType.PLAYER_VS_COMPUTER, GameType.getGameType(" p"));
	}
	@Test
	public void getComputerVsComputer() {
		assertEquals("Should return COMPUTER_VS_COMPUTER GameType",
				GameType.COMPUTER_VS_COMPUTER, GameType.getGameType("c "));
	}
}