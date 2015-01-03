package com.rockpaperscissors.controller;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.Player;
import com.rockpaperscissors.model.strategies.RandomStrategy;
import com.rockpaperscissors.view.RPSView;

/**
 * Coordinates information between the Model classes and the View
 * 
 * 
 * @author Tanyel Bariser
 */
public class RPSController {
	private final ComputerOpponent opponent;
	private RPSView view;
	private Player player;
	
	public RPSController() {
		this(new ComputerOpponent(RandomStrategy.RANDOM));
	}
	
	/**
	 * Creates the controller with a computer opponent as a dependency
	 * 
	 * @param opponent the user player against
	 */
	public RPSController(ComputerOpponent opponent) {
		this.opponent = opponent;
	}
	
	public void setView(RPSView view) {
		this.view = view;
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

	public void setPlayerVsComputerMode() {
		view.setComputerVsComputerSelected(false);
		view.setChooseStrategyVisible(false);
		view.setRandomButtonVisible(false);
		view.setFixedButtonVisible(false);
		view.setRotationButtonVisible(false);
		view.setChooseWeaponVisible(true);
		view.setRockButtonVisible(true);
		view.setPaperButtonVisible(true);
		view.setScissorsButtonVisible(true);
		view.showHumanResult();
		showPlayerScore();
	}
	
	public void setComputerVsComputerMode() {
		view.setPlayerVsComputerSelected(false);
		view.setChooseStrategyVisible(true);
		view.setRandomButtonVisible(true);
		view.setFixedButtonVisible(true);
		view.setRotationButtonVisible(true);
		view.setChooseWeaponVisible(false);
		view.setRockButtonVisible(false);
		view.setPaperButtonVisible(false);
		view.setScissorsButtonVisible(false);
		view.showComputerResult();
		showPlayerScore();
	}

	public void setHumanPlayerResult(Weapon chosenWeapon,
			Weapon opponentWeapon, Result result) {
		view.setHumanPlayerResult(chosenWeapon, opponentWeapon, result);
		view.showHumanResult();
		showPlayerScore();
	}

	public void setComputerPlayerResult(Weapon chosenWeapon,
			Weapon opponentWeapon, Result result) {
		view.setComputerPlayerResult(chosenWeapon, opponentWeapon, result);
		view.showComputerResult();
		showPlayerScore();
	}
	

	public void showPlayerScore() {
		view.setPlayerScore(player.toString());
	}
}