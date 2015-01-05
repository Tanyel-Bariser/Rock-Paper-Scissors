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
import com.rockpaperscissors.eventhandlers.FixedButtonEvent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.strategies.FixedStrategy;

@RunWith(MockitoJUnitRunner.class)
public class FixedButtonEventTest {
	@Mock RPSController controller;
	@Mock ComputerPlayer computerPlayer;
	@Mock ActionEvent action;
	EventHandler<ActionEvent> handler;

	@Before
	public void setUp() {
		handler = FixedButtonEvent.getHandler(controller, computerPlayer);
		handler.handle(action);
	}

	@After
	public void tearDown() {
		handler = null;
	}

	@Test
	public void handleSetsComputerPlayerFixedStrategy() {
		verify(computerPlayer).setStrategy(FixedStrategy.FIXED);
	}
	
	@Test
	public void handleInvokesControllerPlay() {
		verify(controller).play();
	}
}