package com.ang.command;

import com.ang.command.command.*;
import com.ang.command.model.CeilingFan;
import com.ang.command.model.GarageDoor;
import com.ang.command.model.Light;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RemoteControlTest {
    @Test
    public void test1() {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);


        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        remoteControl.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);


//        System.out.println(remoteControl);

        remoteControl.buttonOnPressed(0);
//        remoteControl.undoButtonPressed();
        remoteControl.buttonOffPressed(0);
//        remoteControl.undoButtonPressed();

        remoteControl.buttonOnPressed(1);
        remoteControl.buttonOffPressed(1);
//        remoteControl.undoButtonPressed();
    }

    @Test
    public void test2() {
        RemoteControl remote = new RemoteControl();
        CeilingFan fan = new CeilingFan("Living Room");
        CeilingFanLowCommand lowCommand = new CeilingFanLowCommand(fan);

        CeilingFanHighCommand highCommand = new CeilingFanHighCommand(fan);

        CeilingFanOffCommand offCommand = new CeilingFanOffCommand(fan);


        remote.setCommand(0, lowCommand, offCommand);
        remote.setCommand(1, highCommand, offCommand);


        System.out.println(remote);
        remote.buttonOnPressed(0);
        remote.buttonOnPressed(1);
        remote.undoButtonPressed();
        remote.buttonOffPressed(1);
        remote.undoButtonPressed();
        System.out.println(remote);

    }

    @Test
    public void test3() {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        MacroOnCommand macroOnCommand = new MacroOnCommand(lightOnCommand, garageDoorOpenCommand);

        MacroOffCommand macroOffCommand = new MacroOffCommand(lightOffCommand, garageDoorCloseCommand);
        remote.setCommand(0, macroOnCommand, macroOffCommand);

        remote.buttonOnPressed(0);

        remote.buttonOffPressed(0);

        System.out.println(remote);

        remote.undoButtonPressed();
    }
}
