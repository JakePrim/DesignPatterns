package com.linksu.android_kotlin_designpatterns.iterator_design.actualcombat;

/**
 * Created by suful on 2017/11/25.
 * 抽象领导者
 */

public abstract class Leader {
    public Leader nextHandler;//上一级领导的处理者

    /**
     * 自身能批复的额度权限
     *
     * @return
     */
    public abstract int limit();

    /**
     * 处理报账行为
     *
     * @param money
     */
    public abstract void handle(int money);

    /**
     * 得到当前领导
     *
     * @return
     */
    public abstract String getLeaderName();

    /**
     * 上级领导是否休息
     *
     * @return true 休息 false 工作中
     */
    public abstract boolean isRest();

    public final void handleRequest(int money) {
        if (money <= limit()) {
            if (!isRest()) {
                handle(money);
            } else {
                System.out.println("由于" + getLeaderName() + "休息了，请找" + nextHandler.getLeaderName());
                if (null != nextHandler) {
                    nextHandler.handleRequest(money);
                }
            }
        } else {
            System.out.println("由于" + getLeaderName() + "没有权限批复" + money + "，请找" + nextHandler.getLeaderName());
            if (null != nextHandler) {
                nextHandler.handleRequest(money);
            }
        }
    }
}
