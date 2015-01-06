package com.rockpaperscissors.view;

import static org.junit.Assert.assertEquals;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.loadui.testfx.GuiTest;
import org.loadui.testfx.categories.TestFX;

@Category(TestFX.class)
public class RPSViewBuilderTest extends GuiTest {
	CheckBox playerVsComputer, computerVsComputer;
	Text chooseWeapon, chooseStrategy, resultText, scoreText;
	Button rockButton, paperButton, scissorsButton;
	Button randomButton, fixedButton, rotationButton;
	
    @Override
    protected Parent getRootNode() {
        RPSViewBuilder builder = new RPSViewBuilder(new Stage());
        Pane pane = new Pane();
        pane.getChildren().addAll(builder.pane.getChildren());
        return pane;
    }
    
    @Before
    public void setUp() {
    	playerVsComputer = find("#player");
    	computerVsComputer = find("#computer");
    	chooseWeapon = find("#weapon");
    	chooseStrategy = find("#strategy");
    	rockButton = find("#rock");
    	paperButton = find("#paper");
    	scissorsButton = find("#scissors");
    	randomButton = find("#random");
    	fixedButton = find("#fixed");
    	rotationButton = find("#rotation");
    	resultText = find("#result");
    	scoreText = find("#score");
    }
    
    @Test
    public void playerVsComputerFontSizeSet() {
    	int size = (int) playerVsComputer.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void playerVsComputerLayoutXSet() {
    	int layoutX = (int) playerVsComputer.getLayoutX();
    	assertEquals(RPSViewBuilder.LEFT_EDGE, layoutX);
    }
    
    @Test
    public void playerVsComputerLayoutYSet() {
    	int layoutY = (int) playerVsComputer.getLayoutY();
    	assertEquals(RPSViewBuilder.PLAYER_Y, layoutY);
    }
    
    @Test
    public void playerVsComputerStartsSelected(){
        assertEquals(true, playerVsComputer.isSelected());
    }
    
    @Test
    public void computerVsComputerFontSizeSet() {
    	int size = (int) computerVsComputer.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void computerVsComputerLayoutXSet() {
    	int layoutX = (int) computerVsComputer.getLayoutX();
    	assertEquals(RPSViewBuilder.LEFT_EDGE, layoutX);
    }
    
    @Test
    public void computerVsComputerLayoutYSet() {
    	int layoutY = (int) computerVsComputer.getLayoutY();
    	assertEquals(RPSViewBuilder.COMPUTER_Y, layoutY);
    }
    
    @Test
    public void chooseWeaponrFontSizeSet() {
    	int size = (int) chooseWeapon.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void chooseWeaponColourSet() {
    	Color colour = (Color) chooseWeapon.getFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void chooseWeaponLayoutXSet() {
    	int layoutX = (int) chooseWeapon.getLayoutX();
    	assertEquals(RPSViewBuilder.WEAPON_X, layoutX);
    }
    
    @Test
    public void chooseWeaponLayoutYSet() {
    	int layoutY = (int) chooseWeapon.getLayoutY();
    	assertEquals(RPSViewBuilder.CHOOSE_TEXT_Y, layoutY);
    }
    
    @Test
    public void chooseStrategyFontSizeSet() {
    	int size = (int) chooseStrategy.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void chooseStrategyColourSet() {
    	Color colour = (Color) chooseStrategy.getFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void chooseStrategyLayoutXSet() {
    	int layoutX = (int) chooseStrategy.getLayoutX();
    	assertEquals(RPSViewBuilder.STRATEGY_X, layoutX);
    }
    
    @Test
    public void chooseStrategyLayoutYSet() {
    	int layoutY = (int) chooseStrategy.getLayoutY();
    	assertEquals(RPSViewBuilder.CHOOSE_TEXT_Y, layoutY);
    }
    
    @Test
    public void rockButtonFontSizeSet() {
    	int size = (int) rockButton.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void rockButtonColourSet() {
    	Color colour = (Color) rockButton.getTextFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void rockButtonLayoutXSet() {
    	int layoutX = (int) rockButton.getLayoutX();
    	assertEquals(RPSViewBuilder.ROCK_X, layoutX);
    }
    
    @Test
    public void rockButtonLayoutYSet() {
    	int layoutY = (int) rockButton.getLayoutY();
    	assertEquals(RPSViewBuilder.BUTTON_Y, layoutY);
    }
    
    @Test
    public void paperButtonFontSizeSet() {
    	int size = (int) paperButton.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void paperButtonColourSet() {
    	Color colour = (Color) paperButton.getTextFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void paperButtonLayoutXSet() {
    	int layoutX = (int) paperButton.getLayoutX();
    	assertEquals(RPSViewBuilder.PAPER_X, layoutX);
    }
    
    @Test
    public void paperButtonLayoutYSet() {
    	int layoutY = (int) paperButton.getLayoutY();
    	assertEquals(RPSViewBuilder.BUTTON_Y, layoutY);
    }
    
    @Test
    public void scissorsButtonFontSizeSet() {
    	int size = (int) scissorsButton.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void scissorsButtonColourSet() {
    	Color colour = (Color) scissorsButton.getTextFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void scissorsButtonLayoutXSet() {
    	int layoutX = (int) scissorsButton.getLayoutX();
    	assertEquals(RPSViewBuilder.SCISSORS_X, layoutX);
    }
    
    @Test
    public void scissorsButtonLayoutYSet() {
    	int layoutY = (int) scissorsButton.getLayoutY();
    	assertEquals(RPSViewBuilder.BUTTON_Y, layoutY);
    }
    
    @Test
    public void randomButtonFontSizeSet() {
    	int size = (int) randomButton.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void randomButtonColourSet() {
    	Color colour = (Color) randomButton.getTextFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void randomButtonLayoutXSet() {
    	int layoutX = (int) randomButton.getLayoutX();
    	assertEquals(RPSViewBuilder.RANDOM_X, layoutX);
    }
    
    @Test
    public void randomButtonLayoutYSet() {
    	int layoutY = (int) randomButton.getLayoutY();
    	assertEquals(RPSViewBuilder.BUTTON_Y, layoutY);
    }
    
    @Test
    public void fixedButtonFontSizeSet() {
    	int size = (int) fixedButton.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void fixedButtonColourSet() {
    	Color colour = (Color) fixedButton.getTextFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void fixedButtonLayoutXSet() {
    	int layoutX = (int) fixedButton.getLayoutX();
    	assertEquals(RPSViewBuilder.FIXED_X, layoutX);
    }
    
    @Test
    public void fixedButtonLayoutYSet() {
    	int layoutY = (int) fixedButton.getLayoutY();
    	assertEquals(RPSViewBuilder.BUTTON_Y, layoutY);
    }
    
    @Test
    public void rotationButtonFontSizeSet() {
    	int size = (int) rotationButton.getFont().getSize();
    	assertEquals(RPSViewBuilder.FONT_SIZE, size);
    }
    
    @Test
    public void rotationButtonColourSet() {
    	Color colour = (Color) rotationButton.getTextFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void rotationButtonLayoutXSet() {
    	int layoutX = (int) rotationButton.getLayoutX();
    	assertEquals(RPSViewBuilder.ROTATION_X, layoutX);
    }
    
    @Test
    public void rotationButtonLayoutYSet() {
    	int layoutY = (int) rotationButton.getLayoutY();
    	assertEquals(RPSViewBuilder.BUTTON_Y, layoutY);
    }
    
    @Test
    public void resultTextFontSizeSet() {
    	int size = (int) resultText.getFont().getSize();
    	assertEquals(RPSViewBuilder.RESULTS_SIZE, size);
    }
    
    @Test
    public void resultTextColourSet() {
    	Color colour = (Color) resultText.getFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void resultTextLayoutXSet() {
    	int layoutX = (int) resultText.getLayoutX();
    	assertEquals(RPSViewBuilder.LEFT_EDGE, layoutX);
    }
    
    @Test
    public void resultTextLayoutYSet() {
    	int layoutY = (int) resultText.getLayoutY();
    	assertEquals(RPSViewBuilder.RESULT_Y, layoutY);
    }
    
    @Test
    public void scoreTextFontSizeSet() {
    	int size = (int) scoreText.getFont().getSize();
    	assertEquals(RPSViewBuilder.RESULTS_SIZE, size);
    }
    
    @Test
    public void scoreTextColourSet() {
    	Color colour = (Color) scoreText.getFill();
    	assertEquals(RPSViewBuilder.COLOUR, colour);
    }
    
    @Test
    public void scoreTextLayoutXSet() {
    	int layoutX = (int) scoreText.getLayoutX();
    	assertEquals(RPSViewBuilder.SCORE_X, layoutX);
    }
    
    @Test
    public void scoreTextLayoutYSet() {
    	int layoutY = (int) scoreText.getLayoutY();
    	assertEquals(RPSViewBuilder.RESULT_Y, layoutY);
    }
}