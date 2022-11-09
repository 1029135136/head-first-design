package com.ang.part6;

import com.ang.part6.command.*;
import com.ang.part6.model.CeilingFan;
import com.ang.part6.model.Light;
import com.ang.part6.model.Stereo;
import com.ang.part6.remote.RemoteControl;

/**
 * @author: 于昂
 * @date: 2022/11/8
 **/
public class RemoteTest {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        CeilingFan ceilingFan = new CeilingFan("客厅");
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanHighCommand, ceilingFanOffCommand);
        remoteControl.setCommand(1, ceilingFanMediumCommand, ceilingFanOffCommand);
        remoteControl.setCommand(2, ceilingFanLowCommand, ceilingFanOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
    }
}
