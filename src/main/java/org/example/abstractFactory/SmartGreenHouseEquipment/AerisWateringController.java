package org.example.abstractFactory.SmartGreenHouseEquipment;

public class AerisWateringController implements WateringController {

    @Override
    public void printMessageFromWateringController() {
        System.out.println("This is Aeris WateringController");
    }
}
