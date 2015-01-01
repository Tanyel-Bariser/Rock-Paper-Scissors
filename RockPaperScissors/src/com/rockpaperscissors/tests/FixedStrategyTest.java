package com.rockpaperscissors.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.strategies.FixedStrategy;

public class FixedStrategyTest {
	
	@Test
	public void fixedStrategyReturnNotNull() {
		assertNotNull(FixedStrategy.FIXED.chooseWeapon());
	}
	
	@Test
	public void fixedStrategyOnlyReturnsRockPaperOrScissors() {
		Weapon weapon = FixedStrategy.FIXED.chooseWeapon();
		boolean validWeapon = weapon == Weapon.ROCK
				|| weapon == Weapon.PAPER
				|| weapon == Weapon.SCISSORS;
		assertTrue(validWeapon);
	}
	
	@Test
	public void fixedStrategyAlwaysReturnsSameWeapon() {
		Weapon expectedWeapon = FixedStrategy.FIXED.chooseWeapon();
		assertEquals(expectedWeapon, FixedStrategy.FIXED.chooseWeapon());
		assertEquals(expectedWeapon, FixedStrategy.FIXED.chooseWeapon());
		assertEquals(expectedWeapon, FixedStrategy.FIXED.chooseWeapon());
		assertEquals(expectedWeapon, FixedStrategy.FIXED.chooseWeapon());
		assertEquals(expectedWeapon, FixedStrategy.FIXED.chooseWeapon());
		assertEquals(expectedWeapon, FixedStrategy.FIXED.chooseWeapon());
	}
}