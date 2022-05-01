package com.example.spaceinvadersclone;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

public class GameController extends FPSManager implements Runnable{
    Player player;
    Rectangle playerRectangle;
    AnchorPane anchorPane;


    public GameController(Player player, Rectangle playerRectangle, AnchorPane anchorPane){
        this.player = player;
        this.playerRectangle = playerRectangle;
        this.anchorPane = anchorPane;
    }

    public void updatePlayerPos(){
        playerRectangle.setX(player.xPos);
        playerRectangle.setY(player.yPos);
    }

    public void gameLoop(){
        keyListener();
        updatePlayerPos();
    }

    @Override
    public void run() {
        while (true){
            startFrame();
            gameLoop();
            endFrame();
        }
    }

    public void keyListener(){
        if(Application.aPressed){
            player.moveLeft();
        }
        if(Application.dPressed){
            player.moveRight();
        }
        if(Application.wPressed){
            player.moveUp();
        }
        if(Application.sPressed){
            player.moveDown();
        }
    }
}
