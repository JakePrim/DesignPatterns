package com.linksu.android_kotlin_designpatterns.singleton_design;

/**
 * Created by suful on 2017/10/30.
 * 饿汉模式
 */

public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();

    public static HungrySingleton getSingleton() {
        return singleton;
    }
}
