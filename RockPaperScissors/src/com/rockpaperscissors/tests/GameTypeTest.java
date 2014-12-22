package com.rockpaperscissors.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.rockpaperscissors.GameType;

public class GameTypeTest {

	@Test
	public void getPlayerVsComputer() {
		assertEquals("Should return PLAYER_VS_COMPUTER GameType",
				GameType.PLAY, GameType.getGameType(" pLAy"));
	}
	@Test
	public void getComputerVsComputer() {
		assertEquals("Should return COMPUTER_VS_COMPUTER GameType",
				GameType.COMPUTER, GameType.getGameType("ComputER "));
	}
	@Test (expected = IllegalArgumentException.class)
	public void illegalArgThrowsException() {
		GameType.getGameType("illegal arg");
	}
	@Test (expected = NullPointerException.class)
	public void nullThrowsException() {
		GameType.getGameType(null);
	}	
}