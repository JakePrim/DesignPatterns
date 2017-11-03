package com.linksu.android_kotlin_designpatterns.status_design.actualcombat;

/**
 * Created by suful on 2017/11/3.
 */

public class LoginContext {
    /**
     * 默认为未登录状态
     */
    UserState state = new LogoutState();

    private static LoginContext sLoginContext;

    private LoginContext() {

    }

    public static LoginContext getsLoginContext() {
        if (sLoginContext == null) {
            synchronized (LoginContext.class) {
                if (sLoginContext == null) {
                    sLoginContext = new LoginContext();
                }
            }
        }
        return sLoginContext;
    }


    public void setState(UserState state) {
        this.state = state;
    }

    public void forward() {
        state.forward();
    }

    public void comment() {
        state.comment();
    }
}
