package com.ang.command.command;

import com.ang.command.model.GarageDoor;

/**
 * @author: 于昂
 * @date: 2022/8/5
 **/
public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
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
