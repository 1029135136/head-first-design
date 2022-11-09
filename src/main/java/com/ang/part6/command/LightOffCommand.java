package com.ang.part6.command;

import com.ang.part6.model.Light;

/**
 * @author: 于昂
 * @date: 2022/11/8
 **/
public class LightOffCommand implements Command {
    Light light;

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
