package com.rockpaperscissors.eventhandlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.strategies.RotationStrategy;

/**
 * Hosts an EventHandler for ROTATION button.
 * 
 * @author Tanyel Bariser
 */
public class RotationButtonEvent {
	private final ComputerPlayer computerPlayer;
	private final ComputerOpponent opponent;

	/**
	 * @param computerPlayer object playing the game
	 * @param opponent object playing against the computer player
	 * @return EventHandler for ROTATION button
	 */
	public static EventHandler<ActionEvent> getHandler(ComputerPlayer computerPlayer,
			ComputerOpponent opponent) {
		return new RotationButtonEvent(computerPlayer, opponent).HANDLER;
	}
	
	/**
	 * Private constructor invoked by static factory method
	 * 
	 * @param computerPlayer
	 * @param opponent
	 */
	private RotationButtonEvent(ComputerPlayer computerPlayer,
			ComputerOpponent opponent) {
		this.computerPlayer = computerPlayer;
		this.opponent = opponent;
	}

	/**
	 * Sets Rotation as the user's computer player's strategy of choice
	 * Initiates play of the game
	 */
	private final EventHandler<ActionEvent> HANDLER = event -> {
		computerPlayer.setStrategy(RotationStrategy.ROTATION);
		computerPlayer.compete(opponent);
	};
}