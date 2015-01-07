package com.rockpaperscissors.view;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.player.HumanPlayer;

public interface View {

	void buildPlayerVsComputerEventHandlers(HumanPlayer humanPlayer,
			ComputerOpponent opponent);

	void buildComputerVsComputerEventHandlers(ComputerPlayer computerPlayer,
			ComputerOpponent opponent);

	void setPlayerVsComputerMode();

	void setComputerVsComputerMode();

	void setHumanPlayerResult(Weapon playerWeapon, Weapon opponentWeapon,
			Result result);

	void setComputerPlayerResult(Weapon playerWeapon, Weapon opponentWeapon,
			Result result);

	void setPlayerScore(String playerScore);

}