package com.rockpaperscissors.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Weapon;

/**
 * GUI for the game, builds/sets up all components the user interface requires
 * 
 * @author Tanyel Bariser
 */
public class RPSView {
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
	
	public void setPlayerVsComputerOnAction(EventHandler<ActionEvent> handler) {
		playerVsComputer.setOnAction(handler);
	}
	
	public void setComputerVsComputerOnAction(EventHandler<ActionEvent> handler) {
		computerVsComputer.setOnAction(handler);
	}
	
	public void setRockButtonOnAction(EventHandler<ActionEvent> handler) {
		rockButton.setOnAction(handler);
	}
	
	public void setPaperButtonOnAction(EventHandler<ActionEvent> handler) {
		paperButton.setOnAction(handler);
	}
	
	public void setScissorsButtonOnAction(EventHandler<ActionEvent> handler) {
		scissorsButton.setOnAction(handler);
	}
	
	public void setRandomButtonOnAction(EventHandler<ActionEvent> handler) {
		randomButton.setOnAction(handler);
	}
	
	public void setFixedButtonOnAction(EventHandler<ActionEvent> handler) {
		fixedButton.setOnAction(handler);
	}
	
	public void setRotationButtonOnAction(EventHandler<ActionEvent> handler) {
		rotationButton.setOnAction(handler);
	}
	
	/**
	 * Can change whether or not the Player vs Computer check box is selected
	 * 
	 * @param selected
	 */
	public void setPlayerVsComputerSelected(boolean selected) {
		playerVsComputer.setSelected(selected);
	}

	/**
	 * Can change whether or not the Computer vs Computer check box is selected
	 * 
	 * @param selected
	 */
	public void setComputerVsComputerSelected(boolean selected) {
		computerVsComputer.setSelected(selected);
	}

	/**
	 * Can show or hide choose weapon text to user
	 * 
	 * @param visible
	 */
	public void setChooseWeaponVisible(boolean visible) {
		chooseWeapon.setVisible(visible);
	}

	/**
	 * Can show or hide rock button to user
	 * 
	 * @param visible
	 */
	public void setRockButtonVisible(boolean visible) {
		rockButton.setVisible(visible);
	}

	/**
	 * Can show or hide paper button to user
	 * 
	 * @param visible
	 */
	public void setPaperButtonVisible(boolean visible) {
		paperButton.setVisible(visible);
	}

	/**
	 * Can show or hide scissors button to user
	 * 
	 * @param visible
	 */
	public void setScissorsButtonVisible(boolean visible) {
		scissorsButton.setVisible(visible);
	}
	
	/**
	 * Can show or hide choose strategy text to user
	 * 
	 * @param visible
	 */
	public void setChooseStrategyVisible(boolean visible) {
		chooseStrategy.setVisible(visible);
	}

	/**
	 * Can show or hide random button to user
	 * 
	 * @param visible
	 */
	public void setRandomButtonVisible(boolean visible) {
		randomButton.setVisible(visible);
	}

	/**
	 * Can show or hide fixed button to user
	 * 
	 * @param visible
	 */
	public void setFixedButtonVisible(boolean visible) {
		fixedButton.setVisible(visible);
	}

	/**
	 * Can show or hide rotation button to user
	 * 
	 * @param visible
	 */
	public void setRotationButtonVisible(boolean visible) {
		rotationButton.setVisible(visible);
	}

	/**
	 * @param playerScore text to show user player's score
	 */
	public void setPlayerScore(String playerScore) {
		scoreText.setText(playerScore);
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
	}
	
	/**
	 * Human Player result is shown during Player vs Computer mode
	 */
	public void showHumanResult() {
		resultText.setText(humanResult);
	}

	/**
	 * Computer Player result is shown during Computer vs Computer mode
	 */
	public void showComputerResult() {
		resultText.setText(computerResult);
	}
}