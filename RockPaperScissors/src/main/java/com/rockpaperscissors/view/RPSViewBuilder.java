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
 * IMPORTANT: All code using the JavaFX 8 API are currently in need of unit tests!
 * 
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
	final Button rockButton = new Button("Rock");
	final Button paperButton = new Button("Paper");
	final Button scissorsButton = new Button("Scissors");
	final Button randomButton = new Button("Random");
	final Button fixedButton = new Button("Fixed");
	final Button rotationButton = new Button("Rotation");
	final Pane pane = new Pane();
	private final Stage stage;

	private final int FONT_SIZE = 32;
	private final int RESULTS_FONT_SIZE = 20;
	private final int CHOOSE_Y_POSITION = 170;
	private final int BUTTON_Y_POSITION = 190;
	private final int RESULT_Y_POSITION = 340;

	
	public static View getRPSView(Stage stage) {
		return new RPSView(new RPSViewBuilder(stage));
	}
	
	private RPSViewBuilder(Stage stage) {
		this.stage = stage;
		buildViewComponents();
	}
	
	/**
	 * @return an instance of ViewBuilder (being used for unit testing)
	 */
	static RPSViewBuilder getRPSViewBuilder(Stage stage) {
		return new RPSViewBuilder(stage);
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
		buildStage();
	}

	/**
	 * Sets up check box for Player vs Computer mode
	 */
	private void buildPlayerVsComputer() {
		playerVsComputer.setFont(Font.font(FONT_SIZE));
		playerVsComputer.setLayoutX(5);
		playerVsComputer.setLayoutY(5);
		playerVsComputer.setSelected(true);
		playerVsComputer.setId("PvC");
	}

	/**
	 * Sets up check box for Computer vs Computer mode
	 */
	private void buildComputerVsComputer() {
		computerVsComputer.setFont(Font.font(FONT_SIZE));
		computerVsComputer.setLayoutX(5);
		computerVsComputer.setLayoutY(55);
		computerVsComputer.setSelected(false);
	}

	/**
	 * Sets up text node to ask user which weapon they want to choose
	 */
	private void buildChooseWeaponText() {
		chooseWeapon.setFont(Font.font(FONT_SIZE));
		chooseWeapon.setFill(Color.BLUE);
		chooseWeapon.setLayoutX(165);
		chooseWeapon.setLayoutY(CHOOSE_Y_POSITION);
	}

	/**
	 * Sets up button to allow user to choose the rock weapon
	 */
	private void buildRockButton() {
		rockButton.setFont(Font.font(FONT_SIZE));
		rockButton.setTextFill(Color.BLUE);
		rockButton.setLayoutX(75);
		rockButton.setLayoutY(BUTTON_Y_POSITION);
	}

	/**
	 * Sets up button to allow user to choose the paper weapon
	 */
	private void buildPaperButton() {
		paperButton.setFont(Font.font(FONT_SIZE));
		paperButton.setTextFill(Color.BLUE);
		paperButton.setLayoutX(245);
		paperButton.setLayoutY(BUTTON_Y_POSITION);
	}

	/**
	 * Sets up button to allow user to choose the scissors weapon
	 */
	private void buildScissorsButton() {
		scissorsButton.setFont(Font.font(FONT_SIZE));
		scissorsButton.setTextFill(Color.BLUE);
		scissorsButton.setLayoutX(425);
		scissorsButton.setLayoutY(BUTTON_Y_POSITION);
	}

	/**
	 * Sets up text node to ask user which strategy
	 * to choose for their computer player
	 */
	private void buildChooseStategyText() {
		chooseStrategy.setFont(Font.font(FONT_SIZE));
		chooseStrategy.setFill(Color.BLUE);
		chooseStrategy.setLayoutX(85);
		chooseStrategy.setLayoutY(CHOOSE_Y_POSITION);
		chooseStrategy.setVisible(false);
	}

	/**
	 * Sets up button to allow user to choose the random strategy
	 */	
	private void buildRandomButton() {
		randomButton.setFont(Font.font(FONT_SIZE));
		randomButton.setTextFill(Color.BLUE);
		randomButton.setLayoutX(60);
		randomButton.setLayoutY(BUTTON_Y_POSITION);
		randomButton.setVisible(false);
	}

	/**
	 * Sets up button to allow user to choose the fixed strategy
	 */	
	private void buildFixedButton() {
		fixedButton.setFont(Font.font(FONT_SIZE));
		fixedButton.setTextFill(Color.BLUE);
		fixedButton.setLayoutX(265);
		fixedButton.setLayoutY(BUTTON_Y_POSITION);
		fixedButton.setVisible(false);
	}

	/**
	 * Sets up button to allow user to choose the rotation strategy
	 */	
	private void buildRotationButton() {
		rotationButton.setFont(Font.font(FONT_SIZE));
		rotationButton.setTextFill(Color.BLUE);
		rotationButton.setLayoutX(425);
		rotationButton.setLayoutY(BUTTON_Y_POSITION);
		rotationButton.setVisible(false);
	}

	/**
	 * Sets up text node to show user the results of the most recent game
	 */
	private void buildResultsText() {
		resultText.setFont(Font.font(RESULTS_FONT_SIZE));
		resultText.setFill(Color.BLUE);
		resultText.setLayoutX(5);
		resultText.setLayoutY(RESULT_Y_POSITION);
	}

	/**
	 * Sets up text node to show user the score for the specific player
	 */
	private void buildScoreText() {
		scoreText.setFont(Font.font(RESULTS_FONT_SIZE));
		scoreText.setFill(Color.BLUE);
		scoreText.setLayoutX(365);
		scoreText.setLayoutY(RESULT_Y_POSITION);
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