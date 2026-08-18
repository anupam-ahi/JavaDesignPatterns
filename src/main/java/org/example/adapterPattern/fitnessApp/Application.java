package org.example.adapterPattern.fitnessApp;

public class Application {
    public static void main(String[] args) {
        FitnessApp fitnessApp = new FitnessApp();
        NewStepCounter oldTracker = new OldNewStepCounterAdapter();
        fitnessApp.setNewStepCounter(oldTracker);
        fitnessApp.printDataInKilometers();

        NewStepCounter modernTracker = new ModernStepCounter();
        fitnessApp.setNewStepCounter(modernTracker);
        fitnessApp.printDataInKilometers();


    }
}
