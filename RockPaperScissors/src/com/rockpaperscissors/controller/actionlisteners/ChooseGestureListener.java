package com.rockpaperscissors.controller.actionlisteners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import com.rockpaperscissors.controller.RockPaperScissorsController;
import com.rockpaperscissors.model.Weapon;

public class ChooseGestureListener implements ActionListener {
	private RockPaperScissorsController controller;
	private JButton rockButton;
	private JButton paperButton;
	private JButton scissorsButton;

	public ChooseGestureListener(RockPaperScissorsController controller,
			JButton rockButton, JButton paperButton, JButton scissorsButton) {
		this.controller = controller;
		this.rockButton = rockButton;
		this.paperButton = paperButton;
		this.scissorsButton = scissorsButton;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource().equals(rockButton)) {
			controller.setPlayerGesture(Weapon.ROCK);
		} else if (event.getSource().equals(paperButton)) {
			controller.setPlayerGesture(Weapon.PAPER);
		} else if (event.getSource().equals(scissorsButton)) {
			controller.setPlayerGesture(Weapon.SCISSORS);
		}
		controller.play();
	}
}