package com.rockpaperscissors.controller.eventhandlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.strategies.FixedStrategy;

/** 
 * This class handles the logic when the user clicks the Fixed button
 * 
 * @author Tanyel Bariser
 */
public class FixedButtonEvent {
	private final RPSController controller;
	private final ComputerPlayer computerPlayer;
	
	public static EventHandler<ActionEvent> getHandler(RPSController controller,
			ComputerPlayer computerPlayer) {
		return new FixedButtonEvent(controller, computerPlayer).HANDLER;
	}
	
	/**
	 * Creates class to handle Fixed button click
	 * 
	 * @param controller coordinates between the view and model
	 * @param computerPlayer has play strategies the user can choose from
	 */
	private FixedButtonEvent(RPSController controller, ComputerPlayer computerPlayer) {
		this.controller = controller;
		this.computerPlayer = computerPlayer;
	}

	/**
	 * Sets Fixed as the user's computer player's strategy of choice
	 * Initiates play of the game
	 */
	private final EventHandler<ActionEvent> HANDLER = event -> {
		computerPlayer.setStrategy(FixedStrategy.FIXED);
		controller.play();
	};
}