package com.linksu.android_kotlin_designpatterns.prototype_design.actualcombat;

/**
 * Created by suful on 2017/10/26.
 * 登录Session
 */

public class LoginSession {
    static LoginSession loginSession = null;
    // 已登录用户
    private User loginedUser;

    public static LoginSession getLoginSession() {
        if (loginSession == null) {
            loginSession = new LoginSession();
        }
        return loginSession;
    }

    //设置已登录的用户信息，不对外开放
    public void setLoginSession(User user) {
        loginedUser = user;
    }

//    public User getCloneLoginedUser() {
//        return loginedUser.clone();
//    }

    public User getLoginedUser() {
        return loginedUser.clone();
    }
}
