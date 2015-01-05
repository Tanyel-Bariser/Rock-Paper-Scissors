package com.rockpaperscissors.eventhandlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.HumanPlayer;

/**
 * SPOCK IS CURRENTLY NOT USED IN THIS VERSION 
 * This class handles the logic when the user clicks the Spock button
 * 
 * @author Tanyel Bariser
 */
public class SpockButtonEvent {
	private final HumanPlayer humanPlayer;
	private final ComputerOpponent opponent;
	
	public static EventHandler<ActionEvent> getHandler(HumanPlayer humanPlayer, ComputerOpponent opponent) {
		return new SpockButtonEvent(humanPlayer, opponent).HANDLER;
	}
	
	/**
	 * Creates class to handle Spock button click
	 * 
	 * @param humanPlayer allows user to manually choose weapon
	 */
	private SpockButtonEvent(HumanPlayer humanPlayer, ComputerOpponent opponent) {
		this.humanPlayer = humanPlayer;
		this.opponent = opponent;
	}

	/**
	 * Sets Spock as the human player's weapon of choice
	 * Initiates play of the game
	 */
	private final EventHandler<ActionEvent> HANDLER = event -> {
		humanPlayer.setWeapon(Weapon.SPOCK);
		humanPlayer.compete(opponent);
	};
}