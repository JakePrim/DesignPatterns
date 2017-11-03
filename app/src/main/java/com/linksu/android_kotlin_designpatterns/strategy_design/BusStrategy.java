package com.linksu.android_kotlin_designpatterns.strategy_design;

/**
 * Created by suful on 2017/11/1.
 * 公交车价格计算策略
 */

public class BusStrategy implements CalculateStrategy {

    /**
     * 北京公交车，十公里之内1元钱，超过十公里之后每加一元钱可以乘以5公里
     *
     * @param km
     * @return
     */
    @Override
    public int calculatePrice(int km) {
        //超过十公里的总距离
        int extraToal = km - 5;
        // 超过是5公里的倍数
        int extraFactor = extraToal / 5;
        //超过的距离对5公里取余
        int fraction = extraToal % 5;
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }
}
