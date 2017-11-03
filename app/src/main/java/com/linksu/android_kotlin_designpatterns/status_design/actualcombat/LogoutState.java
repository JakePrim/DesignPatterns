package com.linksu.android_kotlin_designpatterns.status_design.actualcombat;

import com.linksu.android_kotlin_designpatterns.prototype_design.actualcombat.User;

/**
 * Created by suful on 2017/11/3.
 */

public class LogoutState implements UserState {
    @Override
    public void forward() {
        System.out.println("未登录，请登录后再转发");
    }

    @Override
    public void comment() {
        System.out.println("未登录，请登录后再评论");
    }
}
