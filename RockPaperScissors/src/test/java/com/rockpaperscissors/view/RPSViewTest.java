package com.rockpaperscissors.view;

import static org.junit.Assert.assertNotNull;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import org.junit.Test;
import org.loadui.testfx.GuiTest;

import com.rockpaperscissors.model.player.ComputerOpponent;
import com.rockpaperscissors.model.player.ComputerPlayer;
import com.rockpaperscissors.model.player.HumanPlayer;

public class RPSViewTest extends GuiTest {
	View view;
	CheckBox playerVsComputer, computerVsComputer;
	Text chooseWeapon, chooseStrategy, resultText, scoreText;
	Button rockButton, paperButton, scissorsButton;
	Button randomButton, fixedButton, rotationButton;
	RPSViewBuilder builder;

	@Override
	protected Parent getRootNode() {
		rockButton = new Button();
		paperButton = new Button();
		scissorsButton = new Button();
		randomButton = new Button();
		fixedButton = new Button();
		rotationButton = new Button();

		builder = new RPSViewBuilder(new Stage());
		builder.rockButton = rockButton;
		builder.paperButton = paperButton;
		builder.scissorsButton = scissorsButton;
		builder.randomButton = randomButton;
		builder.fixedButton = fixedButton;
		builder.rotationButton = rotationButton;		

		view = new RPSView(builder);
		view.buildButtonOnActionEvents(new HumanPlayer(view),
				new ComputerPlayer(view), new ComputerOpponent());

		Pane pane = new Pane();
		pane.getChildren().addAll(builder.pane.getChildren());
		return pane;
	}

	@Test
	public void rockButtonHasEventHandler() {
		EventHandler<ActionEvent> handler = rockButton.getOnAction();
		assertNotNull(handler);
	}

	@Test
	public void paperButtonHasEventHandler() {
		EventHandler<ActionEvent> handler = paperButton.getOnAction();
		assertNotNull(handler);
	}

	@Test
	public void scissorsButtonHasEventHandler() {
		EventHandler<ActionEvent> handler = scissorsButton.getOnAction();
		assertNotNull(handler);
	}

	@Test
	public void randomButtonHasEventHandler() {
		EventHandler<ActionEvent> handler = randomButton.getOnAction();
		assertNotNull(handler);
	}

	@Test
	public void fixedButtonHasEventHandler() {
		EventHandler<ActionEvent> handler = fixedButton.getOnAction();
		assertNotNull(handler);
	}

	@Test
	public void rotationButtonHasEventHandler() {
		EventHandler<ActionEvent> handler = rotationButton.getOnAction();
		assertNotNull(handler);
	}
}