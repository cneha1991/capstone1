package de.openhpi.capstone1.model;

import de.openhpi.capstone1.view.Observer;

public interface Subject {
    void attach(Observer observer);

    void notifyAllObservers();
}
