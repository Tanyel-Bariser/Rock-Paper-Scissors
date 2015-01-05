package com.rockpaperscissors.eventhandlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.HumanPlayer;

/**
 * LIZARD IS CURRENTLY NOT USED IN THIS VERSION 
 * This class handles the logic when the user clicks the Lizard button
 * 
 * @author Tanyel Bariser
 */
public class LizardButtonEvent {
	private final HumanPlayer humanPlayer;
	private final ComputerOpponent opponent;
	
	public static EventHandler<ActionEvent> getHandler(HumanPlayer humanPlayer, ComputerOpponent opponent) {
		return new LizardButtonEvent(humanPlayer, opponent).HANDLER;
	}
	
	/**
	 * Creates class to handle Lizard button click
	 * 
	 * @param humanPlayer allows user to manually choose weapon
	 */
	private LizardButtonEvent(HumanPlayer humanPlayer, ComputerOpponent opponent) {
		this.humanPlayer = humanPlayer;
		this.opponent = opponent;
	}

	/**
	 * Sets Lizard as the human player's weapon of choice
	 * Initiates play of the game
	 */
	private final EventHandler<ActionEvent> HANDLER = event -> {
		humanPlayer.setWeapon(Weapon.LIZARD);
		humanPlayer.compete(opponent);
	};
}