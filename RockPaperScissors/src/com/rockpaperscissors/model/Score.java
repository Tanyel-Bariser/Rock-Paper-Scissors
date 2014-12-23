package com.rockpaperscissors.model;

public enum Score {
	WINS(0), LOSSES(0), TIES(0);

	private int times;

	Score(int times) {
		this.times = times;
	}

	public int getTimes() {
		return times;
	}

	public static void increment(Result result) {
		switch (result) {
		case WON:
			WINS.times++;
			break;
		case LOST:
			LOSSES.times++;
			break;
		case TIED:
			TIES.times++;
			break;
		}
	}
}