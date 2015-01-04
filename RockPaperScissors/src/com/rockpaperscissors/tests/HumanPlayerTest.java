package com.rockpaperscissors.tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.HumanPlayer;

@RunWith(MockitoJUnitRunner.class)
public class HumanPlayerTest {
	@Mock RPSController controller;
	@Mock Score score;
	@Mock ComputerOpponent opponent;
	HumanPlayer player;

	@Before
	public void setUp() throws Exception {
		player = new HumanPlayer(score);
	}

	@After
	public void tearDown() throws Exception {
		controller = null;
		player = null;
		score = null;
		opponent = null;
	}

	@Test (expected = NullPointerException.class)
	public void competeWithOpponentWhoPlaysNullThrowsException() {
		when(opponent.playWeapon()).thenReturn(null);
		player.setWeapon(Weapon.ROCK);
		player.compete(controller, opponent);
	}
	
	@Test (expected = NullPointerException.class)
	public void competeBeforeSettingPlayersWeaponThrowsException() {
		when(opponent.playWeapon()).thenReturn(Weapon.ROCK);
		player.compete(controller, opponent);
	}
	
	@Test
	public void competeUpdatesScoreWithWonWhenRockAgainstScissors() {
		when(opponent.playWeapon()).thenReturn(Weapon.SCISSORS);
		player.setWeapon(Weapon.ROCK);
		player.compete(controller, opponent);
		verify(score).updateScore(Result.WON);
	}
	
	@Test
	public void competeUpdatesScoreWithTiedWhenRockAgainstRock() {
		when(opponent.playWeapon()).thenReturn(Weapon.ROCK);
		player.setWeapon(Weapon.ROCK);
		player.compete(controller, opponent);
		verify(score).updateScore(Result.TIED);
	}
	
	@Test
	public void competeUpdatesScoreWithLostWhenRockAgainstPaper() {
		when(opponent.playWeapon()).thenReturn(Weapon.PAPER);
		player.setWeapon(Weapon.ROCK);
		player.compete(controller, opponent);
		verify(score).updateScore(Result.LOST);
	}
	
	@Test
	public void competeUpdatesScoreWithWonWhenPaperAgainstRock() {
		when(opponent.playWeapon()).thenReturn(Weapon.ROCK);
		player.setWeapon(Weapon.PAPER);
		player.compete(controller, opponent);
		verify(score).updateScore(Result.WON);
	}
	
	@Test
	public void competeUpdatesScoreWithTiedWhenPaperAgainstPaper() {
		when(opponent.playWeapon()).thenReturn(Weapon.PAPER);
		player.setWeapon(Weapon.PAPER);
		player.compete(controller, opponent);
		verify(score).updateScore(Result.TIED);
	}
	
	@Test
	public void competeUpdatesScoreWithLostWhenPaperAgainstScissors() {
		when(opponent.playWeapon()).thenReturn(Weapon.SCISSORS);
		player.setWeapon(Weapon.PAPER);
		player.compete(controller, opponent);
		verify(score).updateScore(Result.LOST);
	}
	
	@Test
	public void competeUpdatesScoreWithWonWhenScissorsAgainstPaper() {
		when(opponent.playWeapon()).thenReturn(Weapon.PAPER);
		player.setWeapon(Weapon.SCISSORS);
		player.compete(controller, opponent);
		verify(score).updateScore(Result.WON);
	}

	@Test
	public void competeUpdatesScoreWithTiedWhenScissorsAgainstScissors() {
		when(opponent.playWeapon()).thenReturn(Weapon.SCISSORS);
		player.setWeapon(Weapon.SCISSORS);
		player.compete(controller, opponent);
		verify(score).updateScore(Result.TIED);
	}

	@Test
	public void competeUpdatesScoreWithLostWhenScissorsAgainstRock() {
		when(opponent.playWeapon()).thenReturn(Weapon.ROCK);
		player.setWeapon(Weapon.SCISSORS);
		player.compete(controller, opponent);
		verify(score).updateScore(Result.LOST);
	}
	
	@Test
	public void competeUpdatesResultInControllerCorrectly() {
		when(opponent.playWeapon()).thenReturn(Weapon.ROCK);
		player.setWeapon(Weapon.ROCK);
		player.compete(controller, opponent);
		verify(controller).setHumanPlayerResult(Weapon.ROCK, Weapon.ROCK, Result.TIED);
	}

	@Test
	public void testReadableScore() {
		when(score.getWins()).thenReturn(4);
		when(score.getTies()).thenReturn(3);
		when(score.getLosses()).thenReturn(2);
		String expectedOutput = "Your Score:\nWins: 4\nTies: 3\nLosses: 2";
		assertEquals(expectedOutput, player.readableScore());
	}
}