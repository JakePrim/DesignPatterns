package com.linksu.android_kotlin_designpatterns.builder_design;

/**
 * ==========================================
 * 作 者：linksu (sufululove@gmail.com)
 * 版 本：1.0
 * 创建日期： 2017/8/21
 * 描 述：产品的抽象类
 * 修订历史：
 * ==========================================
 */

public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    public Computer() {
    }

    //设置主板
    public void setmBoard(String mBoard) {
        this.mBoard = mBoard;
    }

    //设置显示器
    public void setmDisplay(String mDisplay) {
        this.mDisplay = mDisplay;
    }

    //设置操作系统
    public abstract void setOS();

    @Override
    public String toString() {
        return "Computer{" +
                "mBoard='" + mBoard + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOS='" + mOS + '\'' +
                '}';
    }
}
