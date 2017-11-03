package com.linksu.android_kotlin_designpatterns.strategy_design;

/**
 * Created by suful on 2017/11/1.
 * 计算接口
 */

public interface CalculateStrategy {
    /**
     * 按距离计算价格
     * @param km
     * @return 返回价格
     */
    int calculatePrice(int km);
}
