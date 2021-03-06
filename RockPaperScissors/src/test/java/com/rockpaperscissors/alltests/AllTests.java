package com.rockpaperscissors.alltests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.rockpaperscissors.eventhandlers.ComputerVsComputerEventTest;
import com.rockpaperscissors.eventhandlers.FixedButtonEventTest;
import com.rockpaperscissors.eventhandlers.LizardButtonEventTest;
import com.rockpaperscissors.eventhandlers.PaperButtonEventTest;
import com.rockpaperscissors.eventhandlers.PlayerVsComputerEventTest;
import com.rockpaperscissors.eventhandlers.RandomButtonEventTest;
import com.rockpaperscissors.eventhandlers.RockButtonEventTest;
import com.rockpaperscissors.eventhandlers.RotationButtonEventTest;
import com.rockpaperscissors.eventhandlers.ScissorsButtonEventTest;
import com.rockpaperscissors.eventhandlers.SpockButtonEventTest;
import com.rockpaperscissors.model.ScoreTest;
import com.rockpaperscissors.model.WeaponTest;
import com.rockpaperscissors.model.player.ComputerOpponentTest;
import com.rockpaperscissors.model.player.ComputerPlayerTest;
import com.rockpaperscissors.model.player.HumanPlayerTest;
import com.rockpaperscissors.model.strategies.FixedStrategyTest;
import com.rockpaperscissors.model.strategies.RandomStrategyTest;
import com.rockpaperscissors.model.strategies.RotationStrategyTest;
import com.rockpaperscissors.view.RPSViewBuilderTest;
import com.rockpaperscissors.view.RPSViewSetComputerVsComputerModeTest;
import com.rockpaperscissors.view.RPSViewSetPlayerVsComputerModeTest;
import com.rockpaperscissors.view.RPSViewBuildEventHandlersTest;

@RunWith(Suite.class)
@SuiteClasses({ ComputerOpponentTest.class, ComputerPlayerTest.class,
		ComputerVsComputerEventTest.class, FixedButtonEventTest.class,
		FixedStrategyTest.class, HumanPlayerTest.class,
		LizardButtonEventTest.class, PaperButtonEventTest.class,
		PlayerVsComputerEventTest.class, RandomButtonEventTest.class,
		RandomStrategyTest.class, RockButtonEventTest.class,
		RotationButtonEventTest.class, RotationStrategyTest.class,
		RPSViewBuildEventHandlersTest.class, RPSViewSetPlayerVsComputerModeTest.class,
		RPSViewSetComputerVsComputerModeTest.class, RPSViewBuilderTest.class,
		ScissorsButtonEventTest.class, ScoreTest.class,
		SpockButtonEventTest.class, WeaponTest.class })
public class AllTests {
}