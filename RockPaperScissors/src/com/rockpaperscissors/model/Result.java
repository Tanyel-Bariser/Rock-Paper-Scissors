package com.rockpaperscissors.model;

public enum Result {
	WON(0), TIED(0), LOST(0);
	
	private int times;

	Result(int times) {
		this.times = times;
	}
	
	public void increment() {
		times++;
	}

	public int getTimes() {
		return times;
	}
	
	@Override
	public String toString() {
		return "You " + this.name() + " "+ times + " times.";
	}
}