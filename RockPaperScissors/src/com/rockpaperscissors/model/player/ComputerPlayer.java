package com.rockpaperscissors.model.player;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.strategies.Strategy;
import com.rockpaperscissors.view.RPSView;

public class ComputerPlayer implements Player {
	private final RPSView view;
	private final Score score;
	private Strategy chosenStrategy;

	public ComputerPlayer(RPSView view, Score score) {
		this.view = view;
		this.score = score;
	}

	public void setStrategy(Strategy strategy) {
		chosenStrategy = strategy;
	}

	@Override
	public Result compete(ComputerOpponent opponent) {
		Weapon chosenWeapon = chosenStrategy.chooseWeapon();
		Weapon opponentWeapon = opponent.playWeapon();
		Result result = chosenWeapon.against(opponentWeapon);
		score.updateScore(result);
		view.setComputerPlayerResult(chosenWeapon, opponentWeapon, result);
		view.showComputerResult();
		view.setPlayerScore(this.toString());
		return result;
	}

	@Override
	public String toString() {
		String computerPlayer = "Your Computer Player's Score:\n";
		computerPlayer += "Wins: " + score.getWins() + "\n";
		computerPlayer += "Ties: " + score.getTies() + "\n";
		computerPlayer += "Losses: " + score.getLosses() + "\n";
		return computerPlayer;
	}
}