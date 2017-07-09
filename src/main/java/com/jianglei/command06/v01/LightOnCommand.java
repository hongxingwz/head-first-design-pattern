package com.jianglei.command06.v01;

/**
 * Created by jianglei on 2017/7/9.
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
