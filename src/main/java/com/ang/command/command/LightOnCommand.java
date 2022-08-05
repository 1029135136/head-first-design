package com.ang.command.command;

import com.ang.command.model.Light;

/**
 * @author: 于昂
 * @date: 2022/8/5
 **/
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
