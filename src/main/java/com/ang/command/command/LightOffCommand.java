package com.ang.command.command;

import com.ang.command.model.Light;

/**
 * @author: 于昂
 * @date: 2022/8/5
 **/
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
