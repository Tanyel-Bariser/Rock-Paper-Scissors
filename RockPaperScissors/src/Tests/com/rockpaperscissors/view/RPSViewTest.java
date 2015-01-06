package com.rockpaperscissors.view;

import javafx.scene.Parent;
import javafx.stage.Stage;

import org.junit.Test;
import org.loadui.testfx.GuiTest;

public class RPSViewTest extends GuiTest {

	@Override
	protected Parent getRootNode() {
		RPSViewBuilder builder = RPSViewBuilder.getViewBuilder(new Stage());
		return builder.playerVsComputer;
	}
	
	@Test
	public static void myTest() {
		System.out.println();
	}
}