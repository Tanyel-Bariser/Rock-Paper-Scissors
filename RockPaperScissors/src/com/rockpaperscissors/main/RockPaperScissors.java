package com.rockpaperscissors.main;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.strategies.RandomStrategy;
import com.rockpaperscissors.view.ViewBuilder;

public class RockPaperScissors extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ViewBuilder
				.createViewBuilder()
				.controller(new RPSController(
						new ComputerOpponent(RandomStrategy.RANDOM_GESTURE)))
				.playerVsComputer(new CheckBox("Player vs Computer"))
				.computerVsComputer(new CheckBox("Computer vs Computer"))
				.chooseWeaponText(new Text("Choose Your Weapon"))
				.rockButton(new Button("Rock"))
				.paperButton(new Button("Paper"))
				.scissorsButton(new Button("Scissors"))
				.chooseStrategyText(new Text("Choose Your Computer's Strategy"))
				.randomButton(new Button("Random"))
				.fixedButton(new Button("Fixed"))
				.rotationButton(new Button("Rotation"))
				.resultText(new Text())
				.scoreText(new Text())
				.stage(primaryStage)
				.build();
	}
}