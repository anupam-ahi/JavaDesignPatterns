package org.example.abstractFactory.SmartGreenHouseEquipment;

public class TerravaHumiditySensor implements HumiditySensor {
    @Override
    public void printMessageFromHumiditySensor() {
        System.out.println("This is Terrava HumiditySensor");
    }
}
