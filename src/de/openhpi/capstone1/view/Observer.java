package de.openhpi.capstone1.view;

import de.openhpi.capstone1.model.Subject;
import processing.core.PApplet;

public abstract class Observer {
    protected PApplet display;

    public Observer(PApplet display, Subject subject) {
        this.display = display;
        subject.attach(this);
    }

    public abstract void update();

    public abstract void draw();

    public abstract void setup();
}
