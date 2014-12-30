package com.rockpaperscissors.controller.events;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.GameType;
import com.rockpaperscissors.view.RPSView;

public class PlayerVsComputerEvent {
	private final RPSView view;
	private final RPSController controller;
	
	public PlayerVsComputerEvent(RPSView view, RPSController controller) {
		this.view = view;
		this.controller = controller;
	}

	public final EventHandler<ActionEvent> HANDLE = event -> {
		System.out.println("Player Checked");
		view.getComputerVsComputer().setSelected(false);
		view.getChooseStrategy().setVisible(false);
		view.getRandomButton().setVisible(false);
		view.getFixedButton().setVisible(false);
		view.getRotationButton().setVisible(false);
		view.getChooseWeapon().setVisible(true);
		view.getRockButton().setVisible(true);
		view.getPaperButton().setVisible(true);
		view.getScissorsButton().setVisible(true);
		controller.setGameType(GameType.PLAYER_VS_COMPUTER);
	};
}