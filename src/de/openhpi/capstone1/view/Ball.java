package de.openhpi.capstone1.view;

import de.openhpi.capstone1.model.Subject;
import processing.core.PApplet;
import processing.core.PVector;

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
        xpos = (int) display.random(rad, display.width - rad);
        ypos = (int) display.random(rad, display.height - rad);
    }

    @Override
    public void draw() {
        display.noStroke();
        display.fill(255, 0, 0);
        // Draw the shape
        display.ellipse(xpos, ypos, rad, rad);
    }

    public void checkCollision(Handle oHandleView) {
        PVector posHandle = oHandleView.getPosition();
        PVector dimHandle = oHandleView.getDimension();
        // Update the position of the shape
        xpos = xpos + (xspeed * xdirection);
        ypos = ypos + (yspeed * ydirection);

        // Test to see if the shape exceeds the boundaries of the screen
        // If it does, reverse its direction by multiplying by -1
        if (xpos > display.width - rad || xpos < rad) {
            xdirection *= -1;
        }
        if (ypos < rad || ((ypos > display.height - dimHandle.y - rad)
                && (xpos - rad >= posHandle.x && xpos + rad <= posHandle.x + dimHandle.x))) {
            ydirection *= -1;
        }

        // draw();
    }

    @Override
    public void update() {
        if (display.keyCode == display.ENTER) {
            setup();
        }
    }
}
