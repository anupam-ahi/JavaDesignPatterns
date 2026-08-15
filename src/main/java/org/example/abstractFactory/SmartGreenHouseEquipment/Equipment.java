package org.example.abstractFactory.SmartGreenHouseEquipment;

public interface Equipment {
    HumiditySensor getHumiditySensor();
    WateringController getWateringController();
    VentilationController getVentilationController();
}
