package com.rockpaperscissors.tests;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.strategies.Strategy;
import com.rockpaperscissors.view.RPSView;

@RunWith(MockitoJUnitRunner.class)
public class ComputerPlayerTest {
	@Mock RPSView view;
	@Mock Score score;
	@Mock ComputerOpponent opponent;
	@Mock Strategy strategy;
	ComputerPlayer player;

	@Before
	public void setUp() throws Exception {
		player = new ComputerPlayer(view, score);
		player.setStrategy(strategy);
	}

	@After
	public void tearDown() throws Exception {
		player = null;
		view = null;
		score = null;
		opponent = null;
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
}