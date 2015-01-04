package com.rockpaperscissors.tests;

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
import com.rockpaperscissors.controller.eventhandlers.RandomButtonEvent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.strategies.RandomStrategy;

@RunWith(MockitoJUnitRunner.class)
public class RandomButtonEventTest {
	@Mock RPSController controller;
	@Mock ComputerPlayer computerPlayer;
	@Mock ActionEvent action;
	EventHandler<ActionEvent> handler;

	@Before
	public void setUp() {
		handler = RandomButtonEvent.getHandler(controller, computerPlayer);
		handler.handle(action);
	}

	@After
	public void tearDown() {
		handler = null;
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