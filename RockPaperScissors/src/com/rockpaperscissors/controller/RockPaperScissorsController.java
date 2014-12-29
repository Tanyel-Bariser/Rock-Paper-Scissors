package com.rockpaperscissors.controller;

import com.rockpaperscissors.model.GameType;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.strategies.ComputerStrategy;
import com.rockpaperscissors.model.strategies.RotationStrategy;
import com.rockpaperscissors.view.RockPaperScissorsViewOld;
import com.rockpaperscissors.view.View;

public class RockPaperScissorsController {
	private final View view;
	private ComputerStrategy strategy;
	private Weapon playerGesture, computerGesture;
	private GameType gameType;
	private Result result;
	
	public static void main(String[] args) {
		new RockPaperScissorsController();
	}

	public RockPaperScissorsController() {
		view = new RockPaperScissorsViewOld(this);
		strategy = RotationStrategy.ROTATION_STRATEGY;
		askUserGameType();
	}
	
	private void askUserGameType() {
		view.askUserGameType();
	}

	public void setGameType(GameType gameType) {
		this.gameType = gameType;
		if (gameType.equals(GameType.PLAYER_VS_COMPUTER)) {
			view.choosePlayerGesture();
		} else {
			play();
		}
	}

	public void setPlayerGesture(Weapon playerGesture) {
		this.playerGesture = playerGesture;
	}

	public void play() {
		computerGesture = strategy.chooseGesture();
		if (gameType.equals(GameType.COMPUTER_VS_COMPUTER)) {
			playerGesture = strategy.chooseGesture();
		}
		result = playerGesture.against(computerGesture);
		showUserResult();
	}

	private void showUserResult() {
		if (gameType.equals(GameType.PLAYER_VS_COMPUTER)) {
			Score.updateScore(result);
		}
		view.showResults(result, playerGesture, computerGesture, gameType);
		// Redraws Player vs Computer button and Computer vs Computer button at
		// end.
		askUserGameType();
	}
}