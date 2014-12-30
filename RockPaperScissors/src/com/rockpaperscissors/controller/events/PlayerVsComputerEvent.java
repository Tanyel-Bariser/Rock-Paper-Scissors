package com.rockpaperscissors.controller.events;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.controller.RockPaperScissorsController;
import com.rockpaperscissors.model.GameType;
import com.rockpaperscissors.view.RockPaperScissorsView;

public class PlayerVsComputerEvent {
	private final RockPaperScissorsView view;
	private final RockPaperScissorsController controller;
	
	public PlayerVsComputerEvent(RockPaperScissorsView view, RockPaperScissorsController controller) {
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