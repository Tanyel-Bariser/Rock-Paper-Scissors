package com.rockpaperscissors.view;

import static org.junit.Assert.assertEquals;
import javafx.scene.Parent;
import javafx.stage.Stage;

import org.junit.Test;
import org.loadui.testfx.GuiTest;

import com.rockpaperscissors.model.Result;
import com.rockpaperscissors.model.Weapon;

public class RPSViewSetComputerVsComputerModeTest extends GuiTest {
	RPSView view;

	@Override
	protected Parent getRootNode() {
		RPSViewBuilder builder = new RPSViewBuilder(new Stage());
		view = new RPSView(builder);

		view.setComputerPlayerResult(Weapon.PAPER, Weapon.ROCK, Result.WON);

		// MAIN SET UP FOR TEST CLASS
		view.setComputerVsComputerMode();

		// builder.pane has references to all of view's dependencies
		return builder.pane;
	}

	@Test
	public void computerVsComputerModeUnselectsPlayerVsComputerCheckBox() {
		assertEquals(false, view.playerVsComputer.isSelected());
	}

	@Test
	public void computerVsComputerModeSetsChooseWeaponInvisible() {
		assertEquals(false, view.chooseWeapon.isVisible());
	}

	@Test
	public void computerVsComputerModeSetsChooseStrategyVisible() {
		assertEquals(true, view.chooseStrategy.isVisible());
	}

	@Test
	public void computerVsComputerModeSetsRandomButtonVisible() {
		assertEquals(true, view.randomButton.isVisible());
	}

	@Test
	public void computerVsComputerModeSetsFixedButtonVisible() {
		assertEquals(true, view.fixedButton.isVisible());
	}

	@Test
	public void computerVsComputerModeSetsRotationButtonVisible() {
		assertEquals(true, view.rotationButton.isVisible());
	}

	@Test
	public void computerVsComputerModeSetsRockButtonInvisible() {
		assertEquals(false, view.rockButton.isVisible());
	}

	@Test
	public void computerVsComputerModeSetsPaperButtonInvisible() {
		assertEquals(false, view.paperButton.isVisible());
	}

	@Test
	public void computerVsComputerModeSetsScissorsButtonInvisible() {
		assertEquals(false, view.scissorsButton.isVisible());
	}

	@Test
	public void testSetComputerPlayerResult() {
		String expectedOutput = "Your Computer chose PAPER\nComputer Opponent chose ROCK\nYour Computer WON";
		assertEquals(expectedOutput, view.resultText.getText());
	}
}