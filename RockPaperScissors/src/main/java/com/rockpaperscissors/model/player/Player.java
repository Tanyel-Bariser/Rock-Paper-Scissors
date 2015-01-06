package com.rockpaperscissors.model.player;


public interface Player {
	
	/**
	 * This player chooses a weapon to compete with the opponent player's
	 * weapon and records the result in the score and updates the RPSView
	 * 
	 * @param opponent this player competes against
	 */
	void compete(ComputerOpponent opponent);
	
	String readableScore();

}