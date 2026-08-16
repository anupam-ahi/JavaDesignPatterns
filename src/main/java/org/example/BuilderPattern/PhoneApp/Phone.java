package org.example.BuilderPattern.PhoneApp;

public class Phone {
    private final String os;
    private final int ram;
    private final String processor;
    private final double screenSize;
    private final int battery;

    public Phone(int ram, String os, String processor, double screenSize, int battery) {
        this.ram = ram;
        this.os = os;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }
}
