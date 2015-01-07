package com.rockpaperscissors.view;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.player.HumanPlayer;

/**
 * Manages all GUI components users interact with
 * 
 * @author Tanyel Bariser
 */
public interface View {

	/**
	 * Creates and assigns event handlers for check box
	 * and buttons used in "Player vs Computer" mode
	 * 
	 * @param humanPlayer object playing the game
	 * @param opponent object playing against the human player
	 */
	void buildPlayerVsComputerEventHandlers(HumanPlayer humanPlayer,
			ComputerOpponent opponent);

	/**
	 * Creates and assigns event handlers for check box
	 * and buttons used in "Computer vs Computer" mode
	 * 
	 * @param computerPlayer object playing the game
	 * @param opponent object playing against the computer player
	 */
	void buildComputerVsComputerEventHandlers(ComputerPlayer computerPlayer,
			ComputerOpponent opponent);

	/**
	 * Sets appropriate visibility for GUI components for "Player vs Computer" mode
	 */
	void setPlayerVsComputerMode();

	/**
	 * Sets appropriate visibility for GUI components for "Computer vs Computer" mode
	 */
	void setComputerVsComputerMode();

	/**
	 * Readable string showing most recent result for human player
	 * 
	 * @param playerWeapon weapon chosen by human player
	 * @param opponentWeapon weapon chosen by computer opponent
	 * @param result outcome of game
	 */
	void setHumanPlayerResult(Weapon playerWeapon, Weapon opponentWeapon,
			Result result);

	/**
	 * Readable string showing most recent result for computer player
	 * 
	 * @param playerWeapon weapon chosen by computer player
	 * @param opponentWeapon weapon chosen by computer opponent
	 * @param result outcome of game
	 */
	void setComputerPlayerResult(Weapon playerWeapon, Weapon opponentWeapon,
			Result result);
	
	/**
	 * @param playerScore text to show user player's score
	 */
	void setPlayerScore(String playerScore);
}