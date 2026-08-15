package org.example.abstractFactory.SmartGreenHouseEquipment;

public class Application {
    private HumiditySensor humiditySensor;
    private WateringController wateringController;
    private VentilationController ventilationController;
    public Application(Equipment equipment) {
        humiditySensor = equipment.getHumiditySensor();
        wateringController = equipment.getWateringController();
        ventilationController = equipment.getVentilationController();

    }
    public void printMessage(){
        humiditySensor.printMessageFromHumiditySensor();
        wateringController.printMessageFromWateringController();
        ventilationController.printMessageFromVentilationController();
    }
}
