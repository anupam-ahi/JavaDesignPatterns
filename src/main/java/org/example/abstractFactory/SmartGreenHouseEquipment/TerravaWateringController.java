package org.example.abstractFactory.SmartGreenHouseEquipment;

public class TerravaWateringController implements WateringController {

    @Override
    public void printMessageFromWateringController() {
        System.out.println("This is Terrava WateringController");
    }
}
