package com.linksu.android_kotlin_designpatterns.iterator_design.actualcombat;

/**
 * Created by suful on 2017/11/25.
 * 组长
 */

public class GroupLeader extends Leader {
    @Override
    public int limit() {
        return 1000;
    }

    @Override
    public void handle(int money) {
        System.out.println("组长批复报销 money = [" + money + "]");
    }

    @Override
    public String getLeaderName() {
        return "组长";
    }

    @Override
    public boolean isRest() {
        return false;
    }
}
