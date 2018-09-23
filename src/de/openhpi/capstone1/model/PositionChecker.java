package de.openhpi.capstone1.model;

import java.util.ArrayList;

import de.openhpi.capstone1.view.Observer;

public class PositionChecker implements Subject {
    ArrayList<Observer> aObservers = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        this.aObservers.add(observer);

    }

    @Override
    public void notifyAllObservers() {
        for (Observer oObserver : aObservers) {
            oObserver.update();
        }
    }

}
