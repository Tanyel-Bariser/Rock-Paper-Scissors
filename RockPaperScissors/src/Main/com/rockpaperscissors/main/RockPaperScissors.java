package com.rockpaperscissors.main;

import javafx.application.Application;
import javafx.stage.Stage;

import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.player.HumanPlayer;
import com.rockpaperscissors.view.View;
import com.rockpaperscissors.view.ViewBuilder;

/**
 * Main class to run the game.
 * 
 * @author Tanyel Bariser
 */
public class RockPaperScissors extends Application {

	/**
	 * Invokes the launch method to start JavaFX's Application
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
		View view = ViewBuilder.createRPSView(stage);
		HumanPlayer humanPlayer = new HumanPlayer(view);
		ComputerPlayer computerPlayer = new ComputerPlayer(view);
		ComputerOpponent opponent = new ComputerOpponent();
		view.buildButtonOnActionEvents(humanPlayer, computerPlayer, opponent);
	}
}