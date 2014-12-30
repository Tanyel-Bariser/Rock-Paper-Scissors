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

import com.rockpaperscissors.model.strategies.FixedStrategy;
import com.rockpaperscissors.model.strategies.RandomStrategy;
import com.rockpaperscissors.model.strategies.RotationStrategy;

public class RockPaperScissorsView {
	private final CheckBox playerVsComputer, computerVsComputer;
	private final Text chooseWeapon, chooseStrategy;
	private final Button rockButton, paperButton, scissorsButton;
	private final Button randomButton, fixedButton, rotationButton;
	private final Stage stage;
	private final Pane pane = new Pane();
	private final int FONT_SIZE = 32;
	private final int WIDTH = 640, HEIGHT = 480;
	private final int TEXT_Y_POSITION = 170;
	private final int BUTTON_Y_POSITION = 190;

	public RockPaperScissorsView(ViewBuilder builder) {
		checkBuilderForNullArgs(builder);
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
		setUpView();
	}

	private void setUpView() {
		setUpPlayerVsComputer(playerVsComputer);
		setUpComputerVsComputer(computerVsComputer);
		setUpChooseWeaponText(chooseWeapon);
		setUpRockButton(rockButton);
		setUpPaperButton(paperButton);
		setUpScissorsButton(scissorsButton);
		setUpChooseStategyText(chooseStrategy);
		setUpRandomButton(randomButton);
		setUpFixedButton(fixedButton);
		setUpRotationButton(rotationButton);
		setUpPane();
		setUpStage(stage);
	}

	private void checkBuilderForNullArgs(ViewBuilder builder) {
		if (builder.playerVsComputer == null) {
			throw new NullPointerException(
					"Player vs Computer Check Box is null");
		} else if (builder.computerVsComputer == null) {
			throw new NullPointerException(
					"Computer vs Computer Check Box is null");
		} else if (builder.chooseWeapon == null) {
			throw new NullPointerException("Choose Weapon Text is null");
		} else if (builder.rockButton == null) {
			throw new NullPointerException("Rock Button is null");
		} else if (builder.paperButton == null) {
			throw new NullPointerException("Paper Button is null");
		} else if (builder.scissorsButton == null) {
			throw new NullPointerException("Scissors Button is null");
		} else if (builder.chooseStrategy == null) {
			throw new NullPointerException("Choose Strategy Text is null");
		} else if (builder.randomButton == null) {
			throw new NullPointerException("Random Button is null");
		} else if (builder.fixedButton == null) {
			throw new NullPointerException("Random Button is null");
		} else if (builder.rotationButton == null) {
			throw new NullPointerException("Random Button is null");
		} else if (builder.stage == null) {
			throw new NullPointerException("Stage is null");
		}
	}

