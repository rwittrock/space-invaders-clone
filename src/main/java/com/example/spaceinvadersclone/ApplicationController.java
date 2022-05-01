package com.example.spaceinvadersclone;

import javafx.animation.AnimationTimer;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

import java.io.IOException;
import java.net.URL;
import java.util.EventListener;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class ApplicationController implements Initializable {
    @FXML private AnchorPane anchorPane;
    @FXML private Rectangle playerRectangle = new Rectangle();
    @FXML private Button startGameButton;

    int sceneWidth = 800;
    int sceneHeight = 600;

    Player player = new Player(sceneWidth/2,sceneHeight/2);

    @FXML
    public void instantiatePlayer(){
        anchorPane.getChildren().add(playerRectangle);
        playerRectangle.setHeight(10);
        playerRectangle.setWidth(10);
        playerRectangle.setX(player.xPos);
        playerRectangle.setY(player.yPos);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    @FXML
    public void startGame(){
        startGameButton.setDisable(true);
        startGameButton.setVisible(false);
        instantiatePlayer();
        GameController controller = new GameController(player, playerRectangle, anchorPane);
        Thread thread = new Thread(controller);
        thread.start();
    }

}