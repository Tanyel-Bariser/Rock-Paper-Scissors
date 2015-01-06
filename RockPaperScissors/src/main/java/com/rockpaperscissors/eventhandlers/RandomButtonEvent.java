package com.rockpaperscissors.eventhandlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.strategies.RandomStrategy;

/** 
 * This class handles the logic when the user clicks the Random button
 * 
 * @author Tanyel Bariser
 */
public class RandomButtonEvent {
	private final ComputerPlayer computerPlayer;
	private final ComputerOpponent opponent;

	public static EventHandler<ActionEvent> getHandler(ComputerPlayer computerPlayer,
			ComputerOpponent opponent) {
		return new RandomButtonEvent(computerPlayer, opponent).HANDLER;
	}
	
	/**
	 * Creates class to handle Random button click
	 * 
	 * @param computerPlayer has play strategies the user can choose from
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