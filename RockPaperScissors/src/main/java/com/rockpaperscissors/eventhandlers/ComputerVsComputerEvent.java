package com.rockpaperscissors.eventhandlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.player.Player;
import com.rockpaperscissors.view.View;
/**
 * This class handles the logic when the user clicks the "Computer vs Computer"
 * check box.
 * 
 * @author Tanyel Bariser
 */
public class ComputerVsComputerEvent {
	private final View view;
	private final Player computerPlayer;
	
	public static EventHandler<ActionEvent> getHandler(View view,
			ComputerPlayer computerPlayer) {
		return new ComputerVsComputerEvent(view, computerPlayer).HANDLER;
	}

	/**
	 * Creates class to handle Computer vs Computer mode
	 * 
	 * @param view is the GUI
	 * @param computerPlayer has play strategies the user can choose from (cannot be HumanPlayer)
	 */
	private ComputerVsComputerEvent(View view, ComputerPlayer computerPlayer) {
		this.view = view;
		this.computerPlayer = computerPlayer;
	}

	/**
	 * Switches the view components appropriately to show relevant buttons and
	 * text for the Computer vs Computer mode
	 */
	private final EventHandler<ActionEvent> HANDLER = event -> {
		view.setPlayerScore(computerPlayer.readableScore());
		view.setComputerVsComputerMode();
	};
}