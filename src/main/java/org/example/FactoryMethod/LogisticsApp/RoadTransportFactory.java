package org.example.FactoryMethod.LogisticsApp;

public class RoadTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
