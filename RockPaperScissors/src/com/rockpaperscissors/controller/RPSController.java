package com.rockpaperscissors.controller;

import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.Player;

public class RPSController {
	private final ComputerOpponent opponent;
	private Player player;
	
	public RPSController(ComputerOpponent opponent) {
		this.opponent = opponent;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	public void play() {
		player.compete(opponent);
	}
}