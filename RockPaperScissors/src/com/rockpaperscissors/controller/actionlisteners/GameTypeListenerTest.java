package com.rockpaperscissors.controller.actionlisteners;

import static org.junit.Assert.*;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import org.junit.Test;

public class GameTypeListenerTest {

	@Test
	public void test() {

		JButton playerVsButton = new JButton();

		// Use in Unit test for Action listeners with Mockito to mock controller
		// & verify method called
		ActionEvent event = new ActionEvent(playerVsButton, 0, null);
		event.setSource(playerVsButton);
		System.out.println(event.getSource().equals(playerVsButton));
	}

}
