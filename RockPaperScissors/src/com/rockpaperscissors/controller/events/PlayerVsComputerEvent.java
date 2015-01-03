package com.rockpaperscissors.controller.events;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.player.HumanPlayer;
import com.rockpaperscissors.model.player.Player;
/**
 * This class handles the logic when the user clicks the "Player vs Computer"
 * check box.
 * 
 * @author Tanyel Bariser
 */
public class PlayerVsComputerEvent {
	private final RPSController controller;
	private final Player humanPlayer;
	
	public static EventHandler<ActionEvent> getHandler(RPSController controller,
			HumanPlayer humanPlayer) {
		return new PlayerVsComputerEvent(controller, humanPlayer).HANDLE;
	}

	/**
	 * Creates class to handle Player vs Computer mode
	 * 
	 * @param view is the GUI
	 * @param controller coordinates between the view and model
	 * @param humanPlayer allows user to manually choose weapon (cannot be ComputerPlayer)
	 */
	private PlayerVsComputerEvent(RPSController controller,
			HumanPlayer humanPlayer) {
		this.controller = controller;
		this.humanPlayer = humanPlayer;
	}

	/**
	 * Switches the view components appropriately to show relevant buttons and
	 * text for the Player vs Computer mode
	 * 
	 * Sets human player in RPSController class making it the playable player 
	 */
	private final EventHandler<ActionEvent> HANDLE = event -> {
		controller.setPlayer(humanPlayer);
		controller.setPlayerVsComputerMode();
	};
}