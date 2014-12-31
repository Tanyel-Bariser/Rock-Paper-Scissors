package com.rockpaperscissors.controller.events;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.strategies.FixedStrategy;

public class FixedButtonEvent {
	private final RPSController controller;
	private final ComputerPlayer computerPlayer;
	
	public FixedButtonEvent(RPSController controller, ComputerPlayer computerPlayer) {
		this.controller = controller;
		this.computerPlayer = computerPlayer;
	}

	public final EventHandler<ActionEvent> HANDLE = event -> {
		computerPlayer.setStrategy(FixedStrategy.FIXED);
		controller.play();
	};
}