package com.linksu.android_kotlin_designpatterns.iterator_design.actualcombat;

/**
 * Created by suful on 2017/11/25.
 * 经理
 */

public class BossLeader extends Leader {
    @Override
    public int limit() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void handle(int money) {
        System.out.println("老板批复报销 money = [" + money + "]");
    }

    @Override
    public String getLeaderName() {
        return "Boss";
    }

    @Override
    public boolean isRest() {
        return false;
    }
}
