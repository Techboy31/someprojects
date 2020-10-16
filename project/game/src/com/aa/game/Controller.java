package com.internshala.game;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private static final int COLUMNS=7;
    private static final int ROWS=6;
    private static final int CICRCLE_DIAMETER=80;
    private static final String  discColor1="#24303E";
    private static final String  discolor2="#4CAA88";
    private static String PLAYER_ONE="PLAYER1";
    private static String PLAYER_TWO="PLAYER2";

    private boolean isPlayerOnetTurn=true;

    @FXML
    public GridPane rootGridPane;
    @FXML
    public Pane insertedDiskPane;
    @FXML
    public Label playerNameLabel;
    public void createPlayground()
    {
        
        rootGridPane.add(rectangleWidthHoles,0,1);
    }
    private Shape createGameStructuralGrid(){


        Shape rectangleWidthHoles= new Rectangle((COLUMNS+1)*CICRCLE_DIAMETER, (ROWS+1)*CICRCLE_DIAMETER);

        for(int row=1;row<ROWS;row++)
        {
            for(int column=1;column<COLUMNS;column++)
            {
                Circle circle=new Circle();
                circle.setRadius(CICRCLE_DIAMETER/2);
                circle.setCenterX(CICRCLE_DIAMETER/2);
                circle.setCenterY(CICRCLE_DIAMETER/2);
                circle.setTranslateX(column*(CICRCLE_DIAMETER+5)+ CICRCLE_DIAMETER/4 );
                circle.setTranslateY(row*(CICRCLE_DIAMETER+5)+CICRCLE_DIAMETER/4);
                rectangleWidthHoles=Shape.subtract(rectangleWidthHoles,circle);

            }
        }
        rectangleWidthHoles.setFill(Color.WHITE);
        return rectangleWidthHoles;








    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
