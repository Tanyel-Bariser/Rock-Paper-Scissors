package com.rockpaperscissors.view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Builds and sets up dependencies required for RPSView
 * 
 * @author Tanyel Bariser
 */
public class RPSViewBuilder {
	final CheckBox playerVsComputer = new CheckBox("Player vs Computer");
	final CheckBox computerVsComputer = new CheckBox("Computer vs Computer");
	final Text chooseWeapon = new Text("Choose Your Weapon");
	final Text chooseStrategy = new Text("Choose Your Computer's Strategy");
	final Text resultText = new Text();
	final Text scoreText = new Text();
	Button rockButton = new Button("Rock");
	Button paperButton = new Button("Paper");
	Button scissorsButton = new Button("Scissors");
	Button randomButton = new Button("Random");
	Button fixedButton = new Button("Fixed");
	Button rotationButton = new Button("Rotation");
	final Pane pane = new Pane();
	private final Stage stage;

	// X and Y positions of GUI components and font sizes
	static final Color COLOUR = Color.BLUE;
	static final int LEFT_EDGE = 5;
	static final int BUTTON_Y = 190;
	static final int RESULT_Y = 340;
	static final int CHOOSE_TEXT_Y = 170;
	static final int PLAYER_Y = 5;
	static final int COMPUTER_Y = 55;
	static final int WEAPON_X = 165;
	static final int ROCK_X = 75;
	static final int PAPER_X = 245;
	static final int SCISSORS_X = 425;
	static final int STRATEGY_X = 85;
	static final int RANDOM_X = 60;
	static final int FIXED_X = 265;
	static final int ROTATION_X = 425;
	static final int SCORE_X = 365;
	static final int FONT_SIZE = 32;
	static final int RESULTS_SIZE = 20;

	public static View getRPSView(Stage stage) {
		RPSViewBuilder builder = new RPSViewBuilder(stage);
		builder.buildStage();
		return new RPSView(builder);
	}
	
	RPSViewBuilder(Stage stage) {
		this.stage = stage;
		buildViewComponents();
	}
	
	/**
	 * Invokes all methods required to build all GUI components
	 */
	private void buildViewComponents() {
		buildPlayerVsComputer();
		buildComputerVsComputer();
		buildChooseWeaponText();
		buildRockButton();
		buildPaperButton();
		buildScissorsButton();
		buildChooseStategyText();
		buildRandomButton();
		buildFixedButton();
		buildRotationButton();
		buildResultsText();
		buildScoreText();
		addAllToPane();
	}

	/**
	 * Sets up check box for Player vs Computer mode
	 */
	private void buildPlayerVsComputer() {
		playerVsComputer.setFont(Font.font(FONT_SIZE));
		playerVsComputer.setLayoutX(LEFT_EDGE);
		playerVsComputer.setLayoutY(PLAYER_Y);
		playerVsComputer.setSelected(true);
		playerVsComputer.setId("player");
	}

	/**
	 * Sets up check box for Computer vs Computer mode
	 */
	private void buildComputerVsComputer() {
		computerVsComputer.setFont(Font.font(FONT_SIZE));
		computerVsComputer.setLayoutX(LEFT_EDGE);
		computerVsComputer.setLayoutY(COMPUTER_Y);
		computerVsComputer.setId("computer");
	}

	/**
	 * Sets up text node to ask user which weapon they want to choose
	 */
	private void buildChooseWeaponText() {
		chooseWeapon.setFont(Font.font(FONT_SIZE));
		chooseWeapon.setFill(COLOUR);
		chooseWeapon.setLayoutX(WEAPON_X);
		chooseWeapon.setLayoutY(CHOOSE_TEXT_Y);
		chooseWeapon.setId("weapon");
	}

	/**
	 * Sets up button to allow user to choose the rock weapon
	 */
	private void buildRockButton() {
		rockButton.setFont(Font.font(FONT_SIZE));
		rockButton.setTextFill(COLOUR);
		rockButton.setLayoutX(ROCK_X);
		rockButton.setLayoutY(BUTTON_Y);
		rockButton.setId("rock");
	}

	/**
	 * Sets up button to allow user to choose the paper weapon
	 */
	private void buildPaperButton() {
		paperButton.setFont(Font.font(FONT_SIZE));
		paperButton.setTextFill(COLOUR);
		paperButton.setLayoutX(PAPER_X);
		paperButton.setLayoutY(BUTTON_Y);
		paperButton.setId("paper");
	}

	/**
	 * Sets up button to allow user to choose the scissors weapon
	 */
	private void buildScissorsButton() {
		scissorsButton.setFont(Font.font(FONT_SIZE));
		scissorsButton.setTextFill(COLOUR);
		scissorsButton.setLayoutX(SCISSORS_X);
		scissorsButton.setLayoutY(BUTTON_Y);
		scissorsButton.setId("scissors");
	}

	/**
	 * Sets up text node to ask user which strategy
	 * to choose for their computer player
	 */
	private void buildChooseStategyText() {
		chooseStrategy.setFont(Font.font(FONT_SIZE));
		chooseStrategy.setFill(COLOUR);
		chooseStrategy.setLayoutX(STRATEGY_X);
		chooseStrategy.setLayoutY(CHOOSE_TEXT_Y);
		chooseStrategy.setId("strategy");
	}

	/**
	 * Sets up button to allow user to choose the random strategy
	 */	
	private void buildRandomButton() {
		randomButton.setFont(Font.font(FONT_SIZE));
		randomButton.setTextFill(COLOUR);
		randomButton.setLayoutX(RANDOM_X);
		randomButton.setLayoutY(BUTTON_Y);
		randomButton.setId("random");
	}

	/**
	 * Sets up button to allow user to choose the fixed strategy
	 */	
	private void buildFixedButton() {
		fixedButton.setFont(Font.font(FONT_SIZE));
		fixedButton.setTextFill(COLOUR);
		fixedButton.setLayoutX(FIXED_X);
		fixedButton.setLayoutY(BUTTON_Y);
		fixedButton.setId("fixed");
	}

	/**
	 * Sets up button to allow user to choose the rotation strategy
	 */	
	private void buildRotationButton() {
		rotationButton.setFont(Font.font(FONT_SIZE));
		rotationButton.setTextFill(COLOUR);
		rotationButton.setLayoutX(ROTATION_X);
		rotationButton.setLayoutY(BUTTON_Y);
		rotationButton.setId("rotation");
	}

	/**
	 * Sets up text node to show user the results of the most recent game
	 */
	private void buildResultsText() {
		resultText.setFont(Font.font(RESULTS_SIZE));
		resultText.setFill(COLOUR);
		resultText.setLayoutX(LEFT_EDGE);
		resultText.setLayoutY(RESULT_Y);
		resultText.setId("result");
	}

	/**
	 * Sets up text node to show user the score for the specific player
	 */
	private void buildScoreText() {
		scoreText.setFont(Font.font(RESULTS_SIZE));
		scoreText.setFill(COLOUR);
		scoreText.setLayoutX(SCORE_X);
		scoreText.setLayoutY(RESULT_Y);
		scoreText.setId("score");
	}

	/**
	 * Sets up Pane, which stores all GUI components
	 */
	private void addAllToPane() {
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

	/**
	 * Sets up the stage, which is top level JavaFX container for GUI
	 */
	private void buildStage() {
		int width = 640, height = 420;
		stage.setScene(new Scene(pane, width, height));
		stage.setTitle("Waste an Hour Having Fun");
		stage.setResizable(false);
		stage.show();
	}
}