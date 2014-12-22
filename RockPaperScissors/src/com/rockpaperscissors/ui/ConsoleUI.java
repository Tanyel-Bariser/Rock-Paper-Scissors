package com.rockpaperscissors.ui;

import java.util.Scanner;

import com.rockpaperscissors.GameType;
import com.rockpaperscissors.Gesture;
import com.rockpaperscissors.Result;

public class ConsoleUI implements UserInterface {

	@Override
	public GameType askGameType() {
		System.out.println("If you want to play Player vs Computer: Enter \"Play\"");
		System.out.println("If you want to play Computer vs Computer: Enter \"Computer\"");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		GameType gameType = GameType.getGameType(input);
		if (gameType == null) {
			System.out.println("Invalid input!\nPlease try again:");
			return askGameType();
		}
		return gameType;
	}

	@Override
	public Gesture chooseGesture() {
		System.out.println("Let's play Rock, Paper Scissors:");
		System.out.println("To choose Rock: Enter \"Rock\"");
		System.out.println("To choose Paper: Enter \"Paper\"");
		System.out.println("To choose Scissors: Enter \"Scissors\"");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Gesture gesture = Gesture.getGesture(input);
		if (gesture == null) {
			System.out.println("Invalid input!\nPlease try again!");
			return chooseGesture();
		}
		return gesture;
	}

	@Override
	public void showResult(Result result, Gesture player1, Gesture player2, GameType gameType) {
		
		System.out.println(result.name());
	}
}