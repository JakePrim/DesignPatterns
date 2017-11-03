package com.linksu.android_kotlin_designpatterns.status_design;

/**
 * Created by suful on 2017/11/3.
 */

public class PowerController implements PowerListener {
    private TvState state;

    public void setTvState(TvState state) {
        this.state = state;
    }


    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("开机了");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("关机了");
    }

    public void nextChannel() {
        state.nextChannel();
    }

    public void prevChannel() {
        state.prevChannel();
    }

    public void turnUp() {
        state.turnUp();
    }

    public void turnDown() {
        state.turnDown();
    }
}
