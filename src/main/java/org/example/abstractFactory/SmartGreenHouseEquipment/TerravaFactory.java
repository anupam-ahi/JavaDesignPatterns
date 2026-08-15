package org.example.abstractFactory.SmartGreenHouseEquipment;

public class TerravaFactory implements Equipment{

    @Override
    public HumiditySensor getHumiditySensor() {
        return new TerravaHumiditySensor();
    }

    @Override
    public WateringController getWateringController() {
        return new TerravaWateringController();
    }

    @Override
    public VentilationController getVentilationController() {
        return new TerravaVentilationController();
    }
}
