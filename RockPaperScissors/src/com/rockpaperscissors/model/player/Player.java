package com.rockpaperscissors.model.player;

public interface Player {

	void compete(ComputerOpponent opponent);

	int getWins();

	int getTies();

	int getLosses();
}