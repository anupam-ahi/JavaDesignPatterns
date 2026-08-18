package org.example.adapterPattern.fitnessApp;

public class FitnessApp {
    NewStepCounter newStepCounter;

    public NewStepCounter getNewStepCounter() {
        return newStepCounter;
    }

    public void setNewStepCounter(NewStepCounter newStepCounter) {
        this.newStepCounter = newStepCounter;
    }
    public void printDataInKilometers() {
        newStepCounter.printDataInKilometers();
    }
}
