package com.linksu.android_kotlin_designpatterns.abstract_factory_design;

/**
 * Created by suful on 2017/10/31.
 * 抽象工厂类
 */

public abstract class AbstractFactory {
    /**
     * 创建产品A的方法
     * @return
     */
    public abstract AbstractProductA createProductA();

    /**
     * 创建产品B的方法
     * @return
     */
    public abstract AbstractProductB createProductB();
}
