package com.rockpaperscissors.controller.events;

import com.rockpaperscissors.view.RockPaperScissorsView;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class PlayerVsComputerEvent {
	private final RockPaperScissorsView view;
	
	public PlayerVsComputerEvent(RockPaperScissorsView view) {
		this.view = view;
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
	};
}