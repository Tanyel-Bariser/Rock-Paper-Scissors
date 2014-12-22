package com.rockpaperscissors.strategies;

public final class StrategyFactory {

	// private constructor to prevent instantiation or subclassing
	private StrategyFactory() {
		throw new AssertionError();
	}

	public static Strategy getStrategy(String ui) {
		switch(ui){
			case "RANDOM" : return new RandomStrategy();
			default : return null;
		}
	}
}