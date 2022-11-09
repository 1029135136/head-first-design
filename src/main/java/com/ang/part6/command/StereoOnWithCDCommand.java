package com.ang.part6.command;

import com.ang.part6.model.Stereo;

/**
 * @author: 于昂
 * @date: 2022/11/8
 **/
public class StereoOnWithCDCommand implements Command{
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd("周杰伦的歌曲全集");
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
