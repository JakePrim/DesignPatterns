package com.linksu.android_kotlin_designpatterns.iterator_design.actualcombat;

/**
 * Created by suful on 2017/11/25.
 * 主管
 */

public class DirectorLeader extends Leader {
    @Override
    public int limit() {
        return 5000;
    }

    @Override
    public void handle(int money) {
        System.out.println("主管批复报销 money = [" + money + "]");
    }

    @Override
    public String getLeaderName() {
        return "主管";
    }

    @Override
    public boolean isRest() {
        return true;
    }
}
