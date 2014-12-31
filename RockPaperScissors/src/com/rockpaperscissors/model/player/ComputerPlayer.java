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
		view.setPlayerWeapon(chosenWeapon);
		view.setOpponentWeapon(opponentWeapon);
		view.setPlayerWins(scoreBoard.getWins());
		view.setPlayerTies(scoreBoard.getTies());
		view.setPlayerLosses(scoreBoard.getLosses());
		view.setPlayerResult(result);
	}
	
	private void updateScore(Result result) {
		scoreBoard.updateScore(result);
	}
}