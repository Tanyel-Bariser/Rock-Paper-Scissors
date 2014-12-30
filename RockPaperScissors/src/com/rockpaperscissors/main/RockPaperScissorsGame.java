package com.rockpaperscissors.main;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import com.rockpaperscissors.controller.RockPaperScissorsController;
import com.rockpaperscissors.view.ViewBuilder;

public class RockPaperScissorsGame extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		ViewBuilder.createViewBuilder()
				.controller(new RockPaperScissorsController())
				.playerVsComputer(new CheckBox("Player vs Computer"))
				.computerVsComputer(new CheckBox("Computer vs Computer"))
				.chooseWeaponText(new Text("Choose your Weapon"))
				.rockButton(new Button("Rock"))
				.paperButton(new Button("Paper"))
				.scissorsButton(new Button("Scissors"))
				.chooseStrategyText(new Text("Choose your Computer Strategy"))
				.randomButton(new Button("Random"))
				.fixedButton(new Button("Fixed"))
				.rotationButton(new Button("Rotation"))
				.stage(primaryStage)
				.build();
	}
}