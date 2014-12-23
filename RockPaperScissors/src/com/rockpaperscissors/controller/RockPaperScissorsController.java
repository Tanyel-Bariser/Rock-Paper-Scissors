package com.rockpaperscissors.controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import com.rockpaperscissors.model.GameType;
import com.rockpaperscissors.model.Gesture;
import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.strategies.ComputerStrategy;
import com.rockpaperscissors.model.strategies.ComputerStrategyFactory;
import com.rockpaperscissors.view.RockPaperScissorsView;
import com.rockpaperscissors.view.View;

public class RockPaperScissorsController {
	private View view;
	private ComputerStrategy strategy;
	private Gesture playerGesture, computerGesture;
	private GameType gameType;
	private Result result;

	public static void main(String[] args) {
		new RockPaperScissorsController();
	}

	public RockPaperScissorsController() {
		view = new RockPaperScissorsView(this);
		strategy = ComputerStrategyFactory.getStrategy("RANDOM");
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
			Score.increment(result);
		}
		view.showResults(result, playerGesture, computerGesture, gameType);
		// Redraws Player vs Computer button and Computer vs Computer button at
		// end.
		askUserGameType();
	}
}