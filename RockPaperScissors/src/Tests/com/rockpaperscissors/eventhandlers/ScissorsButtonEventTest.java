package com.rockpaperscissors.eventhandlers;

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
import com.rockpaperscissors.eventhandlers.ScissorsButtonEvent;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.HumanPlayer;

@RunWith(MockitoJUnitRunner.class)
public class ScissorsButtonEventTest {
	@Mock RPSController controller;
	@Mock HumanPlayer humanPlayer;
	@Mock ActionEvent action;
	EventHandler<ActionEvent> handler;

	@Before
	public void setUp() {
		handler = ScissorsButtonEvent.getHandler(controller, humanPlayer);
		handler.handle(action);
	}

	@After
	public void tearDown() {
		handler = null;
	}

	@Test
	public void handleSetsHumanPlayerWeaponScissors() {
		verify(humanPlayer).setWeapon(Weapon.SCISSORS);
	}
	
	@Test
	public void handleInvokesControllerPlay() {
		verify(controller).play();
	}
}