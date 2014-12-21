package com.rockpaperscissors.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.rockpaperscissors.Gesture;
import com.rockpaperscissors.Result;

public class GestureTest {
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
}