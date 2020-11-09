package pl.sdk.gui;

import pl.sdk.GameEngine;
import pl.sdk.Point;

import java.util.ArrayList;

public class Start {

    Start() {
        GameEngine gameEngine = new GameEngine(new ArrayList<>(), new ArrayList<>());
        gameEngine.move(new Point(5, 5));
    }
}
