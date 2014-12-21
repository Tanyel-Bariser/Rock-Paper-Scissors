package com.rockpaperscissors.ui;

import java.util.Scanner;

import com.rockpaperscissors.GameType;
import com.rockpaperscissors.Gesture;
import com.rockpaperscissors.Result;

public class ConsoleUI implements UserInterface {

	@Override
	public GameType askGameType() {
		System.out.println("If you want to play Player vs Computer: Enter \"P\"");
		System.out.println("If you want to play Computer vs Computer: Enter \"C\"");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		GameType gameType = GameType.getGameType(input);
		if (gameType == null) {
			System.out.println("Invalid input!\nPlease try again:");
			return askGameType();
		}
		scanner.close();
		return gameType;
	}

	@Override
	public Gesture chooseGesture() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void showResult(Result result) {
		// TODO Auto-generated method stub
		
	}
}