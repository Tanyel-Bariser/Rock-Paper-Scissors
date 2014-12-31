package com.rockpaperscissors.model.player;

import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.strategies.Strategy;

public class ComputerOpponent {
	private final Strategy strategy;
	
	public ComputerOpponent(Strategy strategy) {
		this.strategy = strategy;
	}

	public Weapon playWeapon() {
		return strategy.chooseWeapon();
	}
}