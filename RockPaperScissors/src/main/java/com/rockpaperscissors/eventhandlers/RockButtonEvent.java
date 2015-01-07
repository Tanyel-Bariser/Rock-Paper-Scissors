package com.rockpaperscissors.eventhandlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.HumanPlayer;
/**
 * Hosts an EventHandler for ROCK button.
 * 
 * @author Tanyel Bariser
 */
public class RockButtonEvent {
	private final HumanPlayer humanPlayer;
	private final ComputerOpponent opponent;
	
	/**
	 * @param humanPlayer object playing the game
	 * @param opponent object playing against the human player
	 * @return EventHandler for ROCK button
	 */
	public static EventHandler<ActionEvent> getHandler(HumanPlayer humanPlayer,
			ComputerOpponent opponent) {
		return new RockButtonEvent(humanPlayer, opponent).HANDLER;
	}
	
	/**
	 * Private constructor invoked by static factory method
	 * 
	 * @param humanPlayer
	 * @param opponent
	 */
	private RockButtonEvent(HumanPlayer humanPlayer, ComputerOpponent opponent) {
		this.humanPlayer = humanPlayer;
		this.opponent = opponent;
	}

	/**
	 * Sets Rock as the human player's weapon of choice
	 * Initiates play of the game
	 */
	private final EventHandler<ActionEvent> HANDLER = event -> {
		humanPlayer.setWeapon(Weapon.ROCK);
		humanPlayer.compete(opponent);
	};
}