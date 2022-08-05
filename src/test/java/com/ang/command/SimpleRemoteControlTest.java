package com.ang.command;

import com.ang.command.command.GarageDoorOpenCommand;
import com.ang.command.command.LightOnCommand;
import com.ang.command.model.GarageDoor;
import com.ang.command.model.Light;
import org.junit.Test;

public class SimpleRemoteControlTest {
    @Test
    public void test1() {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        LightOnCommand lightOnCommand = new LightOnCommand(new Light());
        remote.setSlot(lightOnCommand);
        remote.buttonWasPressed();

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());
        remote.setSlot(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }

}
