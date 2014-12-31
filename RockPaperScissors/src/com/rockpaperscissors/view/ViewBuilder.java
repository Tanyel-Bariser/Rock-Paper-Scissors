package com.rockpaperscissors.view;

import com.rockpaperscissors.controller.RPSController;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Gathers dependencies required for RPSView
 * 
 * 
 * @author Tanyel Bariser
 *
 */
public class ViewBuilder {
	RPSController controller;
	CheckBox playerVsComputer, computerVsComputer;
	Text chooseWeapon, chooseStrategy, resultText, scoreText;
	Button rockButton, paperButton, scissorsButton;
	Button randomButton, fixedButton, rotationButton;
	Stage stage;

	public static ViewBuilder createViewBuilder() {
		return new ViewBuilder();
	}

	public ViewBuilder controller(RPSController controller) {
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
	
	public ViewBuilder resultText(Text resultText) {
		this.resultText = resultText;
		return this;
	}
	
	public ViewBuilder scoreText(Text scoreText) {
		this.scoreText = scoreText;
		return this;
	}

	public ViewBuilder stage(Stage stage) {
		this.stage = stage;
		return this;
	}

	public RPSView build() {
		checkForNullArgs();
		return new RPSView(this);
	}

	private void checkForNullArgs() {
		if (controller == null) {
			throw new NullPointerException("Controller is null");
		} else if (playerVsComputer == null) {
			throw new NullPointerException(
					"Player vs Computer Check Box is null");
		} else if (computerVsComputer == null) {
			throw new NullPointerException(
					"Computer vs Computer Check Box is null");
		} else if (chooseWeapon == null) {
			throw new NullPointerException("Choose Weapon Text is null");
		} else if (rockButton == null) {
			throw new NullPointerException("Rock Button is null");
		} else if (paperButton == null) {
			throw new NullPointerException("Paper Button is null");
		} else if (scissorsButton == null) {
			throw new NullPointerException("Scissors Button is null");
		} else if (chooseStrategy == null) {
			throw new NullPointerException("Choose Strategy Text is null");
		} else if (randomButton == null) {
			throw new NullPointerException("Random Button is null");
		} else if (fixedButton == null) {
			throw new NullPointerException("Fixed Button is null");
		} else if (rotationButton == null) {
			throw new NullPointerException("Rotation Button is null");
		} else if (resultText == null) {
			throw new NullPointerException("Result Text is null");
		} else if (scoreText  == null) {
			throw new NullPointerException("Score Text is null");
		} else if (stage == null) {
			throw new NullPointerException("Stage is null");
		}
	}
}