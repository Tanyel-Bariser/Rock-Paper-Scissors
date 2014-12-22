package com.rockpaperscissors.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

public class RPSListener implements ActionListener {
	private JLabel playerGesture;
	private JLabel computerGesture;
	private JLabel result;
	private JButton rock;
	private JButton paper;
	private JButton scissors;
	private JLabel wins;
	private JLabel losses;
	private JLabel ties;
	

	private RPSListener(Builder builder) {
		playerGesture = builder.playerGesture;
		computerGesture = builder.computerGesture;
		result = builder.result;
		rock = builder.rock;
		paper = builder.paper;
		scissors = builder.scissors;
		wins = builder.wins;
		losses = builder.losses;
		ties = builder.ties;
	}
	
	public static class Builder {
		private JLabel playerGesture;
		private JLabel computerGesture;
		private JLabel result;
		private JButton rock;
		private JButton paper;
		private JButton scissors;
		private JLabel wins;
		private JLabel losses;
		private JLabel ties;
		
		public Builder playerGesture(JLabel playerGesture) {
			this.playerGesture = playerGesture;
			return this;
		}
		public Builder computerGesture(JLabel computerGesture) {
			this.computerGesture = computerGesture;
			return this;
		}
		public Builder result(JLabel result) {
			this.result = result;
			return this;
		}
		public Builder rock(JButton rock) {
			this.rock = rock;
			return this;
		}
		public Builder paper(JButton paper) {
			this.paper = paper;
			return this;
		}
		public Builder scissors(JButton scissors) {
			this.scissors = scissors;
			return this;
		}
		public Builder wins(JLabel wins) {
			this.wins = wins;
			return this;
		}
		public Builder losses(JLabel losses) {
			this.losses = losses;
			return this;
		}
		public Builder ties(JLabel ties) {
			this.ties = ties;
			return this;
		}
		
		public RPSListener build() {
			return new RPSListener(this);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}
}