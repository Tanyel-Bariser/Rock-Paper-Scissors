package com.rockpaperscissors.view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.player.HumanPlayer;

public class RPSView {
	private final RPSController controller;
	private final CheckBox playerVsComputer, computerVsComputer;
	private final Text chooseWeapon, chooseStrategy, resultText, scoreText;
	private final Button rockButton, paperButton, scissorsButton;
	private final Button randomButton, fixedButton, rotationButton;
	private final Stage stage;
	private final Pane pane = new Pane();
	// Event handlers only accept exact subtypes of Player for type safety
	private final HumanPlayer humanPlayer = new HumanPlayer(this, new Score());
	private final ComputerPlayer computerPlayer = new ComputerPlayer(this, new Score());
	private final int FONT_SIZE = 32;
	private final int RESULTS_FONT_SIZE = 20;
	private final int TEXT_Y_POSITION = 170;
	private final int BUTTON_Y_POSITION = 190;
	private final int RESULT_Y_POSITION = 340;
	private String humanResult = null;
	private String computerResult = null;

	/**
	 * Package-private constructor only visible to ViewBuilder
	 * Sets dependencies and invokes buildView() to build view's components
	 * 
	 * @param builder
	 */
	RPSView(ViewBuilder builder) {
		controller = builder.controller;
		controller.setPlayer(humanPlayer);
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
		stage = builder.stage;
		buildView();
	}

	private void buildView() {
		buildPlayerVsComputer(playerVsComputer);
		buildComputerVsComputer(computerVsComputer);
		buildChooseWeaponText(chooseWeapon);
		buildRockButton(rockButton);
		buildPaperButton(paperButton);
		buildScissorsButton(scissorsButton);
		buildChooseStategyText(chooseStrategy);
		buildRandomButton(randomButton);
		buildFixedButton(fixedButton);
		buildRotationButton(rotationButton);
		buildResultsText(resultText);
		buildScoreText(scoreText);
		buildPane();
		buildStage(stage);
	}

	private void buildPlayerVsComputer(CheckBox playerVsComputer) {
		playerVsComputer.setFont(Font.font(FONT_SIZE));
		PlayerVsComputerEvent event = new PlayerVsComputerEvent(this,
				controller, humanPlayer);
		playerVsComputer.setOnAction(event.HANDLE);
		playerVsComputer.setSelected(true);
		playerVsComputer.setLayoutX(5);
		playerVsComputer.setLayoutY(5);
	}

	private void buildComputerVsComputer(CheckBox computerVsComputer) {
		computerVsComputer.setFont(Font.font(FONT_SIZE));
		ComputerVsComputerEvent event = new ComputerVsComputerEvent(this,
				controller, computerPlayer);
		computerVsComputer.setOnAction(event.HANDLE);
		computerVsComputer.setLayoutX(5);
		computerVsComputer.setLayoutY(55);
	}

	private void buildChooseWeaponText(Text chooseWeapon) {
		chooseWeapon.setFont(Font.font(FONT_SIZE));
		chooseWeapon.setFill(Color.BLUE);
		chooseWeapon.setLayoutX(165);
		chooseWeapon.setLayoutY(TEXT_Y_POSITION);
	}

	private void buildRockButton(Button rockButton) {
		rockButton.setFont(Font.font(FONT_SIZE));
		rockButton.setTextFill(Color.BLUE);
		RockButtonEvent event = new RockButtonEvent(controller, humanPlayer);
		rockButton.setOnAction(event.HANDLE);
		rockButton.setLayoutX(75);
		rockButton.setLayoutY(BUTTON_Y_POSITION);
	}

	private void buildPaperButton(Button paperButton) {
		paperButton.setFont(Font.font(FONT_SIZE));
		paperButton.setTextFill(Color.BLUE);
		PaperButtonEvent event = new PaperButtonEvent(controller, humanPlayer);
		paperButton.setOnAction(event.HANDLE);
		paperButton.setLayoutX(245);
		paperButton.setLayoutY(BUTTON_Y_POSITION);
	}

	private void buildScissorsButton(Button scissorsButton) {
		scissorsButton.setFont(Font.font(FONT_SIZE));
		scissorsButton.setTextFill(Color.BLUE);
		ScissorsButtonEvent event = new ScissorsButtonEvent(controller, humanPlayer);
		scissorsButton.setOnAction(event.HANDLE);
		scissorsButton.setLayoutX(425);
		scissorsButton.setLayoutY(BUTTON_Y_POSITION);
	}

	private void buildChooseStategyText(Text chooseStrategy) {
		chooseStrategy.setFont(Font.font(FONT_SIZE));
		chooseStrategy.setFill(Color.BLUE);
		chooseStrategy.setLayoutX(85);
		chooseStrategy.setLayoutY(TEXT_Y_POSITION);
		chooseStrategy.setVisible(false);
	}

