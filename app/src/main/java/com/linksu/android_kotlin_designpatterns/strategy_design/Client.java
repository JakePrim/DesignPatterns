package com.linksu.android_kotlin_designpatterns.strategy_design;

/**
 * Created by suful on 2017/11/1.
 */

public class Client {
    public static void main(String[] args) {
        TranficCalculator calculator = new TranficCalculator();
        calculator.setStrategy(new BusStrategy());
        System.out.println("公交车乘16公里的价格：" + calculator.calculatePrice(16));
        calculator.setStrategy(new SubwayStrategy());
        System.out.println("地铁乘16公里的价格：" + calculator.calculatePrice(16));
    }
}
