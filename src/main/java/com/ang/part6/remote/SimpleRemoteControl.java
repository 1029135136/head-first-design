package com.ang.part6.remote;

import com.ang.part6.command.Command;

/**
 * @author: 于昂
 * @date: 2022/11/8
 **/
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public SimpleRemoteControl(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
