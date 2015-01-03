package com.rockpaperscissors.main;

import javafx.application.Application;
import javafx.stage.Stage;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.controller.events.ComputerVsComputerEvent;
import com.rockpaperscissors.controller.events.FixedButtonEvent;
import com.rockpaperscissors.controller.events.PaperButtonEvent;
import com.rockpaperscissors.controller.events.PlayerVsComputerEvent;
import com.rockpaperscissors.controller.events.RandomButtonEvent;
import com.rockpaperscissors.controller.events.RockButtonEvent;
import com.rockpaperscissors.controller.events.RotationButtonEvent;
import com.rockpaperscissors.controller.events.ScissorsButtonEvent;
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
	 * Builds all JavaFX components required for the RPSView class
	 * 
	 * @param primaryStage is the top level JavaFX container for GUI
	 */
	@Override
	public void start(Stage stage) {
		RPSView view = ViewBuilder.createDefaultView(stage);
		RPSController controller = new RPSController(view);
		setViewButtonEventHandlers(view, controller);
	}
	
	private void setViewButtonEventHandlers(RPSView view, RPSController controller) {
		HumanPlayer humanPlayer = new HumanPlayer();
		ComputerPlayer computerPlayer = new ComputerPlayer();
	
		view.setPlayerVsComputerOnAction(
				PlayerVsComputerEvent.getHandler(controller, humanPlayer));
		view.setComputerVsComputerOnAction(
				ComputerVsComputerEvent.getHandler(controller, computerPlayer));
		view.setRockButtonOnAction(
				RockButtonEvent.getHandler(controller, humanPlayer));
		view.setPaperButtonOnAction(
				PaperButtonEvent.getHandler(controller, humanPlayer));
		view.setScissorsButtonOnAction(
				ScissorsButtonEvent.getHandler(controller, humanPlayer));
		view.setRandomButtonOnAction(
				RandomButtonEvent.getHandler(controller, computerPlayer));
		view.setFixedButtonOnAction(
				FixedButtonEvent.getHandler(controller, computerPlayer));
		view.setRotationButtonOnAction(
				RotationButtonEvent.getHandler(controller, computerPlayer));
	}
}