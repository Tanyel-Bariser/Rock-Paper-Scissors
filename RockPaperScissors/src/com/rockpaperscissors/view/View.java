package com.rockpaperscissors.view;

import com.rockpaperscissors.model.GameType;
import com.rockpaperscissors.model.Gesture;
import com.rockpaperscissors.model.Result;

public interface View {

	void askUserGameType();
	
	void choosePlayerGesture();
	
	void showResults(Result result, Gesture player1Gesture, Gesture player2Gesture, GameType gameType);
}