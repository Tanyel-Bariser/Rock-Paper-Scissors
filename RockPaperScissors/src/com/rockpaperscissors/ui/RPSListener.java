package com.rockpaperscissors.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import com.rockpaperscissors.Gesture;
import com.rockpaperscissors.Result;
import com.rockpaperscissors.RockPaperScissors;
import com.rockpaperscissors.Score;

public class RPSListener implements ActionListener {
	private RockPaperScissors rps;
	private JLabel playerLabel;
	private JLabel computerLabel;
	private JLabel resultLabel;
	private JButton rockButton;
	private JButton paperButton;
	private JButton scissorsButton;
	private JLabel winsLabel;
	private JLabel lossesLabel;
	private JLabel tiesLabel;
	

	private RPSListener(Builder builder) {
		rps = new RockPaperScissors();
		playerLabel = builder.playerLabel;
		computerLabel = builder.computerLabel;
		resultLabel = builder.resultLabel;
		rockButton = builder.rockButton;
		paperButton = builder.paperButton;
		scissorsButton = builder.scissorsButton;
		winsLabel = builder.winsLabel;
		lossesLabel = builder.lossesLabel;
		tiesLabel = builder.tiesLabel;
	}
	
	public static class Builder {
		private JLabel playerLabel;
		private JLabel computerLabel;
		private JLabel resultLabel;
		private JButton rockButton;
		private JButton paperButton;
		private JButton scissorsButton;
		private JLabel winsLabel;
		private JLabel lossesLabel;
		private JLabel tiesLabel;
		
		public Builder playerLabel(JLabel playerLabel) {
			this.playerLabel = playerLabel;
			return this;
		}
		public Builder computerLabel(JLabel computerLabel) {
			this.computerLabel = computerLabel;
			return this;
		}
		public Builder resultLabel(JLabel resultLabel) {
			this.resultLabel = resultLabel;
			return this;
		}
		public Builder rockButton(JButton rockButton) {
			this.rockButton = rockButton;
			return this;
		}
		public Builder paperButton(JButton paperButton) {
			this.paperButton = paperButton;
			return this;
		}
		public Builder scissorsButton(JButton scissorsButton) {
			this.scissorsButton = scissorsButton;
			return this;
		}
		public Builder winsLabel(JLabel winsLabel) {
			this.winsLabel = winsLabel;
			return this;
		}
		public Builder lossesLabel(JLabel lossesLabel) {
			this.lossesLabel = lossesLabel;
			return this;
		}
		public Builder tiesLabel(JLabel tiesLabel) {
			this.tiesLabel = tiesLabel;
			return this;
		}
		
		public RPSListener build() {
			return new RPSListener(this);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		Gesture player1Gesture;
        if(event.getSource().equals(rockButton)){
            player1Gesture = Gesture.ROCK;
        } else if(event.getSource().equals(paperButton)){
            player1Gesture = Gesture.PAPER;
        } else if(event.getSource().equals(scissorsButton)){
            player1Gesture = Gesture.SCISSORS;
        }

        String player2Gesture = rps.getPlayer2Gesture();

        playerLabel.setText("You chose " + player1Gesture + ".");
        computerLabel.setText("CPU chose " + player2Gesture + ".");

        Result result = rps.getResult();

        if (result.equals(Result.WON)){
            resultLabel.setText("You won the game!");
        } else if (result.equals(Result.LOST)){
            resultLabel.setText("The computer won the game!");
        } else {
            resultLabel.setText("The game was a tie!");
        }

        winsLabel.setText("Wins: " + Score.WINS.getTimes());
        lossesLabel.setText("Losses: " + Score.LOSSES.getTimes());
        tiesLabel.setText("Ties: " + Score.TIES.getTimes());
	}
}