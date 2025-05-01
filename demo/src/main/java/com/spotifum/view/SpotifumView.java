package com.spotifum.view;
public class SpotifumView {
    private ViewScreen currentScreen;

    public void setScreen(ViewScreen screen) {
        this.currentScreen = screen;
    }

    public void run() {
        while (true) {
            currentScreen.run();
        }
    }
}