package com.rockpaperscissors.ui;

import java.util.Scanner;

import com.rockpaperscissors.GameType;
import com.rockpaperscissors.Gesture;
import com.rockpaperscissors.Result;

public class ConsoleUI implements UserInterface {
	private final Scanner scanner = new Scanner(System.in);
	private String input;
	
	@Override
	public GameType askGameType() {
		System.out.println("If you want to play Player vs Computer: Enter \"Play\"");
		System.out.println("If you want to play Computer vs Computer: Enter \"Computer\"");
		input = scanner.nextLine();
		GameType gameType = GameType.getGameType(input);
		if (gameType == null) {
			System.out.println("Invalid input!\nPlease try again:");
			return askGameType();
		}
		return gameType;
	}

	@Override
	public Gesture chooseGesture() {
		System.out.println("Let's play Rock, Paper or Scissors:");
		System.out.println("To choose Rock: Enter \"Rock\"");
		System.out.println("To choose Paper: Enter \"Paper\"");
		System.out.println("To choose Scissors: Enter \"Scissors\"");
		input = scanner.nextLine();
		Gesture gesture = Gesture.getGesture(input);
		if (gesture == null) {
			System.out.println("Invalid input!\nPlease try again!");
			return chooseGesture();
		}
		return gesture;
	}

	@Override
	public void showResult(Result player1Result, Gesture player1Gesture, Gesture player2Gesture, GameType gameType) {
		if (gameType.equals(GameType.PLAY)) {
			System.out.println("You played: " + player1Gesture);
			System.out.println("The computer played: " + player2Gesture);
			System.out.println("You " + player1Result);
		} else {
			System.out.println("The first computer player played: " + player1Gesture);
			System.out.println("The second computer player played: " + player2Gesture);
			System.out.println("The first computer player " + player1Result);
		}
	}
	
	@Override
	public boolean askUserPlayAgain() {
		System.out.println("\nWould you like to play again?");
		System.out.println("Enter: \"Yes\" or \"No\"");
		input = scanner.nextLine();
		if (input.equalsIgnoreCase("yes")) {
			return true;
		} else if (input.equalsIgnoreCase("no")) {
			return false;
		} else {
			System.out.println("Invalid input!\nPlease try again:");
			return askUserPlayAgain();
		}
	}
}