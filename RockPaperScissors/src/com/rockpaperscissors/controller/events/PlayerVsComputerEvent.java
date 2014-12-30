package com.rockpaperscissors.controller.events;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.player.HumanPlayer;
import com.rockpaperscissors.model.player.Player;
import com.rockpaperscissors.view.RPSView;

public class PlayerVsComputerEvent {
	private final RPSView view;
	private final RPSController controller;
	private static final Player HUMAN_PLAYER = new HumanPlayer(new Score());
	
	public PlayerVsComputerEvent(RPSView view, RPSController controller) {
		this.view = view;
		this.controller = controller;
	}

	public final EventHandler<ActionEvent> HANDLE = event -> {
		System.out.println("Player Checked");
		view.setComputerVsComputerSelected(false);
		view.setChooseStrategyVisible(false);
		view.setRandomButtonVisible(false);
		view.setFixedButtonVisible(false);
		view.setRotationButtonVisible(false);
		view.setChooseWeaponVisible(true);
		view.setRockButtonVisible(true);
		view.setPaperButtonVisible(true);
		view.setScissorsButtonVisible(true);
		controller.setPlayer(HUMAN_PLAYER);
	};
}