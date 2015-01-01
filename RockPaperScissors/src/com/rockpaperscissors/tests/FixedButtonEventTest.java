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
import com.rockpaperscissors.controller.events.FixedButtonEvent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.strategies.FixedStrategy;

@RunWith(MockitoJUnitRunner.class)
public class FixedButtonEventTest {
	@Mock RPSController controller;
	@Mock ComputerPlayer computerPlayer;
	@Mock ActionEvent action;
	FixedButtonEvent event;

	@Before
	public void setUp() {
		event = new FixedButtonEvent(controller, computerPlayer);
		event.HANDLE.handle(action);
	}

	@After
	public void tearDown() {
		event = null;
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