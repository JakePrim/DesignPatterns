package com.linksu.android_kotlin_designpatterns.abstract_factory_design;

/**
 * Created by suful on 2017/10/31.
 */

public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
