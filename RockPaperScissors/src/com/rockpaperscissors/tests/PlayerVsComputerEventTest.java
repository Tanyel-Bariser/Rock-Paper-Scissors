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
import com.rockpaperscissors.controller.eventhandlers.PlayerVsComputerEvent;
import com.rockpaperscissors.model.player.HumanPlayer;
import com.rockpaperscissors.view.RPSView;

@RunWith(MockitoJUnitRunner.class)
public class PlayerVsComputerEventTest {
	@Mock RPSView view;
	@Mock RPSController controller;
	@Mock HumanPlayer humanPlayer;
	@Mock ActionEvent action;
	PlayerVsComputerEvent event;

	@Before
	public void setUp() throws Exception {
		event = new PlayerVsComputerEvent(view, controller, humanPlayer);
		event.HANDLE.handle(action);
	}

	@After
	public void tearDown() throws Exception {
		event = null;
	}

	@Test
	public void handleMakesComputerVsComputerCheckBoxUnselected() {
		verify(view).setComputerVsComputerSelected(false);
	}
	
	@Test
	public void handleMakesChooseStrategyTextInvisible() {
		verify(view).setChooseStrategyVisible(false);
	}
	
	@Test
	public void handleMakesRandomButtonInvisible() {
		verify(view).setRandomButtonVisible(false);
	}
	
	@Test
	public void handleMakesFixedButtonInvisible() {
		verify(view).setFixedButtonVisible(false);
	}
	
	@Test
	public void handleMakesRotationButtonInvisible() {
		verify(view).setRotationButtonVisible(false);
	}
	
	@Test
	public void handleMakesChooseWeaponTextVisible() {
		verify(view).setChooseWeaponVisible(true);
	}
	
	@Test
	public void handleMakesRockButtonVisible() {
		verify(view).setRockButtonVisible(true);
	}
	
	@Test
	public void handleMakesPaperButtonVisible() {
		verify(view).setPaperButtonVisible(true);
	}
	
	@Test
	public void handleMakesScissorsButtonVisible() {
		verify(view).setScissorsButtonVisible(true);
	}
	
	@Test
	public void handleSetsHumanPlayerScoreViaToString() {
		verify(view).setPlayerScore(humanPlayer.toString());
	}
	
	@Test
	public void handleShowsHumanResultViaView() {
		verify(view).showHumanResult();
	}
	
	@Test
	public void handleSetsHumanPlayerInController() {
		verify(controller).setPlayer(humanPlayer);
	}
}