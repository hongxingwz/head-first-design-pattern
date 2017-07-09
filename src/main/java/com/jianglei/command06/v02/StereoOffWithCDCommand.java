package com.jianglei.command06.v02;

/**
 * Created by jianglei on 2017/7/9.
 */
public class StereoOffWithCDCommand implements Command {
    private Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();

    }
}
