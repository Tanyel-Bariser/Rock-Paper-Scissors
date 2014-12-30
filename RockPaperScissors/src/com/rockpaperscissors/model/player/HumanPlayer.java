package com.rockpaperscissors.model.player;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.Weapon;

public class HumanPlayer implements Player {
	private final Score score;
	private Weapon weapon;
	
	public HumanPlayer(Score score) {
		this.score = score;
	}
	
	public void assignRock() {
		weapon = Weapon.ROCK;
	}
	
	public void assignPaper() {
		weapon = Weapon.PAPER;
	}
	
	public void assignScissors() {
		weapon = Weapon.SCISSORS;
	}
	
	public void assignLizard() {
		weapon = Weapon.LIZARD;
	}
	
	public void assignSpock() {
		weapon = Weapon.SPOCK;
	}

	@Override
	public Weapon playWeapon() {
		return weapon;
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