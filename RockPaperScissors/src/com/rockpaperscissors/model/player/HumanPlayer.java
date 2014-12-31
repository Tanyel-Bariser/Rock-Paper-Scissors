package com.rockpaperscissors.model.player;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.view.RPSView;

public class HumanPlayer implements Player {
	private final RPSView view;
	private final Score scoreBoard;
	private Weapon chosenWeapon;

	public HumanPlayer(RPSView view, Score score) {
		this.view = view;
		scoreBoard = score;
	}

	public void setWeapon(Weapon weapon) {
		chosenWeapon = weapon;
	}

	@Override
	public void compete(ComputerOpponent opponent) {
		Weapon opponentWeapon = opponent.playWeapon();
		Result result = chosenWeapon.against(opponentWeapon);
		updateScore(result);
		view.setHumanPlayerResult(chosenWeapon, opponentWeapon, result);
		view.showHumanResult();
		view.setPlayerScore(this.toString());
	}

	private void updateScore(Result result) {
		scoreBoard.updateScore(result);
	}
	
	@Override
	public String toString() {
		String humanPlayer = "Your Score:\n";
		humanPlayer += "Wins: " + scoreBoard.getWins() + "\n";
		humanPlayer += "Ties: " + scoreBoard.getTies() + "\n";
		humanPlayer += "Losses: " + scoreBoard.getLosses() + "\n";
		return humanPlayer;
	}
}