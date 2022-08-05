package com.ang.command;

import com.ang.command.command.Command;
import com.ang.command.command.NoCommand;

import java.util.Arrays;

/**
 * @author: 于昂
 * @date: 2022/8/5
 **/
public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    /**
     * 最后一次执行的命令
     */
    private Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        undoCommand =  NoCommand.getInstance();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = NoCommand.getInstance();
            offCommands[i] = NoCommand.getInstance();
        }
    }

    public void setCommand(int buttonNum, Command onCommand, Command offCommand) {
        onCommands[buttonNum] = onCommand;
        offCommands[buttonNum] = offCommand;
    }

    public void buttonOnPressed(int buttonNum) {
        onCommands[buttonNum].execute();
        undoCommand = onCommands[buttonNum];
    }

    public void buttonOffPressed(int buttonNum) {
        offCommands[buttonNum].execute();
        undoCommand = offCommands[buttonNum];
    }

    public void undoButtonPressed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n===============================================Remote Control=====================================================\n");

        for (int i = 0; i < onCommands.length; i++) {
            String str = String.format("slot[%d] %s        %s %n",
                    i,
                    onCommands[i].getClass()
                                 .getName(),
                    offCommands[i].getClass()
                                  .getName());
            sb.append(str);
        }
        sb.append(String.format("[undo] %s", undoCommand.getClass().getName()));
        return sb.toString();
    }
}
