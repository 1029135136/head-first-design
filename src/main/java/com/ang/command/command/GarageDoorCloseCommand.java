package com.ang.command.command;

import com.ang.command.model.GarageDoor;

/**
 * @author: 于昂
 * @date: 2022/8/5
 **/
public class GarageDoorCloseCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.close();
    }


    @Override
    public void undo() {
        garageDoor.open();
    }
}
