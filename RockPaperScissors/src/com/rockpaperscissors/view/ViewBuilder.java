package com.rockpaperscissors.view;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ViewBuilder {
	CheckBox playerVsComputer, computerVsComputer;
	Text chooseWeapon;
	Button rockButton, paperButton, scissorsButton;
	Stage stage;

	public static ViewBuilder view() {
		return new ViewBuilder();
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

	public ViewBuilder stage(Stage stage) {
		this.stage = stage;
		return this;
	}
	
	public RockPaperScissorsView build() {
		return new RockPaperScissorsView(this);
	}
}