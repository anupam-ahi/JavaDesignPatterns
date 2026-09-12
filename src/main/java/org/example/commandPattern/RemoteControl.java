package org.example.commandPattern;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];
//        Command noCommand = new NoCommand();
        for(int i = 0; i < 7; i++){
            onCommands[i] = null;
            offCommands[i] = null;
        }
    }
    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;

    }
    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i < 7; i++){
            stringBuffer.append(onCommands[i].getClass().getName() + "  " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }

}
