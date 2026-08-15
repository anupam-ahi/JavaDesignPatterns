package org.example.abstractFactory.SmartGreenHouseEquipment;

public class TerravaVentilationController implements VentilationController {

    @Override
    public void printMessageFromVentilationController() {
        System.out.println("This is Terrava VentilationController");
    }
}
