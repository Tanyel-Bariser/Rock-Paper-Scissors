package com.rockpaperscissors.view;

import com.rockpaperscissors.controller.RockPaperScissorsController;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ViewBuilder {
	RockPaperScissorsController controller;
	CheckBox playerVsComputer, computerVsComputer;
	Text chooseWeapon, chooseStrategy;
	Button rockButton, paperButton, scissorsButton;
	Button randomButton, fixedButton, rotationButton;
	Stage stage;

	public static ViewBuilder createViewBuilder() {
		return new ViewBuilder();
	}

	public ViewBuilder controller(RockPaperScissorsController controller) {
		this.controller = controller;
		return this;
	}

	public ViewBuilder playerVsComputer(CheckBox playerVsComputer) {
		this.playerVsComputer = playerVsComputer;
		return this;
	}

	public ViewBuilder computerVsComputer(CheckBox computerVsComputer) {
		this.computerVsComputer = computerVsComputer;
		return this;
	}

	public ViewBuilder chooseWeaponText(Text chooseWeapon) {
		this.chooseWeapon = chooseWeapon;
		return this;
	}

	public ViewBuilder rockButton(Button rockButton) {
		this.rockButton = rockButton;
		return this;
	}

	public ViewBuilder paperButton(Button paperButton) {
		this.paperButton = paperButton;
		return this;
	}

	public ViewBuilder scissorsButton(Button scissorsButton) {
		this.scissorsButton = scissorsButton;
		return this;
	}

	public ViewBuilder chooseStrategyText(Text chooseStrategy) {
		this.chooseStrategy = chooseStrategy;
		return this;
	}

	public ViewBuilder randomButton(Button randomButton) {
		this.randomButton = randomButton;
		return this;
	}

	public ViewBuilder fixedButton(Button fixedButton) {
		this.fixedButton = fixedButton;
		return this;
	}

	public ViewBuilder rotationButton(Button rotationButton) {
		this.rotationButton = rotationButton;
		return this;
	}

	public ViewBuilder stage(Stage stage) {
		this.stage = stage;
		return this;
	}

	public RockPaperScissorsView build() {
		return new RockPaperScissorsView(this);
	}
}