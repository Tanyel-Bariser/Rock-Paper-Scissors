package com.rockpaperscissors.view;

import com.rockpaperscissors.model.GameType;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.Result;

public interface View {

	void askUserGameType();
	
	void choosePlayerGesture();
	
	void showResults(Result result, Weapon player1Gesture, Weapon player2Gesture, GameType gameType);
}