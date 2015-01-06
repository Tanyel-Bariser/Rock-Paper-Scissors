package com.rockpaperscissors.model.player;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.strategies.Strategy;
import com.rockpaperscissors.view.View;

@RunWith(MockitoJUnitRunner.class)
public class ComputerPlayerTest {
	@Mock View view;
	@Mock Score score;
	@Mock ComputerOpponent opponent;
	@Mock Strategy strategy;
	ComputerPlayer player;

	@Before
	public void setUp() throws Exception {
		player = new ComputerPlayer(view, score);
		player.setStrategy(strategy);
	}

	@Test (expected = NullPointerException.class)
	public void competeWithOpponentWhoPlaysNullThrowsException() {
		when(opponent.playWeapon()).thenReturn(null);
		when(strategy.chooseWeapon()).thenReturn(Weapon.ROCK);
		player.compete(opponent);
	}
	
	@Test (expected = NullPointerException.class)
	public void competeBeforeSettingPlayersStrategyThrowsException() {
		when(opponent.playWeapon()).thenReturn(Weapon.ROCK);
		player.setStrategy(null);
		player.compete(opponent);
	}
	
	/*************************************************************************
	* Tests ComputerPlayer.compete(ComputerOpponent) Updates Score Correctly *
	*************************************************************************/
	@Test
	public void competeUpdatesScoreWithWonWhenRockAgainstScissors() {
		when(opponent.playWeapon()).thenReturn(Weapon.SCISSORS);
		when(strategy.chooseWeapon()).thenReturn(Weapon.ROCK);
		player.compete(opponent);
		verify(score).updateScore(Result.WON);
	}
	
	@Test
	public void competeUpdatesScoreWithTiedWhenRockAgainstRock() {
		when(opponent.playWeapon()).thenReturn(Weapon.ROCK);
		when(strategy.chooseWeapon()).thenReturn(Weapon.ROCK);
		player.compete(opponent);
		verify(score).updateScore(Result.TIED);
	}
	
	@Test
	public void competeUpdatesScoreWithLostWhenRockAgainstPaper() {
		when(opponent.playWeapon()).thenReturn(Weapon.PAPER);
		when(strategy.chooseWeapon()).thenReturn(Weapon.ROCK);
		player.compete(opponent);
		verify(score).updateScore(Result.LOST);
	}
	
	@Test
	public void competeUpdatesScoreWithWonWhenPaperAgainstRock() {
		when(opponent.playWeapon()).thenReturn(Weapon.ROCK);
		when(strategy.chooseWeapon()).thenReturn(Weapon.PAPER);
		player.compete(opponent);
		verify(score).updateScore(Result.WON);
	}
	
	@Test
	public void competeUpdatesScoreWithTiedWhenPaperAgainstPaper() {
		when(opponent.playWeapon()).thenReturn(Weapon.PAPER);
		when(strategy.chooseWeapon()).thenReturn(Weapon.PAPER);
		player.compete(opponent);
		verify(score).updateScore(Result.TIED);
	}
	
	@Test
	public void competeUpdatesScoreWithLostWhenPaperAgainstScissors() {
		when(opponent.playWeapon()).thenReturn(Weapon.SCISSORS);
		when(strategy.chooseWeapon()).thenReturn(Weapon.PAPER);
		player.compete(opponent);
		verify(score).updateScore(Result.LOST);
	}
	
	@Test
	public void competeUpdatesScoreWithWonWhenScissorsAgainstPaper() {
		when(opponent.playWeapon()).thenReturn(Weapon.PAPER);
		when(strategy.chooseWeapon()).thenReturn(Weapon.SCISSORS);
		player.compete(opponent);
		verify(score).updateScore(Result.WON);
	}

	@Test
	public void competeUpdatesScoreWithTiedWhenScissorsAgainstScissors() {
		when(opponent.playWeapon()).thenReturn(Weapon.SCISSORS);
		when(strategy.chooseWeapon()).thenReturn(Weapon.SCISSORS);
		player.compete(opponent);
		verify(score).updateScore(Result.TIED);
	}

	@Test
	public void competeUpdatesScoreWithLostWhenScissorsAgainstRock() {
		when(opponent.playWeapon()).thenReturn(Weapon.ROCK);
		when(strategy.chooseWeapon()).thenReturn(Weapon.SCISSORS);
		player.compete(opponent);
		verify(score).updateScore(Result.LOST);
	}
	
	@Test
	public void competeUpdatesResultInViewCorrectly() {
		when(opponent.playWeapon()).thenReturn(Weapon.ROCK);
		when(strategy.chooseWeapon()).thenReturn(Weapon.ROCK);
		player.compete(opponent);
		verify(view).setComputerPlayerResult(Weapon.ROCK, Weapon.ROCK, Result.TIED);
	}
	
	@Test
	public void competeUpdatesScoreInView() {
		when(opponent.playWeapon()).thenReturn(Weapon.ROCK);
		when(strategy.chooseWeapon()).thenReturn(Weapon.ROCK);
		player.compete(opponent);
		verify(view).setPlayerScore(player.readableScore());
	}
	
	@Test
	public void testReadableScore() {
		when(score.getWins()).thenReturn(4);
		when(score.getTies()).thenReturn(3);
		when(score.getLosses()).thenReturn(2);
		String expectedOutput = "Your Computer Player's Score:\nWins: 4\nTies: 3\nLosses: 2";
		assertEquals(expectedOutput, player.readableScore());
	}
}