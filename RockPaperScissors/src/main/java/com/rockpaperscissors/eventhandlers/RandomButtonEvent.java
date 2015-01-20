package com.rockpaperscissors.eventhandlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.strategies.RandomStrategy;

/**
 * Hosts an EventHandler for RANDOM button.
 * 
 * @author Tanyel Bariser
 */
public class RandomButtonEvent {
	private ComputerPlayer computerPlayer;
	private ComputerOpponent opponent;

	/**
	 * @param computerPlayer object playing the game
	 * @param opponent object playing against the computer player
	 * @return EventHandler for RANDOM button
	 */
	public static EventHandler<ActionEvent> getHandler(ComputerPlayer computerPlayer,
			ComputerOpponent opponent) {
		return new RandomButtonEvent(computerPlayer, opponent).HANDLER;
	}
	
	/**
	 * Private constructor invoked by static factory method
	 * 
	 * @param computerPlayer
	 * @param opponent
	 */
	private RandomButtonEvent(ComputerPlayer computerPlayer,
			ComputerOpponent opponent) {
		this.computerPlayer = computerPlayer;
		this.opponent = opponent;
	}

	/**
	 * Sets Random as the user's computer player's strategy of choice
	 * Initiates play of the game
	 */
	private final EventHandler<ActionEvent> HANDLER = event -> {
		computerPlayer.setStrategy(RandomStrategy.RANDOM);
		computerPlayer.compete(opponent);
	};
}