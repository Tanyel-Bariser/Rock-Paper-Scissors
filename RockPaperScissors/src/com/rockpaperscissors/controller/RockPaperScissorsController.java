package com.rockpaperscissors.controller;

import com.rockpaperscissors.model.GameType;
import com.rockpaperscissors.model.Gesture;
import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.strategies.FixedStrategy;
import com.rockpaperscissors.model.strategies.Strategy;
import com.rockpaperscissors.view.RockPaperScissorsView;
import com.rockpaperscissors.view.View;

public class RockPaperScissorsController {
	private View view;
	private Strategy strategy;
	private Gesture playerGesture, computerGesture;
	private GameType gameType;
	private Result result;

	public static void main(String[] args) {
		new RockPaperScissorsController();
	}

	public RockPaperScissorsController() {
		view = new RockPaperScissorsView(this);
		strategy = FixedStrategy.FIXED_GESTURE;
		askUserGameType();
	}
	
	// Package-private accessibility for unit testing
	void setView(View view) {
		this.view = view;
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

	public void setPlayerGesture(Gesture playerGesture) {
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
			result.increment();
		}
		view.showResults(result, playerGesture, computerGesture, gameType);
		// Redraws Player vs Computer button and Computer vs Computer button at
		// end.
		askUserGameType();
	}
}