package com.rockpaperscissors.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import com.rockpaperscissors.controller.RPSController;
import com.rockpaperscissors.controller.events.PlayerVsComputerEvent;
import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.HumanPlayer;
import com.rockpaperscissors.model.strategies.FixedStrategy;
import com.rockpaperscissors.model.strategies.RandomStrategy;
import com.rockpaperscissors.model.strategies.RotationStrategy;

public class RPSView {
	private final RPSController controller;
	private final CheckBox playerVsComputer, computerVsComputer;
	private final Text chooseWeapon, chooseStrategy;
	private final Button rockButton, paperButton, scissorsButton;
	private final Button randomButton, fixedButton, rotationButton;
	private final Stage stage;
	private final Pane pane = new Pane();
	private final int FONT_SIZE = 32;
	private final int TEXT_Y_POSITION = 170;
	private final int BUTTON_Y_POSITION = 190;

	RPSView(ViewBuilder builder) {
		controller = builder.controller;
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
		buildPane();
		buildStage(stage);
	}

	private void buildPlayerVsComputer(CheckBox playerVsComputer) {
		playerVsComputer.setFont(Font.font(FONT_SIZE));
		PlayerVsComputerEvent event = new PlayerVsComputerEvent(
				this, controller, new HumanPlayer(this, new Score()));
		playerVsComputer.setOnAction(event.HANDLE);
		playerVsComputer.setSelected(true);
		playerVsComputer.setLayoutX(5);
		playerVsComputer.setLayoutY(5);
	}

	private void buildComputerVsComputer(CheckBox computerVsComputer) {
		computerVsComputer.setFont(Font.font(FONT_SIZE));
		computerVsComputer.setOnAction(COMPUTER_VS_COMPUTER_EVENT);
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
		rockButton.setOnAction(ROCK_EVENT);
		rockButton.setLayoutX(75);
		rockButton.setLayoutY(BUTTON_Y_POSITION);
	}

	private void buildPaperButton(Button paperButton) {
		paperButton.setFont(Font.font(FONT_SIZE));
		paperButton.setTextFill(Color.BLUE);
		paperButton.setOnAction(PAPER_EVENT);
		paperButton.setLayoutX(245);
		paperButton.setLayoutY(BUTTON_Y_POSITION);
	}

	private void buildScissorsButton(Button scissorsButton) {
		scissorsButton.setFont(Font.font(FONT_SIZE));
		scissorsButton.setTextFill(Color.BLUE);
		scissorsButton.setOnAction(SCISSORS_EVENT);
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
		randomButton.setOnAction(RANDOM_EVENT);
		randomButton.setLayoutX(60);
		randomButton.setLayoutY(BUTTON_Y_POSITION);
		randomButton.setVisible(false);
	}

	private void buildFixedButton(Button fixedButton) {
		fixedButton.setFont(Font.font(FONT_SIZE));
		fixedButton.setTextFill(Color.BLUE);
		fixedButton.setOnAction(FIXED_EVENT);
		fixedButton.setLayoutX(265);
		fixedButton.setLayoutY(BUTTON_Y_POSITION);
		fixedButton.setVisible(false);
	}

	private void buildRotationButton(Button rotationButton) {
		rotationButton.setFont(Font.font(FONT_SIZE));
		rotationButton.setTextFill(Color.BLUE);
		rotationButton.setOnAction(ROTATION_EVENT);
		rotationButton.setLayoutX(425);
		rotationButton.setLayoutY(BUTTON_Y_POSITION);
		rotationButton.setVisible(false);
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
	}

	private void buildStage(Stage stage) {
		int width = 640, height = 480;
		stage.setScene(new Scene(pane, width, height));
		stage.setTitle("Waste an Hour Having Fun");
		stage.setResizable(false);
		stage.show();
	}

	public void setPlayerVsComputerSelected(boolean selected) {
		playerVsComputer.setSelected(selected);
		;
	}

	public void setComputerVsComputerSelected(boolean selected) {
		computerVsComputer.setSelected(selected);
		;
	}

	public void setChooseWeaponVisible(boolean visible) {
		chooseWeapon.setVisible(visible);
		;
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
		;
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
	
	public void setPlayerWeapon(Weapon playerWeapon) {
		
	}
	
	public void setOpponentWeapon(Weapon opponentWeapon) {
		
	}
	
	public void setPlayerWins(int playerWins) {
		
	}
	
	public void setPlayerTies(int playerTies) {
		
	}

	public void setPlayerLosses(int playerLosses) {
		
	}
	
	public void setPlayerResult(Result result) {
		
	}

	final EventHandler<ActionEvent> COMPUTER_VS_COMPUTER_EVENT = event -> {
		System.out.println("Computer Checked");
		playerVsComputer.setSelected(false);
		chooseWeapon.setVisible(false);
		rockButton.setVisible(false);
		paperButton.setVisible(false);
		scissorsButton.setVisible(false);
		chooseStrategy.setVisible(true);
		randomButton.setVisible(true);
		fixedButton.setVisible(true);
		rotationButton.setVisible(true);
	};

	final EventHandler<ActionEvent> ROCK_EVENT = event -> System.out
			.println("Rock Button Clicked");

	final EventHandler<ActionEvent> PAPER_EVENT = event -> System.out
			.println("Paper Button Clicked");

	final EventHandler<ActionEvent> SCISSORS_EVENT = event -> System.out
			.println("Scissors Button Clicked");

	final EventHandler<ActionEvent> RANDOM_EVENT = event -> {
		System.out.println("Random Button Clicked");
		RandomStrategy.RANDOM_GESTURE.chooseWeapon();
	};

	final EventHandler<ActionEvent> FIXED_EVENT = event -> {
		System.out.println("Fixed Button Clicked");
		FixedStrategy.FIXED_GESTURE.chooseWeapon();
	};

	final EventHandler<ActionEvent> ROTATION_EVENT = event -> {
		System.out.println("Rotation Button Clicked");
		RotationStrategy.ROTATION_STRATEGY.chooseWeapon();
	};
}