package com.rockpaperscissors.ui;

import com.rockpaperscissors.GameType;
import com.rockpaperscissors.Gesture;
import com.rockpaperscissors.Result;

public interface UserInterface {

	GameType askGameType();
	
	Gesture chooseGesture();
	
	void showResult(Result result);
}