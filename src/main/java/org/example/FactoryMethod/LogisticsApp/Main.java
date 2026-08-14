package org.example.FactoryMethod.LogisticsApp;

public class Main {
    public static void main(String[] args) {
       TransportFactory seaLogistics = new SeaTransportFactory();
       seaLogistics.planDelivery();

       TransportFactory roadLogistics = new RoadTransportFactory();
       roadLogistics.planDelivery();

    }
}
