package com.linksu.android_kotlin_designpatterns.status_design.actualcombat;

/**
 * Created by suful on 2017/11/3.
 * 用户登录状态
 */

public class LoginedState implements UserState {
    @Override
    public void forward() {
        System.out.println("已登录，成功转发");
    }

    @Override
    public void comment() {
        System.out.println("已登录，成功评论");
    }
}
