package com.rockpaperscissors.controller.eventhandlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.HumanPlayer;
/**
 * This class handles the logic when the user clicks the Scissors button
 * 
 * @author Tanyel Bariser
 */
public class ScissorsButtonEvent {
	private final RPSController controller;
	private final HumanPlayer humanPlayer;
	
	public static EventHandler<ActionEvent> getHandler(RPSController controller,
			HumanPlayer humanPlayer) {
		return new ScissorsButtonEvent(controller, humanPlayer).HANDLER;
	}
	
	/**
	 * Creates class to handle Scissors button click
	 * 
	 * @param controller coordinates between the view and model
	 * @param humanPlayer allows user to manually choose weapon
	 */
	private ScissorsButtonEvent(RPSController controller, HumanPlayer humanPlayer) {
		this.controller = controller;
		this.humanPlayer = humanPlayer;
	}

	/**
	 * Sets Scissors as the human player's weapon of choice
	 * Initiates play of the game
	 */
	private final EventHandler<ActionEvent> HANDLER = event -> {
		humanPlayer.setWeapon(Weapon.SCISSORS);
		controller.play();
	};
}