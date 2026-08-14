package org.example.FactoryMethod.LogisticsApp;

public class Main {
    public static void main(String[] args) {
        Ship s = new Ship();
        s.deliver();
        Truck t = new Truck();
        t.deliver();

    }
}
