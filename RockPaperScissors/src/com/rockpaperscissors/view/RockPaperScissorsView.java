package com.rockpaperscissors.view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import com.rockpaperscissors.view.builder.RockPaperScissorsViewBuilder;

public class RockPaperScissorsView extends Application {
	private final int FONT_SIZE = 32;
	private final int WIDTH = 640, HEIGHT = 480;
	private RadioButton playerVsPlayer, computerVsPlayer;
	private Button rockButton, paperButton, scissorsButton;
	private Group gameTypeGroup, weaponGroup;
	private Text chooseWeapon, chooseStrategy;

	// JavaFX Application requires a no argument constructor for initialisation
	public RockPaperScissorsView() {
		playerVsPlayer = new RadioButton("Player vs Player");
		computerVsPlayer = new RadioButton("Computer vs Player");
		chooseWeapon = new Text("Choose your Weapon");
		rockButton = new Button("Rock");
		paperButton = new Button("Paper");
		scissorsButton = new Button("Scissors");

		new RockPaperScissorsViewBuilder().setUpPlayerVsButton(playerVsPlayer)
				.setUpComputerVsPlayer(computerVsPlayer)
				.setUpChooseWeaponText(chooseWeapon)
				.setUpRockButton(rockButton).setUpPaperButton(paperButton)
				.setUpScissorsButton(scissorsButton).setUpWeaponGroup().buildView(this);
	}

	@Override
	public void start(Stage stage) throws Exception {

		// Pane set up
		Pane pane = new Pane(chooseWeapon, gameTypeGroup, weaponGroup);

		// Stage set up
		stage.setScene(new Scene(pane, WIDTH, HEIGHT));
		stage.setTitle("Rock Paper Scissors");
		stage.setResizable(false);
		stage.show();
	}

	public RockPaperScissorsView setPlayerVsPlayer(RadioButton playerVsPlayer) {
		this.playerVsPlayer = playerVsPlayer;
		return this;
	}

	public RockPaperScissorsView setComputerVsPlayer(
			RadioButton computerVsComputer) {
		this.computerVsPlayer = computerVsComputer;
		return this;
	}

	public RockPaperScissorsView setGameTypeGroup(Group gameTypeGroup) {
		this.gameTypeGroup = gameTypeGroup;
		return this;
	}

	public RockPaperScissorsView setChooseWeaponText(Text chooseWeapon) {
		this.chooseWeapon = chooseWeapon;
		return this;
	}

	public RockPaperScissorsView setRockButton(Button rockButton) {
		this.rockButton = rockButton;
		return this;
	}

	public RockPaperScissorsView setPaperButton(Button paperButton) {
		this.paperButton = paperButton;
		return this;
	}

	public RockPaperScissorsView setScissorsButton(Button scissorsButton) {
		this.scissorsButton = scissorsButton;
		return this;
	}

	public RockPaperScissorsView setWeaponGroup(Group weaponGroup) {
		this.weaponGroup = weaponGroup;
		return this;
	}

	public static void main(String[] args) {
		launch(args);
	}
}