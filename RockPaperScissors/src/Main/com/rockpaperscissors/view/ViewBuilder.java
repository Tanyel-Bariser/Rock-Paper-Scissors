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
 * Builds and sets up all dependencies required for RPSView
 * Allows optional injection for as many or few of RPSView's dependencies
 * 
 * @author Tanyel Bariser
 */
public class ViewBuilder {
	CheckBox playerVsComputer = new CheckBox("Player vs Computer");
	CheckBox computerVsComputer = new CheckBox("Computer vs Computer");
	Text chooseWeapon = new Text("Choose Your Weapon");
	Text chooseStrategy = new Text("Choose Your Computer's Strategy");
	Text resultText = new Text();
	Text scoreText = new Text();
	Button rockButton = new Button("Rock");
	Button paperButton = new Button("Paper");
	Button scissorsButton = new Button("Scissors");
	Button randomButton = new Button("Random");
	Button fixedButton = new Button("Fixed");
	Button rotationButton = new Button("Rotation");
	private final Pane pane = new Pane();
	private final Stage stage;

	private final int FONT_SIZE = 32;
	private final int RESULTS_FONT_SIZE = 20;
	private final int CHOOSE_Y_POSITION = 170;
	private final int BUTTON_Y_POSITION = 190;
	private final int RESULT_Y_POSITION = 340;

	
	public static View createRPSView(Stage stage) {
		ViewBuilder builder = new ViewBuilder(stage);
		builder.addAllToPane();
		builder.buildStage();
		return new RPSView(builder);
	}
	
	private ViewBuilder(Stage stage) {
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
	}

	/**
	 * Sets up check box for Player vs Computer mode
	 */
	private void buildPlayerVsComputer() {
		playerVsComputer.setFont(Font.font(FONT_SIZE));
		playerVsComputer.setSelected(true);
		playerVsComputer.setLayoutX(5);
		playerVsComputer.setLayoutY(5);
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

	
	/****************************************************************
	 * The following methods allow optional injection of as many or *
	 * few of RPSView's dependencies as desired via method chaining.*
	 ***************************************************************/
	/**
	 * @return an instance of ViewBuilder
	 */
	public static ViewBuilder createViewBuilder(Stage stage) {
		return new ViewBuilder(stage);
	}
	
	/**
	 * @param playerVsComputer check box required for RPSView
	 * @return same instance of ViewBuilder
	 */
	public ViewBuilder playerVsComputer(CheckBox playerVsComputer) {
		this.playerVsComputer = playerVsComputer;
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
	 * Checks to makes sure all arguments required for RPSView have be gathered
	 * Then builds RPSView and returns it
	 * 
	 * @return instance of RPSView
	 */
	public View build() {
		checkForNullArgs();
		addAllToPane();
		buildStage();
		return new RPSView(this);
	}

	/**
	 * Checks that each dependency has be assigned correctly
	 * @throws NullPoinerException
	 */
	private void checkForNullArgs() {
		if (playerVsComputer == null) {
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