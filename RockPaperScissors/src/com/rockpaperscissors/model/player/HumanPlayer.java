package com.rockpaperscissors.model.player;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.Weapon;

public class HumanPlayer implements Player {
	private final Score scoreBoard;
	private Weapon chosenWeapon;
	
	public HumanPlayer(Score score) {
		scoreBoard = score;
	}
	
	public void assignWeapon(Weapon weapon) {
		chosenWeapon = weapon;
	}

	@Override
	public void compete(ComputerOpponent opponent) {
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