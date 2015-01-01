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
import com.rockpaperscissors.controller.events.RandomButtonEvent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.strategies.RandomStrategy;

@RunWith(MockitoJUnitRunner.class)
public class RandomButtonEventTest {
	@Mock RPSController controller;
	@Mock ComputerPlayer computerPlayer;
	@Mock ActionEvent action;
	RandomButtonEvent event;

	@Before
	public void setUp() {
		event = new RandomButtonEvent(controller, computerPlayer);
		event.HANDLE.handle(action);
	}

	@After
	public void tearDown() {
		event = null;
	}

	@Test
	public void handleSetsComputerPlayerRandomStrategy() {
		verify(computerPlayer).setStrategy(RandomStrategy.RANDOM);
	}
	
	@Test
	public void handleInvokesControllerPlay() {
		verify(controller).play();
	}
}