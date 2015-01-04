package com.rockpaperscissors.alltests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.rockpaperscissors.controller.RPSControllerTest;
import com.rockpaperscissors.controller.eventhandlers.ComputerVsComputerEventTest;
import com.rockpaperscissors.controller.eventhandlers.FixedButtonEventTest;
import com.rockpaperscissors.controller.eventhandlers.LizardButtonEventTest;
import com.rockpaperscissors.controller.eventhandlers.PaperButtonEventTest;
import com.rockpaperscissors.controller.eventhandlers.PlayerVsComputerEventTest;
import com.rockpaperscissors.controller.eventhandlers.RandomButtonEventTest;
import com.rockpaperscissors.controller.eventhandlers.RockButtonEventTest;
import com.rockpaperscissors.controller.eventhandlers.RotationButtonEventTest;
import com.rockpaperscissors.controller.eventhandlers.ScissorsButtonEventTest;
import com.rockpaperscissors.controller.eventhandlers.SpockButtonEventTest;
import com.rockpaperscissors.model.ScoreTest;
import com.rockpaperscissors.model.WeaponTest;
import com.rockpaperscissors.model.player.ComputerOpponentTest;
import com.rockpaperscissors.model.player.ComputerPlayerTest;
import com.rockpaperscissors.model.player.HumanPlayerTest;
import com.rockpaperscissors.strategies.FixedStrategyTest;
import com.rockpaperscissors.strategies.RandomStrategyTest;
import com.rockpaperscissors.strategies.RotationStrategyTest;

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