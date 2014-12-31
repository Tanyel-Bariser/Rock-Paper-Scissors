package com.rockpaperscissors.controller.events;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.player.Player;
import com.rockpaperscissors.view.RPSView;

public class ComputerVsComputerEvent {
	private final RPSView view;
	private final RPSController controller;
	private final Player computerPlayer;

	public ComputerVsComputerEvent(RPSView view, RPSController controller,
			ComputerPlayer computerPlayer) {
		this.view = view;
		this.controller = controller;
		this.computerPlayer = computerPlayer;
	}

	public final EventHandler<ActionEvent> HANDLE = event -> {
		view.setPlayerVsComputerSelected(false);
		view.setChooseStrategyVisible(true);
		view.setRandomButtonVisible(true);
		view.setFixedButtonVisible(true);
		view.setRotationButtonVisible(true);
		view.setChooseWeaponVisible(false);
		view.setRockButtonVisible(false);
		view.setPaperButtonVisible(false);
		view.setScissorsButtonVisible(false);
		view.setPlayerScore(computerPlayer.toString());
		view.showComputerResult();
		controller.setPlayer(computerPlayer);
	};
}