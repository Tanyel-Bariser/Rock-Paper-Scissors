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
import com.rockpaperscissors.view.View;

@RunWith(MockitoJUnitRunner.class)
public class HumanPlayerTest {
	@Mock View view;
	@Mock Score score;
	@Mock ComputerOpponent opponent;
	HumanPlayer player;

	@Before
	public void setUp() {
		player = new HumanPlayer(view, score);
	}

	@Test (expected = NullPointerException.class)
	public void competeWithOpponentWhoPlaysNullThrowsException() {
		when(opponent.playWeapon()).thenReturn(null);
		player.setWeapon(Weapon.ROCK);
		player.compete(opponent);
	}
	
	@Test (expected = NullPointerException.class)
	public void competeBeforeSettingPlayersWeaponThrowsException() {
		when(opponent.playWeapon()).thenReturn(Weapon.ROCK);
		player.compete(opponent);
	}
	
	/**********************************************************************
	* Tests HumanPlayer.compete(ComputerOpponent) Updates Score Correctly *
	**********************************************************************/
	@Test
	public void competeUpdatesScoreWithWonWhenRockAgainstScissors() {
		when(opponent.playWeapon()).thenReturn(Weapon.SCISSORS);
		player.setWeapon(Weapon.ROCK);
		player.compete(opponent);
		verify(score).updateScore(Result.WON);
	}
	
	@Test
	public void competeUpdatesScoreWithTiedWhenRockAgainstRock() {
		when(opponent.playWeapon()).thenReturn(Weapon.ROCK);
		player.setWeapon(Weapon.ROCK);
		player.compete(opponent);
		verify(score).updateScore(Result.TIED);
	}
	
	@Test
	public void competeUpdatesScoreWithLostWhenRockAgainstPaper() {
		when(opponent.playWeapon()).thenReturn(Weapon.PAPER);
		player.setWeapon(Weapon.ROCK);
		player.compete(opponent);
		verify(score).updateScore(Result.LOST);
	}
	
	@Test
	public void competeUpdatesScoreWithWonWhenPaperAgainstRock() {
		when(opponent.playWeapon()).thenReturn(Weapon.ROCK);
		player.setWeapon(Weapon.PAPER);
		player.compete(opponent);
		verify(score).updateScore(Result.WON);
	}
	
	@Test
	public void competeUpdatesScoreWithTiedWhenPaperAgainstPaper() {
		when(opponent.playWeapon()).thenReturn(Weapon.PAPER);
		player.setWeapon(Weapon.PAPER);
		player.compete(opponent);
		verify(score).updateScore(Result.TIED);
	}
	
	@Test
	public void competeUpdatesScoreWithLostWhenPaperAgainstScissors() {
		when(opponent.playWeapon()).thenReturn(Weapon.SCISSORS);
		player.setWeapon(Weapon.PAPER);
		player.compete(opponent);
		verify(score).updateScore(Result.LOST);
	}
	
	@Test
	public void competeUpdatesScoreWithWonWhenScissorsAgainstPaper() {
		when(opponent.playWeapon()).thenReturn(Weapon.PAPER);
		player.setWeapon(Weapon.SCISSORS);
		player.compete(opponent);
		verify(score).updateScore(Result.WON);
	}

	@Test
	public void competeUpdatesScoreWithTiedWhenScissorsAgainstScissors() {
		when(opponent.playWeapon()).thenReturn(Weapon.SCISSORS);
		player.setWeapon(Weapon.SCISSORS);
		player.compete(opponent);
		verify(score).updateScore(Result.TIED);
	}

	@Test
	public void competeUpdatesScoreWithLostWhenScissorsAgainstRock() {
		when(opponent.playWeapon()).thenReturn(Weapon.ROCK);
		player.setWeapon(Weapon.SCISSORS);
		player.compete(opponent);
		verify(score).updateScore(Result.LOST);
	}
	
	@Test
	public void competeUpdatesResultInViewCorrectly() {
		when(opponent.playWeapon()).thenReturn(Weapon.ROCK);
		player.setWeapon(Weapon.ROCK);
		player.compete(opponent);
		verify(view).setHumanPlayerResult(Weapon.ROCK, Weapon.ROCK, Result.TIED);
	}
	
	@Test
	public void competeUpdatesScoreInView() {
		when(opponent.playWeapon()).thenReturn(Weapon.ROCK);
		player.setWeapon(Weapon.ROCK);
		player.compete(opponent);
		verify(view).setPlayerScore(player.readableScore());
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