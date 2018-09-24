package de.openhpi.capstone1.starter;

import de.openhpi.capstone1.controller.PositionController;
import de.openhpi.capstone1.model.PositionChecker;
import de.openhpi.capstone1.view.Ball;
import de.openhpi.capstone1.view.Handle;
import processing.core.PApplet;

public class Project extends PApplet {
    private Ball BallView;
    private Handle HandleView;
    private PositionChecker oPositionChecker;
    private PositionController oPositionController;

    @Override
    public void settings() {
        size(640, 360);

    }

    @Override
    public void setup() {
        // fill(120, 50, 40);
        noStroke();
        frameRate(30);
        oPositionChecker = new PositionChecker();
        oPositionController = new PositionController(oPositionChecker);
        BallView = new Ball(this, oPositionChecker);
        HandleView = new Handle(this, oPositionChecker);
        BallView.setup();
    }

    @Override
    public void draw() {
        background(255, 255, 255);
        BallView.draw();
        HandleView.draw();
        BallView.checkCollision(HandleView);
    }

    @Override
    public void keyPressed() {
        oPositionController.HandleKeyPress();
    }

}
