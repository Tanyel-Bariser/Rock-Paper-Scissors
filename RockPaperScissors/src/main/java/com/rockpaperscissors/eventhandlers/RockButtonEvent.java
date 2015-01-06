package com.rockpaperscissors.eventhandlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.HumanPlayer;
/**
 * This class handles the logic when the user clicks the Rock button
 * 
 * @author Tanyel Bariser
 */
public class RockButtonEvent {
	private final HumanPlayer humanPlayer;
	private final ComputerOpponent opponent;
	
	public static EventHandler<ActionEvent> getHandler(HumanPlayer humanPlayer,
			ComputerOpponent opponent) {
		return new RockButtonEvent(humanPlayer, opponent).HANDLER;
	}
	
	/**
	 * Creates class to handle Rock button click
	 * 
	 * @param humanPlayer allows user to manually choose weapon
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