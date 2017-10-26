package com.linksu.android_kotlin_designpatterns.prototypedesign.actualcombat;

/**
 * Created by suful on 2017/10/26.
 * 登录实现
 */

public class LoginImpl implements Login {
    @Override
    public void login() {
        //登录到服务器 获取用户信息
        User loginedUser = new User();
        //将服务器放回的完整信息设置给loginedUser对象
        loginedUser.age = 22;
        loginedUser.name = "Mr.Simple";
        loginedUser.phoneNum = "17600";
        loginedUser.address = new Address("北京市", "海淀区", "花园东路");
        //登录完之后将用户信息设置到Session 中
        LoginSession.getLoginSession().setLoginSession(loginedUser);
    }
}
