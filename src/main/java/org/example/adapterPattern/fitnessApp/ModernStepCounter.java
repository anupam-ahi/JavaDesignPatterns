package org.example.adapterPattern.fitnessApp;

public class ModernStepCounter implements NewStepCounter{
    @Override
    public void printDataInKilometers() {
        System.out.println("Steps: 8000");
        System.out.println("Distance: 6.2 km");
    }
}
