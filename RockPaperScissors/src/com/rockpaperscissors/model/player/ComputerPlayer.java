package com.rockpaperscissors.model.player;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.strategies.Strategy;

/**
 * Computer player allows the user to choose a strategy
 * to automate the choosing weapons
 * 
 * @author Tanyel Bariser
 */
public class ComputerPlayer implements Player {
	private final Score score;
	private Strategy chosenStrategy;

	public ComputerPlayer() {
		this(new Score());
	}
	
	/**
	 * Creates the user's computer player
	 * 
	 * @param view is the GUI
	 * @param score for the user's computer player
	 */
	public ComputerPlayer(Score score) {
		this.score = score;
	}

	/**
	 * User can set the strategy the computer player uses to choose weapons
	 * 
	 * @param strategy the user's computer player uses to choose weapons
	 */
	public void setStrategy(Strategy strategy) {
		chosenStrategy = strategy;
	}

	/**
	 * This player chooses a weapon to compete with the opponent player's
	 * weapon and records the result in the score and updates the RPSView
	 * 
	 * @param opponent this player competes against
	 */
	@Override
	public void compete(RPSController controller, ComputerOpponent opponent) {
		Weapon chosenWeapon = chosenStrategy.chooseWeapon();
		Weapon opponentWeapon = opponent.playWeapon();
		Result result = chosenWeapon.against(opponentWeapon);
		score.updateScore(result);
		controller.setComputerPlayerResult(chosenWeapon, opponentWeapon, result);
	}

	/**
	 * Readable text displaying the current score of this player
	 */
	@Override
	public String toString() {
		String computerPlayer = "Your Computer Player's Score:\n";
		computerPlayer += "Wins: " + score.getWins() + "\n";
		computerPlayer += "Ties: " + score.getTies() + "\n";
		computerPlayer += "Losses: " + score.getLosses();
		return computerPlayer;
	}
}