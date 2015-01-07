package com.rockpaperscissors.model.player;


public interface Player {
	
	/**
	 * This player chooses a weapon to compete with the opponent's weapon
	 * and records the result in the score and updates the View
	 * 
	 * @param opponent this player competes against
	 */
	void compete(ComputerOpponent opponent);
	

	/**
	 * Enforces player objects to have a readable score to allow
	 * view to show the score to the user
	 */
	String readableScore();

}