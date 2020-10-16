package com.internshala.game;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
private Controller controller;
    @Override
    public void start(Stage primaryStage) throws Exception{
       FXMLLoader loader=new FXMLLoader(getClass().getResource("gamesam.fxml"));
        GridPane rootGridPane=loader.load();
       controller= loader.getController();
       controller.createPlayground();


       MenuBar menuBar=createMenu();
       menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        Pane menuPane= (Pane) rootGridPane.getChildren().get(0);
        menuPane.getChildren().add(menuBar);

       Scene scene=new Scene(rootGridPane);

       primaryStage.setScene(scene);
       primaryStage.setTitle("game");
       primaryStage.setResizable(false);
       primaryStage.show();
    }
private MenuBar createMenu() {

    Menu fileMenu=new Menu("file");
    MenuItem newGame=new MenuItem("newGame");
    newGame.setOnAction(event -> resetGame());
    MenuItem resetGame=new MenuItem("resetGame");
    newGame.setOnAction(event -> resetGame());
    SeparatorMenuItem  SeparatorMenuItem=new  SeparatorMenuItem();
    MenuItem exitGame=new MenuItem("exitGame");
    exitGame.setOnAction(event -> exitGame());

    fileMenu.getItems().addAll(newGame,resetGame,SeparatorMenuItem, exitGame);

    Menu helpMenu=new Menu("help");
    MenuItem aboutGame=new MenuItem("aboutGame");
    aboutGame.setOnAction(event -> aboutGame());

    SeparatorMenuItem = new SeparatorMenuItem();
    MenuItem aboutMe=new MenuItem("aboutMe");
    aboutMe.setOnAction(event -> aboutme());

    helpMenu.getItems().addAll(aboutGame,SeparatorMenuItem,aboutGame);





    MenuBar menuBar =new MenuBar();
    menuBar.getMenus().addAll(fileMenu,helpMenu);
    return  menuBar ;

}

    private void aboutme() {
        Alert alert =new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("About the developer");
        alert.setHeaderText("Abhishek singh");
        alert.setContentText(" I loves to play and create games." +
                "  from my childhood i used to invent many physical games");
        alert.show();



    }

    private void aboutGame() {
        Alert alert =new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("about connect 4 game");
        alert.setHeaderText("how to play");
        alert.setContentText("Connect Four is a two-player connection game in which the players first choose a color and then take turns dropping colored discs from the top into a seven-column, six-row vertically suspended grid. " +
                "The pieces fall straight down, occupying the next available space within the column. " +
                "The objective of the game is to be the first to form a horizontal, vertical, or diagonal line of four of one's own discs." +
                " Connect Four is a solved game. " +
                "The first player can always win by playing the right moves. ");
        alert.show();
    }

    private void exitGame() {
        Platform.exit();
        System.exit(0);
    }

    private void resetGame() {
    }

    public static void main(String[] args) {
        launch(args);
    }
}
