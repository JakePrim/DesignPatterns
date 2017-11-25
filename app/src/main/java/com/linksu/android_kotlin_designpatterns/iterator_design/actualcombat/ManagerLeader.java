package com.linksu.android_kotlin_designpatterns.iterator_design.actualcombat;

/**
 * Created by suful on 2017/11/25.
 * 经理
 */

public class ManagerLeader extends Leader {
    @Override
    public int limit() {
        return 10000;
    }

    @Override
    public void handle(int money) {
        System.out.println("经理批复报销 money = [" + money + "]");
    }

    @Override
    public String getLeaderName() {
        return "经理";
    }

    @Override
    public boolean isRest() {
        return false;
    }
}
