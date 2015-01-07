package com.rockpaperscissors.model.player;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.strategies.Strategy;
import com.rockpaperscissors.view.View;

/**
 * Computer player allows the user to choose a strategy for
 * the computer to follow to choose weapons to compete with
 * 
 * @author Tanyel Bariser
 */
public class ComputerPlayer implements Player {
	private final View view;
	private final Score score;
	private Strategy chosenStrategy;

	/**
	 * Sets a blank score for the computer player
	 * 
	 * @param view is the GUI the user can use to assign the strategy
	 */
	public ComputerPlayer(View view) {
		this(view, new Score());
	}
	
	/**
	 * @param view is the GUI the user can use to assign the strategy
	 * @param score with potentially recorded scores from earlier games
	 */
	public ComputerPlayer(View view, Score score) {
		this.view = view;
		this.score = score;
	}

	/**
	 * @param strategy the user's computer player uses to choose weapons
	 */
	public void setStrategy(Strategy strategy) {
		chosenStrategy = strategy;
	}

	/**
	 * This player chooses a weapon to compete with the opponent's weapon
	 * and records the result in the score object and updates the View
	 * 
	 * @param opponent this player competes against
	 */
	@Override
	public void compete(ComputerOpponent opponent) {
		Weapon chosenWeapon = chosenStrategy.chooseWeapon();
		Weapon opponentWeapon = opponent.playWeapon();
		Result result = chosenWeapon.against(opponentWeapon);
		score.updateScore(result);
		view.setComputerPlayerResult(chosenWeapon, opponentWeapon, result);
		view.setPlayerScore(readableScore());
	}
	
	/**
	 * Player interface enforces players to have a readable score to allow
	 * view to show the score to the user
	 */
	@Override
	public String readableScore() {
		String readableScore = "Your Computer Player's Score:\n";
		readableScore += "Wins: " + score.getWins() + "\n";
		readableScore += "Ties: " + score.getTies() + "\n";
		readableScore += "Losses: " + score.getLosses();
		return readableScore;
	}

	/**
	 * Readable text displaying the current score of this player
	 */
	@Override
	public String toString() {
		return readableScore();
	}
}