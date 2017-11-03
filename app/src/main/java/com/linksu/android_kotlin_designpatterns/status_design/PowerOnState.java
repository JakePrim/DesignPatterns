package com.linksu.android_kotlin_designpatterns.status_design;

/**
 * Created by suful on 2017/11/3.
 */

public class PowerOnState implements TvState {
    @Override
    public void nextChannel() {
        System.out.println("下一个频道");
    }

    @Override
    public void prevChannel() {
        System.out.println("上一个频道");
    }

    @Override
    public void turnUp() {
        System.out.println("调高音量");
    }

    @Override
    public void turnDown() {
        System.out.println("调低音量");
    }
}
