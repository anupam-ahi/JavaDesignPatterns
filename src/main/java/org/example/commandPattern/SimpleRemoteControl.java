package org.example.commandPattern;

public class SimpleRemoteControl {
    Command slot;
    public void buttonWasPressed(){
        slot.execute();
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

}
