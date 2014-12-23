package com.rockpaperscissors.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
				Result.WON, Gesture.ROCK.against(Gesture.SCISSORS));
	}
	@Test
	public void rockCrushesLizard() {
		assertEquals("Rock should crush Lizard",
				Result.WON, Gesture.ROCK.against(Gesture.LIZARD));
	}
	@Test
	public void rockTiesWithRock() {
		assertEquals("Rock should tie with Rock",
				Result.TIED, Gesture.ROCK.against(Gesture.ROCK));
	}
	@Test
	public void rockIsCoveredByPaper() {
		assertEquals("Rock should get covered by Paper",
				Result.LOST, Gesture.ROCK.against(Gesture.PAPER));
	}
	@Test
	public void rockIsVaporisedBySpock() {
		assertEquals("Rock should get vaporised by Spock",
				Result.LOST, Gesture.ROCK.against(Gesture.SPOCK));
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
				Result.WON, Gesture.PAPER.against(Gesture.ROCK));
	}
	@Test
	public void paperDisprovesSpock() {
		assertEquals("Paper should disprove Spock",
				Result.WON, Gesture.PAPER.against(Gesture.SPOCK));
	}
	@Test
	public void paperTiesWithPaper() {
		assertEquals("Paper should tie with Paper",
				Result.TIED, Gesture.PAPER.against(Gesture.PAPER));
	}
	@Test
	public void paperIsCutByScissors() {
		assertEquals("Paper should get cut by Scissors",
				Result.LOST, Gesture.PAPER.against(Gesture.SCISSORS));
	}
	@Test
	public void paperIsEatenByLizard() {
		assertEquals("Paper should get eaten by Lizard",
				Result.LOST, Gesture.PAPER.against(Gesture.LIZARD));
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
				Result.WON, Gesture.SCISSORS.against(Gesture.PAPER));
	}
	@Test
	public void scissorsDecapitatesLizard() {
		assertEquals("Scissors should decapitate Lizard",
				Result.WON, Gesture.SCISSORS.against(Gesture.LIZARD));
	}
	@Test
	public void scissorsTiesWithScissors() {
		assertEquals("Scissors should tie with Scissors",
				Result.TIED, Gesture.SCISSORS.against(Gesture.SCISSORS));
	}
	@Test
	public void scissorsIsCrushedByRock() {
		assertEquals("Scissors should get crushed by Rock",
				Result.LOST, Gesture.SCISSORS.against(Gesture.ROCK));
	}
	@Test
	public void scissorsGetsSmashedBySpock() {
		assertEquals("Scissors should get smashed by Spock",
				Result.LOST, Gesture.SCISSORS.against(Gesture.SPOCK));
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
				Result.WON, Gesture.LIZARD.against(Gesture.PAPER));
	}
	@Test
	public void lizardPoisonsSpock() {
		assertEquals("Lizard should poison Spock",
				Result.WON, Gesture.LIZARD.against(Gesture.SPOCK));
	}
	@Test
	public void lizardTiesWithLizard() {
		assertEquals("Lizard should tie with Lizard",
				Result.TIED, Gesture.LIZARD.against(Gesture.LIZARD));
	}
	@Test
	public void lizardIsCrushedByRock() {
		assertEquals("Lizard should get crushed by Rock",
				Result.LOST, Gesture.LIZARD.against(Gesture.ROCK));
	}
	@Test
	public void lizardIsDecapitatedByScissors() {
		assertEquals("Lizard should get decapitated by Scissors",
				Result.LOST, Gesture.LIZARD.against(Gesture.SCISSORS));
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
				Result.WON, Gesture.SPOCK.against(Gesture.SCISSORS));
	}
	@Test
	public void spockVaporisesRock() {
		assertEquals("Spock should vaporise Rock",
				Result.WON, Gesture.SPOCK.against(Gesture.ROCK));
	}
	@Test
	public void spockTiesWithSpock() {
		assertEquals("Spock should tie with Spock",
				Result.TIED, Gesture.SPOCK.against(Gesture.SPOCK));
	}
	@Test
	public void spockIsDisprovedByPaper() {
		assertEquals("Spock should get disproved by Paper",
				Result.LOST, Gesture.SPOCK.against(Gesture.PAPER));
	}
	@Test
	public void spockIsPoisonedByLizard() {
		assertEquals("Spock should get poisoned by Lizard",
				Result.LOST, Gesture.SPOCK.against(Gesture.LIZARD));
	}
}