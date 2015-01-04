package com.rockpaperscissors.strategies;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.strategies.RandomStrategy;

public class RandomStrategyTest {

	@Test
	public void randomStrategyReturnNotNull() {
		assertNotNull(RandomStrategy.RANDOM.chooseWeapon());
	}
	
	@Test
	public void randomStrategyOnlyReturnsRockPaperOrScissors() {
		Weapon weapon = RandomStrategy.RANDOM.chooseWeapon();
		boolean validWeapon = weapon == Weapon.ROCK
				|| weapon == Weapon.PAPER
				|| weapon == Weapon.SCISSORS;
		assertTrue(validWeapon);
	}
}