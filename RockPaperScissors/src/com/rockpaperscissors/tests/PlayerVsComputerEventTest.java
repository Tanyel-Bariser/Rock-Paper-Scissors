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
import com.rockpaperscissors.controller.eventhandlers.PlayerVsComputerEvent;
import com.rockpaperscissors.model.player.HumanPlayer;
import com.rockpaperscissors.view.RPSView;

@RunWith(MockitoJUnitRunner.class)
public class PlayerVsComputerEventTest {
	@Mock RPSView view;
	@Mock RPSController controller;
	@Mock HumanPlayer humanPlayer;
	@Mock ActionEvent action;
	EventHandler<ActionEvent> handler;

	@Before
	public void setUp() throws Exception {
		handler = PlayerVsComputerEvent.getHandler(view, controller, humanPlayer);
		handler.handle(action);
	}

	@After
	public void tearDown() throws Exception {
		handler = null;
	}
	
	@Test
	public void handleSetsHumanPlayerInController() {
		verify(controller).setPlayer(humanPlayer);
	}

	@Test
	public void handleShowsPlayerScore() {
		verify(controller).showPlayerScore();
	}
	
	@Test
	public void handleMakesComputerVsComputerCheckBoxUnselected() {
		verify(view).setPlayerVsComputerMode();
	}
}