package com.rockpaperscissors.model.player;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.strategies.RandomStrategy;
import com.rockpaperscissors.model.strategies.Strategy;

public class ComputerPlayer implements Player {
	private final Score score;
	private Strategy strategy;
	
	public ComputerPlayer(Score score) {
		this.score = score;
	}

	public void assignRandomStrategy() {
		strategy = RandomStrategy.RANDOM_GESTURE;
	}
	
	
	
	@Override
	public Weapon playWeapon() {
		return strategy.chooseWeapon();
	}

	@Override
	public void updateScore(Result result) {
		score.updateScore(result);
	}

	@Override
	public int getWins() {
		return score.getWins();
	}

	@Override
	public int getTies() {
		return score.getTies();
	}

	@Override
	public int getLosses() {
		return score.getLosses();
	}
}