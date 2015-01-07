package com.rockpaperscissors.view;

import static org.junit.Assert.assertEquals;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import org.junit.Test;
import org.loadui.testfx.GuiTest;

public class RPSViewBuilderTest extends GuiTest {
	RPSViewBuilder builder;
	
    @Override
    protected Parent getRootNode() {
        builder = new RPSViewBuilder(new Stage());
        return builder.pane;
    }
    
    @Test
    public void playerVsComputerFontSizeSet() {
    	int size = (int) builder.playerVsComputer.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void playerVsComputerLayoutXSet() {
    	int layoutX = (int) builder.playerVsComputer.getLayoutX();
    	assertEquals(RPSViewBuilder.LEFT_EDGE, layoutX);
    }
    
    @Test
    public void playerVsComputerLayoutYSet() {
    	int layoutY = (int) builder.playerVsComputer.getLayoutY();
    	assertEquals(RPSViewBuilder.PLAYER_Y, layoutY);
    }
    
    @Test
    public void playerVsComputerStartsSelected(){
        assertEquals(true, builder.playerVsComputer.isSelected());
    }
    
    @Test
    public void computerVsComputerFontSizeSet() {
    	int size = (int) builder.computerVsComputer.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void computerVsComputerLayoutXSet() {
    	int layoutX = (int) builder.computerVsComputer.getLayoutX();
    	assertEquals(RPSViewBuilder.LEFT_EDGE, layoutX);
    }
    
    @Test
    public void computerVsComputerLayoutYSet() {
    	int layoutY = (int) builder.computerVsComputer.getLayoutY();
    	assertEquals(RPSViewBuilder.COMPUTER_Y, layoutY);
    }
    
    @Test
    public void chooseWeaponrFontSizeSet() {
    	int size = (int) builder.chooseWeapon.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void chooseWeaponColourSet() {
    	Color colour = (Color) builder.chooseWeapon.getFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void chooseWeaponLayoutXSet() {
    	int layoutX = (int) builder.chooseWeapon.getLayoutX();
    	assertEquals(RPSViewBuilder.WEAPON_X, layoutX);
    }
    
    @Test
    public void chooseWeaponLayoutYSet() {
    	int layoutY = (int) builder.chooseWeapon.getLayoutY();
    	assertEquals(RPSViewBuilder.CHOOSE_TEXT_Y, layoutY);
    }
    
    @Test
    public void chooseStrategyFontSizeSet() {
    	int size = (int) builder.chooseStrategy.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void chooseStrategyColourSet() {
    	Color colour = (Color) builder.chooseStrategy.getFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void chooseStrategyLayoutXSet() {
    	int layoutX = (int) builder.chooseStrategy.getLayoutX();
    	assertEquals(RPSViewBuilder.STRATEGY_X, layoutX);
    }
    
    @Test
    public void chooseStrategyLayoutYSet() {
    	int layoutY = (int) builder.chooseStrategy.getLayoutY();
    	assertEquals(RPSViewBuilder.CHOOSE_TEXT_Y, layoutY);
    }
    
    @Test
    public void rockButtonFontSizeSet() {
    	int size = (int) builder.rockButton.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void rockButtonColourSet() {
    	Color colour = (Color) builder.rockButton.getTextFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void rockButtonLayoutXSet() {
    	int layoutX = (int) builder.rockButton.getLayoutX();
    	assertEquals(RPSViewBuilder.ROCK_X, layoutX);
    }
    
    @Test
    public void rockButtonLayoutYSet() {
    	int layoutY = (int) builder.rockButton.getLayoutY();
    	assertEquals(RPSViewBuilder.BUTTON_Y, layoutY);
    }
    
    @Test
    public void paperButtonFontSizeSet() {
    	int size = (int) builder.paperButton.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void paperButtonColourSet() {
    	Color colour = (Color) builder.paperButton.getTextFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void paperButtonLayoutXSet() {
    	int layoutX = (int) builder.paperButton.getLayoutX();
    	assertEquals(RPSViewBuilder.PAPER_X, layoutX);
    }
    
    @Test
    public void paperButtonLayoutYSet() {
    	int layoutY = (int) builder.paperButton.getLayoutY();
    	assertEquals(RPSViewBuilder.BUTTON_Y, layoutY);
    }
    
    @Test
    public void scissorsButtonFontSizeSet() {
    	int size = (int) builder.scissorsButton.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void scissorsButtonColourSet() {
    	Color colour = (Color) builder.scissorsButton.getTextFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void scissorsButtonLayoutXSet() {
    	int layoutX = (int) builder.scissorsButton.getLayoutX();
    	assertEquals(RPSViewBuilder.SCISSORS_X, layoutX);
    }
    
    @Test
    public void scissorsButtonLayoutYSet() {
    	int layoutY = (int) builder.scissorsButton.getLayoutY();
    	assertEquals(RPSViewBuilder.BUTTON_Y, layoutY);
    }
    
    @Test
    public void randomButtonFontSizeSet() {
    	int size = (int) builder.randomButton.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void randomButtonColourSet() {
    	Color colour = (Color) builder.randomButton.getTextFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void randomButtonLayoutXSet() {
    	int layoutX = (int) builder.randomButton.getLayoutX();
    	assertEquals(RPSViewBuilder.RANDOM_X, layoutX);
    }
    
    @Test
    public void randomButtonLayoutYSet() {
    	int layoutY = (int) builder.randomButton.getLayoutY();
    	assertEquals(RPSViewBuilder.BUTTON_Y, layoutY);
    }
    
    @Test
    public void fixedButtonFontSizeSet() {
    	int size = (int) builder.fixedButton.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void fixedButtonColourSet() {
    	Color colour = (Color) builder.fixedButton.getTextFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void fixedButtonLayoutXSet() {
    	int layoutX = (int) builder.fixedButton.getLayoutX();
    	assertEquals(RPSViewBuilder.FIXED_X, layoutX);
    }
    
    @Test
    public void fixedButtonLayoutYSet() {
    	int layoutY = (int) builder.fixedButton.getLayoutY();
    	assertEquals(RPSViewBuilder.BUTTON_Y, layoutY);
    }
    
    @Test
    public void rotationButtonFontSizeSet() {
    	int size = (int) builder.rotationButton.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void rotationButtonColourSet() {
    	Color colour = (Color) builder.rotationButton.getTextFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void rotationButtonLayoutXSet() {
    	int layoutX = (int) builder.rotationButton.getLayoutX();
    	assertEquals(RPSViewBuilder.ROTATION_X, layoutX);
    }
    
    @Test
    public void rotationButtonLayoutYSet() {
    	int layoutY = (int) builder.rotationButton.getLayoutY();
    	assertEquals(RPSViewBuilder.BUTTON_Y, layoutY);
    }
    
    @Test
    public void resultTextFontSizeSet() {
    	int size = (int) builder.resultText.getFont().getSize();
    	assertEquals(RPSViewBuilder.RESULTS_SIZE, size);
    }
    
    @Test
    public void resultTextColourSet() {
    	Color colour = (Color) builder.resultText.getFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void resultTextLayoutXSet() {
    	int layoutX = (int) builder.resultText.getLayoutX();
    	assertEquals(RPSViewBuilder.LEFT_EDGE, layoutX);
    }
    
    @Test
    public void resultTextLayoutYSet() {
    	int layoutY = (int) builder.resultText.getLayoutY();
    	assertEquals(RPSViewBuilder.RESULT_Y, layoutY);
    }
    
    @Test
    public void scoreTextFontSizeSet() {
    	int size = (int) builder.scoreText.getFont().getSize();
    	assertEquals(RPSViewBuilder.RESULTS_SIZE, size);
    }
    
    @Test
    public void scoreTextColourSet() {
    	Color colour = (Color) builder.scoreText.getFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void scoreTextLayoutXSet() {
    	int layoutX = (int) builder.scoreText.getLayoutX();
    	assertEquals(RPSViewBuilder.SCORE_X, layoutX);
    }
    
    @Test
    public void scoreTextLayoutYSet() {
    	int layoutY = (int) builder.scoreText.getLayoutY();
    	assertEquals(RPSViewBuilder.RESULT_Y, layoutY);
    }
}