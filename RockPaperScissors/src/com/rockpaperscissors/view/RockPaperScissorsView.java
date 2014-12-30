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

public class RockPaperScissorsView {
	private CheckBox playerVsComputer, computerVsComputer;
	private Text chooseWeapon;
	private Button rockButton, paperButton, scissorsButton;
	private final Pane pane = new Pane();
	private final int FONT_SIZE = 32;
	private final int WIDTH = 640, HEIGHT = 480;

	public RockPaperScissorsView(ViewBuilder builder) {
		checkBuilderForNullArgs(builder);
		setUpPlayerVsComputer(builder.playerVsComputer);
		setUpComputerVsComputer(builder.computerVsComputer);
		setUpChooseWeaponText(builder.chooseWeapon);
		setUpRockButton(builder.rockButton);
		setUpPaperButton(builder.paperButton);
		setUpScissorsButton(builder.scissorsButton);
		setUpPane();
		setUpStage(builder.stage);
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
		}
	}

	// Put this in an EventHandler Strategy Host class and pass the View as an
	// argument to the static factory method and use getters to get the
	// computerVsPlayer, chooseWeapon and weaponGroup fields
	EventHandler<ActionEvent> playerVSComputerEvent = event -> {
		System.out.println("Player Checked");
		computerVsComputer.setSelected(false);
		chooseWeapon.setVisible(true);
		rockButton.setVisible(true);
		paperButton.setVisible(true);
		scissorsButton.setVisible(true);
	};

	EventHandler<ActionEvent> computerVsComputerEvent = event -> {
		System.out.println("Computer Checked");
		playerVsComputer.setSelected(false);
		chooseWeapon.setVisible(false);
		rockButton.setVisible(false);
		paperButton.setVisible(false);
		scissorsButton.setVisible(false);
	};

	EventHandler<ActionEvent> rockEvent = event -> System.out
			.println("Rock Button Clicked");

	EventHandler<ActionEvent> paperEvent = event -> System.out
			.println("Paper Button Clicked");

	EventHandler<ActionEvent> scissorsEvent = event -> System.out
			.println("Scissors Button Clicked");

	private void setUpPlayerVsComputer(CheckBox playerVsPlayer) {
		this.playerVsComputer = playerVsPlayer;
		playerVsPlayer.setFont(Font.font(FONT_SIZE));
		playerVsPlayer.setOnAction(playerVSComputerEvent);
		playerVsPlayer.setSelected(true);
	}

	private void setUpComputerVsComputer(CheckBox computerVsPlayer) {
		this.computerVsComputer = computerVsPlayer;
		computerVsPlayer.setFont(Font.font(FONT_SIZE));
		computerVsPlayer.setOnAction(computerVsComputerEvent);
		computerVsPlayer.setLayoutY(HEIGHT / 10);
	}

	private void setUpChooseWeaponText(Text chooseWeapon) {
		this.chooseWeapon = chooseWeapon;
		chooseWeapon.setFont(Font.font(FONT_SIZE));
		chooseWeapon.setFill(Color.BLUE);
		chooseWeapon.setLayoutX(WIDTH / 3.9);
		chooseWeapon.setLayoutY(HEIGHT / 2.8);
	}

	private void setUpRockButton(Button rockButton) {
		this.rockButton = rockButton;
		rockButton.setFont(Font.font(FONT_SIZE));
		rockButton.setTextFill(Color.BLUE);
		rockButton.setOnAction(rockEvent);
		rockButton.setLayoutX(WIDTH / 8.1);
		rockButton.setLayoutY(HEIGHT / 2.5);
	}

	private void setUpPaperButton(Button paperButton) {
		this.paperButton = paperButton;
		paperButton.setFont(Font.font(FONT_SIZE));
		paperButton.setTextFill(Color.BLUE);
		paperButton.setOnAction(paperEvent);
		paperButton.setLayoutX(WIDTH / 2.6);
		paperButton.setLayoutY(HEIGHT / 2.5);
	}

	private void setUpScissorsButton(Button scissorsButton) {
		this.scissorsButton = scissorsButton;
		scissorsButton.setFont(Font.font(FONT_SIZE));
		scissorsButton.setTextFill(Color.BLUE);
		scissorsButton.setOnAction(scissorsEvent);
		scissorsButton.setLayoutX(WIDTH / 1.5);
		scissorsButton.setLayoutY(HEIGHT / 2.5);
	}

	private void setUpPane() {
		pane.getChildren().add(playerVsComputer);
		pane.getChildren().add(computerVsComputer);
		pane.getChildren().add(chooseWeapon);
		pane.getChildren().add(rockButton);
		pane.getChildren().add(paperButton);
		pane.getChildren().add(scissorsButton);
	}

	private void setUpStage(Stage stage) {
		stage.setScene(new Scene(pane, WIDTH, HEIGHT));
		stage.setTitle("Rock Paper Scissors");
		stage.setResizable(false);
		stage.show();
	}
}