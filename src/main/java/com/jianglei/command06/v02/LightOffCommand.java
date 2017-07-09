package com.jianglei.command06.v02;

/**
 * Created by jianglei on 2017/7/9.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
