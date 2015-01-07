package com.rockpaperscissors.view;

import static org.junit.Assert.assertEquals;
import javafx.scene.Parent;
import javafx.stage.Stage;

import org.junit.Test;
import org.loadui.testfx.GuiTest;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Weapon;

public class RPSViewSetPlayerVsComputerModeTest extends GuiTest {
	RPSView view;

	@Override
	protected Parent getRootNode() {
		RPSViewBuilder builder = new RPSViewBuilder(new Stage());
		view = new RPSView(builder);

		view.setHumanPlayerResult(Weapon.ROCK, Weapon.SCISSORS, Result.WON);
		
		// MAIN SET UP FOR TEST CLASS
		view.setPlayerVsComputerMode();

		// builder.pane has references to all of view's dependencies
		return builder.pane;
	}

	@Test
	public void playerVsComputerModeUnselectsComputerVsComputerCheckBox() {
		assertEquals(false, view.computerVsComputer.isSelected());
	}
	
	@Test
	public void playerVsComputerModeSetsChooseWeaponVisible() {
		assertEquals(true, view.chooseWeapon.isVisible());
	}
	
	@Test
	public void playerVsComputerModeSetsChooseStrategyInvisible() {
		assertEquals(false, view.chooseStrategy.isVisible());
	}
	
	@Test
	public void playerVsComputerModeSetsRandomButtonInvisible() {
		assertEquals(false, view.randomButton.isVisible());
	}

	@Test
	public void playerVsComputerModeSetsFixedButtonInvisible() {
		assertEquals(false, view.fixedButton.isVisible());
	}

	@Test
	public void playerVsComputerModeSetsRotationButtonInvisible() {
		assertEquals(false, view.rotationButton.isVisible());
	}

	@Test
	public void playerVsComputerModeSetsRockButtonVisible() {
		assertEquals(true, view.rockButton.isVisible());
	}

	@Test
	public void playerVsComputerModeSetsPaperButtonVisible() {
		assertEquals(true, view.paperButton.isVisible());
	}

	@Test
	public void playerVsComputerModeSetsScissorsButtonVisible() {
		assertEquals(true, view.scissorsButton.isVisible());
	}
	
	@Test
	public void testSetHumanPlayerResult() {
		String expectedOutput = "You chose ROCK\nComputer Opponent chose SCISSORS\nYou WON";
		assertEquals(expectedOutput, view.resultText.getText());
	}
}