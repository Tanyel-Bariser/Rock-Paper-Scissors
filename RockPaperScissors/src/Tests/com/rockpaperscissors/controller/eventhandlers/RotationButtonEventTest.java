package com.rockpaperscissors.controller.eventhandlers;

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
import com.rockpaperscissors.controller.eventhandlers.RotationButtonEvent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.strategies.RotationStrategy;

@RunWith(MockitoJUnitRunner.class)
public class RotationButtonEventTest {
	@Mock RPSController controller;
	@Mock ComputerPlayer computerPlayer;
	@Mock ActionEvent action;
	EventHandler<ActionEvent> handler;

	@Before
	public void setUp() {
		handler = RotationButtonEvent.getHandler(controller, computerPlayer);
		handler.handle(action);
	}

	@After
	public void tearDown() {
		handler = null;
	}

	@Test
	public void handleSetsComputerPlayerRotationStrategy() {
		verify(computerPlayer).setStrategy(RotationStrategy.ROTATION);
	}
	
	@Test
	public void handleInvokesControllerPlay() {
		verify(controller).play();
	}
}