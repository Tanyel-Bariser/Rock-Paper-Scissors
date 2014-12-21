package com.rockpaperscissors.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.rockpaperscissors.Gesture;
import com.rockpaperscissors.Result;

public class GestureTest {
	
	/************************************
	 * Tests for Gesture.ROCK.against() *
	 ***********************************/
	
	@Test (expected = NullPointerException.class)
	public void rockAgainstNullThrowsException() {
		Gesture.ROCK.against(null);
	}
	@Test
	public void rockBeatsScissors() {
		assertEquals("Rock should beat Scissors",
				Result.WIN, Gesture.ROCK.against(Gesture.SCISSORS));
	}
	@Test
	public void rockBeatsLizard() {
		assertEquals("Rock should beat Lizard",
				Result.WIN, Gesture.ROCK.against(Gesture.LIZARD));
	}
	@Test
	public void rockTiesWithRock() {
		assertEquals("Rock should tie with Rock",
				Result.TIE, Gesture.ROCK.against(Gesture.ROCK));
	}
	@Test
	public void rockLosesToPaper() {
		assertEquals("Rock should lose to Paper",
				Result.LOSE, Gesture.ROCK.against(Gesture.PAPER));
	}
	@Test
	public void rockLosesToSpock() {
		assertEquals("Rock should lose to Spock",
				Result.LOSE, Gesture.ROCK.against(Gesture.SPOCK));
	}
	
	/************************************
	 * Tests for Gesture.PAPER.against() *
	 ***********************************/
	
	@Test (expected = NullPointerException.class)
	public void paperAgainstNullThrowsException() {
		Gesture.PAPER.against(null);
	}
	@Test
	public void paperBeatsScissors() {
		assertEquals("Paper should beat Rock",
				Result.WIN, Gesture.PAPER.against(Gesture.ROCK));
	}
	@Test
	public void paperBeatsSpock() {
		assertEquals("Paper should beat Spock",
				Result.WIN, Gesture.PAPER.against(Gesture.SPOCK));
	}
	@Test
	public void paperTiesWithPaper() {
		assertEquals("Paper should tie with Paper",
				Result.TIE, Gesture.PAPER.against(Gesture.PAPER));
	}
	@Test
	public void paperLosesToScissors() {
		assertEquals("Paper should lose to Scissors",
				Result.LOSE, Gesture.PAPER.against(Gesture.SCISSORS));
	}
	@Test
	public void paperLosesToLizard() {
		assertEquals("Paper should lose to Lizard",
				Result.LOSE, Gesture.PAPER.against(Gesture.LIZARD));
	}
}