package com.rockpaperscissors.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ComputerOpponentTest.class, ComputerPlayerTest.class,
		ComputerVsComputerEventTest.class, FixedButtonEventTest.class,
		FixedStrategyTest.class, HumanPlayerTest.class,
		LizardButtonEventTest.class, PaperButtonEventTest.class,
		PlayerVsComputerEventTest.class, RandomButtonEventTest.class,
		RandomStrategyTest.class, RockButtonEventTest.class,
		RotationButtonEventTest.class, RotationStrategyTest.class,
		RPSControllerTest.class, ScissorsButtonEventTest.class,
		ScoreTest.class, SpockButtonEventTest.class, WeaponTest.class })
public class AllTests {
}