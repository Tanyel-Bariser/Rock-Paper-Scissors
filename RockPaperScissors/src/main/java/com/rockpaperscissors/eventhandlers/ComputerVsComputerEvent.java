package com.rockpaperscissors.eventhandlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.player.Player;
import com.rockpaperscissors.view.View;
/**
 * Hosts an EventHandler for "Computer vs Computer" check box.
 * 
 * @author Tanyel Bariser
 */
public class ComputerVsComputerEvent {
	private final View view;
	private final Player computerPlayer;
	
	/**
	 * @param view containing the "Computer vs Computer" check box
	 * @param computerPlayer object playing the game
	 * @return EventHandler for "Computer vs Computer" check box
	 */
	public static EventHandler<ActionEvent> getHandler(View view,
			ComputerPlayer computerPlayer) {
		return new ComputerVsComputerEvent(view, computerPlayer).HANDLER;
	}

	/**
	 * Private constructor invoked by static factory method
	 * 
	 * @param view
	 * @param computerPlayer
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