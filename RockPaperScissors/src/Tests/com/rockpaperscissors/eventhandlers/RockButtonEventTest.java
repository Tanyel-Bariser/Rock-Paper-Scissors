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
public class RockButtonEventTest {
	@Mock HumanPlayer humanPlayer;
	@Mock ComputerOpponent opponent;
	@Mock ActionEvent action;
	EventHandler<ActionEvent> handler;

	@Before
	public void setUp() {
		handler = RockButtonEvent.getHandler(humanPlayer, opponent);
		handler.handle(action);
	}
	
	@Test
	public void handleSetsHumanPlayerWeaponRock() {
		verify(humanPlayer).setWeapon(Weapon.ROCK);
	}
	
	@Test
	public void handlerPlayerCompetesOpponent() {
		verify(humanPlayer).compete(opponent);
	}
}