package com.rockpaperscissors.model;

import static org.junit.Assert.assertSame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Score;

public class ScoreTest {
	Score score;
	
	@Before
	public void setUp() {
		score = new Score();
	}
	
	@After
	public void tearDown() {
		score = null;
	}

	@Test
	public void blankScoreCreation() {
		assertSame(0, score.getWins());
		assertSame(0, score.getTies());
		assertSame(0, score.getLosses());
	}
	
	@Test
	public void nonBlankScoreCreation() {
		Score score = new Score(4, 2, 3);
		assertSame(4, score.getWins());
		assertSame(2, score.getTies());
		assertSame(3, score.getLosses());
	}
	
	@Test (expected = NullPointerException.class)
	public void updateScoreNullThrowsException() {
		score.updateScore(null);
	}
	
	@Test
	public void updateScoreThreeWins() {
		score.updateScore(Result.WON);
		score.updateScore(Result.WON);
		score.updateScore(Result.WON);
		assertSame(3, score.getWins());
	}
	
	@Test
	public void updateScoreTwoTies() {
		score.updateScore(Result.TIED);
		score.updateScore(Result.TIED);
		assertSame(2, score.getTies());
	}
	
	@Test
	public void updateScoreOneLoss() {
		score.updateScore(Result.LOST);
		assertSame(1, score.getLosses());
	}
}