package com.rockpaperscissors.main;

import javafx.application.Application;
import javafx.stage.Stage;

import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.player.HumanPlayer;
import com.rockpaperscissors.view.View;
import com.rockpaperscissors.view.RPSViewBuilder;

/**
 * Main class to run the program/play the game.
 * 
 * @author Tanyel Bariser
 */
public class RockPaperScissors extends Application {

	/**
	 * Launches program
	 * 
	 * @param args main method (command line) arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * Sets up objects required to play the game
	 * 
	 * @param stage is the top level JavaFX container for GUI components
	 */
	@Override
	public void start(Stage stage) {
		View view = RPSViewBuilder.getRPSView(stage);
		HumanPlayer humanPlayer = new HumanPlayer(view);
		ComputerPlayer computerPlayer = new ComputerPlayer(view);
		ComputerOpponent opponent = new ComputerOpponent();
		view.buildPlayerVsComputerEventHandlers(humanPlayer, opponent);
		view.buildComputerVsComputerEventHandlers(computerPlayer, opponent);
	}
}