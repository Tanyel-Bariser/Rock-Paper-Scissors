package com.rockpaperscissors.controller;

import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.Player;

/**
 * Coordinates information between the Model classes and the View
 * 
 * 
 * @author Tanyel Bariser
 */
public class RPSController {
	private final ComputerOpponent opponent;
	private Player player;
	
	/**
	 * Creates the controller with a computer opponent as a dependency
	 * 
	 * @param opponent the user player against
	 */
	public RPSController(ComputerOpponent opponent) {
		this.opponent = opponent;
	}
	
	/**
	 * Is invoked BEFORE play method
	 * Sets human player during player vs computer mode
	 * Sets computer player during computer vs computer mode
	 * 
	 * @param player chosen by user to play against computer opponent
	 */
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	/**
	 * After the user has chosen and set the player, this method can be called
	 * so the player can compete against the computer opponent
	 */
	public void play() {
		player.compete(opponent);
	}
}