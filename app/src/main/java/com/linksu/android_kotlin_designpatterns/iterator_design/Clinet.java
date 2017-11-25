package com.linksu.android_kotlin_designpatterns.iterator_design;

import com.linksu.android_kotlin_designpatterns.iterator_design.actualcombat.BossLeader;
import com.linksu.android_kotlin_designpatterns.iterator_design.actualcombat.DirectorLeader;
import com.linksu.android_kotlin_designpatterns.iterator_design.actualcombat.GroupLeader;
import com.linksu.android_kotlin_designpatterns.iterator_design.actualcombat.ManagerLeader;
import com.linksu.android_kotlin_designpatterns.iterator_design.template.AbstractHandler;
import com.linksu.android_kotlin_designpatterns.iterator_design.template.AbstractRequest;
import com.linksu.android_kotlin_designpatterns.iterator_design.template.ConcreteHandler1;
import com.linksu.android_kotlin_designpatterns.iterator_design.template.ConcreteHandler2;
import com.linksu.android_kotlin_designpatterns.iterator_design.template.Handler1;
import com.linksu.android_kotlin_designpatterns.iterator_design.template.Handler2;
import com.linksu.android_kotlin_designpatterns.iterator_design.template.Handler3;
import com.linksu.android_kotlin_designpatterns.iterator_design.template.Requset1;
import com.linksu.android_kotlin_designpatterns.iterator_design.template.Requset2;
import com.linksu.android_kotlin_designpatterns.iterator_design.template.Requset3;

import java.security.acl.Group;

/**
 * Created by suful on 2017/11/25.
 */

public class Clinet {
    //模板
    public static void main(String[] args) {
//        ConcreteHandler1 handler1 = new ConcreteHandler1();
//
//        ConcreteHandler2 handler2 = new ConcreteHandler2();
//
//        //设置handler1 的下一个节点
//        handler1.successor = handler2;
//
//        //设置handler2 的下一个节点
//        handler2.successor = handler1;
//
//        //处理请求
//        handler1.handleRequest("ConcreteHandler2");

//        AbstractHandler handler1 = new Handler1();
//        AbstractHandler handler2 = new Handler2();
//        AbstractHandler handler3 = new Handler3();
//
//        handler1.nextHandler = handler2;
//        handler2.nextHandler = handler3;
//
//        AbstractRequest request1 = new Requset1("Request1");
//        AbstractRequest request2 = new Requset2("Request2");
//        AbstractRequest request3 = new Requset3("Request3");
//
//        handler1.handlerRequest(request1);
//        handler1.handlerRequest(request2);
//        handler1.handlerRequest(request3);

        //构造各个领导对象
        GroupLeader groupLeader = new GroupLeader();
        DirectorLeader directorLeader = new DirectorLeader();
        ManagerLeader managerLeader = new ManagerLeader();
        BossLeader bossLeader = new BossLeader();

        groupLeader.nextHandler = directorLeader;
        directorLeader.nextHandler = managerLeader;
        managerLeader.nextHandler = bossLeader;

        groupLeader.handleRequest(5000);
    }
}
