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
import com.rockpaperscissors.controller.eventhandlers.ComputerVsComputerEvent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.view.RPSView;

@RunWith(MockitoJUnitRunner.class)
public class ComputerVsComputerEventTest {
	@Mock RPSView view;
	@Mock RPSController controller;
	@Mock ComputerPlayer computerPlayer;
	@Mock ActionEvent action;
	ComputerVsComputerEvent event;

	@Before
	public void setUp() throws Exception {
		event = new ComputerVsComputerEvent(view, controller, computerPlayer);
		event.HANDLE.handle(action);
	}

	@After
	public void tearDown() throws Exception {
		event = null;
	}

	@Test
	public void handleMakesPlayerVsComputerCheckBoxUnselected() {
		verify(view).setPlayerVsComputerSelected(false);
	}
	
	@Test
	public void handleMakesChooseStrategyTextVisible() {
		verify(view).setChooseStrategyVisible(true);
	}
	
	@Test
	public void handleMakesRandomButtonVisible() {
		verify(view).setRandomButtonVisible(true);
	}
	
	@Test
	public void handleMakesFixedButtonVisible() {
		verify(view).setFixedButtonVisible(true);
	}
	
	@Test
	public void handleMakesRotationButtonVisible() {
		verify(view).setRotationButtonVisible(true);
	}
	
	@Test
	public void handleMakesChooseWeaponTextInvisible() {
		verify(view).setChooseWeaponVisible(false);
	}
	
	@Test
	public void handleMakesRockButtonInvisible() {
		verify(view).setRockButtonVisible(false);
	}
	
	@Test
	public void handleMakesPaperButtonInvisible() {
		verify(view).setPaperButtonVisible(false);
	}
	
	@Test
	public void handleMakesScissorsButtonInvisible() {
		verify(view).setScissorsButtonVisible(false);
	}
	
	@Test
	public void handleSetsComputerPlayerScoreViaToString() {
		verify(view).setPlayerScore(computerPlayer.toString());
	}
	
	@Test
	public void handleShowsComputerResultViaView() {
		verify(view).showComputerResult();
	}
	
	@Test
	public void handleSetsComputerPlayerInController() {
		verify(controller).setPlayer(computerPlayer);
	}
}