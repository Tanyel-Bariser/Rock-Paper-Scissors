package com.rockpaperscissors.view;

import com.rockpaperscissors.controller.RPSController;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Gathers dependencies required for RPSView
 * 
 * @author Tanyel Bariser
 */
public class ViewBuilder {
	// Package-private fields only visible to RPSView
	RPSController controller;
	CheckBox playerVsComputer, computerVsComputer;
	Text chooseWeapon, chooseStrategy, resultText, scoreText;
	Button rockButton, paperButton, scissorsButton;
	Button randomButton, fixedButton, rotationButton;
	Stage stage;

	/**
	 * Static factory method creates an instance of this class
	 * 
	 * @return an instance of ViewBuilder
	 */
	public static ViewBuilder createViewBuilder() {
		return new ViewBuilder();
	}

	/**
	 * @param controller dependency required for RPSView
	 * @return same instance of ViewBuilder
	 */
	public ViewBuilder controller(RPSController controller) {
		this.controller = controller;
		return this;
	}

	/**
	 * @param playerVsComputer check box required for RPSView
	 * @return same instance of ViewBuilder
	 */
	public ViewBuilder playerVsComputer(CheckBox playerVsComputer) {
		this.playerVsComputer = playerVsComputer;
		playerVsComputer.arm();
		return this;
	}

	/**
	 * @param computerVsComputer check box required for RPSView
	 * @return same instance of ViewBuilder
	 */
	public ViewBuilder computerVsComputer(CheckBox computerVsComputer) {
		this.computerVsComputer = computerVsComputer;
		return this;
	}

	/**
	 * @param chooseWeapon text node required for RPSView
	 * @return same instance of ViewBuilder
	 */
	public ViewBuilder chooseWeaponText(Text chooseWeapon) {
		this.chooseWeapon = chooseWeapon;
		return this;
	}

	/**
	 * @param rockButton required for RPSView
	 * @return same instance of ViewBuilder
	 */
	public ViewBuilder rockButton(Button rockButton) {
		this.rockButton = rockButton;
		return this;
	}

	/**
	 * @param paperButton required for RPSView
	 * @return same instance of ViewBuilder
	 */
	public ViewBuilder paperButton(Button paperButton) {
		this.paperButton = paperButton;
		return this;
	}

	/**
	 * @param scissorsButton required for RPSView
	 * @return same instance of ViewBuilder
	 */
	public ViewBuilder scissorsButton(Button scissorsButton) {
		this.scissorsButton = scissorsButton;
		return this;
	}

	/**
	 * @param chooseStrategy required for RPSView
	 * @return same instance of ViewBuilder
	 */
	public ViewBuilder chooseStrategyText(Text chooseStrategy) {
		this.chooseStrategy = chooseStrategy;
		return this;
	}

	/**
	 * @param randomButton required for RPSView
	 * @return same instance of ViewBuilder
	 */
	public ViewBuilder randomButton(Button randomButton) {
		this.randomButton = randomButton;
		return this;
	}

	/**
	 * @param fixedButton required for RPSView
	 * @return same instance of ViewBuilder
	 */
	public ViewBuilder fixedButton(Button fixedButton) {
		this.fixedButton = fixedButton;
		return this;
	}

	/**
	 * @param rotationButton required for RPSView
	 * @return same instance of ViewBuilder
	 */
	public ViewBuilder rotationButton(Button rotationButton) {
		this.rotationButton = rotationButton;
		return this;
	}
	
	/**
	 * @param resultText required for RPSView
	 * @return same instance of ViewBuilder
	 */
	public ViewBuilder resultText(Text resultText) {
		this.resultText = resultText;
		return this;
	}
	
	/**
	 * @param scoreText required for RPSView
	 * @return same instance of ViewBuilder
	 */
	public ViewBuilder scoreText(Text scoreText) {
		this.scoreText = scoreText;
		return this;
	}

	/**
	 * @param stage required for RPSView
	 * @return same instance of ViewBuilder
	 */
	public ViewBuilder stage(Stage stage) {
		this.stage = stage;
		return this;
	}

	/**
	 * Checks to makes sure all arguments required for RPSView have be gathered
	 * Then builds RPSView and returns it
	 * 
	 * @return instance of RPSView
	 */
	public RPSView build() {
		checkForNullArgs();
		return new RPSView(this);
	}

	/**
	 * Checks that each dependency has be assigned correctly
	 * @throws NullPoinerException
	 */
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