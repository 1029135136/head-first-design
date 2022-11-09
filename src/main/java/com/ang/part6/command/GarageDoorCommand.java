package com.ang.part6.command;

import com.ang.part6.model.GarageDoor;

/**
 * @author: 于昂
 * @date: 2022/11/8
 **/
public class GarageDoorCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }

    @Override
    public void undo() {
        garageDoor.close();
    }
}
