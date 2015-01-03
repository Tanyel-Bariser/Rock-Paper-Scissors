package com.rockpaperscissors.main;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.HumanPlayer;
import com.rockpaperscissors.model.strategies.RandomStrategy;
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
	 * Builds all JavaFX components required for the RPSView class
	 * 
	 * @param primaryStage is the top level JavaFX container for GUI
	 */
	@Override
	public void start(Stage stage) {
		ViewBuilder.createDefaultView(stage);
		//ViewBuilder.createViewBuilder(stage).humanPlayer(new HumanPlayer()).build();
	}
}