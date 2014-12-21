package com.rockpaperscissors;

import com.rockpaperscissors.player.ComputerPlayer;
import com.rockpaperscissors.player.HumanPlayer;
import com.rockpaperscissors.player.Player;
import com.rockpaperscissors.strategies.RandomStrategy;
import com.rockpaperscissors.strategies.Strategy;
import com.rockpaperscissors.ui.ConsoleUI;
import com.rockpaperscissors.ui.UserInterface;

public class RockPaperScissors {

	public static void main(String[] args) {
		Player player1, player2;
		UserInterface ui = new ConsoleUI();
		GameType gameType = ui.askGameType();
		Strategy strategy = new RandomStrategy();
		if (gameType.equals(GameType.PLAYER_VS_COMPUTER)) {
			player1 = new HumanPlayer(ui);
		} else {
			player1 = new ComputerPlayer(strategy);
		}
		player2 = new ComputerPlayer(strategy);
		Gesture player1Gesture = player1.throwGesture();
		Gesture player2Gesture = player2.throwGesture();
		Result result = player1Gesture.against(player2Gesture);
		ui.showResult(result);
	}
}