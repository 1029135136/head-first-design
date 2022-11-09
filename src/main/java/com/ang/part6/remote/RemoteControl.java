package com.ang.part6.remote;

import com.ang.part6.command.Command;
import com.ang.part6.command.NoCommand;

/**
 * @author: 于昂
 * @date: 2022/11/8
 **/
public class RemoteControl {
    private static final int SIZE = 7;
    private Command[] onCommands;
    private Command[] offCommands;
    private Command unCommand;

    public RemoteControl() {
        this.onCommands = new Command[SIZE];
        this.offCommands = new Command[SIZE];
        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < SIZE; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }


    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        unCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        unCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        unCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("\n------------------------remote control ------------------------------\n");
        for (int i = 0; i < SIZE; i++) {
            stringBuffer.append(String.format("[slot %d] %s    %s %n", i, onCommands[i].getClass()
                                                                                      .getSimpleName(), offCommands[i].getClass()
                                                                                                                      .getSimpleName()));
        }
        return stringBuffer.toString();
    }
}
