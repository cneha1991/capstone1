package de.openhpi.capstone1.controller;

import de.openhpi.capstone1.model.PositionChecker;

public class PositionController {

    PositionChecker oPositionChecker;

    public PositionController(PositionChecker oPositionChecker) {
        this.oPositionChecker = oPositionChecker;
    }

    public void recalculatePosition() {

    }

    public void HandleKeyPress() {
        oPositionChecker.updatePosition();
    }

}
