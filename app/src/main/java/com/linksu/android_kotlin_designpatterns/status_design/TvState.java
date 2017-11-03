package com.linksu.android_kotlin_designpatterns.status_design;

/**
 * Created by suful on 2017/11/3.
 * 电视状态接口 定义了电视操作的函数
 */

public interface TvState {
    void nextChannel();

    void prevChannel();

    void turnUp();

    void turnDown();
}
