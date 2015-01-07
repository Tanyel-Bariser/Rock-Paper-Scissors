package com.rockpaperscissors.view;

import static org.junit.Assert.assertEquals;
import javafx.scene.Parent;
import javafx.stage.Stage;

import org.junit.Test;
import org.loadui.testfx.GuiTest;

import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.player.HumanPlayer;

public class RPSViewSetComputerVsComputerModeTest extends GuiTest {
	RPSView view;

	@Override
	protected Parent getRootNode() {
		RPSViewBuilder builder = new RPSViewBuilder(new Stage());
		view = new RPSView(builder);

		HumanPlayer humanPlayer = new HumanPlayer(view);
		ComputerPlayer computerPlayer = new ComputerPlayer(view);
		ComputerOpponent opponent = new ComputerOpponent();
		view.buildPlayerVsComputerEventHandlers(humanPlayer, opponent);
		view.buildComputerVsComputerEventHandlers(computerPlayer, opponent);

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
}