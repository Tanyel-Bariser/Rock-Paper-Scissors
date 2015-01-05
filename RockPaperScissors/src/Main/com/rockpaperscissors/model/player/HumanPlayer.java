package com.rockpaperscissors.model.player;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.view.View;

/**
 * Human Player allows the user to manually choose the weapon to play with
 * 
 * @author Tanyel Bariser
 */
public class HumanPlayer implements Player {
	private final View view;
	private final Score score;
	private Weapon chosenWeapon;
	
	public HumanPlayer(View view) {
		this(view, new Score());
	}

	/**
	 * Creates the user's player
	 * 
	 * @param view is the GUI
	 * @param score for this player
	 */
	public HumanPlayer(View view, Score score) {
		this.view = view;
		this.score = score;
	}

	/**
	 * User chooses the weapon to be used by this player
	 * 
	 * @param weapon chosen by user for this player
	 */
	public void setWeapon(Weapon weapon) {
		chosenWeapon = weapon;
	}

	/**
	 * This player chooses a weapon to compete with the opponent player's
	 * weapon and records the result in the score and updates the RPSView
	 * 
	 * @param opponent this player competes against
	 */
	@Override
	public void compete(ComputerOpponent opponent) {
		Weapon opponentWeapon = opponent.playWeapon();
		Result result = chosenWeapon.against(opponentWeapon);
		score.updateScore(result);
		view.setHumanPlayerResult(chosenWeapon, opponentWeapon, result);
		view.setPlayerScore(readableScore());
	}
	
	@Override
	public String readableScore() {
		String readableScore = "Your Score:\n";
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