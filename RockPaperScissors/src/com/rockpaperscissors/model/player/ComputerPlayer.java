package com.rockpaperscissors.model.player;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.strategies.Strategy;

public class ComputerPlayer implements Player {
	private final Score scoreBoard;
	private Strategy chosenStrategy;
	
	public ComputerPlayer(Score score) {
		scoreBoard = score;
	}

	public void assignStrategy(Strategy strategy) {
		chosenStrategy = strategy;
	}
	
	@Override
	public void compete(ComputerOpponent opponent) {
		Weapon chosenWeapon = chosenStrategy.chooseWeapon(); 
		Result result = chosenWeapon.against(opponent.playWeapon());
		updateScore(result);
	}
	
	private void updateScore(Result result) {
		scoreBoard.updateScore(result);
	}

	@Override
	public int getWins() {
		return scoreBoard.getWins();
	}

	@Override
	public int getTies() {
		return scoreBoard.getTies();
	}

	@Override
	public int getLosses() {
		return scoreBoard.getLosses();
	}
}