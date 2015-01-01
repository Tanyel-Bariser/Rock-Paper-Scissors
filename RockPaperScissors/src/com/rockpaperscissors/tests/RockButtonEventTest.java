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
import com.rockpaperscissors.controller.events.RockButtonEvent;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.HumanPlayer;

@RunWith(MockitoJUnitRunner.class)
public class RockButtonEventTest {
	@Mock RPSController controller;
	@Mock HumanPlayer player;
	@Mock ActionEvent action;
	RockButtonEvent event;

	@Before
	public void setUp() {
		event = new RockButtonEvent(controller, player);
		event.HANDLE.handle(action);
	}

	@After
	public void tearDown() {
		event = null;
	}

	@Test
	public void handleSetsHumanPlayerWeaponRock() {
		verify(player).setWeapon(Weapon.ROCK);
	}
	
	@Test
	public void handleInvokesControllerPlay() {
		verify(controller).play();
	}
}