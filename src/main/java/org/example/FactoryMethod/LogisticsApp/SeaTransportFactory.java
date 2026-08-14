package org.example.FactoryMethod.LogisticsApp;

public class SeaTransportFactory extends TransportFactory {
    public Transport createTransport() {
        return new Ship();
    }

}
