package com.jianglei.command06.v02;

import org.junit.Test;

/**
 * Created by jianglei on 2017/7/9.
 */
public class RemoteControlTest {

    @Test
    public void testExecute() {
        RemoteControl rc = new RemoteControl();
        Light light = new Light();
        rc.setCommand(
                0, new LightOnCommand(light), new LightOffCommand(light));
        rc.onButtonWasPushed(0);
        rc.offButtonWasPushed(0);

        Stereo stereo = new Stereo();
        rc.setCommand(1, new StereoOnWithCDCommand(stereo), new StereoOffWithCDCommand(stereo));

        rc.onButtonWasPushed(1);
        rc.offButtonWasPushed(1);
    }
}
