package com.rockpaperscissors.tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Random;

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
	final Random random = new Random();
	Weapon expectedWeapon, actualWeapon;

	@Before
	public void setUp() {
		opponent = new ComputerOpponent(strategy);
		actualWeapon = Weapon.values()[random.nextInt(Strategy.NUMBER_OF_WEAPONS)];
	}
	
	@After
	public void tearDown() {
		strategy = null;
		opponent = null;
		actualWeapon = null;
		expectedWeapon = null;
	}

	@Test
	public void computerOpponentReturnsTheWeaponStrategyChooses() {
		when(strategy.chooseWeapon()).thenReturn(actualWeapon);
		expectedWeapon = opponent.playWeapon();
		assertEquals(expectedWeapon, actualWeapon);
	}
}