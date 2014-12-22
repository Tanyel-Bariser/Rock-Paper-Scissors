package com.rockpaperscissors.ui;

public class UserInterfaceFactory {
	
	// Should not be instantiated nor subclassed
	private UserInterfaceFactory() {
		throw new AssertionError();
	}

	public static UserInterface getUserInterface(String ui) {
		switch(ui){
		case "CONSOLE" : return new ConsoleUI();
		default : return null;
		}
	}
}
