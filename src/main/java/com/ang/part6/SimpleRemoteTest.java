package com.ang.part6;

import com.ang.part6.command.GarageDoorCommand;
import com.ang.part6.command.LightOnCommand;
import com.ang.part6.model.GarageDoor;
import com.ang.part6.model.Light;
import com.ang.part6.remote.SimpleRemoteControl;

/**
 * @author: 于昂
 * @date: 2022/11/8
 **/
public class SimpleRemoteTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remoteControl.setSlot(lightOnCommand);
        remoteControl.buttonWasPressed();


        GarageDoor garageDoor = new GarageDoor();
        GarageDoorCommand garageDoorCommand = new GarageDoorCommand(garageDoor);
        remoteControl.setSlot(garageDoorCommand);
        remoteControl.buttonWasPressed();
    }
}
