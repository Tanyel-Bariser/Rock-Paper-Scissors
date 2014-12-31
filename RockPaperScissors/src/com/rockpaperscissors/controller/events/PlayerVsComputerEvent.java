package com.rockpaperscissors.controller.events;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.player.HumanPlayer;
import com.rockpaperscissors.model.player.Player;
import com.rockpaperscissors.view.RPSView;

public class PlayerVsComputerEvent {
	private final RPSView view;
	private final RPSController controller;
	private final Player humanPlayer;

	public PlayerVsComputerEvent(RPSView view, RPSController controller,
			HumanPlayer humanPlayer) {
		this.view = view;
		this.controller = controller;
		this.humanPlayer = humanPlayer;
	}

	public final EventHandler<ActionEvent> HANDLE = event -> {
		view.setComputerVsComputerSelected(false);
		view.setChooseStrategyVisible(false);
		view.setRandomButtonVisible(false);
		view.setFixedButtonVisible(false);
		view.setRotationButtonVisible(false);
		view.setChooseWeaponVisible(true);
		view.setRockButtonVisible(true);
		view.setPaperButtonVisible(true);
		view.setScissorsButtonVisible(true);
		view.setPlayerScore(humanPlayer.toString());
		view.showHumanResult();
		controller.setPlayer(humanPlayer);
	};
}