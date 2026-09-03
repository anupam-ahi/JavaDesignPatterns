package org.example.commandPattern;

public class GarageDoor {
    GarageDoor garageDoor;
    void up(){
        System.out.println("Garage door is going up");
    }
    void down(){
        System.out.println("Garage door is going down");
    }
    void stop(){
        System.out.println("Garage door is stopping");
    }
    void lightOn(){
        System.out.println("Garage door is lighting on");
    }
    void lightOff(){
        System.out.println("Garage door is lighting off");
    }
}
