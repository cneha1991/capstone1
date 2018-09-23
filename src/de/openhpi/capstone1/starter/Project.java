package de.openhpi.capstone1.starter;

import java.awt.event.KeyEvent;

import de.openhpi.capstone1.model.PositionChecker;
import de.openhpi.capstone1.model.Subject;
import de.openhpi.capstone1.view.Ball;
import de.openhpi.capstone1.view.Handle;
import de.openhpi.capstone1.view.Observer;
import processing.core.PApplet;

public class Project extends PApplet {
    private Observer BallView;
    private Observer HandleView;
    private Subject oPositionChecker;

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
        BallView = new Ball(this, oPositionChecker);
        HandleView = new Handle(this, oPositionChecker);
        BallView.setup();
    }

    @Override
    public void draw() {
        background(102);
        BallView.draw();
        HandleView.draw();
    }

    @Override
    public void keyPressed() {
        if (key == CODED) {
            if (keyCode == KeyEvent.VK_LEFT) {
                HandleView.update();
            } else if (keyCode == KeyEvent.VK_RIGHT) {
                HandleView.update();
            }
        }
    }

}
