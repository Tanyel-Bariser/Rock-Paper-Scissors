package com.rockpaperscissors.eventhandlers;

import static org.mockito.Mockito.verify;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.strategies.RotationStrategy;

@RunWith(MockitoJUnitRunner.class)
public class RotationButtonEventTest {
	@Mock ComputerPlayer computerPlayer;
	@Mock ComputerOpponent opponent;
	@Mock ActionEvent action;
	EventHandler<ActionEvent> handler;

	@Before
	public void setUp() {
		handler = RotationButtonEvent.getHandler(computerPlayer, opponent);
		handler.handle(action);
	}

	@Test
	public void handleSetsComputerPlayerRotationStrategy() {
		verify(computerPlayer).setStrategy(RotationStrategy.ROTATION);
	}
	
	@Test
	public void handlerPlayerCompetesOpponent() {
		verify(computerPlayer).compete(opponent);
	}
}