package org.example.adapterPattern.fitnessApp;

public class OldNewStepCounterAdapter implements NewStepCounter{
    OldStepCounter oldStepCounter = new OldStepCounter();
    @Override
    public void printDataInKilometers() {
        oldStepCounter.printDataInMiles();
        System.out.println("converted to kilometers");
    }
}
