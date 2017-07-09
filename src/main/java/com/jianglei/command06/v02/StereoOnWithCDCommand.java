package com.jianglei.command06.v02;

/**
 * Created by jianglei on 2017/7/9.
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd("cd");
        stereo.setVolume("11");

        stereo.sing();

    }
}
