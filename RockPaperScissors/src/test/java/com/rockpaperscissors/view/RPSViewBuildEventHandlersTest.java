package com.rockpaperscissors.view;

import static org.junit.Assert.assertNotNull;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.stage.Stage;

import org.junit.Test;
import org.loadui.testfx.GuiTest;

import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.player.HumanPlayer;

public class RPSViewBuildEventHandlersTest extends GuiTest {
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

		// builder.pane has references to all of view's dependencies
		return builder.pane;
	}

	@Test
	public void playerVsComputerHasEventHandler() {
		EventHandler<ActionEvent> handler = view.playerVsComputer.getOnAction();
		assertNotNull(handler);
	}

	@Test
	public void computerVsComputerHasEventHandler() {
		EventHandler<ActionEvent> handler = view.computerVsComputer.getOnAction();
		assertNotNull(handler);
	}
	
	@Test
	public void rockButtonHasEventHandler() {
		EventHandler<ActionEvent> handler = view.rockButton.getOnAction();
		assertNotNull(handler);
	}

	@Test
	public void paperButtonHasEventHandler() {
		EventHandler<ActionEvent> handler = view.paperButton.getOnAction();
		assertNotNull(handler);
	}
	
	@Test
	public void scissorsButtonHasEventHandler() {
		EventHandler<ActionEvent> handler = view.scissorsButton.getOnAction();
		assertNotNull(handler);
	}

	@Test
	public void randomButtonHasEventHandler() {
		EventHandler<ActionEvent> handler = view.randomButton.getOnAction();
		assertNotNull(handler);
	}

	@Test
	public void fixedButtonHasEventHandler() {
		EventHandler<ActionEvent> handler = view.fixedButton.getOnAction();
		assertNotNull(handler);
	}

	@Test
	public void rotationButtonHasEventHandler() {
		EventHandler<ActionEvent> handler = view.rotationButton.getOnAction();
		assertNotNull(handler);
	}
}