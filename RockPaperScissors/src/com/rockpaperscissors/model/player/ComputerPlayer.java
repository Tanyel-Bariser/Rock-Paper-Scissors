package com.rockpaperscissors.model.player;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.strategies.Strategy;
import com.rockpaperscissors.view.RPSView;

public class ComputerPlayer implements Player {
	private final RPSView view;
	private final Score scoreBoard;
	private Strategy chosenStrategy;

	public ComputerPlayer(RPSView view, Score score) {
		this.view = view;
		scoreBoard = score;
	}

	public void setStrategy(Strategy strategy) {
		chosenStrategy = strategy;
	}

	@Override
	public void compete(ComputerOpponent opponent) {
		Weapon chosenWeapon = chosenStrategy.chooseWeapon();
		Weapon opponentWeapon = opponent.playWeapon();
		Result result = chosenWeapon.against(opponentWeapon);
		updateScore(result);
		view.setPlayerResult(chosenWeapon, opponentWeapon, result);
		view.setPlayerScore(this.toString());
	}

	private void updateScore(Result result) {
		scoreBoard.updateScore(result);
	}

	@Override
	public String toString() {
		String computerPlayer = "Your Computer Player's\nScore:\n";
		computerPlayer += "Wins: " + scoreBoard.getWins() + "\n";
		computerPlayer += "Ties: " + scoreBoard.getTies() + "\n";
		computerPlayer += "Losses: " + scoreBoard.getLosses() + "\n";
		return computerPlayer;
	}
}