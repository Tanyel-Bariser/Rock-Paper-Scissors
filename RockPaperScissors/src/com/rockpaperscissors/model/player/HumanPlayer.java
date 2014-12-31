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