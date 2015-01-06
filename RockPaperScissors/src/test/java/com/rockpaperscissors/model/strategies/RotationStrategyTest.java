package com.rockpaperscissors.model.strategies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.strategies.RotationStrategy;

public class RotationStrategyTest {

	@Test
	public void rotationStrategyReturnNotNull() {
		assertNotNull(RotationStrategy.ROTATION.chooseWeapon());
	}

	@Test
	public void rotationStrategyOnlyReturnsRockPaperOrScissors() {
		Weapon weapon = RotationStrategy.ROTATION.chooseWeapon();
		boolean validWeapon = weapon == Weapon.ROCK || weapon == Weapon.PAPER
				|| weapon == Weapon.SCISSORS;
		assertTrue(validWeapon);
	}

	@Test
	public void rotationStrategyRotatesInOrderRockPaperScissors() {
		Weapon firstWeapon = RotationStrategy.ROTATION.chooseWeapon();
		Weapon nextWeapon = RotationStrategy.ROTATION.chooseWeapon();
		switch (firstWeapon) {
		case ROCK:
			assertEquals(Weapon.PAPER, nextWeapon);
			break;
		case PAPER:
			assertEquals(Weapon.SCISSORS, nextWeapon);
			break;
		case SCISSORS:
			assertEquals(Weapon.ROCK, nextWeapon);
			break;
		}
	}
}