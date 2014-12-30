package com.rockpaperscissors.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Weapon;

public class WeaponTest {
	
	 /**********************************
	 * Tests for Weapon.ROCK.against() *
	 **********************************/
	
	@Test (expected = NullPointerException.class)
	public void rockAgainstNullThrowsException() {
		Weapon.ROCK.against(null);
	}
	@Test
	public void rockAgainstScissorsWon() {
		assertEquals("Rock should crush Scissors",
				Result.WON, Weapon.ROCK.against(Weapon.SCISSORS));
	}
	@Test
	public void rockAgainstLizardWon() {
		assertEquals("Rock should crush Lizard",
				Result.WON, Weapon.ROCK.against(Weapon.LIZARD));
	}
	@Test
	public void rockAgainstRockTied() {
		assertEquals("Rock should tie with Rock",
				Result.TIED, Weapon.ROCK.against(Weapon.ROCK));
	}
	@Test
	public void rockAgainstPaperLost() {
		assertEquals("Rock should get covered by Paper",
				Result.LOST, Weapon.ROCK.against(Weapon.PAPER));
	}
	@Test
	public void rockAgainstSpockLost() {
		assertEquals("Rock should get vaporised by Spock",
				Result.LOST, Weapon.ROCK.against(Weapon.SPOCK));
	}
	
	 /***********************************
	 * Tests for Weapon.PAPER.against() *
	 ***********************************/
	
	@Test (expected = NullPointerException.class)
	public void paperAgainstNullThrowsException() {
		Weapon.PAPER.against(null);
	}
	@Test
	public void paperAgainstRockWon() {
		assertEquals("Paper should cover Rock",
				Result.WON, Weapon.PAPER.against(Weapon.ROCK));
	}
	@Test
	public void paperAgainstSpockWon() {
		assertEquals("Paper should disprove Spock",
				Result.WON, Weapon.PAPER.against(Weapon.SPOCK));
	}
	@Test
	public void paperAgainstPaperTied() {
		assertEquals("Paper should tie with Paper",
				Result.TIED, Weapon.PAPER.against(Weapon.PAPER));
	}
	@Test
	public void paperAgainstScissorsLost() {
		assertEquals("Paper should get cut by Scissors",
				Result.LOST, Weapon.PAPER.against(Weapon.SCISSORS));
	}
	@Test
	public void paperAgainstLizardLost() {
		assertEquals("Paper should get eaten by Lizard",
				Result.LOST, Weapon.PAPER.against(Weapon.LIZARD));
	}
	
	 /**************************************
	 * Tests for Weapon.SCISSORS.against() *
	 **************************************/
	
	@Test (expected = NullPointerException.class)
	public void scissorsAgainstNullThrowsException() {
		Weapon.SCISSORS.against(null);
	}
	@Test
	public void scissorsAgainstPaperWon() {
		assertEquals("Scissors should cut Paper",
				Result.WON, Weapon.SCISSORS.against(Weapon.PAPER));
	}
	@Test
	public void scissorsAgainstLizardWon() {
		assertEquals("Scissors should decapitate Lizard",
				Result.WON, Weapon.SCISSORS.against(Weapon.LIZARD));
	}
	@Test
	public void scissorsAgainstScissorsTied() {
		assertEquals("Scissors should tie with Scissors",
				Result.TIED, Weapon.SCISSORS.against(Weapon.SCISSORS));
	}
	@Test
	public void scissorsAgainstRockLost() {
		assertEquals("Scissors should get crushed by Rock",
				Result.LOST, Weapon.SCISSORS.against(Weapon.ROCK));
	}
	@Test
	public void scissorsAgainstSpockLost() {
		assertEquals("Scissors should get smashed by Spock",
				Result.LOST, Weapon.SCISSORS.against(Weapon.SPOCK));
	}
	
	 /************************************
	 * Tests for Weapon.LIZARD.against() *
	 ************************************/
	
	@Test (expected = NullPointerException.class)
	public void lizardAgainstNullThrowsException() {
		Weapon.LIZARD.against(null);
	}
	@Test
	public void lizardAgainstPaperWon() {
		assertEquals("Lizard should eat Paper",
				Result.WON, Weapon.LIZARD.against(Weapon.PAPER));
	}
	@Test
	public void lizardAgainstSpockWon() {
		assertEquals("Lizard should poison Spock",
				Result.WON, Weapon.LIZARD.against(Weapon.SPOCK));
	}
	@Test
	public void lizardAgainstLizardTied() {
		assertEquals("Lizard should tie with Lizard",
				Result.TIED, Weapon.LIZARD.against(Weapon.LIZARD));
	}
	@Test
	public void lizardAgainstRockLost() {
		assertEquals("Lizard should get crushed by Rock",
				Result.LOST, Weapon.LIZARD.against(Weapon.ROCK));
	}
	@Test
	public void lizardAgainstScissorsLost() {
		assertEquals("Lizard should get decapitated by Scissors",
				Result.LOST, Weapon.LIZARD.against(Weapon.SCISSORS));
	}
	
	 /***********************************
	 * Tests for Weapon.SPOCK.against() *
	 ***********************************/
	
	@Test (expected = NullPointerException.class)
	public void spockAgainstNullThrowsException() {
		Weapon.SPOCK.against(null);
	}
	@Test
	public void spockAgainstScissorsWon() {
		assertEquals("Spock should smash Scissors",
				Result.WON, Weapon.SPOCK.against(Weapon.SCISSORS));
	}
	@Test
	public void spockAgainstRockWon() {
		assertEquals("Spock should vaporise Rock",
				Result.WON, Weapon.SPOCK.against(Weapon.ROCK));
	}
	@Test
	public void spockAgainstSpockTied() {
		assertEquals("Spock should tie with Spock",
				Result.TIED, Weapon.SPOCK.against(Weapon.SPOCK));
	}
	@Test
	public void spockAgainstPaperLost() {
		assertEquals("Spock should get disproved by Paper",
				Result.LOST, Weapon.SPOCK.against(Weapon.PAPER));
	}
	@Test
	public void spockAgainstLizardLost() {
		assertEquals("Spock should get poisoned by Lizard",
				Result.LOST, Weapon.SPOCK.against(Weapon.LIZARD));
	}
}