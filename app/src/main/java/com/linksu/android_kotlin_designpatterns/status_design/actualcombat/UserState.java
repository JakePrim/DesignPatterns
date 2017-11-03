package com.linksu.android_kotlin_designpatterns.status_design.actualcombat;

/**
 * Created by suful on 2017/11/3.
 * 用户状态
 */

public interface UserState {

    /**
     * 转发
     */
    public void forward();

    /**
     * 评论
     */
    public void comment();
}
