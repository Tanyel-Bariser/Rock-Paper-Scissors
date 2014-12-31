package com.rockpaperscissors.controller.events;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.strategies.RandomStrategy;

public class RandomButtonEvent {
	private final RPSController controller;
	private final ComputerPlayer computerPlayer;
	
	public RandomButtonEvent(RPSController controller, ComputerPlayer computerPlayer) {
		this.controller = controller;
		this.computerPlayer = computerPlayer;
	}

	public final EventHandler<ActionEvent> HANDLE = event -> {
		System.out.println("Random Button Clicked");
		computerPlayer.setStrategy(RandomStrategy.RANDOM);
		controller.play();
	};
}