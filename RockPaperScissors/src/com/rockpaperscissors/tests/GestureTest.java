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
	public void rockCrushesScissors() {
		assertEquals("Rock should crush Scissors",
				Result.WIN, Gesture.ROCK.against(Gesture.SCISSORS));
	}
	@Test
	public void rockCrushesLizard() {
		assertEquals("Rock should crush Lizard",
				Result.WIN, Gesture.ROCK.against(Gesture.LIZARD));
	}
	@Test
	public void rockTiesWithRock() {
		assertEquals("Rock should tie with Rock",
				Result.TIE, Gesture.ROCK.against(Gesture.ROCK));
	}
	@Test
	public void rockIsCoveredByPaper() {
		assertEquals("Rock should get covered by Paper",
				Result.LOSE, Gesture.ROCK.against(Gesture.PAPER));
	}
	@Test
	public void rockIsVaporisedBySpock() {
		assertEquals("Rock should get vaporised by Spock",
				Result.LOSE, Gesture.ROCK.against(Gesture.SPOCK));
	}
	
	/*************************************
	 * Tests for Gesture.PAPER.against() *
	 ************************************/
	
	@Test (expected = NullPointerException.class)
	public void paperAgainstNullThrowsException() {
		Gesture.PAPER.against(null);
	}
	@Test
	public void paperCoversRock() {
		assertEquals("Paper should cover Rock",
				Result.WIN, Gesture.PAPER.against(Gesture.ROCK));
	}
	@Test
	public void paperDisprovesSpock() {
		assertEquals("Paper should disprove Spock",
				Result.WIN, Gesture.PAPER.against(Gesture.SPOCK));
	}
	@Test
	public void paperTiesWithPaper() {
		assertEquals("Paper should tie with Paper",
				Result.TIE, Gesture.PAPER.against(Gesture.PAPER));
	}
	@Test
	public void paperIsCutByScissors() {
		assertEquals("Paper should get cut by Scissors",
				Result.LOSE, Gesture.PAPER.against(Gesture.SCISSORS));
	}
	@Test
	public void paperIsEatenByLizard() {
		assertEquals("Paper should get eaten by Lizard",
				Result.LOSE, Gesture.PAPER.against(Gesture.LIZARD));
	}
	
	/****************************************
	 * Tests for Gesture.SCISSORS.against() *
	 ***************************************/
	
	@Test (expected = NullPointerException.class)
	public void scissorsAgainstNullThrowsException() {
		Gesture.SCISSORS.against(null);
	}
	@Test
	public void scissorsCutsPaper() {
		assertEquals("Scissors should cut Paper",
				Result.WIN, Gesture.SCISSORS.against(Gesture.PAPER));
	}
	@Test
	public void scissorsDecapitatesLizard() {
		assertEquals("Scissors should decapitate Lizard",
				Result.WIN, Gesture.SCISSORS.against(Gesture.LIZARD));
	}
	@Test
	public void scissorsTiesWithScissors() {
		assertEquals("Scissors should tie with Scissors",
				Result.TIE, Gesture.SCISSORS.against(Gesture.SCISSORS));
	}
	@Test
	public void scissorsIsCrushedByRock() {
		assertEquals("Scissors should get crushed by Rock",
				Result.LOSE, Gesture.SCISSORS.against(Gesture.ROCK));
	}
	@Test
	public void scissorsGetsSmashedBySpock() {
		assertEquals("Scissors should get smashed by Spock",
				Result.LOSE, Gesture.SCISSORS.against(Gesture.SPOCK));
	}
}