package com.rockpaperscissors.controller.events;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.player.HumanPlayer;
import com.rockpaperscissors.model.player.Player;
import com.rockpaperscissors.view.RPSView;
/**
 * This class handles the logic when the user clicks the "Player vs Computer"
 * check box.
 * 
 * @author Tanyel Bariser
 */
public class PlayerVsComputerEvent {
	private final RPSView view;
	private final RPSController controller;
	private final Player humanPlayer;

	/**
	 * Creates class to handle Player vs Computer mode
	 * 
	 * @param view is the GUI
	 * @param controller coordinates between the view and model
	 * @param humanPlayer allows user to manually choose weapon (cannot be ComputerPlayer)
	 */
	public PlayerVsComputerEvent(RPSView view, RPSController controller,
			HumanPlayer humanPlayer) {
		this.view = view;
		this.controller = controller;
		this.humanPlayer = humanPlayer;
	}

	/**
	 * Switches the view components appropriately to show relevant buttons and
	 * text for the Player vs Computer mode
	 * 
	 * Sets human player in RPSController class making it the playable player 
	 */
	public final EventHandler<ActionEvent> HANDLE = event -> {
		view.setComputerVsComputerSelected(false);
		view.setChooseStrategyVisible(false);
		view.setRandomButtonVisible(false);
		view.setFixedButtonVisible(false);
		view.setRotationButtonVisible(false);
		view.setChooseWeaponVisible(true);
		view.setRockButtonVisible(true);
		view.setPaperButtonVisible(true);
		view.setScissorsButtonVisible(true);
		view.setPlayerScore(humanPlayer.toString());
		view.showHumanResult();
		controller.setPlayer(humanPlayer);
	};
}