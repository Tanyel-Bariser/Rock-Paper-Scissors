package com.rockpaperscissors.view.builder;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import com.rockpaperscissors.view.RockPaperScissorsView;

public class RockPaperScissorsViewBuilder {
	private RadioButton playerVsPlayer, computerVsPlayer;
	private Text chooseWeapon;
	private Button rockButton, paperButton, scissorsButton;
	private Group weaponGroup;
	private final int FONT_SIZE = 32;
	private final int WIDTH = 640, HEIGHT = 480;

	EventHandler<ActionEvent> playerVSPlayerEvent = event -> {
		System.out.println("Player Checked");
		computerVsPlayer.setSelected(false);
		chooseWeapon.setVisible(true);
		weaponGroup.setVisible(true);
	};

	EventHandler<ActionEvent> computerVsPlayerEvent = event -> {
		System.out.println("Computer Checked");
		playerVsPlayer.setSelected(false);
		chooseWeapon.setVisible(false);
		weaponGroup.setVisible(false);
	};

	public RockPaperScissorsViewBuilder setUpPlayerVsButton(
			RadioButton playerVsPlayer) {
		this.playerVsPlayer = playerVsPlayer;
		playerVsPlayer.setFont(Font.font(FONT_SIZE));
		playerVsPlayer.setOnAction(playerVSPlayerEvent);
		playerVsPlayer.setSelected(true);
		return this;
	}

	public RockPaperScissorsViewBuilder setUpComputerVsPlayer(
			RadioButton computerVsPlayer) {
		this.computerVsPlayer = computerVsPlayer;
		computerVsPlayer.setFont(Font.font(FONT_SIZE));
		computerVsPlayer.setOnAction(computerVsPlayerEvent);
		computerVsPlayer.setLayoutY(HEIGHT / 10);
		return this;
	}

	public RockPaperScissorsViewBuilder setUpChooseWeaponText(Text chooseWeapon) {
		this.chooseWeapon = chooseWeapon;
		chooseWeapon.setFont(Font.font(FONT_SIZE));
		chooseWeapon.setFill(Color.BLUE);
		chooseWeapon.setLayoutX(WIDTH / 3.9);
		chooseWeapon.setLayoutY(HEIGHT / 2.8);
		return this;
	}

	public RockPaperScissorsViewBuilder setUpRockButton(Button rockButton) {
		this.rockButton = rockButton;
		rockButton.setFont(Font.font(FONT_SIZE));
		rockButton.setTextFill(Color.BLUE);
		rockButton.setOnAction(event -> System.out
				.println("Rock Button Clicked"));
		rockButton.setLayoutX(WIDTH / 8.1);
		rockButton.setLayoutY(HEIGHT / 2.5);
		return this;
	}

	public RockPaperScissorsViewBuilder setUpPaperButton(Button paperButton) {
		this.paperButton = paperButton;
		paperButton.setFont(Font.font(FONT_SIZE));
		paperButton.setTextFill(Color.BLUE);
		paperButton.setOnAction(event -> System.out
				.println("Paper Button Clicked"));
		paperButton.setLayoutX(WIDTH / 2.6);
		paperButton.setLayoutY(HEIGHT / 2.5);
		return this;
	}

	public RockPaperScissorsViewBuilder setUpScissorsButton(
			Button scissorsButton) {
		this.scissorsButton = scissorsButton;
		scissorsButton.setFont(Font.font(FONT_SIZE));
		scissorsButton.setTextFill(Color.BLUE);
		scissorsButton.setOnAction(event -> System.out
				.println("Scissors Button Clicked"));
		scissorsButton.setLayoutX(WIDTH / 1.5);
		scissorsButton.setLayoutY(HEIGHT / 2.5);
		return this;
	}

	public RockPaperScissorsViewBuilder setUpWeaponGroup() {
		weaponGroup = new Group(rockButton, paperButton, scissorsButton);
		return this;
	}

	public void buildView(RockPaperScissorsView view) {
		view.setPlayerVsPlayer(playerVsPlayer)
				.setComputerVsPlayer(computerVsPlayer)
				.setGameTypeGroup(new Group(playerVsPlayer, computerVsPlayer))
				.setChooseWeaponText(chooseWeapon).setRockButton(rockButton)
				.setPaperButton(paperButton).setScissorsButton(scissorsButton)
				.setWeaponGroup(weaponGroup);
	}
}