package com.ang.part6.command;

import com.ang.part6.model.Stereo;

/**
 * @author: 于昂
 * @date: 2022/11/8
 **/
public class StereoOffCommand implements Command{
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
