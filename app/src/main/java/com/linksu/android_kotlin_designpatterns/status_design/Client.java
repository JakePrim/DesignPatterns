package com.linksu.android_kotlin_designpatterns.status_design;

import com.linksu.android_kotlin_designpatterns.status_design.actualcombat.LoginContext;
import com.linksu.android_kotlin_designpatterns.status_design.actualcombat.LoginedState;
import com.linksu.android_kotlin_designpatterns.status_design.actualcombat.LogoutState;

/**
 * Created by suful on 2017/11/3.
 */

public class Client {
    public static void main(String[] args) {
        PowerController controller = new PowerController();
        controller.powerOn();
        controller.nextChannel();
        controller.prevChannel();
        controller.powerOff();
        controller.nextChannel();
        controller.prevChannel();

        LoginContext.getsLoginContext().setState(new LoginedState());

        LoginContext.getsLoginContext().forward();

        LoginContext.getsLoginContext().setState(new LogoutState());

        LoginContext.getsLoginContext().forward();
    }
}
