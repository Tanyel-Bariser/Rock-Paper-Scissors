package com.rockpaperscissors.eventhandlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.model.player.HumanPlayer;
import com.rockpaperscissors.model.player.Player;
import com.rockpaperscissors.view.View;
/**
 * This class handles the logic when the user clicks the "Player vs Computer"
 * check box.
 * 
 * @author Tanyel Bariser
 */
public class PlayerVsComputerEvent {
	private final View view;
	private final Player humanPlayer;
	
	public static EventHandler<ActionEvent> getHandler(View view,
			HumanPlayer humanPlayer) {
		return new PlayerVsComputerEvent(view, humanPlayer).HANDLER;
	}

	/**
	 * Creates class to handle Player vs Computer mode
	 * 
	 * @param view is the GUI
	 * @param humanPlayer allows user to manually choose weapon (cannot be ComputerPlayer)
	 */
	private PlayerVsComputerEvent(View view, HumanPlayer humanPlayer) {
		this.view = view;
		this.humanPlayer = humanPlayer;
	}

	/**
	 * Switches the view components appropriately to show relevant buttons and
	 * text for the Player vs Computer mode
	 */
	private final EventHandler<ActionEvent> HANDLER = event -> {
		view.setPlayerScore(humanPlayer.readableScore());
		view.setPlayerVsComputerMode();
	};
}