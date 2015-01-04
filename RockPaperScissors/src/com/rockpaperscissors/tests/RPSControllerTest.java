package com.rockpaperscissors.tests;

import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.Player;
import com.rockpaperscissors.view.View;

@RunWith(MockitoJUnitRunner.class)
public class RPSControllerTest {
	@Mock View view;
	@Mock ComputerOpponent opponent;
	@Mock Player player;
	RPSController controller;
	
	@Before
	public void setUp() {
		controller = new RPSController(view, opponent);
	}
	
	@After
	public void tearDown() {
		controller = null;
	}
	
	@Test (expected = NullPointerException.class)
	public void playBeforeSetPlayerThrowsException() {
		controller.play();
	}

	@Test
	public void playMakesPlayercompeteWithOpponent() {
		controller.setPlayer(player);
		controller.play();
		verify(player).compete(controller, opponent);
	}
}