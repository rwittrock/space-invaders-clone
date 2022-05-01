package com.example.spaceinvadersclone;

public class FPSManager {
    int frameRate = 30;
    int frameMs = 1000 / frameRate;
    long delayMS;
    long endMS;
    long startMS;

    public void startFrame(){
        startMS = System.currentTimeMillis();
    }

    public void endFrame(){
        endMS = System.currentTimeMillis();
        delayMS = frameMs - (endMS - startMS);
        try {
            Thread.sleep(delayMS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
