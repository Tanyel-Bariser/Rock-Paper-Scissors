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
import com.rockpaperscissors.controller.events.LizardButtonEvent;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.HumanPlayer;

@RunWith(MockitoJUnitRunner.class)
public class LizardButtonEventTest {
	@Mock RPSController controller;
	@Mock HumanPlayer humanPlayer;
	@Mock ActionEvent action;
	LizardButtonEvent event;

	@Before
	public void setUp() {
		event = new LizardButtonEvent(controller, humanPlayer);
		event.HANDLE.handle(action);
	}

	@After
	public void tearDown() {
		event = null;
	}

	@Test
	public void handleSetsHumanPlayerWeaponLizard() {
		verify(humanPlayer).setWeapon(Weapon.LIZARD);
	}
	
	@Test
	public void handleInvokesControllerPlay() {
		verify(controller).play();
	}
}