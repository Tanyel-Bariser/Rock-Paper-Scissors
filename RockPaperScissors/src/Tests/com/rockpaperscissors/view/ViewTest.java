package com.rockpaperscissors.view;

import javafx.scene.Parent;
import javafx.stage.Stage;

import org.junit.Test;
import org.loadui.testfx.GuiTest;

public class ViewTest extends GuiTest {

	@Override
	protected Parent getRootNode() {
		ViewBuilder builder = ViewBuilder.createViewBuilder(new Stage());
		return builder.playerVsComputer;
	}
	
	@Test
	public static void myTest() {
		System.out.println();
	}
}