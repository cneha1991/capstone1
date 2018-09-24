package de.openhpi.capstone1.view;

import java.awt.event.KeyEvent;

import de.openhpi.capstone1.model.Subject;
import processing.core.PApplet;
import processing.core.PVector;

public class Handle extends Observer {
    int xPos, yPos;

    public Handle(PApplet display, Subject subject) {
        super(display, subject);
        xPos = display.width / 4;
        yPos = display.height - 20;
    }

    @Override
    public void update() {
        if (display.key == display.CODED) {
            if (display.keyCode == KeyEvent.VK_LEFT) {
                xPos -= 10;
                xPos = xPos < 0 ? 0 : xPos;
            } else if (display.keyCode == KeyEvent.VK_RIGHT) {
                xPos += 10;
                xPos = xPos + display.width / 4 >= display.width ? display.width * 3 / 4 : xPos;
            }
        }
    }

    public PVector getPosition() {
        PVector position = new PVector();
        position.x = xPos;
        position.y = yPos;
        return position;
    }

    public PVector getDimension() {
        PVector dim = new PVector();
        dim.x = display.width / 4;
        dim.y = 20;

        return dim;
    }

    @Override
    public void draw() {
        display.noStroke();
        display.fill(0);
        display.rect(xPos, yPos, display.width / 4, 20);

    }

    @Override
    public void setup() {
        // TODO Auto-generated method stub

    }
}
