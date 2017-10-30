package com.linksu.android_kotlin_designpatterns.singleton_design;

/**
 * Created by suful on 2017/10/30.
 * Double Check Lock (DCL) 实现单例
 * DCL 优点：资源利用率高，第一次执行getInstance时单例对象才会被实例化，效率高。
 *
 */

public class Singleton {
    private static Singleton singleton = null;

    public static Singleton getInstance() {
        /**
         * 第一层判断 主要是为了避免不必要的同步
         */
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
