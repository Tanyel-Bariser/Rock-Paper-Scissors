package com.rockpaperscissors.player;

import com.rockpaperscissors.Gesture;
import com.rockpaperscissors.ui.UserInterface;

public class HumanPlayer implements Player {
	private UserInterface ui;
	
	public HumanPlayer(UserInterface ui) {
		this.ui = ui;
	}
	
	@Override
	public Gesture throwGesture() {	
		return ui.chooseGesture();
	}
}