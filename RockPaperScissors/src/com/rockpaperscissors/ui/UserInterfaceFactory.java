package com.rockpaperscissors.ui;

public final class UserInterfaceFactory {
	
	// private constructor to prevent instantiation or subclassing
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
