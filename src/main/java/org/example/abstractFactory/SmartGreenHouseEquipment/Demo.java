package org.example.abstractFactory.SmartGreenHouseEquipment;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    private static List<Application> configureApplication() {
        Equipment equipment1, equipment2;
        equipment1 = new AerisFactory();
        equipment2 = new TerravaFactory();
        List<Application> applications = new ArrayList<>();
        applications.add(new Application(equipment1));
        applications.add(new Application(equipment2));
        return applications;
    }
    public static void main(String[] args){
        List<Application> applications = Demo.configureApplication();
        for (Application application : applications){
            application.printMessage();
        }
    }

}

