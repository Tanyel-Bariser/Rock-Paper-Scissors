package com.rockpaperscissors.model.player;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.strategies.Strategy;

@RunWith(MockitoJUnitRunner.class)
public class ComputerOpponentTest {
	@Mock Strategy strategy;
	ComputerOpponent opponent;
	Weapon actualWeapon;

	@Before
	public void setUp() {
		opponent = new ComputerOpponent(strategy);
	}
	
	@After
	public void tearDown() {
		strategy = null;
		opponent = null;
		actualWeapon = null;
	}

	@Test
	public void computerOpponentReturnsRockIfStrategyChoosesRock() {
		when(strategy.chooseWeapon()).thenReturn(Weapon.ROCK);
		actualWeapon = opponent.playWeapon();
		assertEquals(Weapon.ROCK, actualWeapon);
	}
	
	@Test
	public void computerOpponentReturnsPaperIfStrategyChoosesPaper() {
		when(strategy.chooseWeapon()).thenReturn(Weapon.PAPER);
		actualWeapon = opponent.playWeapon();
		assertEquals(Weapon.PAPER, actualWeapon);
	}
	
	@Test
	public void computerOpponentReturnsScissorsIfStrategyChoosesScissors() {
		when(strategy.chooseWeapon()).thenReturn(Weapon.SCISSORS);
		actualWeapon = opponent.playWeapon();
		assertEquals(Weapon.SCISSORS, actualWeapon);
	}
}