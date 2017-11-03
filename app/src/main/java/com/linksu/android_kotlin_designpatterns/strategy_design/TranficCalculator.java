package com.linksu.android_kotlin_designpatterns.strategy_design;

/**
 * Created by suful on 2017/11/1.
 * 价格计算器，操作算法
 */

public class TranficCalculator {
    CalculateStrategy strategy;

    public void setStrategy(CalculateStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculatePrice(int km) {
        return strategy.calculatePrice(km);
    }
}
