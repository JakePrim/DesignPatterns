package com.linksu.android_kotlin_designpatterns.status_design;

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
    }
}
