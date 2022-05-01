package com.example.spaceinvadersclone;

import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {

    public static boolean dPressed = false;
    public static boolean aPressed = false;
    public static boolean wPressed = false;
    public static boolean sPressed = false;
    public static boolean spacePressed= false;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("space-invaders.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ke) {
                if(ke.getCode() == KeyCode.SPACE){
                    spacePressed = true;
                }
                if(ke.getCode() == KeyCode.A){
                    aPressed = true;
                }
                if(ke.getCode() == KeyCode.D){
                    dPressed = true;
                }
                if(ke.getCode() == KeyCode.S){
                    sPressed = true;
                }
                if(ke.getCode() == KeyCode.W){
                    wPressed = true;
                }

            }
        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent ke) {
                if(ke.getCode() == KeyCode.SPACE){
                    spacePressed = false;
                }
                if(ke.getCode() == KeyCode.A){
                    aPressed = false;
                }
                if(ke.getCode() == KeyCode.D){
                    dPressed = false;
                }
                if(ke.getCode() == KeyCode.S){
                    sPressed = false;
                }
                if(ke.getCode() == KeyCode.W){
                    wPressed = false;
                }
            }
        });

        stage.setTitle("Space Invaders Clone");
        stage.setScene(scene);
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }
}