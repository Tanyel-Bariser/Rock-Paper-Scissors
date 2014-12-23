package com.rockpaperscissors.view.actionlisteners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.rockpaperscissors.controller.RockPaperScissorsController;
import com.rockpaperscissors.model.GameType;

public class GameTypeListener implements ActionListener {
	private RockPaperScissorsController controller;
	private JButton playerVsButton;
	private JButton computerVsButton;

	public GameTypeListener(RockPaperScissorsController controller,
			JButton playerVsButton, JButton computerVsButton) {
		this.controller = controller;
		this.playerVsButton = playerVsButton;
		this.computerVsButton = computerVsButton;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource().equals(playerVsButton)) {
			controller.setGameType(GameType.PLAYER_VS_COMPUTER);
		} else if (event.getSource().equals(computerVsButton)) {
			controller.setGameType(GameType.COMPUTER_VS_COMPUTER);
		}
	}
}
