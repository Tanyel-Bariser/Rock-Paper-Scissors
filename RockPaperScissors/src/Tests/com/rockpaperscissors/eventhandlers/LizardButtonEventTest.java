package com.rockpaperscissors.eventhandlers;

import static org.mockito.Mockito.verify;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.HumanPlayer;

@RunWith(MockitoJUnitRunner.class)
public class LizardButtonEventTest {
	@Mock HumanPlayer humanPlayer;
	@Mock ComputerOpponent opponent;
	@Mock ActionEvent action;
	EventHandler<ActionEvent> handler;

	@Before
	public void setUp() {
		handler = LizardButtonEvent.getHandler(humanPlayer, opponent);
		handler.handle(action);
	}

	@Test
	public void handleSetsHumanPlayerWeaponLizard() {
		verify(humanPlayer).setWeapon(Weapon.LIZARD);
	}
	
	@Test
	public void handlerPlayerCompetesOpponent() {
		verify(humanPlayer).compete(opponent);
	}
}