package com.rockpaperscissors.view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.rockpaperscissors.controller.RockPaperScissorsController;
import com.rockpaperscissors.controller.actionlisteners.ChooseGestureListener;
import com.rockpaperscissors.controller.actionlisteners.GameTypeListener;
import com.rockpaperscissors.model.GameType;
import com.rockpaperscissors.model.Gesture;
import com.rockpaperscissors.model.Result;

public class RockPaperScissorsView implements View {
	private RockPaperScissorsController controller;
	private final JFrame frame;

	public RockPaperScissorsView(RockPaperScissorsController controller) {
		this.controller = controller;
		frame = new JFrame("Rock Paper Scissors");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void askUserGameType() {
		JButton playerVsButton = new JButton("Player vs Computer");
		JButton computerVsButton = new JButton("Computer vs Computer");
		ActionListener listener = new GameTypeListener(controller,
				playerVsButton, computerVsButton);

		playerVsButton.addActionListener(listener);
		computerVsButton.addActionListener(listener);

		JPanel panel = new JPanel(true);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		panel.add(Box.createGlue());
		panel.add(playerVsButton);
		panel.add(Box.createGlue());
		panel.add(computerVsButton);
		panel.add(Box.createGlue());

		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.NORTH);
		frame.setSize(500, 300);
		frame.setVisible(true);
	}

	@Override
	public void choosePlayerGesture() {
		JButton rockButton = new JButton("ROCK");
		JButton paperButton = new JButton("PAPER");
		JButton scissorsButton = new JButton("SCISSORS");
		ActionListener listener = new ChooseGestureListener(controller,
				rockButton, paperButton, scissorsButton);

		rockButton.addActionListener(listener);
		paperButton.addActionListener(listener);
		scissorsButton.addActionListener(listener);

		JPanel panel = new JPanel(true);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		panel.add(Box.createGlue());
		panel.add(rockButton);
		panel.add(Box.createGlue());
		panel.add(paperButton);
		panel.add(Box.createGlue());
		panel.add(scissorsButton);
		panel.add(Box.createGlue());

		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.CENTER);
		frame.setSize(500, 300);
		frame.setVisible(true);
	}

	@Override
	public void showResults(Result result, Gesture playerGesture,
			Gesture computerGesture, GameType gameType) {
		String resultText, playerText, computerText;
		if (gameType.equals(GameType.PLAYER_VS_COMPUTER)) {
			resultText = "You " + result.name();
			playerText = "You chose " + playerGesture.name();
			computerText = "The computer chose " + computerGesture.name();
		} else {
			resultText = "Computer 1 " + result.name();
			playerText = "Computer 1 chose " + playerGesture.name();
			computerText = "Computer 2 chose " + computerGesture.name();
		}
		JLabel resultLabel = new JLabel(resultText, JLabel.CENTER);
		JLabel playerLabel = new JLabel(playerText, JLabel.CENTER);
		JLabel computerLabel = new JLabel(computerText, JLabel.CENTER);

		JLabel winsLabel = new JLabel(Result.WON.toString());
		JLabel lossesLabel = new JLabel(Result.LOST.toString());
		JLabel tiesLabel = new JLabel(Result.TIED.toString());

		JPanel panel = new JPanel(true);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		panel.add(playerLabel);
		panel.add(computerLabel);
		panel.add(resultLabel);
		panel.add(winsLabel);
		panel.add(lossesLabel);
		panel.add(tiesLabel);

		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.SOUTH);
		frame.setSize(500, 300);
		frame.setVisible(true);
	}
}