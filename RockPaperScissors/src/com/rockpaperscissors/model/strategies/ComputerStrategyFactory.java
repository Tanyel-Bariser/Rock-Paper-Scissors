package com.rockpaperscissors.model.strategies;

public final class ComputerStrategyFactory {

	// private constructor to prevent instantiation or subclassing
	private ComputerStrategyFactory() {
		throw new AssertionError();
	}

	public static ComputerStrategy getStrategy(String strategyType) {
		switch (strategyType) {
		case "RANDOM": return new RandomStrategy();
		default: throw new IllegalArgumentException(
					"Invalid argument for ComputerStrategyFactory");
		}
	}
}