	// Put this in an EventHandler Strategy Host class and pass the View as an
	// argument to the static factory method and use getters to get the
	// computerVsPlayer, chooseWeapon and weaponGroup fields
	final EventHandler<ActionEvent> PLAYER_VS_COMPUTER_EVENT = event -> {
		System.out.println("Player Checked");
		computerVsComputer.setSelected(false);
		chooseStrategy.setVisible(false);
		randomButton.setVisible(false);
		fixedButton.setVisible(false);
		rotationButton.setVisible(false);
		chooseWeapon.setVisible(true);
		rockButton.setVisible(true);
		paperButton.setVisible(true);
		scissorsButton.setVisible(true);
	};

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
		RandomStrategy.RANDOM_GESTURE.chooseGesture();
	};

	final EventHandler<ActionEvent> FIXED_EVENT = event -> {
		System.out.println("Fixed Button Clicked");
		FixedStrategy.FIXED_GESTURE.chooseGesture();
	};

	final EventHandler<ActionEvent> ROTATION_EVENT = event -> {
		System.out.println("Rotation Button Clicked");
		RotationStrategy.ROTATION_STRATEGY.chooseGesture();
	};
	
	private void setUpPlayerVsComputer(CheckBox playerVsComputer) {
		playerVsComputer.setFont(Font.font(FONT_SIZE));
		playerVsComputer.setOnAction(PLAYER_VS_COMPUTER_EVENT);
		playerVsComputer.setSelected(true);
		playerVsComputer.setLayoutX(5);
		playerVsComputer.setLayoutY(5);
	}

	private void setUpComputerVsComputer(CheckBox computerVsComputer) {
		computerVsComputer.setFont(Font.font(FONT_SIZE));
		computerVsComputer.setOnAction(COMPUTER_VS_COMPUTER_EVENT);
		computerVsComputer.setLayoutX(5);
		computerVsComputer.setLayoutY(55);
	}

	private void setUpChooseWeaponText(Text chooseWeapon) {
		chooseWeapon.setFont(Font.font(FONT_SIZE));
		chooseWeapon.setFill(Color.BLUE);
		chooseWeapon.setLayoutX(165);
		chooseWeapon.setLayoutY(TEXT_Y_POSITION);
	}

	private void setUpRockButton(Button rockButton) {
		rockButton.setFont(Font.font(FONT_SIZE));
		rockButton.setTextFill(Color.BLUE);
		rockButton.setOnAction(ROCK_EVENT);
		rockButton.setLayoutX(75);
		rockButton.setLayoutY(BUTTON_Y_POSITION);
	}

	private void setUpPaperButton(Button paperButton) {
		paperButton.setFont(Font.font(FONT_SIZE));
		paperButton.setTextFill(Color.BLUE);
		paperButton.setOnAction(PAPER_EVENT);
		paperButton.setLayoutX(245);
		paperButton.setLayoutY(BUTTON_Y_POSITION);
	}

	private void setUpScissorsButton(Button scissorsButton) {
		scissorsButton.setFont(Font.font(FONT_SIZE));
		scissorsButton.setTextFill(Color.BLUE);
		scissorsButton.setOnAction(SCISSORS_EVENT);
		scissorsButton.setLayoutX(425);
		scissorsButton.setLayoutY(BUTTON_Y_POSITION);
	}

	private void setUpChooseStategyText(Text chooseStrategy) {
		chooseStrategy.setFont(Font.font(FONT_SIZE));
		chooseStrategy.setFill(Color.BLUE);
		chooseStrategy.setLayoutX(95);
		chooseStrategy.setLayoutY(TEXT_Y_POSITION);
		chooseStrategy.setVisible(false);
	}

	private void setUpRandomButton(Button randomButton) {
		randomButton.setFont(Font.font(FONT_SIZE));
		randomButton.setTextFill(Color.BLUE);
		randomButton.setOnAction(RANDOM_EVENT);
		randomButton.setLayoutX(60);
		randomButton.setLayoutY(BUTTON_Y_POSITION);
		randomButton.setVisible(false);
	}
	
	private void setUpFixedButton(Button fixedButton) {
		fixedButton.setFont(Font.font(FONT_SIZE));
		fixedButton.setTextFill(Color.BLUE);
		fixedButton.setOnAction(FIXED_EVENT);
		fixedButton.setLayoutX(265);
		fixedButton.setLayoutY(BUTTON_Y_POSITION);
		fixedButton.setVisible(false);
	}

	private void setUpRotationButton(Button rotationButton) {
		rotationButton.setFont(Font.font(FONT_SIZE));
		rotationButton.setTextFill(Color.BLUE);
		rotationButton.setOnAction(ROTATION_EVENT);
		rotationButton.setLayoutX(425);
		rotationButton.setLayoutY(BUTTON_Y_POSITION);
		rotationButton.setVisible(false);
	}
	
	private void setUpPane() {
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

	private void setUpStage(Stage stage) {
		stage.setScene(new Scene(pane, WIDTH, HEIGHT));
		stage.setTitle("Rock Paper Scissors");
		stage.setResizable(false);
		stage.show();
	}
}