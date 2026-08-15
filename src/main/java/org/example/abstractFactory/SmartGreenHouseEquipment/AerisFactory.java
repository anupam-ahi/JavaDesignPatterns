package org.example.abstractFactory.SmartGreenHouseEquipment;

public class AerisFactory implements Equipment{

    @Override
    public HumiditySensor getHumiditySensor() {
        return new AerisHumiditySensor();
    }

    @Override
    public WateringController getWateringController() {
        return new AerisWateringController();
    }

    @Override
    public VentilationController getVentilationController() {
        return new AerisVentilationController();
    }
}
