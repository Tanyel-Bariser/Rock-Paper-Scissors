package com.rockpaperscissors.view;

import static org.junit.Assert.assertEquals;
import javafx.scene.Parent;
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
	Text chooseWeapon, chooseStrategy;
	
    @Override
    protected Parent getRootNode() {
        RPSViewBuilder builder = new RPSViewBuilder(new Stage());
        Pane pane = new Pane();
        pane.getChildren().addAll(builder.pane.getChildren());
        return pane;
    }
    
    @Before
    public void setUp() {
    	playerVsComputer = find("#pvc");
    	computerVsComputer = find("#cvc");
    	chooseWeapon = find("#weapon");
    	chooseStrategy = find("#strategy");
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
}