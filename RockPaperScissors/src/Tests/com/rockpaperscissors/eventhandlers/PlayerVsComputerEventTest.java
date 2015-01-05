package com.rockpaperscissors.eventhandlers;

import static org.mockito.Mockito.verify;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.rockpaperscissors.model.player.HumanPlayer;
import com.rockpaperscissors.view.RPSView;

@RunWith(MockitoJUnitRunner.class)
public class PlayerVsComputerEventTest {
	@Mock RPSView view;
	@Mock HumanPlayer humanPlayer;
	@Mock ActionEvent action;
	EventHandler<ActionEvent> handler;

	@Before
	public void setUp() throws Exception {
		handler = PlayerVsComputerEvent.getHandler(view, humanPlayer);
		handler.handle(action);
	}
	
	@Test
	public void handleShowsPlayerScore() {
		verify(view).setPlayerScore(humanPlayer.readableScore());
	}
	
	@Test
	public void handleMakesComputerVsComputerCheckBoxUnselected() {
		verify(view).setPlayerVsComputerMode();
	}
}