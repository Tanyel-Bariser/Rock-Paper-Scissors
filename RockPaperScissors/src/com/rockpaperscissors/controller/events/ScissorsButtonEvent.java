package com.rockpaperscissors.controller.events;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.HumanPlayer;

public class ScissorsButtonEvent {
	private final RPSController controller;
	private final HumanPlayer humanPlayer;
	
	public ScissorsButtonEvent(RPSController controller, HumanPlayer humanPlayer) {
		this.controller = controller;
		this.humanPlayer = humanPlayer;
	}

	public final EventHandler<ActionEvent> HANDLE = event -> {
		System.out.println("Scissors Button Clicked");
		humanPlayer.setWeapon(Weapon.SCISSORS);
		controller.play();
	};
}