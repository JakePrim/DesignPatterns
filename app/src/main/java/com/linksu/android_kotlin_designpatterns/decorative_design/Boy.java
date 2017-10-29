package com.linksu.android_kotlin_designpatterns.decorative_design;

/**
 * Created by suful on 2017/10/29.
 * 具体装饰谁？
 * 定义一个男孩类(Boy) ---》 属于人类(Person)，继承人类(Person)  实现穿着的方法
 */

public class Boy extends Person {
    @Override
    public void dressed() {
        System.out.println("穿了内衣内裤");
    }
}
