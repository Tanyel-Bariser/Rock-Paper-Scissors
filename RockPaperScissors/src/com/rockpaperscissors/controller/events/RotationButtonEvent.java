package com.rockpaperscissors.controller.events;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.strategies.RotationStrategy;

/** 
 * This class handles the logic when the user clicks the Rotation button
 * 
 * @author Tanyel Bariser
 */
public class RotationButtonEvent {
	private final RPSController controller;
	private final ComputerPlayer computerPlayer;
	
	public static EventHandler<ActionEvent> getHandler(RPSController controller,
			ComputerPlayer computerPlayer) {
		return new RotationButtonEvent(controller, computerPlayer).HANDLE;
	}
	
	/**
	 * Creates class to handle Rotation button click
	 * 
	 * @param controller coordinates between the view and model
	 * @param computerPlayer has play strategies the user can choose from
	 */
	private RotationButtonEvent(RPSController controller, ComputerPlayer computerPlayer) {
		this.controller = controller;
		this.computerPlayer = computerPlayer;
	}

	/**
	 * Sets Rotation as the user's computer player's strategy of choice
	 * Initiates play of the game
	 */
	private final EventHandler<ActionEvent> HANDLE = event -> {
		computerPlayer.setStrategy(RotationStrategy.ROTATION);
		controller.play();
	};
}