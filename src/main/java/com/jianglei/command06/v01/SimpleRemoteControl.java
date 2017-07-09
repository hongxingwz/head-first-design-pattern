package com.jianglei.command06.v01;

/**
 * Created by jianglei on 2017/7/9.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public SimpleRemoteControl(Command slot) {
        this.slot = slot;
    }

    public void buttomWasPressed() {
        slot.execute();
    }
}
