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
import com.rockpaperscissors.controller.events.RotationButtonEvent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.strategies.RotationStrategy;

@RunWith(MockitoJUnitRunner.class)
public class RotationButtonEventTest {
	@Mock RPSController controller;
	@Mock ComputerPlayer computerPlayer;
	@Mock ActionEvent action;
	RotationButtonEvent event;

	@Before
	public void setUp() {
		event = new RotationButtonEvent(controller, computerPlayer);
		event.HANDLE.handle(action);
	}

	@After
	public void tearDown() {
		event = null;
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