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
public class SpockButtonEventTest {
	@Mock HumanPlayer humanPlayer;
	@Mock ComputerOpponent opponent;
	@Mock ActionEvent action;
	EventHandler<ActionEvent> handler;

	@Before
	public void setUp() {
		handler = SpockButtonEvent.getHandler(humanPlayer, opponent);
		handler.handle(action);
	}
	
	@Test
	public void handleSetsHumanPlayerWeaponSpock() {
		verify(humanPlayer).setWeapon(Weapon.SPOCK);
	}
	
	@Test
	public void handlerPlayerCompetesOpponent() {
		verify(humanPlayer).compete(opponent);
	}
}