	private void buildRandomButton(Button randomButton) {
		randomButton.setFont(Font.font(FONT_SIZE));
		randomButton.setTextFill(Color.BLUE);
		RandomButtonEvent event = new RandomButtonEvent(controller, computerPlayer);
		randomButton.setOnAction(event.HANDLE);
		randomButton.setLayoutX(60);
		randomButton.setLayoutY(BUTTON_Y_POSITION);
		randomButton.setVisible(false);
	}

	private void buildFixedButton(Button fixedButton) {
		fixedButton.setFont(Font.font(FONT_SIZE));
		fixedButton.setTextFill(Color.BLUE);
		FixedButtonEvent event = new FixedButtonEvent(controller, computerPlayer);
		fixedButton.setOnAction(event.HANDLE);
		fixedButton.setLayoutX(265);
		fixedButton.setLayoutY(BUTTON_Y_POSITION);
		fixedButton.setVisible(false);
	}

	private void buildRotationButton(Button rotationButton) {
		rotationButton.setFont(Font.font(FONT_SIZE));
		rotationButton.setTextFill(Color.BLUE);
		RotationButtonEvent event = new RotationButtonEvent(controller, computerPlayer);
		rotationButton.setOnAction(event.HANDLE);
		rotationButton.setLayoutX(425);
		rotationButton.setLayoutY(BUTTON_Y_POSITION);
		rotationButton.setVisible(false);
	}

	private void buildResultsText(Text result) {
		result.setFont(Font.font(RESULTS_FONT_SIZE));
		result.setFill(Color.BLUE);
		result.setLayoutX(5);
		result.setLayoutY(RESULT_Y_POSITION);
	}

	private void buildScoreText(Text score) {
		score.setFont(Font.font(RESULTS_FONT_SIZE));
		score.setFill(Color.BLUE);
		score.setLayoutX(365);
		score.setLayoutY(RESULT_Y_POSITION);
	}

	private void buildPane() {
		pane.getChildren().add(playerVsComputer);
		pane.getChildren().add(computerVsComputer);
		pane.getChildren().add(chooseWeapon);
		pane.getChildren().add(rockButton);
		pane.getChildren().add(paperButton);
		pane.getChildren().add(scissorsButton);
		pane.getChildren().add(chooseStrategy);
		pane.getChildren().add(randomButton);
		pane.getChildren().add(fixedButton);
		pane.getChildren().add(rotationButton);
		pane.getChildren().add(resultText);
		pane.getChildren().add(scoreText);
	}

	private void buildStage(Stage stage) {
		int width = 640, height = 420;
		stage.setScene(new Scene(pane, width, height));
		stage.setTitle("Waste an Hour Having Fun");
		stage.setResizable(false);
		stage.show();
	}

	public void setPlayerVsComputerSelected(boolean selected) {
		playerVsComputer.setSelected(selected);
	}

	public void setComputerVsComputerSelected(boolean selected) {
		computerVsComputer.setSelected(selected);
	}

	public void setChooseWeaponVisible(boolean visible) {
		chooseWeapon.setVisible(visible);
	}

	public void setRockButtonVisible(boolean visible) {
		rockButton.setVisible(visible);
	}

	public void setPaperButtonVisible(boolean visible) {
		paperButton.setVisible(visible);
	}

	public void setScissorsButtonVisible(boolean visible) {
		scissorsButton.setVisible(visible);
	}

	public void setChooseStrategyVisible(boolean visible) {
		chooseStrategy.setVisible(visible);
	}

	public void setRandomButtonVisible(boolean visible) {
		randomButton.setVisible(visible);
	}

	public void setFixedButtonVisible(boolean visible) {
		fixedButton.setVisible(visible);
	}

	public void setRotationButtonVisible(boolean visible) {
		rotationButton.setVisible(visible);
	}

	public void setPlayerScore(String playerScore) {
		scoreText.setText(playerScore);
	}

	public void setHumanPlayerResult(Weapon playerWeapon, Weapon opponentWeapon,
			Result result) {
		humanResult = "You chose " + playerWeapon.name() + "\n";
		humanResult += "Computer Opponent chose " + opponentWeapon.name() + "\n";
		humanResult += "You " + result.name();
	}
	
	public void setComputerPlayerResult(Weapon playerWeapon, Weapon opponentWeapon,
			Result result) {
		computerResult = "Your Computer chose " + playerWeapon.name() + "\n";
		computerResult += "Computer Opponent chose " + opponentWeapon.name() + "\n";
		computerResult += "Your Computer " + result.name();
	}
	
	public void showHumanResult() {
		resultText.setText(humanResult);
	}
	
	public void showComputerResult() {
		resultText.setText(computerResult);
	}
}