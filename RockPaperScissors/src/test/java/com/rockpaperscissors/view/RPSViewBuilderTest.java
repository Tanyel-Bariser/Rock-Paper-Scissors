package com.rockpaperscissors.view;

import static org.junit.Assert.*;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.loadui.testfx.GuiTest;
import org.loadui.testfx.categories.TestFX;

@Category(TestFX.class)
public class RPSViewBuilderTest extends GuiTest {
    @Override
    protected Parent getRootNode() {
        RPSViewBuilder builder = RPSViewBuilder.getRPSViewBuilder(new Stage());
        Pane pane = new Pane();
        pane.getChildren().addAll(builder.pane.getChildren());
        return pane;
    }
    
    @Test
    public void playerVsComputerStartsSelected(){
        CheckBox playerVsComputer= find( "#PvC" );
        assertSame(true, playerVsComputer.isSelected());
    }
}