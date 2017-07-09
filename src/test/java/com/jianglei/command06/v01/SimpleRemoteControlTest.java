package com.jianglei.command06.v01;

import com.jianglei.command06.v01.Light;
import com.jianglei.command06.v01.LightOnCommand;
import com.jianglei.command06.v01.SimpleRemoteControl;
import org.junit.Test;

/**
 * Created by jianglei on 2017/7/9.
 */
public class SimpleRemoteControlTest {

    @Test
    public void testButtonWasPreddsed() {
        SimpleRemoteControl sc = new SimpleRemoteControl(
                                    new LightOnCommand(new Light()));
        sc.buttomWasPressed();
    }

    @Test
    public void testButtonWasPreddsed2() {
        SimpleRemoteControl sc = new SimpleRemoteControl(
                                    new GarageDoorOpenCommand(new GarageDoor()));
        sc.buttomWasPressed();
    }
}
