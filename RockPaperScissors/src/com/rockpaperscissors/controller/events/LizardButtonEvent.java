package com.rockpaperscissors.controller.events;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.HumanPlayer;

/**
 * LIZARD IS CURRENTLY NOT USED IN THIS VERSION 
 * This class handles the logic when the user clicks the Lizard button
 * 
 * @author Tanyel Bariser
 */
public class LizardButtonEvent {
	private final RPSController controller;
	private final HumanPlayer humanPlayer;
	
	/**
	 * Creates class to handle Lizard button click
	 * 
	 * @param controller coordinates between the view and model
	 * @param humanPlayer allows user to manually choose weapon
	 */
	public LizardButtonEvent(RPSController controller, HumanPlayer humanPlayer) {
		this.controller = controller;
		this.humanPlayer = humanPlayer;
	}

	/**
	 * Sets Lizard as the human player's weapon of choice
	 * Initiates play of the game
	 */
	public final EventHandler<ActionEvent> HANDLE = event -> {
		humanPlayer.setWeapon(Weapon.LIZARD);
		controller.play();
	};
}