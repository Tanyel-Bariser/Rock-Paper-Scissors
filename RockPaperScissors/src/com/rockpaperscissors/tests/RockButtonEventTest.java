package com.rockpaperscissors.tests;

import static org.mockito.Mockito.verify;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.controller.eventhandlers.RockButtonEvent;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.HumanPlayer;

@RunWith(MockitoJUnitRunner.class)
public class RockButtonEventTest {
	@Mock RPSController controller;
	@Mock HumanPlayer humanPlayer;
	@Mock ActionEvent action;
	EventHandler<ActionEvent> handler;

	@Before
	public void setUp() {
		handler = RockButtonEvent.getHandler(controller, humanPlayer);
		handler.handle(action);
	}

	@After
	public void tearDown() {
		handler = null;
	}

	@Test
	public void handleSetsHumanPlayerWeaponRock() {
		verify(humanPlayer).setWeapon(Weapon.ROCK);
	}
	
	@Test
	public void handleInvokesControllerPlay() {
		verify(controller).play();
	}
}