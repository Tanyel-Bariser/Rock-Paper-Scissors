package com.rockpaperscissors.controller.events;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.HumanPlayer;
/**
 * This class handles the logic when the user clicks the Paper button
 * 
 * @author Tanyel Bariser
 */
public class PaperButtonEvent {
	private final RPSController controller;
	private final HumanPlayer humanPlayer;
	
	/**
	 * Creates class to handle Paper button click
	 * 
	 * @param controller coordinates between the view and model
	 * @param humanPlayer allows user to manually choose weapon
	 */
	public PaperButtonEvent(RPSController controller, HumanPlayer humanPlayer) {
		this.controller = controller;
		this.humanPlayer = humanPlayer;
	}

	/**
	 * Sets Paper as the human player's weapon of choice
	 * Initiates play of the game
	 */
	public final EventHandler<ActionEvent> HANDLE = event -> {
		humanPlayer.setWeapon(Weapon.PAPER);
		controller.play();
	};
}