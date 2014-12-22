package com.rockpaperscissors.ui;

import com.rockpaperscissors.GameType;
import com.rockpaperscissors.Gesture;
import com.rockpaperscissors.Result;

public class GraphicalUserInterface implements UserInterface {

	@Override
	public GameType askGameType() {
		return null;
	}

	@Override
	public Gesture chooseGesture() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void showResult(Result result, Gesture player1Gesture,
			Gesture player2Gesture, GameType gameType) {

	}

	@Override
	public void showScore() {

	}

	@Override
	public boolean askPlayAgain() {
		return false;
	}
}