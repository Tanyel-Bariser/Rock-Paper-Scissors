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
	private final Player comptuerPlayer;

	public ComputerVsComputerEvent(RPSView view, RPSController controller,
			ComputerPlayer computerPlayer) {
		this.view = view;
		this.controller = controller;
		this.comptuerPlayer = computerPlayer;
	}

	public final EventHandler<ActionEvent> HANDLE = event -> {
		System.out.println("Computer Checked");
		view.setPlayerVsComputerSelected(false);
		view.setChooseStrategyVisible(true);
		view.setRandomButtonVisible(true);
		view.setFixedButtonVisible(true);
		view.setRotationButtonVisible(true);
		view.setChooseWeaponVisible(false);
		view.setRockButtonVisible(false);
		view.setPaperButtonVisible(false);
		view.setScissorsButtonVisible(false);
		controller.setPlayer(comptuerPlayer);
		view.setPlayerScore(comptuerPlayer.toString());
	};
}
