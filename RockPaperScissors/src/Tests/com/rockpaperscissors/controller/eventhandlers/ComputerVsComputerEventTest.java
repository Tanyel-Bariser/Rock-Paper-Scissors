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
import com.rockpaperscissors.controller.eventhandlers.ComputerVsComputerEvent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.view.RPSView;

@RunWith(MockitoJUnitRunner.class)
public class ComputerVsComputerEventTest {
	@Mock RPSView view;
	@Mock RPSController controller;
	@Mock ComputerPlayer computerPlayer;
	@Mock ActionEvent action;
	EventHandler<ActionEvent> handler;

	@Before
	public void setUp() throws Exception {
		handler = ComputerVsComputerEvent.getHandler(view, controller, computerPlayer);
		handler.handle(action);
	}

	@After
	public void tearDown() throws Exception {
		handler = null;
	}


	@Test
	public void handleSetsComputerPlayerInController() {
		verify(controller).setPlayer(computerPlayer);
	}

	@Test
	public void handleShowsPlayerScore() {
		verify(controller).showPlayerScore();
	}
	
	@Test
	public void handleMakesPlayerVsComputerCheckBoxUnselected() {
		verify(view).setComputerVsComputerMode();
	}
}