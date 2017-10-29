package com.linksu.android_kotlin_designpatterns.prototype_design;

import com.linksu.android_kotlin_designpatterns.prototype_design.actualcombat.Address;
import com.linksu.android_kotlin_designpatterns.prototype_design.actualcombat.LoginImpl;
import com.linksu.android_kotlin_designpatterns.prototype_design.actualcombat.LoginSession;
import com.linksu.android_kotlin_designpatterns.prototype_design.actualcombat.User;

/**
 * Created by suful on 2017/10/21.
 * 原型模式
 */

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
//        //原始文档
        WordDocument wordDocument = new WordDocument();
        wordDocument.setmText("这是正本文档");
        wordDocument.addImage("图片1");
        wordDocument.addImage("图片2");
        wordDocument.addImage("图片3");
        wordDocument.showDocument();

        //已原始文档为原型 拷贝一个副本 注意：Cloneable 实现拷贝时，构造函数是不会执行的
        WordDocument clone = wordDocument.clone();
        clone.showDocument();

        //修改副本文档
        clone.setmText("这是副本文档");
        clone.addImage("副本图片");
        clone.showDocument();

        //不会影响原始文档
        wordDocument.showDocument();


        LoginImpl login = new LoginImpl();
        login.login();
        User loginedUser = LoginSession.getLoginSession().getLoginedUser();
        loginedUser.address = new Address("北京市", "朝阳区", "酒仙桥街");
        loginedUser.phoneNum = "123";
        loginedUser.age = 23;
        loginedUser.name = "Mr.Name";
        System.out.println("没有调用setLoginSession 修改的副本用户数据:" + loginedUser.toString());
        System.out.println("没有调用setLoginSession 原来的用户数据:" + LoginSession.getLoginSession().getLoginedUser());
        LoginSession.getLoginSession().setLoginSession(loginedUser);
        System.out.println("调用setLoginSession 修改真正的用户数据:" + LoginSession.getLoginSession().getLoginedUser());
    }
}
