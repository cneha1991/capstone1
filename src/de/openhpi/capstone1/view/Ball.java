package de.openhpi.capstone1.view;

import de.openhpi.capstone1.model.Subject;
import processing.core.PApplet;

public class Ball extends Observer {
    int rad = 10; // Width of the shape
    float xpos, ypos; // Starting position of shape

    float xspeed = 5; // Speed of the shape
    float yspeed = 5; // Speed of the shape

    int xdirection = 1; // Left or Right
    int ydirection = 1; // Top to Bottom

    public Ball(PApplet display, Subject subject) {
        super(display, subject);

    }

    @Override
    public void setup() {
        display.ellipseMode(display.RADIUS);
        // Set the starting position of the shape
        xpos = display.width / 2;
        ypos = display.height / 2;
    }

    @Override
    public void draw() {
        display.noStroke();
        display.fill(204);

        // Update the position of the shape
        xpos = xpos + (xspeed * xdirection);
        ypos = ypos + (yspeed * ydirection);

        // Test to see if the shape exceeds the boundaries of the screen
        // If it does, reverse its direction by multiplying by -1
        if (xpos > display.width - rad || xpos < rad) {
            xdirection *= -1;
        }
        if (ypos > display.height - rad || ypos < rad) {
            ydirection *= -1;
        }

        // Draw the shape
        display.ellipse(xpos, ypos, rad, rad);
    }

    @Override
    public void update() {

    }
}
