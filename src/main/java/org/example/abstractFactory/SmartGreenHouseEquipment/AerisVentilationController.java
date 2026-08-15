package org.example.abstractFactory.SmartGreenHouseEquipment;

public class AerisVentilationController implements VentilationController {

    @Override
    public void printMessageFromVentilationController() {
        System.out.println("This is Aeris VentilationController");
    }
}
