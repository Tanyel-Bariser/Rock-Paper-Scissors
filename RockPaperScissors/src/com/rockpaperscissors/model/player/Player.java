package com.rockpaperscissors.model.player;

import com.rockpaperscissors.controller.RPSController;

public interface Player {
	
	/**
	 * This player chooses a weapon to compete with the opponent player's
	 * weapon and records the result in the score and updates the RPSView
	 * 
	 * @param opponent this player competes against
	 */
	void compete(RPSController controller, ComputerOpponent opponent);

}