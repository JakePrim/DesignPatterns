package com.linksu.android_kotlin_designpatterns.singleton_design;

import android.graphics.drawable.LayerDrawable;

/**
 * Created by suful on 2017/10/30.
 * 懒汉模式:是声明一个静态对象，并且用户在第一次调用时进行初始化
 */

public class LazySingleton {
    private static LazySingleton lazySingleton;

    /**
     * synchronized LazySingleton getLazySingleton()
     * synchronized 同步锁 在多线程下保持单例对象唯一性的手段
     * 缺点: 每次调用getLazySingleton（）方法都会进行同步，这样会消耗不必要的资源。第一次加载需要及时进行实例化
     *
     * @return
     */
    public static synchronized LazySingleton getLazySingleton() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
