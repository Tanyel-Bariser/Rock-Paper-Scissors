package com.rockpaperscissors.model.player;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Weapon;

public interface Player {

	Weapon playWeapon();

	void updateScore(Result result);

	int getWins();

	int getTies();

	int getLosses();
}