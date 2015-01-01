package com.rockpaperscissors.tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Random;

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
import com.rockpaperscissors.model.player.HumanPlayer;
import com.rockpaperscissors.model.strategies.Strategy;
import com.rockpaperscissors.view.RPSView;

@RunWith(MockitoJUnitRunner.class)
public class HumanPlayerTest {
	@Mock RPSView view;
	@Mock Score score;
	@Mock ComputerOpponent opponent;
	Weapon chosenWeapon, opponentWeapon;
	HumanPlayer player;
	Result expectedResult, actualResult;
	final Random random = new Random();

	@Before
	public void setUp() throws Exception {
		player = new HumanPlayer(view, score);
		opponentWeapon = Weapon.values()[random.nextInt(Strategy.NUMBER_OF_WEAPONS)];
		chosenWeapon = Weapon.values()[random.nextInt(Strategy.NUMBER_OF_WEAPONS)];
		expectedResult = chosenWeapon.against(opponentWeapon);
		when(opponent.playWeapon()).thenReturn(opponentWeapon);
		player.setWeapon(chosenWeapon);
	}

	@After
	public void tearDown() throws Exception {
		player = null;
		view = null;
		score = null;
		opponent = null;
	}

	@Test
	public void competeReturnsCorrectResult() {
		actualResult = player.compete(opponent);
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void competeUpdatesScoreWithCorrectResult() {
		actualResult = player.compete(opponent);
		verify(score).updateScore(actualResult);
	}
	
	
}