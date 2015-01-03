package com.rockpaperscissors.controller.events;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.player.Player;
import com.rockpaperscissors.view.RPSView;
/**
 * This class handles the logic when the user clicks the "Computer vs Computer"
 * check box.
 * 
 * @author Tanyel Bariser
 */
public class ComputerVsComputerEvent {
	private final RPSController controller;
	private final Player computerPlayer;

	/**
	 * Creates class to handle Computer vs Computer mode
	 * 
	 * @param view is the GUI
	 * @param controller coordinates between the view and model
	 * @param computerPlayer has play strategies the user can choose from (cannot be HumanPlayer)
	 */
	public ComputerVsComputerEvent(RPSController controller,
			ComputerPlayer computerPlayer) {
		this.controller = controller;
		this.computerPlayer = computerPlayer;
	}

	/**
	 * Switches the view components appropriately to show relevant buttons and
	 * text for the Computer vs Computer mode
	 * 
	 * Sets computer player in RPSController class making it the playable player
	 */
	public final EventHandler<ActionEvent> HANDLE = event -> {
		controller.setPlayer(computerPlayer);
		controller.setComputerVsComputerMode();
	};
}