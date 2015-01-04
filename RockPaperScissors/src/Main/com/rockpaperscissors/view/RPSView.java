package com.rockpaperscissors.view;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.controller.eventhandlers.ComputerVsComputerEvent;
import com.rockpaperscissors.controller.eventhandlers.FixedButtonEvent;
import com.rockpaperscissors.controller.eventhandlers.PaperButtonEvent;
import com.rockpaperscissors.controller.eventhandlers.PlayerVsComputerEvent;
import com.rockpaperscissors.controller.eventhandlers.RandomButtonEvent;
import com.rockpaperscissors.controller.eventhandlers.RockButtonEvent;
import com.rockpaperscissors.controller.eventhandlers.RotationButtonEvent;
import com.rockpaperscissors.controller.eventhandlers.ScissorsButtonEvent;
import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.player.HumanPlayer;

/**
 * Contains all GUI components the game requires
 * 
 * @author Tanyel Bariser
 */
public class RPSView implements View {
	private final CheckBox playerVsComputer, computerVsComputer;
	private final Text chooseWeapon, chooseStrategy, resultText, scoreText;
	private final Button rockButton, paperButton, scissorsButton;
	private final Button randomButton, fixedButton, rotationButton;
	private String humanResult = null;
	private String computerResult = null;

	/**
	 * Package-private constructor only visible to ViewBuilder
	 * Sets dependencies and invokes buildView() to build view's components
	 * 
	 * @param builder containing RPSView's dependencies
	 */
	RPSView(ViewBuilder builder) {
		playerVsComputer = builder.playerVsComputer;
		computerVsComputer = builder.computerVsComputer;
		chooseWeapon = builder.chooseWeapon;
		rockButton = builder.rockButton;
		paperButton = builder.paperButton;
		scissorsButton = builder.scissorsButton;
		chooseStrategy = builder.chooseStrategy;
		randomButton = builder.randomButton;
		fixedButton = builder.fixedButton;
		rotationButton = builder.rotationButton;
		resultText = builder.resultText;
		scoreText = builder.scoreText;
	}
	
	public void setButtonOnActionEvents(RPSController controller,
			HumanPlayer humanPlayer, ComputerPlayer computerPlayer) {
		playerVsComputer.setOnAction(
				PlayerVsComputerEvent.getHandler(this, controller, humanPlayer));
		computerVsComputer.setOnAction(
				ComputerVsComputerEvent.getHandler(this, controller, computerPlayer));
		rockButton.setOnAction(
				RockButtonEvent.getHandler(controller, humanPlayer));
		paperButton.setOnAction(
				PaperButtonEvent.getHandler(controller, humanPlayer));
		scissorsButton.setOnAction(
				ScissorsButtonEvent.getHandler(controller, humanPlayer));
		randomButton.setOnAction(
				RandomButtonEvent.getHandler(controller, computerPlayer));
		fixedButton.setOnAction(
				FixedButtonEvent.getHandler(controller, computerPlayer));
		rotationButton.setOnAction(
				RotationButtonEvent.getHandler(controller, computerPlayer));	
	}
	
	public void setPlayerVsComputerMode() {
		computerVsComputer.setSelected(false);
		chooseStrategy.setVisible(false);
		randomButton.setVisible(false);
		fixedButton.setVisible(false);
		rotationButton.setVisible(false);
		chooseWeapon.setVisible(true);
		rockButton.setVisible(true);
		paperButton.setVisible(true);
		scissorsButton.setVisible(true);
		resultText.setText(humanResult);
	}
	
	public void setComputerVsComputerMode() {
		playerVsComputer.setSelected(false);
		chooseStrategy.setVisible(true);
		randomButton.setVisible(true);
		fixedButton.setVisible(true);
		rotationButton.setVisible(true);
		chooseWeapon.setVisible(false);
		rockButton.setVisible(false);
		paperButton.setVisible(false);
		scissorsButton.setVisible(false);
		resultText.setText(computerResult);
	}

	/**
	 * Readable string showing most recent result for human player
	 * 
	 * @param playerWeapon weapon chosen by player
	 * @param opponentWeapon weapon chosen by computer opponent
	 * @param result outcome of game
	 */
	public void setHumanPlayerResult(Weapon playerWeapon, Weapon opponentWeapon,
			Result result) {
		humanResult = "You chose " + playerWeapon.name() + "\n";
		humanResult += "Computer Opponent chose " + opponentWeapon.name() + "\n";
		humanResult += "You " + result.name();
		resultText.setText(humanResult);
	}

	/**
	 * Readable string showing most recent result for computer player
	 * 
	 * @param playerWeapon weapon chosen by player
	 * @param opponentWeapon weapon chosen by computer opponent
	 * @param result outcome of game
	 */
	public void setComputerPlayerResult(Weapon playerWeapon, Weapon opponentWeapon,
			Result result) {
		computerResult = "Your Computer chose " + playerWeapon.name() + "\n";
		computerResult += "Computer Opponent chose " + opponentWeapon.name() + "\n";
		computerResult += "Your Computer " + result.name();
		resultText.setText(computerResult);
	}

	/**
	 * @param playerScore text to show user player's score
	 */
	public void setPlayerScore(String playerScore) {
		scoreText.setText(playerScore);
	}
}