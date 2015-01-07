package com.rockpaperscissors.eventhandlers;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.model.player.HumanPlayer;
import com.rockpaperscissors.model.player.Player;
import com.rockpaperscissors.view.View;
/**
 * Hosts an EventHandler for "Player vs Computer" check box.
 * 
 * @author Tanyel Bariser
 */
public class PlayerVsComputerEvent {
	private final View view;
	private final Player humanPlayer;
	
	/**
	 * @param view containing the "Player vs Computer" check box
	 * @param humanPlayer object playing the game
	 * @return EventHandler for "Player vs Computer" check box
	 */
	public static EventHandler<ActionEvent> getHandler(View view,
			HumanPlayer humanPlayer) {
		return new PlayerVsComputerEvent(view, humanPlayer).HANDLER;
	}

	/**
	 * Private constructor invoked by static factory method
	 * 
	 * @param view
	 * @param humanPlayer
	 */
	private PlayerVsComputerEvent(View view, HumanPlayer humanPlayer) {
		this.view = view;
		this.humanPlayer = humanPlayer;
	}

	/**
	 * Switches the view components appropriately to show relevant buttons and
	 * text for the "Player vs Computer" mode
	 */
	private final EventHandler<ActionEvent> HANDLER = event -> {
		view.setPlayerScore(humanPlayer.readableScore());
		view.setPlayerVsComputerMode();
	};
}