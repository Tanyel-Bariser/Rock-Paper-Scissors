package com.rockpaperscissors.eventhandlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.HumanPlayer;
/**
 * This class handles the logic when the user clicks the Scissors button
 * 
 * @author Tanyel Bariser
 */
public class ScissorsButtonEvent {
	private final HumanPlayer humanPlayer;
	private final ComputerOpponent opponent;
	
	public static EventHandler<ActionEvent> getHandler(HumanPlayer humanPlayer, ComputerOpponent opponent) {
		return new ScissorsButtonEvent(humanPlayer, opponent).HANDLER;
	}
	
	/**
	 * Creates class to handle Scissors button click
	 * 
	 * @param humanPlayer allows user to manually choose weapon
	 */
	private ScissorsButtonEvent(HumanPlayer humanPlayer, ComputerOpponent opponent) {
		this.humanPlayer = humanPlayer;
		this.opponent = opponent;
	}

	/**
	 * Sets Scissors as the human player's weapon of choice
	 * Initiates play of the game
	 */
	private final EventHandler<ActionEvent> HANDLER = event -> {
		humanPlayer.setWeapon(Weapon.SCISSORS);
		humanPlayer.compete(opponent);
	};
}