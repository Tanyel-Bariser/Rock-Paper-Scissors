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
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.player.HumanPlayer;
import com.rockpaperscissors.model.player.Player;

/**
 * Builds and sets up all dependencies required for RPSView
 * Allows optional injection for as many or few of RPSView's dependencies
 * 
 * @author Tanyel Bariser
 */
public class ViewBuilder {
	// Initialises default dependencies of RPSView
	RPSController controller = new RPSController();
	private Player humanPlayer = new HumanPlayer();
	private Player computerPlayer = new ComputerPlayer();
	private final int FONT_SIZE = 32;
	private final int RESULTS_FONT_SIZE = 20;
	private final int TEXT_Y_POSITION = 170;
	private final int BUTTON_Y_POSITION = 190;
	private final int RESULT_Y_POSITION = 340;
	// GUI components
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
	
	public static RPSView createDefaultView(Stage stage) {
		ViewBuilder builder = new ViewBuilder(stage);
		builder.build();
		return new RPSView(builder);
	}
	
	private ViewBuilder(Stage stage) {
		this.stage = stage;
	}

	/**
	 * Invokes all methods required to build all GUI components
	 */
	private void buildView() {
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
		buildPane();
		buildStage();
	}

	/**
	 * Sets up check box for Player vs Computer mode
	 */
	private void buildPlayerVsComputer() {
		playerVsComputer.setFont(Font.font(FONT_SIZE));
		PlayerVsComputerEvent event = new PlayerVsComputerEvent(controller, (HumanPlayer) humanPlayer);
		playerVsComputer.setOnAction(event.HANDLE);
		playerVsComputer.setSelected(true);
		playerVsComputer.setLayoutX(5);
		playerVsComputer.setLayoutY(5);
		playerVsComputer.setSelected(false);
	}

	/**
	 * Sets up check box for Computer vs Computer mode
	 */
	private void buildComputerVsComputer() {
		computerVsComputer.setFont(Font.font(FONT_SIZE));
		ComputerVsComputerEvent event = new ComputerVsComputerEvent(controller, (ComputerPlayer) computerPlayer);
		computerVsComputer.setOnAction(event.HANDLE);
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
		chooseWeapon.setLayoutY(TEXT_Y_POSITION);
		chooseWeapon.setVisible(false);
	}

	/**
	 * Sets up button to allow user to choose the rock weapon
	 */
	private void buildRockButton() {
		rockButton.setFont(Font.font(FONT_SIZE));
		rockButton.setTextFill(Color.BLUE);
		RockButtonEvent event = new RockButtonEvent(controller,
				(HumanPlayer) humanPlayer);
		rockButton.setOnAction(event.HANDLE);
		rockButton.setLayoutX(75);
		rockButton.setLayoutY(BUTTON_Y_POSITION);
		rockButton.setVisible(false);
	}

	/**
	 * Sets up button to allow user to choose the paper weapon
	 */
	private void buildPaperButton() {
		paperButton.setFont(Font.font(FONT_SIZE));
		paperButton.setTextFill(Color.BLUE);
		PaperButtonEvent event = new PaperButtonEvent(controller,
				(HumanPlayer) humanPlayer);
		paperButton.setOnAction(event.HANDLE);
		paperButton.setLayoutX(245);
		paperButton.setLayoutY(BUTTON_Y_POSITION);
		paperButton.setVisible(false);
	}

	/**
	 * Sets up button to allow user to choose the scissors weapon
	 */
	private void buildScissorsButton() {
		scissorsButton.setFont(Font.font(FONT_SIZE));
		scissorsButton.setTextFill(Color.BLUE);
		ScissorsButtonEvent event = new ScissorsButtonEvent(controller,
				(HumanPlayer) humanPlayer);
		scissorsButton.setOnAction(event.HANDLE);
		scissorsButton.setLayoutX(425);
		scissorsButton.setLayoutY(BUTTON_Y_POSITION);
		scissorsButton.setVisible(false);
	}

	/**
	 * Sets up text node to ask user which strategy
	 * to choose for their computer player
	 */
	private void buildChooseStategyText() {
		chooseStrategy.setFont(Font.font(FONT_SIZE));
		chooseStrategy.setFill(Color.BLUE);
		chooseStrategy.setLayoutX(85);
		chooseStrategy.setLayoutY(TEXT_Y_POSITION);
		chooseStrategy.setVisible(false);
		chooseStrategy.setVisible(false);
	}

	/**
	 * Sets up button to allow user to choose the random strategy
	 */	
	private void buildRandomButton() {
		randomButton.setFont(Font.font(FONT_SIZE));
		randomButton.setTextFill(Color.BLUE);
		RandomButtonEvent event = new RandomButtonEvent(controller, (ComputerPlayer) computerPlayer);
		randomButton.setOnAction(event.HANDLE);
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
		FixedButtonEvent event = new FixedButtonEvent(controller, (ComputerPlayer) computerPlayer);
		fixedButton.setOnAction(event.HANDLE);
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
		RotationButtonEvent event = new RotationButtonEvent(controller, (ComputerPlayer) computerPlayer);
		rotationButton.setOnAction(event.HANDLE);
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
	 * @param controller dependency required for RPSView
	 * @return same instance of ViewBuilder
	 */
	public ViewBuilder controller(RPSController controller) {
		this.controller = controller;
		return this;
	}
	
	/**
	 * @param humanPlayer allows manual choice of weapon by user
	 * @return same instance of ViewBuilder
	 */
	public ViewBuilder humanPlayer(HumanPlayer humanPlayer) {
		this.humanPlayer = humanPlayer;
		return this;
	}

	/**
	 * @param computerPlayer allows user choice of strategy to choose weapon
	 * @return same instance of ViewBuilder
	 */
	public ViewBuilder computerPlayer(ComputerPlayer computerPlayer) {
		this.computerPlayer = computerPlayer;
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
	 * Checks to makes sure all arguments required for RPSView have be gathered
	 * Then builds RPSView and returns it
	 * 
	 * @return instance of RPSView
	 */
	public RPSView build() {
		checkForNullArgs();
		buildView();
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