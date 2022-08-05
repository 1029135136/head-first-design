package com.ang.command;

import com.ang.command.command.Command;

/**
 * @author: 于昂
 * @date: 2022/8/5
 **/
public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl() {
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
