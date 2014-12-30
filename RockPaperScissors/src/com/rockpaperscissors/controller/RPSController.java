package com.rockpaperscissors.controller;

import com.rockpaperscissors.model.GameType;
import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;
import com.rockpaperscissors.model.Weapon;
import com.rockpaperscissors.model.player.Player;
import com.rockpaperscissors.model.strategies.RotationStrategy;
import com.rockpaperscissors.model.strategies.Strategy;

public class RPSController {
	private Player player, computer;
	private final Strategy opponentStrategy;
	private Weapon playerWeapon, opponentWeapon;
	private GameType gameType;
	private Result result;
	
	public RPSController(Strategy opponentStategy) {
		this.opponentStrategy = opponentStategy;
	}

	public void setGameType(GameType gameType) {
		this.gameType = gameType;
	}

	public void play() {
		opponentWeapon = opponentStrategy.chooseWeapon();
		if (gameType.equals(GameType.COMPUTER_VS_COMPUTER)) {
			playerWeapon = opponentStrategy.chooseWeapon();
		}
		result = playerWeapon.against(opponentWeapon);
		showUserResult();
	}

	private void showUserResult() {
		if (gameType.equals(GameType.PLAYER_VS_COMPUTER)) {
			player.updateScore(result);
		} else {
			computer.updateScore(result);
		}
	}
}