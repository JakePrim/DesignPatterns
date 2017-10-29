package com.linksu.android_kotlin_designpatterns.builder_design;

/**
 * ==========================================
 * 作 者：linksu (sufululove@gmail.com)
 * 版 本：1.0
 * 创建日期： 2017/8/21
 * 描 述：抽象Builder 类，规范产品的组建，一般是由子类来实现具体的组建过程
 * 修订历史：
 * ==========================================
 */

public abstract class Builder {
    //设置主机
    public abstract void buildBoard(String board);

    //设置显示器
    public abstract void buildDisplay(String display);

    //设置操作系统
    public abstract void buildOS();

    //创建Computer
    public abstract Computer create();
}
