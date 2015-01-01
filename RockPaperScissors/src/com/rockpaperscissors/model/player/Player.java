package com.rockpaperscissors.model.player;

import com.rockpaperscissors.model.Result;

public interface Player {
	
	Result compete(ComputerOpponent opponent);

}