package com.rockpaperscissors.view;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Text;

import com.rockpaperscissors.eventhandlers.ComputerVsComputerEvent;
import com.rockpaperscissors.eventhandlers.FixedButtonEvent;
import com.rockpaperscissors.eventhandlers.PaperButtonEvent;
import com.rockpaperscissors.eventhandlers.PlayerVsComputerEvent;
import com.rockpaperscissors.eventhandlers.RandomButtonEvent;
import com.rockpaperscissors.eventhandlers.RockButtonEvent;
import com.rockpaperscissors.eventhandlers.RotationButtonEvent;
import com.rockpaperscissors.eventhandlers.ScissorsButtonEvent;
import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.player.HumanPlayer;

/**
 * Contains all GUI components the game requires
 * 
 * @author Tanyel Bariser
 */
public class RPSView implements View {
	final CheckBox playerVsComputer, computerVsComputer;
	final Text chooseWeapon, chooseStrategy, resultText, scoreText;
	final Button rockButton, paperButton, scissorsButton;
	final Button randomButton, fixedButton, rotationButton;
	String humanResult = null;
	String computerResult = null;

	/**
	 * Package-private constructor only visible to RPSViewBuilder
	 * 
	 * @param builder containing RPSView's dependencies
	 */
	RPSView(RPSViewBuilder builder) {
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
		setPlayerVsComputerMode();
	}
	
	@Override
	public void buildPlayerVsComputerEventHandlers(HumanPlayer humanPlayer, ComputerOpponent opponent) {
		playerVsComputer.setOnAction(
				PlayerVsComputerEvent.getHandler(this, (HumanPlayer) humanPlayer));
		rockButton.setOnAction(
				RockButtonEvent.getHandler((HumanPlayer) humanPlayer, opponent));
		paperButton.setOnAction(
				PaperButtonEvent.getHandler((HumanPlayer) humanPlayer, opponent));
		scissorsButton.setOnAction(
				ScissorsButtonEvent.getHandler((HumanPlayer) humanPlayer, opponent));
	}
	
	@Override
	public void buildComputerVsComputerEventHandlers(ComputerPlayer computerPlayer, ComputerOpponent opponent) {
		computerVsComputer.setOnAction(
				ComputerVsComputerEvent.getHandler(this, (ComputerPlayer) computerPlayer));
		randomButton.setOnAction(
				RandomButtonEvent.getHandler((ComputerPlayer) computerPlayer, opponent));
		fixedButton.setOnAction(
				FixedButtonEvent.getHandler((ComputerPlayer) computerPlayer, opponent));
		rotationButton.setOnAction(
				RotationButtonEvent.getHandler((ComputerPlayer) computerPlayer, opponent));	
		
	}
	
	@Override
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
	
	@Override
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
	@Override
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
	@Override
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
	@Override
	public void setPlayerScore(String playerScore) {
		scoreText.setText(playerScore);
	}
}