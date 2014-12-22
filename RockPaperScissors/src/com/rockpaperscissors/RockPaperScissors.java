package com.rockpaperscissors;

import com.rockpaperscissors.player.ComputerPlayer;
import com.rockpaperscissors.player.HumanPlayer;
import com.rockpaperscissors.player.Player;
import com.rockpaperscissors.strategies.RandomStrategy;
import com.rockpaperscissors.strategies.Strategy;
import com.rockpaperscissors.ui.ConsoleUI;
import com.rockpaperscissors.ui.UserInterface;

public class RockPaperScissors {
	private Player player1, player2;
	private UserInterface ui;
	private Gesture player1Gesture, player2Gesture;
	private GameType gameType;
	private Result player1Result;

	public static void main(String[] args) {
		new RockPaperScissors();
	}

	public RockPaperScissors() {
		do {
			setUpGame();
			play();
			showUserResult();
		} while (playAgain());
	}

	private void setUpGame() {
		ui = new ConsoleUI();
		gameType = ui.askGameType();
		Strategy strategy = new RandomStrategy();
		if (gameType.equals(GameType.PLAY)) {
			player1 = new HumanPlayer(ui);
		} else {
			player1 = new ComputerPlayer(strategy);
		}
		player2 = new ComputerPlayer(strategy);
	}

	private void play() {
		player1Gesture = player1.throwGesture();
		player2Gesture = player2.throwGesture();
		player1Result = player1Gesture.against(player2Gesture);
	}

	private void showUserResult() {
		ui.showResult(player1Result, player1Gesture, player2Gesture, gameType);
		Score.increment(player1Result);
		ui.showScore();
	}
	
	private boolean playAgain() {
		return ui.askUserPlayAgain();
	}
}