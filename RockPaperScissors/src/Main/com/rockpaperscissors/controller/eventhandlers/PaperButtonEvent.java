package com.rockpaperscissors.controller.eventhandlers;

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
	
	public static EventHandler<ActionEvent> getHandler(RPSController controller,
			HumanPlayer humanPlayer) {
		return new PaperButtonEvent(controller, humanPlayer).HANDLER;
	}
	
	/**
	 * Creates class to handle Paper button click
	 * 
	 * @param controller coordinates between the view and model
	 * @param humanPlayer allows user to manually choose weapon
	 */
	private PaperButtonEvent(RPSController controller, HumanPlayer humanPlayer) {
		this.controller = controller;
		this.humanPlayer = humanPlayer;
	}

	/**
	 * Sets Paper as the human player's weapon of choice
	 * Initiates play of the game
	 */
	private final EventHandler<ActionEvent> HANDLER = event -> {
		humanPlayer.setWeapon(Weapon.PAPER);
		controller.play();
	};
}