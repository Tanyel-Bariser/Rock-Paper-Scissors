package com.rockpaperscissors.controller;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.Player;
import com.rockpaperscissors.view.View;

/**
 * Coordinates information between the Model classes and the View
 * 
 * @author Tanyel Bariser
 */
public class RPSController {
	private final View view;
	private final ComputerOpponent opponent;
	private Player player;
	
	public RPSController(View view) {
		this(view, new ComputerOpponent());
	}
	
	/**
	 * Creates the controller with a computer opponent as a dependency
	 * 
	 * @param opponent the user plays against
	 */
	public RPSController(View view, ComputerOpponent opponent) {
		this.view = view;
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
		player.compete(this, opponent);
	}

	public void setHumanPlayerResult(Weapon chosenWeapon,
			Weapon opponentWeapon, Result result) {
		view.setHumanPlayerResult(chosenWeapon, opponentWeapon, result);
		showPlayerScore();
	}

	public void setComputerPlayerResult(Weapon chosenWeapon,
			Weapon opponentWeapon, Result result) {
		view.setComputerPlayerResult(chosenWeapon, opponentWeapon, result);
		showPlayerScore();
	}
	
	public void showPlayerScore() {
		view.setPlayerScore(player.toString());
	}
}