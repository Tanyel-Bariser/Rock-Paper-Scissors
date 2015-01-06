package com.rockpaperscissors.eventhandlers;

import static org.mockito.Mockito.verify;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.view.RPSView;

@RunWith(MockitoJUnitRunner.class)
public class ComputerVsComputerEventTest {
	@Mock RPSView view;
	@Mock ComputerPlayer computerPlayer;
	@Mock ActionEvent action;
	EventHandler<ActionEvent> handler;

	@Before
	public void setUp() throws Exception {
		handler = ComputerVsComputerEvent.getHandler(view, computerPlayer);
		handler.handle(action);
	}

	@Test
	public void handleShowsPlayerScore() {
		verify(view).setPlayerScore(computerPlayer.readableScore());
	}
	
	@Test
	public void handleMakesPlayerVsComputerCheckBoxUnselected() {
		verify(view).setComputerVsComputerMode();
	}
}