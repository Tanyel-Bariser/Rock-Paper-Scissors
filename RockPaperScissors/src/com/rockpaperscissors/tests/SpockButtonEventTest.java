package com.rockpaperscissors.tests;

import static org.mockito.Mockito.verify;
import javafx.event.ActionEvent;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.controller.events.SpockButtonEvent;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.HumanPlayer;

@RunWith(MockitoJUnitRunner.class)
public class SpockButtonEventTest {
	@Mock RPSController controller;
	@Mock HumanPlayer humanPlayer;
	@Mock ActionEvent action;
	SpockButtonEvent event;

	@Before
	public void setUp() {
		event = new SpockButtonEvent(controller, humanPlayer);
		event.HANDLE.handle(action);
	}

	@After
	public void tearDown() {
		event = null;
	}

	@Test
	public void handleSetsHumanPlayerWeaponSpock() {
		verify(humanPlayer).setWeapon(Weapon.SPOCK);
	}
	
	@Test
	public void handleInvokesControllerPlay() {
		verify(controller).play();
	}
}