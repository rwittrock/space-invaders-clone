package com.example.spaceinvadersclone;

public class Player {
    int xPos;
    int yPos;
    int velocity;

    public Player(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
        velocity = 5;
    }

    public void moveUp(){
        this.yPos-=velocity;
    }

    public void moveDown(){
        this.yPos+=velocity;
    }

    public void moveLeft(){
        this.xPos-=velocity;
    }

    public void moveRight(){
        this.xPos+=velocity;
    }
}
