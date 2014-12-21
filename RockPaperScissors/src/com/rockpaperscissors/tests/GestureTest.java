package com.rockpaperscissors.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.rockpaperscissors.Gesture;
import com.rockpaperscissors.Result;

public class GestureTest {
	
	 /***********************************
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
	
	 /************************************
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
	
	 /***************************************
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
	
	 /*************************************
	 * Tests for Gesture.LIZARD.against() *
	 *************************************/
	
	@Test (expected = NullPointerException.class)
	public void lizardAgainstNullThrowsException() {
		Gesture.LIZARD.against(null);
	}
	@Test
	public void lizardEatsPaper() {
		assertEquals("Lizard should eat Paper",
				Result.WIN, Gesture.LIZARD.against(Gesture.PAPER));
	}
	@Test
	public void lizardPoisonsSpock() {
		assertEquals("Lizard should poison Spock",
				Result.WIN, Gesture.LIZARD.against(Gesture.SPOCK));
	}
	@Test
	public void lizardTiesWithLizard() {
		assertEquals("Lizard should tie with Lizard",
				Result.TIE, Gesture.LIZARD.against(Gesture.LIZARD));
	}
	@Test
	public void lizardIsCrushedByRock() {
		assertEquals("Lizard should get crushed by Rock",
				Result.LOSE, Gesture.LIZARD.against(Gesture.ROCK));
	}
	@Test
	public void lizardIsDecapitatedByScissors() {
		assertEquals("Lizard should get decapitated by Scissors",
				Result.LOSE, Gesture.LIZARD.against(Gesture.SCISSORS));
	}
	
	 /************************************
	 * Tests for Gesture.SPOCK.against() *
	 ************************************/
	
	@Test (expected = NullPointerException.class)
	public void spockAgainstNullThrowsException() {
		Gesture.SPOCK.against(null);
	}
	@Test
	public void spockSmashesScissors() {
		assertEquals("Spock should smash Scissors",
				Result.WIN, Gesture.SPOCK.against(Gesture.SCISSORS));
	}
	@Test
	public void spockVaporisesRock() {
		assertEquals("Spock should vaporise Rock",
				Result.WIN, Gesture.SPOCK.against(Gesture.ROCK));
	}
	@Test
	public void spockTiesWithSpock() {
		assertEquals("Spock should tie with Spock",
				Result.TIE, Gesture.SPOCK.against(Gesture.SPOCK));
	}
	@Test
	public void spockIsDisprovedByPaper() {
		assertEquals("Spock should get disproved by Paper",
				Result.LOSE, Gesture.SPOCK.against(Gesture.PAPER));
	}
	@Test
	public void spockIsPoisonedByLizard() {
		assertEquals("Spock should get poisoned by Lizard",
				Result.LOSE, Gesture.SPOCK.against(Gesture.LIZARD));
	}
	
	 /*********************************
	 * Tests for Gesture.getGesture() *
	 *********************************/

	@Test
	public void getRock() {
		assertEquals("Should return ROCK",
				Gesture.ROCK, Gesture.getGesture(" r"));
	}
	@Test
	public void getScissors() {
		assertEquals("Should return SCISSORS",
				Gesture.SCISSORS, Gesture.getGesture("s  "));
	}
	@Test
	public void getPaper() {
		assertEquals("Should return PAPER",
				Gesture.PAPER, Gesture.getGesture("   p"));
	}
	@Test
	public void getLizard() {
		assertEquals("Should return LIZARD",
				Gesture.LIZARD, Gesture.getGesture("l"));
	}
	@Test
	public void getSpock() {
		assertEquals("Should return SPOCK",
				Gesture.SPOCK, Gesture.getGesture("sp  "));
	}
	@Test
	public void wrongArgReturnsNull() {
		assertEquals("Wrong argument should return null",
				null, Gesture.getGesture("q"));
	}
	@Test (expected = NullPointerException.class)
	public void nullThrowsException() {
		Gesture.getGesture(null);
	}
}