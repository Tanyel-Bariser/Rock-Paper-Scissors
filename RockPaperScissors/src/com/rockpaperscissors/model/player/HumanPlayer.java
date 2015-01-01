package com.rockpaperscissors.model.player;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.view.RPSView;

public class HumanPlayer implements Player {
	private final RPSView view;
	private final Score score;
	private Weapon chosenWeapon;

	public HumanPlayer(RPSView view, Score score) {
		this.view = view;
		this.score = score;
	}

	public void setWeapon(Weapon weapon) {
		chosenWeapon = weapon;
	}

	@Override
	public Result compete(ComputerOpponent opponent) {
		Weapon opponentWeapon = opponent.playWeapon();
		Result result = chosenWeapon.against(opponentWeapon);
		score.updateScore(result);
		view.setHumanPlayerResult(chosenWeapon, opponentWeapon, result);
		view.showHumanResult();
		view.setPlayerScore(this.toString());
		return result;
	}
	
	@Override
	public String toString() {
		String humanPlayer = "Your Score:\n";
		humanPlayer += "Wins: " + score.getWins() + "\n";
		humanPlayer += "Ties: " + score.getTies() + "\n";
		humanPlayer += "Losses: " + score.getLosses() + "\n";
		return humanPlayer;
	}
}