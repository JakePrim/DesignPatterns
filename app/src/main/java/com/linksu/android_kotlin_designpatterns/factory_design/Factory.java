package com.linksu.android_kotlin_designpatterns.factory_design;

/**
 * Created by suful on 2017/10/30.
 * 抽象工厂类
 */

public abstract class Factory {

    /**
     * 具体生产什么由子类去实现
     * @param <T> 产品对象类类型
     * @return 具体的产品对象
     */
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
