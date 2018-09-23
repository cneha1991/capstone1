package de.openhpi.capstone1.view;

import de.openhpi.capstone1.model.Subject;
import processing.core.PApplet;

public class Handle extends Observer {
    public Handle(PApplet display, Subject subject) {
        super(display, subject);
    }

    @Override
    public void update() {

    }

    @Override
    public void draw() {
        display.noStroke();
        display.fill(0);
        display.rect(display.width / 4, display.height - 20, display.width / 2, 20);

    }

    @Override
    public void setup() {
        // TODO Auto-generated method stub

    }
}
