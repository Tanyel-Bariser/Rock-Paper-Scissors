package com.rockpaperscissors.main;

import javafx.application.Application;
import javafx.stage.Stage;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.player.HumanPlayer;
import com.rockpaperscissors.view.RPSView;
import com.rockpaperscissors.view.ViewBuilder;

/**
 * Main class to run the game.
 * 
 * @author Tanyel Bariser
 */
public class RockPaperScissors extends Application {

	/**
	 * Invokes the launch method to start JavaFX's Application superclass
	 * 
	 * @param args main method (command line) arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * Sets up objects required to play the game
	 * 
	 * @param stage is the top level JavaFX container for GUI
	 */
	@Override
	public void start(Stage stage) {
		RPSView view = ViewBuilder.createDefaultView(stage);
		RPSController controller = new RPSController(view);
		HumanPlayer humanPlayer = new HumanPlayer();
		ComputerPlayer computerPlayer = new ComputerPlayer();
		view.setButtonOnActionEvents(controller, humanPlayer, computerPlayer);
	}
}